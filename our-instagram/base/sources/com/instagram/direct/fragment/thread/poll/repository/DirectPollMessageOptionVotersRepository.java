package com.instagram.direct.fragment.thread.poll.repository;

import X.AbstractC208910l;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.InterfaceC13000lm;
import X.KQG;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class DirectPollMessageOptionVotersRepository implements InterfaceC13000lm {
    public final C0UO A00;
    public final C0UO A01;
    public final C0UO A02;
    public final UserSession A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;

    public DirectPollMessageOptionVotersRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A06 = A0o;
        C008002u A00 = C10E.A00(KQG.A00);
        this.A05 = A00;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A04 = A0z;
        this.A02 = AbstractC208910l.A02(A0o);
        this.A01 = AbstractC208910l.A02(A00);
        this.A00 = AbstractC208910l.A02(A0z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r13, java.lang.String r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r4 = 8
            r5 = r16
            boolean r0 = X.MAT.A03(r5, r4)
            if (r0 == 0) goto L8c
            r3 = r5
            X.MAT r3 = (X.MAT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r0 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L96
            X.AbstractC09560e7.A00(r0)
        L26:
            r2 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L33
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L91
            X.8jk r2 = X.AbstractC25227BEk.A0h()
        L33:
            return r2
        L34:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r13.A03
            X.0UO r0 = r13.A00
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.AbstractC167007dF.A1D(r14, r4, r15)
            X.1Ms r5 = X.AbstractC25228BEl.A0q(r1)
            java.lang.String r7 = "api/"
            java.lang.String r8 = "v1/"
            java.lang.String r9 = "direct_v2/"
            java.lang.String r10 = "group_poll/"
            java.lang.String r11 = "%s/"
            java.lang.String r12 = "options/"
            r5.A06()
            r5.A03()
            r13 = r11
            java.lang.String r1 = X.AnonymousClass001.A15(r7, r8, r9, r10, r11, r12, r13)
            X.C14360o3.A07(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r15}
            X.AbstractC31173DnH.A1Q(r5, r1, r0)
            java.lang.Class<X.K83> r1 = X.K83.class
            java.lang.Class<X.LAk> r0 = X.LAk.class
            r5.A0R(r1, r0)
            if (r6 == 0) goto L77
            java.lang.String r0 = "cursor"
            r5.A9s(r0, r6)
        L77:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetGroupPollOptionDetailsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetGroupPollOptionDetailsResponse>>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r4
            r0 = 507883296(0x1e45af20, float:1.0465308E-20)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L26
            return r2
        L8c:
            X.MAT r3 = X.MAT.A00(r13, r5, r4)
            goto L18
        L91:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L96:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository.A00(com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            r11 = this;
            r3 = 32
            boolean r0 = X.MAF.A01(r14, r3)
            if (r0 == 0) goto L8e
            r4 = r14
            X.MAF r4 = (X.MAF) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L6f
            if (r0 != r2) goto L9d
            java.lang.Object r5 = r4.A01
            com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r5 = (com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository) r5
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L94
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r8 = r1.A00
            X.3DC r8 = (X.C3DC) r8
            X.05A r9 = r5.A06
            java.lang.Object r10 = r9.getValue()
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r0 = r8.F7f()
            X.Jw5 r0 = (X.C45015Jw5) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r7 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r6 = r0.iterator()
        L4c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r6)
            java.lang.String r4 = r0.getId()
            java.lang.String r3 = r0.getFullName()
            java.lang.String r2 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bhu()
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r0 = new com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel
            r0.<init>(r1, r4, r3, r2)
            r7.add(r0)
            goto L4c
        L6f:
            X.AbstractC09560e7.A00(r1)
            if (r15 == 0) goto L7b
            X.05A r1 = r11.A06
            X.0sl r0 = X.C16930sl.A00
            r1.Egh(r0)
        L7b:
            X.05A r1 = r11.A05
            X.KQH r0 = X.KQH.A00
            r1.Egh(r0)
            r4.A01 = r11
            r4.A00 = r2
            java.lang.Object r1 = A00(r11, r12, r13, r4)
            if (r1 == r3) goto Lcf
            r5 = r11
            goto L28
        L8e:
            X.MAF r4 = new X.MAF
            r4.<init>(r11, r14, r3)
            goto L16
        L94:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lbe
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La2:
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r7, r10)
            r9.Egh(r0)
            X.05A r1 = r5.A04
            java.lang.Object r0 = r8.F7f()
            X.Jw5 r0 = (X.C45015Jw5) r0
            java.lang.String r0 = r0.A00
            r1.Egh(r0)
            X.05A r1 = r5.A05
            X.KQE r0 = X.KQE.A00
            X.3NX r1 = X.AbstractC43593JPy.A0m(r0, r1)
        Lbe:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto Lcd
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Ld0
            X.05A r1 = r5.A05
            X.KQF r0 = X.KQF.A00
            r1.Egh(r0)
        Lcd:
            X.0eB r3 = X.C0eB.A00
        Lcf:
            return r3
        Ld0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository.A01(java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A06.Egh(C16930sl.A00);
        this.A05.Egh(KQG.A00);
        this.A04.Egh(null);
    }
}
