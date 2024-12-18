package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GpK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38091GpK implements InterfaceC43071ya {
    public String A00 = "canceled";
    public final UserSession A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            A00(interfaceC57162jr.B0m(c59062n7), "cold");
        }
    }

    public final void A00(long j, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A01), "instagram_explore_head_load");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, "explore_popular");
            A0f.A9K("time_spent", Long.valueOf(j));
            Long A0T = AbstractC37302Gc3.A0T();
            A0f.A9K("time_spent_all_media_rendered", A0T);
            A0f.A9K("time_spent_first_media_rendered", A0T);
            A0f.AAP("event_outcome", this.A00);
            A0f.AAP("load_type", str);
            A0f.Cht();
        }
    }

    public C38091GpK(UserSession userSession) {
        this.A01 = userSession;
    }
}
