package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.49L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49L {
    public final InterfaceC02550Ad A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public C49L(InterfaceC02550Ad interfaceC02550Ad) {
        C49M c49m = C49M.A00;
        C49O c49o = C49O.A00;
        C49Q c49q = C49Q.A00;
        C49S c49s = C49S.A00;
        this.A00 = interfaceC02550Ad;
        this.A01 = c49m;
        this.A03 = c49o;
        this.A04 = c49q;
        this.A02 = c49s;
    }

    public final void A00(C5OM c5om, String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "Pass";
        } else {
            str3 = "Fail";
        }
        C25531Mh c25531Mh = (C25531Mh) this.A01.invoke(this.A00);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0Q("promotion_id", Long.valueOf(Long.parseLong(str)));
            c25531Mh.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
            c25531Mh.A0R("eligibility_result", str3);
            if (c5om != null) {
                ImmutableMap AEd = c5om.AEd();
                if (!AEd.isEmpty()) {
                    c25531Mh.A0w(AEd);
                }
            }
            c25531Mh.Cht();
        }
    }
}
