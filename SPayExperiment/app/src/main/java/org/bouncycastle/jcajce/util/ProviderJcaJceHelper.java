/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.AlgorithmParameterGenerator
 *  java.security.AlgorithmParameters
 *  java.security.KeyFactory
 *  java.security.KeyPairGenerator
 *  java.security.MessageDigest
 *  java.security.Provider
 *  java.security.Signature
 *  java.security.cert.CertificateFactory
 *  javax.crypto.Cipher
 *  javax.crypto.KeyAgreement
 *  javax.crypto.KeyGenerator
 *  javax.crypto.Mac
 *  javax.crypto.SecretKeyFactory
 */
package org.bouncycastle.jcajce.util;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;

public class ProviderJcaJceHelper
implements JcaJceHelper {
    protected final Provider provider;

    public ProviderJcaJceHelper(Provider provider) {
        this.provider = provider;
    }

    @Override
    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String string) {
        return AlgorithmParameterGenerator.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public AlgorithmParameters createAlgorithmParameters(String string) {
        return AlgorithmParameters.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public CertificateFactory createCertificateFactory(String string) {
        return CertificateFactory.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public Cipher createCipher(String string) {
        return Cipher.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public MessageDigest createDigest(String string) {
        return MessageDigest.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public KeyAgreement createKeyAgreement(String string) {
        return KeyAgreement.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public KeyFactory createKeyFactory(String string) {
        return KeyFactory.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public KeyGenerator createKeyGenerator(String string) {
        return KeyGenerator.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public KeyPairGenerator createKeyPairGenerator(String string) {
        return KeyPairGenerator.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public Mac createMac(String string) {
        return Mac.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public SecretKeyFactory createSecretKeyFactory(String string) {
        return SecretKeyFactory.getInstance((String)string, (Provider)this.provider);
    }

    @Override
    public Signature createSignature(String string) {
        return Signature.getInstance((String)string, (Provider)this.provider);
    }
}

