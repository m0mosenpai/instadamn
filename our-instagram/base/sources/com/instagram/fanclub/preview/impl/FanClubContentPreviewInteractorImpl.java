package com.instagram.fanclub.preview.impl;

import X.AbstractC09440dt;
import X.AbstractC167007dF;
import X.C008002u;
import X.C05A;
import X.C06160Ug;
import X.C10E;
import X.C143436di;
import X.C14360o3;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC114705Ga;
import X.InterfaceC15070pN;
import X.J7K;
import X.Ld8;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class FanClubContentPreviewInteractorImpl implements InterfaceC114705Ga {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC15070pN A08;
    public final Ld8 A09;
    public final C143436di A0A;

    public FanClubContentPreviewInteractorImpl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Ld8 ld8, C143436di c143436di) {
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1G(ld8, 4, c143436di);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A09 = ld8;
        this.A0A = c143436di;
        this.A02 = AbstractC09440dt.A01(new J7K(this, 4));
        C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        this.A08 = new C06160Ug(null, A00);
        C008002u A002 = C10E.A00(null);
        this.A04 = A002;
        this.A07 = new C06160Ug(null, A002);
        C008002u A003 = C10E.A00(null);
        this.A03 = A003;
        this.A06 = new C06160Ug(null, A003);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC114705Ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AK6(X.C38321qM r14, X.InterfaceC23621Ds r15, boolean r16) {
        /*
            r13 = this;
            r4 = 10
            boolean r0 = X.MAH.A01(r15, r4)
            if (r0 == 0) goto Laa
            r3 = r15
            X.MAH r3 = (X.MAH) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 != r5) goto Lb1
            java.lang.Object r1 = r3.A01
            X.05A r1 = (X.C05A) r1
            X.AbstractC09560e7.A00(r0)
        L28:
            r1.Egh(r0)
        L2b:
            X.0eB r4 = X.C0eB.A00
            return r4
        L2e:
            X.AbstractC09560e7.A00(r0)
            X.0do r0 = r13.A02
            X.0wW r1 = X.AbstractC37300Gc1.A0C(r0)
            java.lang.String r0 = "subscription_exclusive_content_public_preview_select"
            X.0Ai r6 = X.AbstractC166987dD.A0f(r1, r0)
            X.0iw r0 = r13.A00
            X.AbstractC37301Gc2.A15(r6, r0)
            r8 = r14
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r14)
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto Lbb
            long r0 = X.AbstractC31174DnI.A08(r0)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.lang.String r0 = "creator_igid"
            r6.A9K(r0, r2)
            java.lang.String r0 = r14.A2u()
            if (r0 == 0) goto Lb6
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.util.List r1 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r0 = "media_ids"
            r6.AAk(r0, r1)
            java.lang.String r0 = "media_menu"
            X.AbstractC31180DnO.A1I(r6, r0)
            X.6di r0 = r13.A0A
            X.0xq r2 = r0.A01
            java.lang.String r1 = "has_seen_exclusive_content_convert_to_preview_nux"
            boolean r0 = X.AbstractC31172DnG.A1a(r2, r1)
            if (r0 != 0) goto L8b
            X.AbstractC31177DnL.A1N(r2, r1, r5)
            X.05A r0 = r13.A05
            r0.Egh(r14)
            goto L2b
        L8b:
            X.05A r1 = r13.A04
            X.Ld8 r9 = r13.A09
            r3.A01 = r1
            r3.A00 = r5
            X.19L r0 = r9.A01
            X.12W r0 = r0.Arv()
            r10 = 0
            r11 = 14
            X.PZO r7 = new X.PZO
            r12 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r3, r0, r7)
            if (r0 != r4) goto L28
            return r4
        Laa:
            X.MAH r3 = new X.MAH
            r3.<init>(r13, r15, r4)
            goto L16
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r7)
            throw r0
        Lbb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AK6(X.1qM, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC114705Ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AK7(X.C38321qM r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 29
            boolean r0 = X.MAK.A01(r10, r3)
            if (r0 == 0) goto L97
            r5 = r10
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L9e
            java.lang.Object r9 = r5.A02
            java.lang.Object r7 = r5.A01
            X.05A r7 = (X.C05A) r7
            X.AbstractC09560e7.A00(r0)
        L2a:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r9, r0)
            r7.Egh(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L34:
            X.AbstractC09560e7.A00(r0)
            X.0do r0 = r8.A02
            X.0wW r1 = X.AbstractC37300Gc1.A0C(r0)
            java.lang.String r0 = "subscription_exclusive_content_public_preview_remove"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r1, r0)
            X.0iw r0 = r8.A00
            X.AbstractC37301Gc2.A15(r4, r0)
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r9)
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto La8
            long r0 = X.AbstractC31174DnI.A08(r0)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.lang.String r0 = "creator_igid"
            r4.A9K(r0, r2)
            java.lang.String r0 = r9.A2u()
            if (r0 == 0) goto La3
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.util.List r1 = X.AbstractC166987dD.A1J(r2)
            java.lang.String r0 = "media_ids"
            r4.AAk(r0, r1)
            java.lang.String r0 = "media_menu"
            X.AbstractC31180DnO.A1I(r4, r0)
            X.05A r7 = r8.A03
            X.Ld8 r4 = r8.A09
            X.AbstractC31172DnG.A1V(r7, r9, r5, r3)
            X.19L r0 = r4.A01
            X.12W r3 = r0.Arv()
            r2 = 0
            r1 = 13
            X.MCG r0 = new X.MCG
            r0.<init>(r9, r4, r2, r1)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r5, r3, r0)
            if (r0 != r6) goto L2a
            return r6
        L97:
            X.MAK r5 = new X.MAK
            r5.<init>(r8, r10, r3)
            goto L16
        L9e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r7)
            throw r0
        La8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AK7(X.1qM, X.1Ds):java.lang.Object");
    }
}
