package X;

import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.FxAccountInfo;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FWL {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.nux.cal.model.ConnectContent, X.1um, X.1ul] */
    public static ConnectContent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fb_profile_pic_url".equals(A0s)) {
                    c40791um.A00 = AbstractC222616c.A00(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("fb_profile_name".equals(A0s)) {
                        c40791um.A0D = AbstractC167017dG.A0m(c16l);
                    } else if ("connect_subtitle".equals(A0s)) {
                        c40791um.A08 = AbstractC167017dG.A0m(c16l);
                    } else if ("connect_title".equals(A0s)) {
                        c40791um.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("connect_footer".equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("connect_button_label1".equals(A0s)) {
                        c40791um.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("connect_button_label2".equals(A0s)) {
                        c40791um.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("disclosure_title".equals(A0s)) {
                        c40791um.A0C = AbstractC167017dG.A0m(c16l);
                    } else if ("disclosure_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                ContentText parseFromJson = AbstractC34256F9c.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A0I = arrayList;
                    } else if ("disclosure_button_label1".equals(A0s)) {
                        c40791um.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("disclosure_button_label2".equals(A0s)) {
                        c40791um.A0B = AbstractC167017dG.A0m(c16l);
                    } else if ("partial_screen_primary_button_label".equals(A0s)) {
                        c40791um.A0F = AbstractC167017dG.A0m(c16l);
                    } else if ("partial_screen_toast_text".equals(A0s)) {
                        c40791um.A0G = AbstractC167017dG.A0m(c16l);
                    } else if ("final_screen_toast_text".equals(A0s)) {
                        c40791um.A0E = AbstractC167017dG.A0m(c16l);
                    } else if ("scroll_hint_text".equals(A0s)) {
                        c40791um.A0H = AbstractC167017dG.A0m(c16l);
                    } else if ("ap".equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("target_linked_accounts".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                FxAccountInfo parseFromJson2 = AbstractC34261F9h.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A0J = arrayList;
                    } else if ("target_account".equals(A0s)) {
                        c40791um.A03 = AbstractC34261F9h.parseFromJson(c16l);
                    } else if ("age_restriction_screen".equals(A0s)) {
                        c40791um.A01 = AbstractC34260F9g.parseFromJson(c16l);
                    } else if ("initiator_account".equals(A0s)) {
                        c40791um.A02 = AbstractC34261F9h.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
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
