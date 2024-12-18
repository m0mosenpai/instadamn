package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.TimeZone;

/* renamed from: X.Fez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35157Fez {
    public static final C35157Fez A00 = new Object();

    public final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        AbstractC25233BEq.A0x(2, interfaceC11380iw, str2, str3);
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
        A0X.A0x = true;
        A0X.A1G = true;
        A0X.A03 = 0.7f;
        C66277U6x A01 = C66277U6x.A01(str, A00(str2, str3, str4, str5));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = interfaceC11380iw.getModuleName();
        A0C.A00 = 32;
        A0C.A0P = C05F.A01;
        U60 A012 = W6d.A01(A0C, A01);
        A0X.A0T = A012;
        AbstractC31173DnH.A0w(fragmentActivity, A012, A0X);
    }

    public final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC25233BEq.A0x(2, interfaceC11380iw, str2, str3);
        C66277U6x A01 = C66277U6x.A01(str, A00(str2, str3, str4, str5));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        Integer num = C05F.A01;
        A0C.A0P = num;
        A0C.A0R = interfaceC11380iw.getModuleName();
        A0C.A00 = 32;
        A0C.A0P = num;
        A0C.A0S = str6;
        A01.A04(fragmentActivity, A0C);
    }

    public static final HashMap A00(String str, String str2, String str3, String str4) {
        String id;
        C09530e4 A1L = AbstractC166987dD.A1L("customer_id", str);
        C09530e4 A1L2 = AbstractC166987dD.A1L("merchant_id", str2);
        String str5 = "";
        if (str3 == null) {
            str3 = "";
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("appointment_id", str3);
        TimeZone timeZone = TimeZone.getDefault();
        if (timeZone != null && (id = timeZone.getID()) != null) {
            str5 = id;
        }
        return AbstractC06930Yk.A02(A1L, A1L2, A1L3, AbstractC166987dD.A1L("timezone", str5), AbstractC166987dD.A1L("referrer_ui_component", str4));
    }
}
