package X;

import com.instagram.common.session.UserSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.LKk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47993LKk {
    public static final C47993LKk A00 = new Object();

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num, String str) {
        String str2;
        Integer num2;
        String str3;
        String str4;
        String str5;
        String iconicHorizonWorldDeeplink;
        if (c38321qM != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_iconic_entrypoints");
            if (A0f.isSampled()) {
                A0f.AAP("event_name", str);
                A0f.AAP("media_id", c38321qM.A0C.getPk());
                switch (num.intValue()) {
                    case 0:
                        str2 = "reels";
                        break;
                    case 1:
                        str2 = "feed";
                        break;
                    default:
                        str2 = "stories";
                        break;
                }
                A0f.AAP("product_type", str2);
                if (c38321qM.A5O()) {
                    num2 = C05F.A00;
                } else if (c38321qM.Cff()) {
                    num2 = C05F.A0C;
                } else {
                    num2 = C05F.A01;
                }
                switch (num2.intValue()) {
                    case 0:
                        str3 = "carousel";
                        break;
                    case 1:
                        str3 = "photo";
                        break;
                    default:
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                        break;
                }
                A0f.AAP("media_type", str3);
                InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
                String str6 = null;
                if (CHL != null) {
                    str4 = CHL.getIconicHorizonWorldDeeplink();
                } else {
                    str4 = null;
                }
                A0f.AAP(MSV.A00(428), str4);
                InterfaceC43580JMo CHL2 = c38321qM.A0C.CHL();
                if (CHL2 != null) {
                    str6 = CHL2.getIconicHorizonWorldDeeplink();
                }
                String str7 = null;
                if (str6 != null) {
                    Matcher matcher = Pattern.compile("[?&]r=([^&]*)").matcher(str6);
                    if (matcher.find()) {
                        str7 = matcher.group(1);
                    }
                }
                A0f.AAP("referral_source", str7);
                InterfaceC43580JMo CHL3 = c38321qM.A0C.CHL();
                if (CHL3 != null && (iconicHorizonWorldDeeplink = CHL3.getIconicHorizonWorldDeeplink()) != null) {
                    str5 = android.net.Uri.parse(iconicHorizonWorldDeeplink).getQueryParameter("hwsh");
                } else {
                    str5 = null;
                }
                A0f.AAP("hwsh", str5);
                A0f.Cht();
            }
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        if (!F28.A00(userSession) && str != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_iconic_entrypoints_dm");
            if (A0f.isSampled()) {
                AbstractC43593JPy.A1J(A0f, "impression");
            }
        }
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        if (!F28.A00(userSession) && str != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_iconic_entrypoints_dm");
            if (A0f.isSampled()) {
                AbstractC43593JPy.A1J(A0f, "cta_tap");
            }
        }
    }

    public final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        A00(interfaceC11380iw, userSession, c38321qM, num, "cta_tap");
    }

    public final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        A00(interfaceC11380iw, userSession, c38321qM, num, "impression");
    }
}
