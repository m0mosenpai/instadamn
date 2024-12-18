package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.RqJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61595RqJ {
    public long A00;
    public C18920wW A01;
    public C38321qM A02;
    public C37952Gmu A03;
    public String A04;
    public String A05;

    public final void A00(C18920wW c18920wW, Double d, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "mai_play_store_events");
        if (A0f.isSampled()) {
            A0f.AAP("mai_event_name", str);
            A0f.A7v("is_preloading_enabled", null);
            A0f.A9K("itunes_id", null);
            AbstractC37300Gc1.A0o(A0f, str2);
            A0f.A8I("load_duration", null);
            A0f.A7v("did_load_successfully", null);
            A0f.A8I("time_spent", d);
            A0f.A8I("tti", null);
            A0f.A8I("background_time", null);
            A0f.AAP("error", null);
            A0f.AAP(TraceFieldType.ErrorDomain, null);
            A0f.A9K(TraceFieldType.ErrorCode, null);
            A0f.A9K("load_attempt_count", null);
            A0f.A9M("load_params", null);
            A0f.AAP("mai_session_id", null);
            A0f.AAP("presenting_surface", null);
            String str4 = this.A05;
            if (str4 == null) {
                C14360o3.A0F("storeType");
                throw C00O.createAndThrow();
            }
            A0f.AAP("store_type", str4);
            A0f.AAP("app_store_uri", str3);
            A0f.Cht();
        }
    }
}
