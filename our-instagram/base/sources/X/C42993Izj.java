package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Izj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42993Izj implements InterfaceC64212vg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ String A02;

    public C42993Izj(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A02 = str;
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        String str;
        C38321qM c38321qM = (C38321qM) obj;
        AbstractC167027dH.A12(c38321qM, obj2, enumC64262vl);
        String id = c38321qM.getId();
        if (id == null) {
            id = "n/a";
        }
        if (c38321qM.CdW() && c38321qM.A2W() != null) {
            str = c38321qM.A2W();
            if (str == null) {
                throw AbstractC25227BEk.A0n();
            }
        } else {
            str = id;
        }
        return new C82573mL(enumC64262vl, str, this.A02, id, this.A01.getModuleName(), AbstractC37302Gc3.A0c(c38321qM), AbstractC82563mK.A03(this.A00, c38321qM), f, 0, -1, -1, -1, -1, -1, -1, AbstractC82563mK.A00(c38321qM), j, j2);
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return AbstractC82563mK.A01(AbstractC37301Gc2.A0H(obj));
    }
}