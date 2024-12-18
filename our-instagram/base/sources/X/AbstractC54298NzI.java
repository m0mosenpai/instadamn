package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.NzI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54298NzI {
    public static final void A00(Nj6 nj6, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num, String str, Map map) {
        String str2;
        String str3;
        String str4;
        EnumC53355Nj5 enumC53355Nj5;
        String str5;
        String str6;
        WorldLocationPagesInfo CHs;
        Integer BF1;
        InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
        if (A0t != null && (BF1 = A0t.BF1()) != null) {
            str2 = BF1.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        InterfaceC43580JMo A0t2 = AbstractC25226BEj.A0t(c38321qM);
        if (A0t2 == null || (str3 = A0t2.getIconicHorizonWorldDeeplink()) == null) {
            str3 = "";
        }
        InterfaceC43580JMo A0t3 = AbstractC25226BEj.A0t(c38321qM);
        if (A0t3 == null || (str4 = A0t3.getIconicHorizonWorldName()) == null) {
            str4 = "";
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        String str7 = null;
        Matcher matcher = Pattern.compile(AbstractC43591JPw.A00(733)).matcher(str3);
        if (matcher.find()) {
            str7 = matcher.group(1);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_world_pages");
        if (A0f.isSampled()) {
            A0f.A8R(nj6, "entry_surface");
            if (c38321qM.A5O()) {
                enumC53355Nj5 = EnumC53355Nj5.CAROUSEL;
            } else if (c38321qM.Cff()) {
                enumC53355Nj5 = EnumC53355Nj5.VIDEO;
            } else {
                enumC53355Nj5 = EnumC53355Nj5.PHOTO;
            }
            MSW.A1O(enumC53355Nj5, A0f);
            InterfaceC43580JMo A0t4 = AbstractC25226BEj.A0t(c38321qM);
            if (A0t4 == null || (CHs = A0t4.CHs()) == null || (str5 = CHs.getWorldId()) == null) {
                str5 = "";
            }
            A0f.AAP("horizon_world_id", str5);
            switch (num.intValue()) {
                case 0:
                    str6 = "mediaTap";
                    break;
                case 1:
                    str6 = "pageImpression";
                    break;
                case 2:
                    str6 = "report";
                    break;
                case 3:
                    str6 = "ctaTap";
                    break;
                case 4:
                    str6 = "storyRingTap";
                    break;
                case 5:
                    str6 = "paginate";
                    break;
                case 6:
                    str6 = "ctaImpression";
                    break;
                default:
                    str6 = "openHorizonProfile";
                    break;
            }
            A0f.AAP("event_name", str6);
            String A2u = c38321qM.A2u();
            if (A2u == null) {
                A2u = "";
            }
            A0f.AAP("initial_media_id", A2u);
            A0f.A9M(Location.EXTRAS, AbstractC06930Yk.A04(map, AbstractC06930Yk.A07(AbstractC166987dD.A1L("currentPresence", str2), AbstractC166987dD.A1L("horizonWorldDeeplink", str3), AbstractC166987dD.A1L("horizonWorldName", str4), AbstractC166987dD.A1L("referralSource", str7))));
            if (str == null) {
                str = "";
            }
            A0f.AAP("target_media_id", str);
            A0f.Cht();
        }
    }
}
