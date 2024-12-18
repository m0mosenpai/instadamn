package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fc6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35033Fc6 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;

    public C35033Fc6(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }

    public static C18920wW A00(C35033Fc6 c35033Fc6) {
        UserSession userSession = c35033Fc6.A00;
        InterfaceC60442pS interfaceC60442pS = c35033Fc6.A01;
        C14360o3.A0C(interfaceC60442pS, MSV.A00(9));
        return AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public final void A01(String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "change_notification_setting");
        A0f.AAP("ui_type", str3);
        A0f.AAP("setting_value", str2);
        A0f.AAP(TraceFieldType.ContentType, str);
        A0f.Cht();
    }

    public final void A02(String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1N(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "change_notifications_setting_request");
        A0f.AAP(TraceFieldType.ContentType, str);
        A0f.A7v("success", AbstractC31173DnH.A0e(A0f, "setting_value", str2, z));
        A0f.AAP("ui_type", str3);
        A0f.Cht();
    }

    public final void A03(boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "fetch_notifications_setting");
        A0f.A7v("success", Boolean.valueOf(z));
        A0f.Cht();
    }
}
