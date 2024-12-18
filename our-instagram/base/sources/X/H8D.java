package X;

import android.content.Context;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class H8D extends AbstractC77583di {
    public static final C51532Yb A04 = new C51532Yb(C77603dk.A00, C42105IlF.A00, 3, false);
    public final UserSession A00;
    public final C38321qM A01;
    public final String A02;
    public final C51722Yv A03;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        UserSession userSession = this.A00;
        Context context = c77993eR.A05.A0C;
        C14360o3.A07(context);
        C55101ObE c55101ObE = new C55101ObE(userSession, context);
        return new C78053eX(this.A03, C29050Crd.A00, new C2YP(A04, C43186J7j.A00, new C50364MLq(32, c77993eR, c55101ObE, this), c77993eR.A01()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
    
        if (r10 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Context r12, X.H8D r13, X.C55101ObE r14) {
        /*
            com.instagram.common.session.UserSession r8 = r13.A00
            r4 = 0
            X.0Tz r11 = X.AbstractC25225BEi.A0j(r8, r4)
            r0 = 2342163254124683441(0x20810912001320b1, double:4.065793543981252E-152)
            boolean r2 = X.C18U.A06(r11, r8, r0)
            if (r2 != 0) goto L26
            X.1My r7 = X.AbstractC25651Mw.A00(r8)
            X.1qM r2 = r13.A01
            java.lang.String r6 = r2.A2u()
            r5 = 1
            r3 = 0
            X.Ine r2 = new X.Ine
            r2.<init>(r6, r5, r3)
            r7.E4s(r2)
        L26:
            X.1qM r6 = r13.A01
            java.lang.String r2 = r6.A2u()
            java.lang.Long r7 = X.C55101ObE.A00(r2)
            com.instagram.common.session.UserSession r2 = r14.A07
            X.0iw r5 = r14.A05
            X.0wW r3 = X.AbstractC12220kQ.A01(r5, r2)
            java.lang.String r2 = "instagram_open_carousel_tap"
            X.0Ai r3 = X.AbstractC166987dD.A0f(r3, r2)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L57
            X.Hih r2 = X.EnumC39652Hih.A0e
            X.AbstractC25225BEi.A1M(r2, r3)
            X.AbstractC25229BEm.A1A(r3, r5)
            java.lang.String r2 = r14.A08
            X.AbstractC25225BEi.A1N(r3, r2)
            X.AbstractC37300Gc1.A0h(r3, r7)
            r3.Cht()
        L57:
            X.22P r5 = X.C22P.A3l
            X.0sk r2 = X.AbstractC06930Yk.A0E()
            r3 = 0
            java.lang.String r5 = X.C55101ObE.A01(r5, r14, r7, r3, r2)
            X.IbI r7 = new X.IbI
            r7.<init>(r8)
            java.lang.String r10 = r13.A02
            r8 = 4
            X.HGg r2 = new X.HGg
            r2.<init>(r13, r8)
            r8 = 0
            if (r10 == 0) goto Ld9
            java.lang.String r9 = "_"
            java.util.List r9 = X.AbstractC167007dF.A0m(r10, r9, r4)
            if (r9 == 0) goto Ld9
            java.lang.Object r9 = X.AbstractC001800i.A0J(r9)
            java.lang.String r9 = (java.lang.String) r9
        L80:
            com.instagram.common.session.UserSession r10 = r7.A00
            boolean r0 = X.C18U.A06(r11, r10, r0)
            if (r0 == 0) goto Ldd
            X.1Ms r7 = X.AbstractC167017dG.A0c(r10)
            java.lang.String r0 = "media/configure_to_accept_pending_media/"
            r7.A0B(r0)
            java.lang.String r0 = "parent_media_id"
            r7.A9s(r0, r9)
            java.lang.String r1 = r6.A2u()
            java.lang.String r0 = "media_id"
            r7.A9s(r0, r1)
            java.lang.String r1 = r6.A2u()
            r0 = 1486(0x5ce, float:2.082E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r7.A9s(r0, r1)
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r6)
            if (r0 == 0) goto Lb6
            java.lang.String r8 = r0.getId()
        Lb6:
            java.lang.String r0 = "previous_submitter_id"
            r7.A9s(r0, r8)
            r1 = 617(0x269, float:8.65E-43)
            java.lang.String r0 = "camera_entry_point"
            r7.A0D(r0, r1)
            r0 = 424(0x1a8, float:5.94E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r7.A9s(r0, r5)
            java.lang.Class<X.H9I> r1 = X.H9I.class
            java.lang.Class<X.IOS> r0 = X.IOS.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r3, r7, r1, r0, r4)
            r1.A00 = r2
        Ld5:
            X.C1GJ.A03(r1)
            return
        Ld9:
            r9 = r3
            if (r10 == 0) goto Ldd
            goto L80
        Ldd:
            com.instagram.common.session.UserSession r1 = r7.A00
            java.lang.String r0 = "open_carousel_review_page"
            X.5eQ r1 = X.AbstractC50633MWu.A00(r12, r1, r6, r0)
            X.NFP r0 = new X.NFP
            r0.<init>(r12, r6, r7, r9)
            r1.A00 = r0
            goto Ld5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8D.A03(android.content.Context, X.H8D, X.ObE):void");
    }

    public static final void A04(H8D h8d, C55101ObE c55101ObE) {
        List list;
        C38321qM c38321qM = h8d.A01;
        Long A00 = C55101ObE.A00(c38321qM.A2u());
        UserSession userSession = c55101ObE.A07;
        InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_open_carousel_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(EnumC39652Hih.A0f, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
            AbstractC37300Gc1.A0h(A0f, A00);
            A0f.Cht();
        }
        C41627IbI c41627IbI = new C41627IbI(h8d.A00);
        String str = h8d.A02;
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            list = AbstractC166987dD.A1J(A2u);
        } else {
            list = null;
        }
        c41627IbI.A01(SubmittedSubPostManageType.A07, new C39030HGg(h8d, 5), str, null, list);
    }

    public H8D(C51722Yv c51722Yv, UserSession userSession, C38321qM c38321qM, String str) {
        this.A03 = c51722Yv;
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = c38321qM;
    }
}
