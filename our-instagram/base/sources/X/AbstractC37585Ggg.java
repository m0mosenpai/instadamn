package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ggg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37585Ggg implements JI9 {
    public String A00 = AbstractC167017dG.A0j();

    @Override // X.JI9
    public final /* synthetic */ void Ck8(List list) {
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, H8M h8m) {
        interfaceC02590Ai.AAP("afi_type", h8m.A05);
        interfaceC02590Ai.AAP("ad_tracking_token", h8m.A04);
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("extra_data", map);
        interfaceC02590Ai.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_dwell");
        interfaceC02590Ai.AAP("question_id", "main_question");
    }

    @Override // X.JI9
    public final String AaQ() {
        return this.A00;
    }

    @Override // X.JI9
    public final void Ciw() {
        if (this instanceof H8M) {
            H8M h8m = (H8M) this;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(h8m.A03, "instagram_ads_feedback_interface_dismiss");
            if (A0f.isSampled()) {
                AbstractC37301Gc2.A0z(A0f, h8m.A01);
                A01(A0f, h8m, h8m.A02);
                A02(A0f, h8m);
                A03(A0f, H8M.A00(h8m, false));
                AbstractC37301Gc2.A11(A0f, h8m.A00);
                AbstractC37301Gc2.A19(A0f, h8m.A06);
                return;
            }
            return;
        }
        throw C00O.createAndThrow();
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, AbstractC37585Ggg abstractC37585Ggg, long j) {
        interfaceC02590Ai.A9K("ig_userid", Long.valueOf(j));
        interfaceC02590Ai.AAP("afi_id", abstractC37585Ggg.A00);
    }
}
