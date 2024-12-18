package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

/* loaded from: classes4.dex */
public abstract class AE4 {
    public static final void A00(UserSession userSession, C55U c55u, InterfaceC60442pS interfaceC60442pS, InterfaceC53892dT interfaceC53892dT, String str) {
        C55U c55u2 = c55u;
        A01(userSession, interfaceC60442pS, AbstractC111324zv.A00(2689));
        AbstractC208269Jl.A00(userSession).A07(AbstractC189418aK.A00(str), true);
        CameraConfiguration cameraConfiguration = null;
        if (c55u != null) {
            if (c55u2 instanceof C128535rM) {
                MX1.A01(userSession).A04(C22P.A0a);
            }
        } else {
            if (str.equals("camera_tab_bar") || str.equals("camera_action_bar_button_main_feed")) {
                MX1.A01(userSession).A04(C22P.A0a);
                c55u2 = C128535rM.A00;
            }
            interfaceC53892dT.FBp(new PositionConfig(null, cameraConfiguration, null, str, null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
        }
        cameraConfiguration = C82R.A00(c55u2, new C81W[0]);
        interfaceC53892dT.FBp(new PositionConfig(null, cameraConfiguration, null, str, null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
    }

    public static final void A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        if (interfaceC60442pS != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_navigation_header_clicked");
            if (A0f.isSampled()) {
                A0f.AAP("destination_section", str);
                A0f.AAP("container_module", interfaceC60442pS.getModuleName());
                A0f.Cht();
            }
        }
    }
}
