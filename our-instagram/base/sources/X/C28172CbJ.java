package X;

import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

/* renamed from: X.CbJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28172CbJ {
    public final InterfaceC02550Ad A00;
    public final CVW A01;

    public static final void A00(C8f c8f, EnumC72434Xde enumC72434Xde, C28172CbJ c28172CbJ, String str, String str2) {
        CVW cvw = c28172CbJ.A01;
        C09530e4 A1L = AbstractC166987dD.A1L("app_session_id", null);
        String str3 = cvw.A01;
        LinkedHashMap A0p = AbstractC25233BEq.A0p("surface_session_id", str3, A1L);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) c28172CbJ.A00, "meta_ai_intents_platform_events");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            A0f.A8R(enumC72434Xde, "surface");
            A0f.A8R(c8f, "intent_name");
            A0f.AAP("bottom_sheet_session_id", cvw.A00);
            if (str3 == null) {
                str3 = "";
            }
            A0f.AAP("surface_session_id", str3);
            A0f.AAP("feedback_type", str2);
            A0f.A9M("app_context_data", A0p);
            A0f.AAP("surface_string_override", null);
            A0f.Cht();
        }
    }

    public C28172CbJ(FoaUserSession foaUserSession, CVW cvw) {
        this.A01 = cvw;
        this.A00 = AbstractC12220kQ.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }
}
