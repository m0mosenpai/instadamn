package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123835ix {
    public InterfaceC11380iw A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public boolean A04;
    public User A05;
    public final C18920wW A06;

    public C123835ix(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
    }

    public final void A00(long j, String str, int i, String str2, String str3) {
        String str4 = this.A02;
        if (str4 != null) {
            String str5 = this.A03;
            if (str5 != null) {
                A04(str, str4, str5, str2, str3, i, j);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str4, 4);
        C18920wW c18920wW = this.A06;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "similar_user_dismiss_tapped");
        A00.AAP("target_id", str);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("chaining_profile_id", str2);
        A00.AAP("view_module", str3);
        A00.AAP("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1I();
        } else {
            z = false;
        }
        A00.A7v("is_auto_expand", Boolean.valueOf(z));
        A00.A9K("text_app_aysf_vertical_type", null);
        if (str4.length() != 0) {
            A00.AAP("algorithm", str4);
        }
        if (user != null && C6XI.A01(this.A01, user)) {
            A00.AAP("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A00.AAP("social_context", str5);
        }
        A00.Cht();
    }

    public final void A02(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str4, 4);
        C18920wW c18920wW = this.A06;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "similar_user_follow_button_tapped");
        A00.AAP("target_id", str);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("chaining_profile_id", str2);
        A00.AAP("view_module", str3);
        A00.AAP("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1I();
        } else {
            z = false;
        }
        A00.A7v("is_auto_expand", Boolean.valueOf(z));
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.A9K("text_app_aysf_vertical_type", null);
        if (str4.length() != 0) {
            A00.AAP("algorithm", str4);
        }
        if (user != null && C6XI.A01(this.A01, user)) {
            A00.AAP("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A00.AAP("social_context", str5);
        }
        A00.Cht();
    }

    public final void A03(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str4, 4);
        C18920wW c18920wW = this.A06;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "similar_username_tapped");
        A00.AAP("target_id", str);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("chaining_profile_id", str2);
        A00.AAP("view_module", str3);
        A00.AAP("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1I();
        } else {
            z = false;
        }
        A00.A7v("is_auto_expand", Boolean.valueOf(z));
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.A9K("text_app_aysf_vertical_type", null);
        if (str4.length() != 0) {
            A00.AAP("algorithm", str4);
        }
        if (user != null && C6XI.A01(this.A01, user)) {
            A00.AAP("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A00.AAP("social_context", str5);
        }
        A00.Cht();
    }

    public final void A04(String str, String str2, String str3, String str4, String str5, int i, long j) {
        boolean z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str4, 4);
        C18920wW c18920wW = this.A06;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "similar_user_impression");
        A00.AAP("target_id", str);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("chaining_profile_id", str2);
        A00.AAP("view_module", str3);
        A00.AAP("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1I();
        } else {
            z = false;
        }
        A00.A7v("is_auto_expand", Boolean.valueOf(z));
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.A9K("text_app_aysf_vertical_type", null);
        if (str4.length() != 0) {
            A00.AAP("algorithm", str4);
        }
        if (user != null && C6XI.A01(this.A01, user)) {
            A00.AAP("badge_type", "trending_professional");
        }
        if (j <= 0) {
            int i2 = (int) j;
            if (j == i2) {
                A00.A8p("impression_length", Integer.valueOf(i2));
            } else {
                throw new ArithmeticException();
            }
        }
        if (str5 != null) {
            A00.AAP("social_context", str5);
        }
        A00.Cht();
    }

    public C123835ix(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, String str2) {
        this.A06 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = interfaceC11380iw;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = C2TN.A05(userSession, str);
        this.A05 = user;
        this.A01 = userSession;
    }
}
