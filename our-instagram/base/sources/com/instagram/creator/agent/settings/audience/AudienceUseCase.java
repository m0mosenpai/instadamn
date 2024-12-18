package com.instagram.creator.agent.settings.audience;

import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C10Q;
import X.C14360o3;
import X.C15180pY;
import X.C26039BfS;
import X.C29245Cuo;
import X.C3r5;
import X.C6R;
import X.EnumC53314Nhq;
import X.MVZ;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

/* loaded from: classes5.dex */
public final class AudienceUseCase extends C3r5 {
    public boolean A00;
    public final AudienceRepository A01;
    public final CreatorAiSettingsRepository A02;
    public final String A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C05A A0C;
    public final C05A A0D;

    public AudienceUseCase(AudienceRepository audienceRepository, CreatorAiSettingsRepository creatorAiSettingsRepository, String str, C05A c05a, C05A c05a2, C05A c05a3, C05A c05a4) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1U(c05a3, c05a4);
        this.A03 = str;
        this.A01 = audienceRepository;
        this.A02 = creatorAiSettingsRepository;
        this.A09 = c05a;
        this.A08 = c05a2;
        this.A0C = c05a3;
        this.A0D = c05a4;
        C008002u A00 = C10E.A00(C29245Cuo.A00);
        this.A04 = A00;
        this.A0A = AbstractC208910l.A02(A00);
        C6R c6r = C6R.A03;
        C008002u A1H = AbstractC25225BEi.A1H(c6r);
        this.A05 = A1H;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A07 = A1A;
        EnumC53314Nhq enumC53314Nhq = EnumC53314Nhq.NOBODY;
        C008002u A1H2 = AbstractC25225BEi.A1H(enumC53314Nhq);
        this.A06 = A1H2;
        this.A00 = true;
        C15180pY A02 = C10Q.A02(new AudienceUseCase$uiState$1(null), c05a, c05a3, A1H, A1A, A1H2);
        this.A0B = AbstractC208910l.A01(new C26039BfS(MVZ.A00(""), c6r, enumC53314Nhq, 2131975805, true, false), A03(), A02, C10I.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creator.agent.settings.audience.AudienceUseCase r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 0
            boolean r0 = X.MAF.A01(r7, r3)
            if (r0 == 0) goto L6b
            r5 = r7
            X.MAF r5 = (X.MAF) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5b
            if (r0 != r3) goto L71
            java.lang.Object r6 = r5.A01
            com.instagram.creator.agent.settings.audience.AudienceUseCase r6 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r6
            X.AbstractC09560e7.A00(r4)
        L27:
            X.Gof r4 = (X.C38052Gof) r4
            if (r4 == 0) goto L59
            X.05A r0 = r6.A08
            r0.Egh(r4)
            boolean r0 = r4.A02
            if (r0 == 0) goto L48
            X.05A r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            X.Nhq r0 = X.EnumC53314Nhq.NOBODY
            if (r1 != r0) goto L48
            X.Nhq r0 = X.EnumC53314Nhq.ANYBODY_CREATOR_DOES_NOT_FOLLOW
        L40:
            r2.Egh(r0)
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L48:
            boolean r0 = r4.A01
            if (r0 == 0) goto L43
            X.05A r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            X.Nhq r0 = X.EnumC53314Nhq.NOBODY
            if (r1 != r0) goto L43
            X.Nhq r0 = X.EnumC53314Nhq.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW
            goto L40
        L59:
            r3 = 0
            goto L43
        L5b:
            X.AbstractC09560e7.A00(r4)
            com.instagram.creator.agent.settings.audience.AudienceRepository r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r4 = r0.A05(r5)
            if (r4 != r1) goto L27
            return r1
        L6b:
            X.MAF r5 = new X.MAF
            r5.<init>(r6, r7, r3)
            goto L15
        L71:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.audience.AudienceUseCase.A00(com.instagram.creator.agent.settings.audience.AudienceUseCase, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creator.agent.settings.audience.AudienceUseCase r7, X.InterfaceC23621Ds r8) {
        /*
            r4 = 1
            boolean r0 = X.MAF.A01(r8, r4)
            if (r0 == 0) goto L62
            r3 = r8
            X.MAF r3 = (X.MAF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r6 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L52
            if (r0 != r4) goto L95
            java.lang.Object r7 = r3.A01
            com.instagram.creator.agent.settings.audience.AudienceUseCase r7 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r7
            X.AbstractC09560e7.A00(r6)
        L27:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L8f
            X.05A r4 = r7.A0C
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r6, r0)
            int r0 = X.AbstractC167017dG.A01(r0)
            java.util.LinkedHashMap r3 = X.AbstractC25225BEi.A18(r0)
            java.util.Iterator r2 = r6.iterator()
        L3f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Jxv r0 = (X.C45126Jxv) r0
            java.lang.String r0 = r0.A02
            r3.put(r0, r1)
            goto L3f
        L52:
            X.AbstractC09560e7.A00(r6)
            com.instagram.creator.agent.settings.audience.AudienceRepository r0 = r7.A01
            r3.A01 = r7
            r3.A00 = r4
            java.lang.Object r6 = r0.A06(r3)
            if (r6 != r1) goto L27
            return r1
        L62:
            X.MAF r3 = new X.MAF
            r3.<init>(r7, r8, r4)
            goto L15
        L68:
            r4.Egh(r3)
            X.05A r3 = r7.A0D
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r6)
            java.util.Iterator r1 = r6.iterator()
        L75:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()
            X.Jxv r0 = (X.C45126Jxv) r0
            java.lang.String r0 = r0.A02
            r2.add(r0)
            goto L75
        L87:
            java.util.Set r0 = X.AbstractC001800i.A0k(r2)
            r3.Egh(r0)
            goto L90
        L8f:
            r5 = 0
        L90:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        L95:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.audience.AudienceUseCase.A01(com.instagram.creator.agent.settings.audience.AudienceUseCase, X.1Ds):java.lang.Object");
    }
}
