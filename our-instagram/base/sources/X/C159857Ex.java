package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159857Ex {
    public final /* synthetic */ C159737El A00;

    public C159857Ex(C159737El c159737El) {
        this.A00 = c159737El;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.L7G, java.lang.Object] */
    public final void A00(String str, String str2, String str3, int i) {
        C159737El c159737El = this.A00;
        C159737El.A0Q(null, EnumC46186KcO.A08, c159737El, null);
        c159737El.A0b.A05(null);
        C163997Vo c163997Vo = c159737El.A1i;
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = str2;
        obj.A02 = str3;
        c163997Vo.A06(obj, str, null);
        UserSession userSession = c159737El.A1Z;
        C3DN A01 = AbstractC161537Lo.A01(c159737El.A1R, userSession);
        if (A01 != null) {
            A01.A0B();
        }
        c159737El.A1I(0.0f);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("direct_power_ups_has_sent", true);
        ARD.apply();
    }
}
