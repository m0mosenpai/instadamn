package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;

/* renamed from: X.2QO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QO {
    public C49712Qe A00;
    public final Gson A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2QO(UserSession userSession) {
        this();
        C14360o3.A0B(userSession, 1);
        C17050sx A01 = AbstractC09440dt.A01(new C9F7(29, userSession, this));
        this.A02 = A01;
        String string = ((InterfaceC19630xq) A01.getValue()).getString("tdf_shared_prefs_key", null);
        C49712Qe c49712Qe = (C49712Qe) this.A01.A08(string == null ? "" : string, C49712Qe.class);
        this.A00 = c49712Qe == null ? new C49712Qe(new C49722Qf(new C49732Qg("", C05F.A00), C16910sj.A00)) : c49712Qe;
    }

    public static final void A00(C2QO c2qo) {
        String A0B = c2qo.A01.A0B(c2qo.A00);
        C14360o3.A0A(A0B);
        C14360o3.A0B(A0B, 0);
        InterfaceC19610xo ARD = ((InterfaceC19630xq) c2qo.A02.getValue()).ARD();
        ARD.E7K("tdf_shared_prefs_key", A0B);
        ARD.apply();
    }

    public C2QO() {
        this.A01 = new Gson();
    }
}
