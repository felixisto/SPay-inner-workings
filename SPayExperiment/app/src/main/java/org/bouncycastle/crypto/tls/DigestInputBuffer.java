/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 */
package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

class DigestInputBuffer
extends ByteArrayOutputStream {
    DigestInputBuffer() {
    }

    void updateDigest(Digest digest) {
        digest.update(this.buf, 0, this.count);
    }
}

