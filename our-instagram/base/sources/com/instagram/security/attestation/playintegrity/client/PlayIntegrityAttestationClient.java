package com.instagram.security.attestation.playintegrity.client;

import X.AbstractC167017dG;
import X.C006802i;
import X.C25531Mh;
import android.content.Context;

/* loaded from: classes9.dex */
public final class PlayIntegrityAttestationClient {
    public C25531Mh A00;
    public final Context A01;
    public final C006802i A02;
    public final IgGooglePlayIntegrityAttestor A03;
    public final String A04;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.MUD r5, X.AbstractC12990ll r6, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 25
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
            r1.A02 = r5
            r1.A0M = r2
            X.1ON r1 = X.AbstractC31177DnL.A0Q(r1)
            r4.A00 = r2
            r0 = 1335113021(0x4f94353d, float:4.973034E9)
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
            X.NUq r1 = new X.NUq
            r1.<init>(r0)
            throw r1
        L60:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L65:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A00(X.MUD, X.0ll, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AbstractC12990ll r6, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 24
            boolean r0 = X.PXC.A03(r9, r3)
            if (r0 == 0) goto L54
            r5 = r9
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L6a
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L59
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r4 = r1.A00
            return r4
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r6)
            java.lang.String r0 = "attestation/create_android_playintegrity/"
            r2.A0B(r0)
            java.lang.String r0 = "app_scoped_device_id"
            r2.A9s(r0, r8)
            java.lang.Class<X.N2G> r1 = X.N2G.class
            java.lang.Class<X.ONQ> r0 = X.ONQ.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1335113021(0x4f94353d, float:4.973034E9)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L54:
            X.PXC r5 = X.PXC.A00(r7, r9, r3)
            goto L16
        L59:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L65
            java.lang.String r0 = "Failed to retrieve nonce(s) from the server"
            X.NUp r1 = new X.NUp
            r1.<init>(r0)
            throw r1
        L65:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L6a:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A01(X.0ll, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient, java.lang.String, X.1Ds):java.lang.Object");
    }

    public PlayIntegrityAttestationClient(Context context, C006802i c006802i, IgGooglePlayIntegrityAttestor igGooglePlayIntegrityAttestor, String str) {
        AbstractC167017dG.A1Q(igGooglePlayIntegrityAttestor, context);
        this.A03 = igGooglePlayIntegrityAttestor;
        this.A04 = str;
        this.A01 = context;
        this.A02 = c006802i;
    }
}
