package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.AbstractC166997dE;
import X.AbstractC193598he;
import X.AbstractC52922bZ;
import X.BAO;
import X.C128175qm;
import X.C152406tQ;
import X.C2GS;
import X.C54635OBk;
import X.C54750OGz;
import X.C58252li;
import X.C8ZN;
import X.C8ZT;
import X.MXY;
import X.N6J;
import X.OVo;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* loaded from: classes9.dex */
public final class ClipsSharingDraftViewModel extends AbstractC52922bZ {
    public final C58252li A00;
    public final C2GS A01;
    public final C2GS A02;
    public final C2GS A03;
    public final UserSession A04;
    public final C54750OGz A05;
    public final C54635OBk A06;
    public final ClipsDraftRepository A07;
    public final OVo A08;
    public final String A09;
    public final boolean A0A;
    public final C152406tQ A0B;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r0.A0i != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClipsSharingDraftViewModel(X.C152406tQ r13, com.instagram.common.session.UserSession r14, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r15, X.OVo r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.<init>(X.6tQ, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.OVo, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = X.PX0.A01(r7, r3)
            if (r0 == 0) goto L59
            r5 = r7
            X.PX0 r5 = (X.PX0) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L5f
            boolean r8 = r5.A05
            java.lang.Object r1 = r5.A02
            X.5qm r1 = (X.C128175qm) r1
            java.lang.Object r0 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r0
            X.AbstractC09560e7.A00(r4)
        L2d:
            if (r8 != 0) goto L37
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r0.A07
            X.5JK r1 = r1.A0H
            r0 = 0
            r2.A0P(r1, r0)
        L37:
            X.0eB r3 = X.C0eB.A00
        L39:
            return r3
        L3a:
            X.AbstractC09560e7.A00(r4)
            boolean r0 = r6.A07()
            if (r0 == 0) goto L37
            X.5qm r1 = r6.A03()
            X.OGz r0 = r6.A05
            r5.A01 = r6
            r5.A02 = r1
            r5.A05 = r8
            r5.A00 = r2
            java.lang.Object r0 = r0.A00(r1, r5)
            if (r0 == r3) goto L39
            r0 = r6
            goto L2d
        L59:
            X.PX0 r5 = new X.PX0
            r5.<init>(r6, r7, r3)
            goto L15
        L5f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A05(X.1Ds, boolean):java.lang.Object");
    }

    public static final void A01(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        if (clipsSharingDraftViewModel.A04.A00(C8ZN.class) != null) {
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    public final C128175qm A03() {
        C128175qm c128175qm;
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A07.A02.A02();
        if (abstractC193598he != null && (c128175qm = (C128175qm) abstractC193598he.A01) != null) {
            return c128175qm;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.BC2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r10) {
        /*
            r9 = this;
            r3 = 42
            boolean r0 = X.MAO.A02(r10, r3)
            if (r0 == 0) goto L7c
            r5 = r10
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A03
            X.1JX r8 = X.C1JX.A02
            int r1 = r5.A00
            r6 = 3
            r7 = 2
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 == r0) goto L48
            if (r1 == r7) goto L5e
            if (r1 != r6) goto L82
            X.AbstractC09560e7.A00(r2)
        L2b:
            X.0eB r8 = X.C0eB.A00
        L2d:
            return r8
        L2e:
            X.AbstractC09560e7.A00(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r9.A07
            A01(r9)
            X.OzS r1 = new X.OzS
            r1.<init>()
            r5.A01 = r9
            r5.A00 = r0
            r0 = 0
            java.lang.Object r0 = r2.A0G(r1, r5, r0)
            if (r0 == r8) goto L2d
            r1 = r9
            goto L4f
        L48:
            java.lang.Object r1 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.AbstractC09560e7.A00(r2)
        L4f:
            X.5qm r3 = r1.A03()
            X.MAO.A00(r1, r3, r5, r7)
            r0 = 0
            java.lang.Object r0 = r1.A05(r5, r0)
            if (r0 != r8) goto L69
            return r8
        L5e:
            java.lang.Object r3 = r5.A02
            X.5qm r3 = (X.C128175qm) r3
            java.lang.Object r1 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.AbstractC09560e7.A00(r2)
        L69:
            X.2li r2 = r1.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = r1.A07
            X.2GS r0 = r1.A02
            r2.A0D(r0)
            r5.A01 = r4
            r5.A02 = r4
            r5.A00 = r6
            r1.A0J(r3, r5)
            goto L2b
        L7c:
            X.MAO r5 = new X.MAO
            r5.<init>(r9, r10, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A04(X.1Ds):java.lang.Object");
    }

    public final void A06(MXY mxy) {
        Object obj;
        BAO bao = new BAO(46, mxy, this);
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A07.A02.A02();
        if (abstractC193598he != null && (obj = abstractC193598he.A01) != null) {
            bao.invoke(obj);
        }
    }

    public final boolean A07() {
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A07.A02.A02();
        if (abstractC193598he instanceof C8ZT) {
            abstractC193598he.A00();
            return true;
        }
        return false;
    }

    public static C128175qm A00(N6J n6j) {
        return N6J.A01(n6j).A03();
    }

    public static boolean A02(N6J n6j) {
        return N6J.A01(n6j).A07();
    }
}
