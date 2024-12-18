package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes9.dex */
public abstract class OY8 {
    public static DirectMessagesInteropOptionsViewModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = new DirectMessagesInteropOptionsViewModel();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ig_followers".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A05 = A00(c16l);
                } else if ("fb_friends".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A00 = A00(c16l);
                } else if ("fb_friends_of_friends".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A01 = A00(c16l);
                } else if ("people_with_your_phone_number".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A09 = A00(c16l);
                } else if ("others_on_ig".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A08 = A00(c16l);
                } else if ("others_on_fb".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A07 = A00(c16l);
                } else if ("fb_messaged_your_page".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A03 = A00(c16l);
                } else if ("fb_liked_or_followed_your_page".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A02 = A00(c16l);
                } else if ("group_message_setting".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A04 = A00(c16l);
                } else if ("ig_verified".equals(A0s)) {
                    directMessagesInteropOptionsViewModel.A06 = A00(c16l);
                }
                c16l.A0z();
            }
            return directMessagesInteropOptionsViewModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static DirectMessageInteropReachabilityOptions A00(C16L c16l) {
        return AbstractC54192NxW.A00(c16l.A1P());
    }

    public static String A01(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        if (directMessageInteropReachabilityOptions != null) {
            A0S.A0S("ig_followers", directMessageInteropReachabilityOptions.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions2 != null) {
            A0S.A0S("fb_friends", directMessageInteropReachabilityOptions2.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions3 != null) {
            A0S.A0S("fb_friends_of_friends", directMessageInteropReachabilityOptions3.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions4 != null) {
            A0S.A0S("people_with_your_phone_number", directMessageInteropReachabilityOptions4.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions5 != null) {
            A0S.A0S("others_on_ig", directMessageInteropReachabilityOptions5.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions6 != null) {
            A0S.A0S("others_on_fb", directMessageInteropReachabilityOptions6.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A03;
        if (directMessageInteropReachabilityOptions7 != null) {
            A0S.A0S("fb_messaged_your_page", directMessageInteropReachabilityOptions7.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A02;
        if (directMessageInteropReachabilityOptions8 != null) {
            A0S.A0S("fb_liked_or_followed_your_page", directMessageInteropReachabilityOptions8.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions9 != null) {
            A0S.A0S("group_message_setting", directMessageInteropReachabilityOptions9.A03);
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10 = directMessagesInteropOptionsViewModel.A06;
        if (directMessageInteropReachabilityOptions10 != null) {
            A0S.A0S("ig_verified", directMessageInteropReachabilityOptions10.A03);
        }
        return AbstractC167017dG.A0l(A0S, A0O);
    }
}
