package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ALg {
    public static void A03(InterfaceC02590Ai interfaceC02590Ai, String str, Map map) {
        interfaceC02590Ai.A7v("is_offensive", true);
        interfaceC02590Ai.AAP(AbstractC50532MSl.A00(), str);
        interfaceC02590Ai.A9M("extra_values", map);
        interfaceC02590Ai.Cht();
    }

    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, AbstractC111324zv.A00(2576));
        A0f.AAP("source_of_action", str);
        A0f.AAP("text_language", str2);
        A03(A0f, str3, A1G);
    }

    public static final void A01(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, "instagram_wellbeing_warning_system_tiered_warning");
        A0f.AAP("source_of_action", str2);
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A03(A0f, str3, A1G);
    }

    public static final void A02(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, AbstractC111324zv.A00(4706));
        A0f.AAP("source_of_action", str);
        A0f.AAP("text_language", str2);
        A03(A0f, str3, A1G);
    }
}
