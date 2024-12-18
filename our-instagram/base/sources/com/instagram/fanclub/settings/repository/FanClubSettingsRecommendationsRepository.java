package com.instagram.fanclub.settings.repository;

import X.AbstractC208910l;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes9.dex */
public final class FanClubSettingsRecommendationsRepository {
    public final FanClubApi A00;
    public final C0UO A01;
    public final C05A A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r6 = this;
            r3 = 12
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L60
            r5 = r7
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L49
            if (r0 != r2) goto L66
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L40
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.PrV r0 = (X.InterfaceC58225PrV) r0
            X.05A r1 = r1.A02
            X.Muo r0 = (X.C51784Muo) r0
            java.util.List r0 = r0.A00
            r1.Egh(r0)
        L3d:
            X.0eB r3 = X.C0eB.A00
        L3f:
            return r3
        L40:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L3d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L49:
            X.AbstractC09560e7.A00(r4)
            com.instagram.fanclub.api.FanClubApi r1 = r6.A00
            if (r8 == 0) goto L5e
            java.lang.String r0 = "settings"
        L52:
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r1.A0D(r0, r5)
            if (r4 == r3) goto L3f
            r1 = r6
            goto L28
        L5e:
            r0 = 0
            goto L52
        L60:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r7, r3)
            goto L16
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository.A00(X.1Ds, boolean):java.lang.Object");
    }

    public FanClubSettingsRecommendationsRepository(FanClubApi fanClubApi) {
        this.A00 = fanClubApi;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A02 = A0o;
        this.A01 = AbstractC208910l.A02(A0o);
    }
}
