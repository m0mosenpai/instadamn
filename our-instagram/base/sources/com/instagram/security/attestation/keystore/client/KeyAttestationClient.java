package com.instagram.security.attestation.keystore.client;

import X.C006802i;
import X.C25531Mh;
import X.C53E;

/* loaded from: classes9.dex */
public final class KeyAttestationClient {
    public C25531Mh A00;
    public final C53E A01;
    public final C006802i A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C51743MtS r5, X.AbstractC12990ll r6, com.instagram.security.attestation.keystore.client.KeyAttestationClient r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 21
            boolean r0 = X.PXC.A03(r8, r3)
            if (r0 == 0) goto L4f
            r4 = r8
            X.PXC r4 = (X.PXC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L65
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L54
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r3 = r1.A00
            return r3
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1Ms r1 = X.AbstractC167017dG.A0c(r6)
            java.lang.String r0 = "attestation/validate/"
            r1.A0B(r0)
            r1.A03 = r5
            r1.A0L = r2
            X.1ON r1 = X.AbstractC31177DnL.A0Q(r1)
            r4.A00 = r2
            r0 = 669957587(0x27eebdd3, float:6.6264078E-15)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L24
            return r3
        L4f:
            X.PXC r4 = X.PXC.A00(r7, r8, r3)
            goto L16
        L54:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L60
            java.lang.String r0 = "Failed to validate attestation"
            X.NUo r1 = new X.NUo
            r1.<init>(r0)
            throw r1
        L60:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L65:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.client.KeyAttestationClient.A00(X.MtS, X.0ll, com.instagram.security.attestation.keystore.client.KeyAttestationClient, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AbstractC12990ll r6, com.instagram.security.attestation.keystore.client.KeyAttestationClient r7, java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 20
            boolean r0 = X.PXC.A03(r10, r3)
            if (r0 == 0) goto L59
            r5 = r10
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L6f
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L5e
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r4 = r1.A00
            return r4
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r6)
            java.lang.String r0 = "attestation/create_android_keystore/"
            r2.A0B(r0)
            java.lang.String r0 = "app_scoped_device_id"
            r2.A9s(r0, r8)
            java.lang.String r0 = "key_hash"
            r2.A9s(r0, r9)
            java.lang.Class<X.N2O> r1 = X.N2O.class
            java.lang.Class<X.ONP> r0 = X.ONP.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 669957587(0x27eebdd3, float:6.6264078E-15)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L59:
            X.PXC r5 = X.PXC.A00(r7, r10, r3)
            goto L16
        L5e:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L6a
            java.lang.String r0 = "Failed to retrieve nonce(s) from the server"
            X.NUn r1 = new X.NUn
            r1.<init>(r0)
            throw r1
        L6a:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L6f:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.client.KeyAttestationClient.A01(X.0ll, com.instagram.security.attestation.keystore.client.KeyAttestationClient, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public KeyAttestationClient(C53E c53e, C006802i c006802i, String str) {
        this.A01 = c53e;
        this.A03 = str;
        this.A02 = c006802i;
    }
}
