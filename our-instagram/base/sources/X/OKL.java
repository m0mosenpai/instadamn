package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OKL {
    public final C18920wW A00;

    public OKL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(null, userSession);
    }

    public final void A00(Integer num, Integer num2) {
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "smart_glasses_toolkit_navigation_row");
        if (num2.intValue() != 0) {
            str = "click";
        } else {
            str = "impression";
        }
        A0f.AAP("event_type", str);
        switch (num.intValue()) {
            case 0:
                str2 = "glasses_version_number";
                break;
            case 1:
                str2 = "smart_glasses_media";
                break;
            case 2:
                str2 = "streaming_live_from_glasses";
                break;
            default:
                str2 = "more_smart_glasses_content";
                break;
        }
        A0f.AAP("item", str2);
        A0f.Cht();
    }

    public final void A01(String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "smart_glasses_connection_status_outcome");
        A0f.AAP("connection_status", str);
        A0f.AAP("error", str2);
        A0f.Cht();
    }
}
