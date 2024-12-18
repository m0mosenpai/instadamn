package X;

import android.view.Window;
import java.util.HashMap;

/* renamed from: X.Eth, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33631Eth {
    public final String A00() {
        if (((GWS) this).A02 != null) {
            return "com.bloks.www.fxcal.link.async";
        }
        C14360o3.A0F("unifiedLauncherFlowConfig");
        throw C00O.createAndThrow();
    }

    public final String A01() {
        FM5 fm5 = ((GWS) this).A02;
        if (fm5 != null) {
            return fm5.A02;
        }
        C14360o3.A0F("unifiedLauncherFlowConfig");
        throw C00O.createAndThrow();
    }

    public final void A02() {
        GWQ gwq = (GWQ) this;
        gwq.A00.markerPoint(444800256, "hide_loading_state");
        C1Z0 A00 = AbstractC34209F7h.A00();
        Window window = ((GWS) gwq).A01;
        if (window != null) {
            A00.A01(window);
        } else {
            C14360o3.A0F("window");
            throw C00O.createAndThrow();
        }
    }

    public void A03() {
        G04 g04 = ((GWQ) this).A02;
        String A01 = A01();
        A00();
        G04.A00(g04, "initial_async_controller_request_success", "", A01, AbstractC166987dD.A1G());
    }

    public void A04(String str) {
        G04 g04 = ((GWQ) this).A02;
        String A01 = A01();
        String A00 = A00();
        HashMap A1G = AbstractC166987dD.A1G();
        C14360o3.A0B(A00, 2);
        G04.A00(g04, "initial_async_controller_request_error", str, A01, A1G);
    }
}
