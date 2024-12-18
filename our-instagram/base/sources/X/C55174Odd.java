package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.LinkedHashMap;

/* renamed from: X.Odd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55174Odd {
    public final C18920wW A00;
    public final String A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public final void A04(int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_reachability_settings_upsell_impression");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "upsell_type", i);
            AbstractC31171DnF.A1G(A0f, this.A01);
            if (i == 2) {
                A0f.A9M("extra_data_map", AbstractC167007dF.A0n("seen", String.valueOf(0)));
            }
            A0f.Cht();
        }
    }

    public final void A06(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, EnumC222416a enumC222416a, String str, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_interop_reachability_setting_client_interaction");
        if (A0f.isSampled()) {
            A0f.AAP("setting_name", A01(str));
            AbstractC166997dE.A1N(A0f, "interaction_type", 1);
            int A00 = A00(directMessagesInteropOptionsViewModel.A00(str));
            if (A00 != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0f, "setting_from_value", A00);
            } else {
                A0f.AAP("setting_from_value", null);
            }
            int A002 = A00(directMessagesInteropOptionsViewModel2.A00(str));
            if (A002 != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0f, "setting_to_value", A002);
            } else {
                A0f.AAP("setting_to_value", null);
            }
            A0f.A7v("setting_change_succeeded", Boolean.valueOf(z3));
            A0f.A9M("extra_data_map", A02(directMessagesInteropOptionsViewModel2, enumC222416a, z, z2));
            AbstractC31175DnJ.A17(A0f, this.A01);
        }
    }

    public static final int A00(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions) {
        if (directMessageInteropReachabilityOptions == null) {
            return Integer.MIN_VALUE;
        }
        switch (directMessageInteropReachabilityOptions.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 5;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public static final LinkedHashMap A02(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, EnumC222416a enumC222416a, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str10 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str = directMessageInteropReachabilityOptions.A03;
        } else {
            str = null;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("ig_followers", str);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str2 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str2 = null;
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("others_on_ig", str2);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions3 != null) {
            str3 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str3 = null;
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("others_on_fb", str3);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions4 != null) {
            str4 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str4 = null;
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L("group_message_setting", str4);
        if (enumC222416a != null) {
            str5 = enumC222416a.A01;
        } else {
            str5 = null;
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("account_type", str5));
        if (enumC222416a != EnumC222416a.A05) {
            if (z) {
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A00;
                if (directMessageInteropReachabilityOptions5 != null) {
                    str8 = directMessageInteropReachabilityOptions5.A03;
                } else {
                    str8 = null;
                }
                A07.put("fb_friends", str8);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A01;
                if (directMessageInteropReachabilityOptions6 != null) {
                    str9 = directMessageInteropReachabilityOptions6.A03;
                } else {
                    str9 = null;
                }
                A07.put("fb_friends_of_friends", str9);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A09;
                if (directMessageInteropReachabilityOptions7 != null) {
                    str10 = directMessageInteropReachabilityOptions7.A03;
                }
                str7 = "people_with_your_phone_number";
                A07.put(str7, str10);
            }
        } else if (z2) {
            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A03;
            if (directMessageInteropReachabilityOptions8 != null) {
                str6 = directMessageInteropReachabilityOptions8.A03;
            } else {
                str6 = null;
            }
            A07.put("fb_messaged_your_page", str6);
            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A02;
            if (directMessageInteropReachabilityOptions9 != null) {
                str10 = directMessageInteropReachabilityOptions9.A03;
            }
            str7 = "fb_liked_or_followed_your_page";
            A07.put(str7, str10);
        }
        return A07;
    }

    public static final void A03(C55174Odd c55174Odd, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, EnumC222416a enumC222416a, String str, boolean z, boolean z2, boolean z3) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c55174Odd.A00, "ig_interop_reachability_settings_suggestion");
        if (A0f.isSampled()) {
            int A00 = A00(directMessagesInteropOptionsViewModel.A00(str));
            int A002 = A00(directMessagesInteropOptionsViewModel2.A00(str));
            if (A00 != Integer.MIN_VALUE && A002 != Integer.MIN_VALUE) {
                if (z3) {
                    str2 = "dialog_confirmed_by_user";
                } else {
                    str2 = "dialog_shown";
                }
                A0f.AAP(AbstractC111324zv.A00(2322), str2);
                A0f.AAP("setting_name", A01(str));
                AbstractC166997dE.A1N(A0f, "setting_from_value", A00);
                AbstractC166997dE.A1N(A0f, "setting_to_value", A002);
                A0f.A9M("extra_data_map", A02(directMessagesInteropOptionsViewModel2, enumC222416a, z, z2));
                A0f.Cht();
            }
        }
    }

    public final void A05(int i, int i2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_reachability_settings_upsell_click");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "upsell_type", i);
            AbstractC166997dE.A1N(A0f, "action_type", i2);
            AbstractC31175DnJ.A17(A0f, this.A01);
        }
    }

    public C55174Odd(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final String A01(String str) {
        switch (str.hashCode()) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return "direct-interop-message-reachability-settings-fb-friends";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return "direct-interop-message-reachability-settings-fb-friends-of-friends";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return "direct-interop-message-reachability-settings-people-with-your-phone-number";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return "direct-interop-message-reachability-settings-fb-messaged-your-page";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -456614348:
                if (str.equals("ig_followers")) {
                    return "direct-interop-message-reachability-settings-ig-followers";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -371252023:
                if (str.equals("ig_verified")) {
                    return "direct-interop-message-reachability-settings-verified-accounts";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return "direct-interop-message-reachability-settings-fb-liked-or-followed-your-page";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return "direct-interop-message-reachability-settings-others-on-fb";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return "direct-interop-message-reachability-settings-others-on-ig";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return "direct-interop-message-reachability-settings-ig-group-settings";
                }
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
            default:
                throw AbstractC31175DnJ.A0V("Invalid MessageInteropOption ", str);
        }
    }
}
