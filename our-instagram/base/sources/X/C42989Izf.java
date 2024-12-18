package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Izf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42989Izf implements InterfaceC64212vg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C42989Izf(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C38321qM c38321qM = (C38321qM) obj;
        AbstractC167027dH.A12(c38321qM, obj2, enumC64262vl);
        String id = c38321qM.getId();
        if (id != null) {
            String str = this.A01;
            String id2 = c38321qM.getId();
            if (id2 != null) {
                return new C82573mL(enumC64262vl, id, str, id2, "feed_timeline", AbstractC111324zv.A00(1026), AbstractC82563mK.A03(this.A00, c38321qM), f, 0, -1, -1, -1, -1, -1, -1, AbstractC82563mK.A00(c38321qM), j, j2);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return AbstractC82563mK.A01(AbstractC37301Gc2.A0H(obj));
    }
}
