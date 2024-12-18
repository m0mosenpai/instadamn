package X;

import android.security.keystore.StrongBoxUnavailableException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;

/* renamed from: X.53F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53F {
    public final KeyStore A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    public static void A00(C53F c53f, C53G c53g, String str, byte[] bArr, boolean z) {
        try {
            c53f = z;
            c53f.A02(c53g, str, bArr, true, c53f);
        } catch (ProviderException e) {
            if (e instanceof StrongBoxUnavailableException) {
                try {
                    c53f.A02(c53g, str, bArr, false, c53f);
                    return;
                } catch (ProviderException e2) {
                    throw new Exception("Unable to generate attested key", e2);
                }
            }
            throw new Exception("Unable to generate attested key", e);
        }
    }

    public final KeyStore.Entry A01(String str) {
        try {
            return this.A00.getEntry(str, null);
        } catch (NullPointerException | UnsupportedOperationException | GeneralSecurityException | ProviderException e) {
            throw new Exception("Unable to get entry", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C53G r6, java.lang.String r7, byte[] r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> La4
            r4.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> La4
            r1.setTime(r4)     // Catch: java.lang.Throwable -> La4
            r3 = 1
            r0 = 10
            r1.add(r3, r0)     // Catch: java.lang.Throwable -> La4
            java.util.Date r2 = r1.getTime()     // Catch: java.lang.Throwable -> La4
            r0 = 12
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch: java.lang.Throwable -> La4
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String[] r0 = r6.A02     // Catch: java.lang.Throwable -> La4
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setDigests(r0)     // Catch: java.lang.Throwable -> La4
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setCertificateNotBefore(r4)     // Catch: java.lang.Throwable -> La4
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setCertificateNotAfter(r2)     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L31
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setAttestationChallenge(r8)     // Catch: java.lang.Throwable -> La4
        L31:
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> La4
            r2 = 0
            if (r0 == r3) goto L3b
            if (r0 != r2) goto L49
            goto L40
        L3b:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "PSS"
            goto L44
        L40:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "PKCS1"
        L44:
            r1[r2] = r0     // Catch: java.lang.Throwable -> La4
            r4.setSignaturePaddings(r1)     // Catch: java.lang.Throwable -> La4
        L49:
            java.lang.String r2 = r6.A01     // Catch: java.lang.Throwable -> La4
            r0 = 63
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)     // Catch: java.lang.Throwable -> La4
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r2, r0)     // Catch: java.lang.Throwable -> La4
            r4.setIsStrongBoxBacked(r9)     // Catch: java.lang.Throwable -> La4
            android.security.keystore.KeyGenParameterSpec r0 = r4.build()     // Catch: java.lang.Throwable -> La4
            r1.initialize(r0)     // Catch: java.lang.Throwable -> La4
            java.security.KeyPair r0 = r1.generateKeyPair()     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L94
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            java.security.PrivateKey r1 = r0.getPrivate()     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            java.lang.Class<android.security.keystore.KeyInfo> r0 = android.security.keystore.KeyInfo.class
            java.security.spec.KeySpec r2 = r2.getKeySpec(r1, r0)     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            java.lang.String r0 = "key spec should not be null!"
            X.C18C.A07(r2, r0)     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            android.security.keystore.KeyInfo r2 = (android.security.keystore.KeyInfo) r2     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            r0 = 31
            if (r1 < r0) goto L88
            int r1 = r2.getSecurityLevel()     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            r0 = -1
            if (r1 == r0) goto L94
            goto L8f
        L88:
            boolean r0 = r2.isInsideSecureHardware()     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            if (r0 == 0) goto L95
            return
        L8f:
            if (r1 == r3) goto L94
            r0 = 2
            if (r1 != r0) goto L95
        L94:
            return
        L95:
            X.N0M r0 = new X.N0M     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            r0.<init>()     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
            throw r0     // Catch: java.security.GeneralSecurityException -> L9b java.lang.Throwable -> La4 java.lang.Throwable -> La4
        L9b:
            r2 = move-exception
            java.lang.String r1 = "Unable to determine if attested key is hardware backed"
            X.N0M r0 = new X.N0M     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
        La4:
            r2 = move-exception
            java.lang.String r1 = "Unable to generate attested key"
            X.Njg r0 = new X.Njg
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53F.A02(X.53G, java.lang.String, byte[], boolean, boolean):void");
    }

    public C53F() {
        try {
            KeyStore keyStore = KeyStore.getInstance(AbstractC58317Pt9.A00(63));
            this.A00 = keyStore;
            keyStore.load(null);
        } catch (IOException | GeneralSecurityException e) {
            throw new Exception("Unable to create or load AndroidKeyStore", e);
        }
    }
}
