package com.instagram.fanclub.settings.repository;

import X.AbstractC25225BEi;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C143436di;
import X.C14360o3;
import X.Ld8;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes6.dex */
public final class FanClubSettingsRepository {
    public final FanClubApi A00;
    public final Ld8 A01;
    public final FanClubSettingsRecommendationsRepository A02;
    public final MonetizationRepository A03;
    public final C143436di A04;
    public final C0UO A05;
    public final C0UO A06;
    public final String A07;
    public final C05A A08;
    public final C05A A09;

    public FanClubSettingsRepository(FanClubApi fanClubApi, Ld8 ld8, FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository, MonetizationRepository monetizationRepository, C143436di c143436di, String str) {
        AbstractC25234BEr.A0j(1, str, monetizationRepository, fanClubSettingsRecommendationsRepository, c143436di);
        C14360o3.A0B(ld8, 6);
        this.A07 = str;
        this.A00 = fanClubApi;
        this.A03 = monetizationRepository;
        this.A02 = fanClubSettingsRecommendationsRepository;
        this.A04 = c143436di;
        this.A01 = ld8;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A09 = A1A;
        this.A06 = A1A;
        C008002u A1H = AbstractC25225BEi.A1H(0);
        this.A08 = A1H;
        this.A05 = A1H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r0.A00(r2, r10) != r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r9, boolean r10) {
        /*
            r8 = this;
            r4 = 4
            boolean r0 = X.MUF.A00(r9, r4)
            if (r0 == 0) goto L90
            r2 = r9
            X.MUF r2 = (X.MUF) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L90
            int r3 = r3 - r1
            r2.A00 = r3
        L15:
            java.lang.Object r0 = r2.A02
            X.1JX r5 = X.C1JX.A02
            int r1 = r2.A00
            r7 = 3
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L33
            if (r1 == r4) goto L5e
            if (r1 != r7) goto L96
            java.lang.Object r6 = r2.A01
            X.05A r6 = (X.C05A) r6
            X.AbstractC09560e7.A00(r0)
        L2d:
            r6.Egh(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L33:
            boolean r10 = r2.A04
            java.lang.Object r1 = r2.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r1
            X.AbstractC09560e7.A00(r0)
            goto L51
        L3d:
            X.AbstractC09560e7.A00(r0)
            com.instagram.monetization.repository.MonetizationRepository r1 = r8.A03
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0C
            r2.A01 = r8
            r2.A04 = r10
            r2.A00 = r3
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 == r5) goto L5d
            r1 = r8
        L51:
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r0 = r1.A02
            r2.A01 = r1
            r2.A00 = r4
            java.lang.Object r0 = r0.A00(r2, r10)
            if (r0 != r5) goto L65
        L5d:
            return r5
        L5e:
            java.lang.Object r1 = r2.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r1
            X.AbstractC09560e7.A00(r0)
        L65:
            X.Ld8 r0 = r1.A01
            r0.A00()
            X.05A r6 = r1.A09
            com.instagram.monetization.repository.MonetizationRepository r4 = r1.A03
            r2.A01 = r6
            r2.A00 = r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r0 = X.C1E2.A02(r2)
            X.3yw r3 = new X.3yw
            r3.<init>(r0)
            X.NiA r2 = X.EnumC53330NiA.A07
            r1 = 38
            X.DfD r0 = new X.DfD
            r0.<init>(r3, r1)
            X.OY3.A02(r2, r4, r0)
            java.lang.Object r0 = r3.A00()
            if (r0 != r5) goto L2d
            return r5
        L90:
            X.MUF r2 = new X.MUF
            r2.<init>(r8, r9, r4)
            goto L15
        L96:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A01(X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r13) {
        /*
            r12 = this;
            r3 = 13
            boolean r0 = X.MAH.A01(r13, r3)
            if (r0 == 0) goto L89
            r4 = r13
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L70
            if (r0 != r5) goto L8f
            java.lang.Object r4 = r4.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r4 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r4
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L67
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.R0o r0 = (X.C60488R0o) r0
            if (r0 == 0) goto L64
            X.R0n r0 = r0.A0E()
            if (r0 == 0) goto L64
            X.R0m r3 = r0.A0E()
            if (r3 == 0) goto L64
            java.lang.Class<X.QgG> r2 = X.QgG.class
            r0 = 694(0x2b6, float:9.73E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = -1827495145(0xffffffff9312a317, float:-1.85082E-27)
            X.2JS r2 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r2 == 0) goto L64
            r1 = 0
            java.lang.String r0 = "count"
            int r2 = r2.getCoercedIntField(r1, r0)
            X.05A r1 = r4.A08
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r1.Egh(r0)
        L64:
            X.0eB r1 = X.C0eB.A00
        L66:
            return r1
        L67:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L64
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L70:
            X.AbstractC09560e7.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r12.A00
            java.lang.String r3 = r12.A07
            r4.A01 = r12
            r4.A00 = r5
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            java.lang.Object r2 = r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == r1) goto L66
            r4 = r12
            goto L28
        L89:
            X.MAH r4 = new X.MAH
            r4.<init>(r12, r13, r3)
            goto L16
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A00(X.1Ds):java.lang.Object");
    }
}
