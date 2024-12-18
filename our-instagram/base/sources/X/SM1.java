package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SM1 {
    public final /* synthetic */ InterfaceC172717mh A00;
    public final /* synthetic */ IABAdsContext A01;
    public final /* synthetic */ UserSession A02;

    public SM1(InterfaceC172717mh interfaceC172717mh, IABAdsContext iABAdsContext, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = interfaceC172717mh;
        this.A01 = iABAdsContext;
    }

    public final InterfaceC72010XEy A00(String str) {
        InterfaceC72010XEy wbJ;
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension;
        if (C14360o3.A0K(str, "1302814060304063")) {
            UserSession userSession = this.A02;
            InterfaceC172717mh interfaceC172717mh = this.A00;
            FragmentActivity activity = interfaceC172717mh.getActivity();
            IABAdsContext iABAdsContext = this.A01;
            DisclaimerText disclaimerText = null;
            if (iABAdsContext != null) {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = iABAdsContext.A02;
                Map map = iABAdsContext.A0D;
                if (map != null) {
                    disclaimerText = (DisclaimerText) map.get(EnumC39621HeV.A06);
                }
            } else {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = null;
            }
            wbJ = new R8X(activity, interfaceC172717mh, disclaimerText, iABAdsMetaCheckoutPaymentsSDKDataExtension, userSession);
        } else {
            UserSession userSession2 = this.A02;
            InterfaceC172717mh interfaceC172717mh2 = this.A00;
            wbJ = new WbJ(interfaceC172717mh2.getActivity(), interfaceC172717mh2, userSession2);
        }
        return wbJ;
    }
}
