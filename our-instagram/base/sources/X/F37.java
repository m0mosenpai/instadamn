package X;

import java.util.Map;

/* loaded from: classes6.dex */
public abstract class F37 {
    public static final void A00(C18920wW c18920wW, String str, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "direct_in_thread_translation_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", map);
            A0f.Cht();
        }
    }
}
