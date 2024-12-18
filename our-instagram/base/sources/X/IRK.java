package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRK {
    public static C38822H7p parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            User user = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1J(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("merchant".equals(A0q)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H66 parseFromJson = AbstractC40326HuW.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1D(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text_format".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38822H7p(user, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38822H7p c38822H7p) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1D(anonymousClass182, c38822H7p.A01);
        String str = c38822H7p.A02;
        if (str != null) {
            anonymousClass182.A0S("media_id", str);
        }
        User user = c38822H7p.A00;
        if (user != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user, "merchant");
        }
        List list = c38822H7p.A07;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list);
            while (A0q.hasNext()) {
                H66 h66 = (H66) A0q.next();
                if (h66 != null) {
                    anonymousClass182.A0d();
                    AbstractC37301Gc2.A1D(anonymousClass182, h66.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c38822H7p.A03);
        String str2 = c38822H7p.A04;
        if (str2 != null) {
            anonymousClass182.A0S("text_format", str2);
        }
        String str3 = c38822H7p.A05;
        if (str3 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        }
        String str4 = c38822H7p.A06;
        if (str4 != null) {
            anonymousClass182.A0S("vibrant_text_color", str4);
        }
        anonymousClass182.A0a();
    }
}
