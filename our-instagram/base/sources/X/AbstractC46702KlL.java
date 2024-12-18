package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.KlL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46702KlL {
    public static void A00(MUW muw, C18920wW c18920wW, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        String str2;
        String str3;
        String str4;
        Long l;
        Number number;
        String str5;
        Number number2;
        if (C18U.A06(C06090Tz.A05, userSession, 36328229255134562L)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "direct_expression_tray_tap");
            if (A0f.isSampled()) {
                String str6 = null;
                if (directThreadKey != null) {
                    str2 = AbstractC43827JZq.A01(directThreadKey);
                } else {
                    str2 = null;
                }
                AbstractC31171DnF.A1H(A0f, str2);
                if (muw != null) {
                    str3 = muw.A03;
                } else {
                    str3 = null;
                }
                A0f.AAP("target", str3);
                if (muw != null && (number2 = (Number) muw.A00) != null) {
                    switch (number2.intValue()) {
                        case 1:
                            str4 = "tap_hscroll";
                            break;
                        case 2:
                            str4 = "see_more";
                            break;
                        case 3:
                            str4 = "edit_avatar";
                            break;
                        case 4:
                            str4 = "create_sticker";
                            break;
                        default:
                            str4 = "tab_switch";
                            break;
                    }
                } else {
                    str4 = null;
                }
                AbstractC31171DnF.A1C(A0f, str4);
                if (muw != null && (str5 = muw.A02) != null) {
                    l = AbstractC166997dE.A0j(str5);
                } else {
                    l = null;
                }
                A0f.A9K("pack_id", l);
                if (muw != null && (number = (Number) muw.A01) != null) {
                    switch (number.intValue()) {
                        case 1:
                            str6 = "favorite";
                            break;
                        case 2:
                            str6 = "your_sticker";
                            break;
                        case 3:
                            str6 = "create_sticker";
                            break;
                        case 4:
                            str6 = "giphy";
                            break;
                        default:
                            str6 = "recent";
                            break;
                    }
                }
                A0f.AAP("category", str6);
                A0f.AAP("bottom_sheet_session_id", str);
                A0f.Cht();
            }
        }
    }
}
