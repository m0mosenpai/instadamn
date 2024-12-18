package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GrF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38210GrF {
    public final UserSession A00;

    public C38210GrF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        EnumC37745GjK enumC37745GjK;
        boolean A1R = AbstractC167007dF.A1R(0, c38321qM, context);
        Activity activity = (Activity) context;
        UserSession userSession = this.A00;
        if (C14360o3.A0K(interfaceC60442pS.getModuleName(), "explore_popular")) {
            enumC37745GjK = EnumC37745GjK.A06;
        } else {
            enumC37745GjK = EnumC37745GjK.A09;
        }
        new C37605Gh0(activity, userSession, interfaceC60442pS, null, new J07(this, c38321qM), enumC37745GjK, null).A0N(new C5SE(userSession, c38321qM), c38321qM, new C41173IKm(null, null, null, false, A1R, A1R, false, false, A1R, false, false, false, false, false, false, false, false));
    }
}
