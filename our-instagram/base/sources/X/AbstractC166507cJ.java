package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166507cJ {
    public static final void A01(C26065Bft c26065Bft, AbstractC23721Ec abstractC23721Ec, UserSession userSession, EnumC166477cG enumC166477cG, C38321qM c38321qM, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        long j;
        String str5;
        if (enumC166477cG == EnumC166477cG.A05) {
            str3 = String.valueOf(c38321qM.A0d.A07);
            abstractC23721Ec.A0H("max_id", str3);
        } else {
            str3 = "";
        }
        if (enumC166477cG == EnumC166477cG.A03) {
            str3 = String.valueOf(c38321qM.A0d.A08);
            abstractC23721Ec.A0H("min_id", str3);
        }
        String str6 = c26065Bft.A04;
        boolean z2 = false;
        if (str6 != null && str6.length() > 0) {
            abstractC23721Ec.A9s("target_comment_id", str6);
        }
        Integer num = (Integer) c26065Bft.A02;
        if (num != C05F.A0u) {
            abstractC23721Ec.A9s("sort_order", AbstractC166107be.A00(num));
        }
        EnumC166067ba enumC166067ba = (EnumC166067ba) c26065Bft.A01;
        if (enumC166067ba != EnumC166067ba.A04) {
            C14360o3.A0B(enumC166067ba, 0);
            abstractC23721Ec.A9s("comment_filter_param", enumC166067ba.A00);
        }
        if (enumC166477cG == EnumC166477cG.A04 && c26065Bft.A07) {
            abstractC23721Ec.A9s("permalink_enabled", "true");
        }
        if (c26065Bft.A08) {
            abstractC23721Ec.A9s("can_support_carousel_mentions", "true");
        }
        if (c26065Bft.A05) {
            abstractC23721Ec.A9s("can_support_nested_replies", "true");
        }
        abstractC23721Ec.A9s("can_support_threading", "true");
        abstractC23721Ec.A9s("analytics_module", str);
        abstractC23721Ec.A9s("inventory_source", c38321qM.A0C.BJN());
        abstractC23721Ec.A9s(MSV.A00(93), String.valueOf(i));
        abstractC23721Ec.A9s(MSV.A00(34), "false");
        abstractC23721Ec.A9s("carousel_index", String.valueOf(0));
        if (c26065Bft.A06) {
            abstractC23721Ec.A9s("include_preview_comments", "false");
        }
        List list = c38321qM.A0d.A0B.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User user = ((C84923qg) it.next()).A08;
                if (user != null) {
                    str4 = user.getId();
                } else {
                    str4 = null;
                }
                if (C2TN.A05(userSession, str4)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z && !z2) {
            abstractC23721Ec.A08(C05F.A0N);
            j = 3000;
        } else {
            abstractC23721Ec.A04();
            abstractC23721Ec.A00 = 1500L;
            j = 86400000;
        }
        abstractC23721Ec.A01 = j;
        StringBuilder sb = new StringBuilder();
        sb.append("comments_");
        sb.append(str2);
        sb.append('_');
        sb.append(c38321qM.getId());
        sb.append('_');
        sb.append(str3);
        sb.append('_');
        sb.append(str6);
        sb.append('_');
        if (num != null) {
            str5 = AbstractC166107be.A01(num);
        } else {
            str5 = "null";
        }
        sb.append(str5);
        sb.append('_');
        sb.append(enumC166067ba);
        abstractC23721Ec.A0A = sb.toString();
    }

    public static final String A00(InterfaceC37266GbJ interfaceC37266GbJ, UserSession userSession) {
        if (interfaceC37266GbJ != null && C18U.A06(C06090Tz.A05, userSession, 36321039478694993L)) {
            return AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", interfaceC37266GbJ.Baq(), null);
        }
        return null;
    }
}
