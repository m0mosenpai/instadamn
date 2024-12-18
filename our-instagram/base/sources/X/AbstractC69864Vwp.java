package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vwp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69864Vwp {
    public static C109914xJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            C66643URh c66643URh = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Long l = null;
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("charity_user".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("consumption_sheet_config".equals(A0s)) {
                    c66643URh = VVY.parseFromJson(c16l);
                } else if ("donations_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("donations_count_current_session_only".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("formatted_amount_raised".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("formatted_amount_raised_current_session_only".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("formatted_amount_raised_during_live_str".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("formatted_amount_raised_of_goal_amount_str".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("formatted_donations_count".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("formatted_donations_count_current_session_only".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("fundraiser_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("live_fundraiser_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("standalone_fundraiser_id".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            return new C109914xJ(c66643URh, user, num, num2, l, l2, str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109914xJ c109914xJ) {
        anonymousClass182.A0d();
        User user = c109914xJ.A01;
        if (user != null) {
            anonymousClass182.A0r("charity_user");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        C66643URh c66643URh = c109914xJ.A00;
        if (c66643URh != null) {
            anonymousClass182.A0r("consumption_sheet_config");
            anonymousClass182.A0d();
            Boolean bool = c66643URh.A01;
            if (bool != null) {
                anonymousClass182.A0T("can_viewer_donate", bool.booleanValue());
            }
            UQt uQt = c66643URh.A00;
            if (uQt != null) {
                anonymousClass182.A0r("donation_amount_config");
                anonymousClass182.A0d();
                Integer num = uQt.A00;
                if (num != null) {
                    anonymousClass182.A0Q("default_selected_donation_value", num.intValue());
                }
                List list = uQt.A05;
                if (list != null) {
                    Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "donation_amount_selector_values", list);
                    while (A0q.hasNext()) {
                        Number number = (Number) A0q.next();
                        if (number != null) {
                            anonymousClass182.A0h(number.intValue());
                        }
                    }
                    anonymousClass182.A0Z();
                }
                Integer num2 = uQt.A01;
                if (num2 != null) {
                    anonymousClass182.A0Q("maximum_donation_amount", num2.intValue());
                }
                Integer num3 = uQt.A02;
                if (num3 != null) {
                    anonymousClass182.A0Q("minimum_donation_amount", num3.intValue());
                }
                Integer num4 = uQt.A03;
                if (num4 != null) {
                    anonymousClass182.A0Q("prefill_amount", num4.intValue());
                }
                String str = uQt.A04;
                if (str != null) {
                    anonymousClass182.A0S("user_currency", str);
                }
                anonymousClass182.A0a();
            }
            String str2 = c66643URh.A02;
            if (str2 != null) {
                anonymousClass182.A0S("donation_disabled_message", str2);
            }
            String str3 = c66643URh.A03;
            if (str3 != null) {
                anonymousClass182.A0S("donation_url", str3);
            }
            String str4 = c66643URh.A04;
            if (str4 != null) {
                anonymousClass182.A0S("privacy_disclaimer", str4);
            }
            String str5 = c66643URh.A05;
            if (str5 != null) {
                anonymousClass182.A0S("profile_fundraiser_id", str5);
            }
            String str6 = c66643URh.A06;
            if (str6 != null) {
                anonymousClass182.A0S("you_donated_message", str6);
            }
            anonymousClass182.A0a();
        }
        Integer num5 = c109914xJ.A02;
        if (num5 != null) {
            anonymousClass182.A0Q("donations_count", num5.intValue());
        }
        Integer num6 = c109914xJ.A03;
        if (num6 != null) {
            anonymousClass182.A0Q("donations_count_current_session_only", num6.intValue());
        }
        String str7 = c109914xJ.A06;
        if (str7 != null) {
            anonymousClass182.A0S("formatted_amount_raised", str7);
        }
        String str8 = c109914xJ.A07;
        if (str8 != null) {
            anonymousClass182.A0S("formatted_amount_raised_current_session_only", str8);
        }
        String str9 = c109914xJ.A08;
        if (str9 != null) {
            anonymousClass182.A0S("formatted_amount_raised_during_live_str", str9);
        }
        String str10 = c109914xJ.A09;
        if (str10 != null) {
            anonymousClass182.A0S("formatted_amount_raised_of_goal_amount_str", str10);
        }
        String str11 = c109914xJ.A0A;
        if (str11 != null) {
            anonymousClass182.A0S("formatted_donations_count", str11);
        }
        String str12 = c109914xJ.A0B;
        if (str12 != null) {
            anonymousClass182.A0S("formatted_donations_count_current_session_only", str12);
        }
        String str13 = c109914xJ.A0C;
        if (str13 != null) {
            anonymousClass182.A0S("formatted_goal_amount", str13);
        }
        String str14 = c109914xJ.A0D;
        if (str14 != null) {
            anonymousClass182.A0S("fundraiser_title", str14);
        }
        Long l = c109914xJ.A04;
        if (l != null) {
            anonymousClass182.A0R("live_fundraiser_id", l.longValue());
        }
        Long l2 = c109914xJ.A05;
        if (l2 != null) {
            anonymousClass182.A0R("standalone_fundraiser_id", l2.longValue());
        }
        anonymousClass182.A0a();
    }
}
