package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public abstract class F9Y {
    public static void A00(Context context, Handler handler, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, GY6 gy6, RegFlowExtras regFlowExtras, EVN evn, EnumC31713DwI enumC31713DwI, String str, String str2, String str3) {
        regFlowExtras.A0k = true;
        C35037FcA A06 = C1Q9.A15.A02(c07270a1).A06(regFlowExtras.A01(), enumC31713DwI);
        A06.A04("existing_user_username", str);
        A06.A02();
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0o(AbstractC25225BEi.A0t(str2), abstractC59962oe);
        A0I.A05 = AbstractC167007dF.A0f(context, str, 2131969562);
        A0I.A09(2131969559);
        A0I.A0Z(new DialogInterfaceOnClickListenerC35379Fiu(handler, abstractC59962oe, c07270a1, gy6, regFlowExtras, evn, enumC31713DwI, str3, str, 1), EnumC193348hE.A03, AbstractC166997dE.A0r(context.getResources(), str, 2131969561), true);
        A0I.A0Q(new DialogInterfaceOnClickListenerC35379Fiu(handler, abstractC59962oe, c07270a1, gy6, regFlowExtras, evn, enumC31713DwI, str3, str, 0), EnumC193348hE.A04, 2131969560);
        AbstractC31178DnM.A1R(A0I, false);
    }
}
