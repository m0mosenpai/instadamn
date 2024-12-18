package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dpg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31320Dpg {
    public final InterfaceC11380iw A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public final void A00(String str) {
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        String moduleName = interfaceC11380iw.getModuleName();
        C14360o3.A0B(moduleName, 0);
        C09530e4 A1L = AbstractC166987dD.A1L(MSV.A00(100), moduleName);
        C09530e4 A1L2 = AbstractC166987dD.A1L("trigger_event_type", AbstractC31178DnM.A0f("OPEN_PROACTIVE_WARNING_FLOW"));
        C09530e4 A1L3 = AbstractC166987dD.A1L("trigger_session_id", AbstractC25231BEo.A0p());
        LinkedHashMap A0r = AbstractC31180DnO.A0r(AbstractC111324zv.A00(228), AbstractC166997dE.A0o(), A1L, A1L2, A1L3);
        A0r.put("proactive_warning_request_context", str);
        Map A0B = AbstractC06930Yk.A0B(A0r);
        new U79(fragmentActivity, null, interfaceC11380iw, userSession, null, new C33309Eo4(), null, C05F.A00, "com.bloks.www.ig.ixt.triggers.bottom_sheet.proactive_warning_flow", "", A0B).A05();
    }

    public C31320Dpg(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
