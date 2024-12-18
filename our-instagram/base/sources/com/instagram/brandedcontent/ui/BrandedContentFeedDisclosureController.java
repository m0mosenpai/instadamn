package com.instagram.brandedcontent.ui;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC54944ORu;
import X.AbstractC59962oe;
import X.AbstractC60592pi;
import X.C05F;
import X.C07S;
import X.C07Y;
import X.C14360o3;
import X.C16930sl;
import X.C50163MDq;
import X.C50259MHo;
import X.C50695MZq;
import X.C51121MiQ;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.LL0;
import X.MC8;
import X.OGF;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class BrandedContentFeedDisclosureController extends AbstractC60592pi implements InterfaceC11380iw {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final C51121MiQ A04;

    public BrandedContentFeedDisclosureController(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A04 = new C51121MiQ(new C50259MHo(this, 26));
        this.A03 = AbstractC09440dt.A01(new C50163MDq(this, 22));
        AbstractC59962oe abstractC59962oe2 = this.A01;
        C07S c07s = C07S.STARTED;
        AbstractC166987dD.A1Z(new MC8(c07s, this, abstractC59962oe2, null, 13), C07Y.A00(abstractC59962oe2));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "BrandedContentFeedDisclosureController";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[LOOP:1: B:18:0x00b3->B:20:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r11, java.util.List r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController.A00(com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController, java.util.List, X.1Ds):java.lang.Object");
    }

    public final void A01(User user) {
        OGF ogf = AbstractC54944ORu.A00;
        UserSession userSession = this.A02;
        C50695MZq.A00(userSession, ogf.A00(null, null, userSession, user, C16930sl.A00, false, false));
        Integer num = C05F.A0H;
        Integer num2 = C05F.A00;
        LL0.A02(this, userSession, num, num2, num2);
    }
}
