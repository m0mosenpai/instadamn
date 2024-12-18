package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OQ6 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.N3R, X.1um, X.1ul] */
    public static N3R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ig_followers".equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("fb_friends".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("fb_friends_of_friends".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("people_with_your_phone_number".equals(A0s)) {
                    c40791um.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("others_on_ig".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("others_on_fb".equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("fb_messaged_your_page".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("fb_liked_or_followed_your_page".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("eligible_for_linked_page_ig_dm_access".equals(A0s)) {
                    c40791um.A0B = c16l.A0d();
                } else if ("setting_enabled_for_linked_page_ig_dm_access".equals(A0s)) {
                    c40791um.A00 = AbstractC166997dE.A0d(c16l);
                } else if ("group_message_setting".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("ig_verified".equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
