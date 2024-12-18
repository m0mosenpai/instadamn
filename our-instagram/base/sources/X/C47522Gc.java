package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47522Gc {
    public final C2Hn A00;
    public final Gson A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;

    public final void A00() {
        String A0B = this.A01.A0B(this.A00);
        C14360o3.A0A(A0B);
        C14360o3.A0B(A0B, 0);
        InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A03.getValue()).ARD();
        ARD.E7K("autofill_shared_prefs_key", A0B);
        ARD.apply();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, X.2Hn] */
    public C47522Gc(UserSession userSession) {
        this();
        this.A02 = userSession;
        C17050sx A01 = AbstractC09440dt.A01(new C206889Dt(this, 11));
        this.A03 = A01;
        String string = ((InterfaceC19630xq) A01.getValue()).getString("autofill_shared_prefs_key", null);
        C2Hn c2Hn = (C2Hn) this.A01.A08(string == null ? "" : string, C2Hn.class);
        C2Hn c2Hn2 = c2Hn;
        if (c2Hn == null) {
            HashMap hashMap = new HashMap();
            C2I1 c2i1 = C2I1.NONE;
            ?? obj = new Object();
            obj.A02 = 0L;
            obj.A01 = 0L;
            obj.A00 = 0;
            obj.A05 = hashMap;
            obj.A03 = c2i1;
            obj.A04 = c2i1;
            c2Hn2 = obj;
        }
        this.A00 = c2Hn2;
    }

    public C47522Gc() {
        this.A01 = new Gson();
    }
}
