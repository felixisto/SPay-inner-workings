/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.x509.Extensions;

public class Request
extends ASN1Object {
    CertID reqCert;
    Extensions singleRequestExtensions;

    private Request(ASN1Sequence aSN1Sequence) {
        this.reqCert = CertID.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.singleRequestExtensions = Extensions.getInstance((ASN1TaggedObject)aSN1Sequence.getObjectAt(1), true);
        }
    }

    public Request(CertID certID, Extensions extensions) {
        this.reqCert = certID;
        this.singleRequestExtensions = extensions;
    }

    public static Request getInstance(Object object) {
        if (object instanceof Request) {
            return (Request)object;
        }
        if (object != null) {
            return new Request(ASN1Sequence.getInstance(object));
        }
        return null;
    }

    public static Request getInstance(ASN1TaggedObject aSN1TaggedObject, boolean bl) {
        return Request.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, bl));
    }

    public CertID getReqCert() {
        return this.reqCert;
    }

    public Extensions getSingleRequestExtensions() {
        return this.singleRequestExtensions;
    }

    @Override
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.reqCert);
        if (this.singleRequestExtensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.singleRequestExtensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
