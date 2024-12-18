package com.instagram.direct.prompts.dailyprompts.repository;

import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C35039FcC;
import X.EnumC33335EoU;
import X.F2C;
import X.InterfaceC13000lm;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class DirectDailyPromptsResponseListRepository implements InterfaceC13000lm {
    public final UserSession A00;
    public final C35039FcC A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C0UO A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;

    public DirectDailyPromptsResponseListRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = F2C.A00(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33335EoU.A03);
        this.A0E = A1H;
        C008002u A00 = C10E.A00(null);
        this.A0D = A00;
        C008002u A002 = C10E.A00(null);
        this.A0B = A002;
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC167007dF.A0d());
        this.A0C = A1H2;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A02 = A1A;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A03 = A0o;
        C008002u A003 = C10E.A00(null);
        this.A0F = A003;
        this.A08 = AbstractC208910l.A02(A1H);
        this.A06 = AbstractC208910l.A02(A00);
        this.A04 = AbstractC208910l.A02(A002);
        this.A05 = AbstractC208910l.A02(A1H2);
        this.A07 = AbstractC208910l.A02(A1A);
        this.A09 = AbstractC208910l.A02(A003);
        this.A0A = AbstractC208910l.A02(A0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.05A] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A01(java.lang.String, java.lang.String, java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.model.direct.DirectThreadKey r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r10 = this;
            r3 = 20
            boolean r0 = X.MAK.A01(r14, r3)
            if (r0 == 0) goto L8b
            r4 = r14
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L72
            if (r1 != r2) goto Lb4
            java.lang.Object r13 = r4.A02
            java.lang.Object r7 = r4.A01
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r7 = (com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository) r7
            X.AbstractC09560e7.A00(r0)
        L2a:
            boolean r1 = r0 instanceof X.C3NX
            r5 = 0
            if (r1 == 0) goto Lb9
            X.05A r9 = r7.A03
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r9)
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            r6 = 0
            if (r0 == 0) goto L70
            java.lang.Object r8 = r1.next()
            r0 = r8
            X.E6c r0 = (X.C32050E6c) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.C14360o3.A0K(r0, r13)
            if (r0 == 0) goto L39
        L4f:
            X.E6c r8 = (X.C32050E6c) r8
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r9)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r0.iterator()
        L5d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.E6c r0 = (X.C32050E6c) r0
            java.lang.String r0 = r0.A05
            X.AbstractC25232BEp.A1Q(r0, r13, r1, r4)
            goto L5d
        L70:
            r8 = r6
            goto L4f
        L72:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r10.A00
            r0 = 163(0xa3, float:2.28E-43)
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A01(r1, r11, r12, r13, r0)
            X.AbstractC31172DnG.A1V(r10, r13, r4, r2)
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 == r3) goto Lc2
            r7 = r10
            goto L2a
        L8b:
            X.MAK r4 = new X.MAK
            r4.<init>(r10, r14, r3)
            goto L16
        L91:
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r4)
            r9.Egh(r0)
            X.05A r1 = r7.A02
            if (r8 == 0) goto La4
            com.instagram.user.model.User r0 = r8.A02
            if (r0 == 0) goto La4
            java.lang.String r6 = X.AbstractC76433bn.A00(r0)
        La4:
            com.instagram.common.session.UserSession r0 = r7.A00
            boolean r0 = X.AbstractC31171DnF.A1W(r0, r6)
            if (r0 != 0) goto Lb0
            boolean r5 = X.AbstractC31176DnK.A1b(r1)
        Lb0:
            X.AbstractC166997dE.A1Y(r1, r5)
            goto Lbe
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb9:
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto Lc3
            r2 = 0
        Lbe:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
        Lc2:
            return r3
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A00(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 30
            boolean r0 = X.MAT.A03(r8, r3)
            if (r0 == 0) goto L49
            r4 = r8
            X.MAT r4 = (X.MAT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L56
            X.AbstractC09560e7.A00(r0)
        L24:
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L2d
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L51
            r2 = 0
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r0 = "daily_prompt"
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A0A(r1, r7, r6, r0)
            r4.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L49:
            r0 = 42
            X.MAT r4 = new X.MAT
            r4.<init>(r5, r8, r3, r0)
            goto L16
        L51:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L56:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.A02(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(DirectDailyPromptsResponseListRepository.class);
    }
}
