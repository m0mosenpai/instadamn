package X;

import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

/* renamed from: X.CbQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28178CbQ {
    public final InterfaceC02550Ad A00;
    public final CWR A01;
    public final C28172CbJ A02;

    public /* synthetic */ C28178CbQ(FoaUserSession foaUserSession, CWR cwr) {
        C28172CbJ c28172CbJ = new C28172CbJ(foaUserSession, cwr.A05);
        this.A01 = cwr;
        this.A02 = c28172CbJ;
        this.A00 = AbstractC12220kQ.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }

    public static final void A00(C8R c8r, C28178CbQ c28178CbQ, String str) {
        CWR cwr = c28178CbQ.A01;
        CVW cvw = cwr.A05;
        LinkedHashMap A0p = AbstractC25233BEq.A0p("surface_session_id", cvw.A01, AbstractC166987dD.A1L("app_session_id", null));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) c28178CbQ.A00, "meta_ai_intents_image_editing_events");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            A0f.A8R(AbstractC72653Xjv.A00(cwr.A02), "surface");
            A0f.A8R(c8r, "source_image_type");
            A0f.AAP("bottom_sheet_session_id", cvw.A00);
            A0f.AAP("response_image_type", "");
            A0f.A9M("app_context_data", A0p);
            A0f.AAP("surface_string_override", null);
            A0f.Cht();
        }
    }
}
