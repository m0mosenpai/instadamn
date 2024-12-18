package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.4ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102124ii {
    public static C102134ij parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool = null;
            String str8 = null;
            String str9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("accessibility_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("avatar_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("avatar_revision_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("avatar_sticker_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("avatar_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("custom_avatar_cdn_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("expression_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("has_avatar".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C102134ij(bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C102134ij c102134ij) {
        anonymousClass182.A0d();
        String str = c102134ij.A01;
        if (str != null) {
            anonymousClass182.A0S("accessibility_label", str);
        }
        String str2 = c102134ij.A02;
        if (str2 != null) {
            anonymousClass182.A0S("avatar_id", str2);
        }
        String str3 = c102134ij.A03;
        if (str3 != null) {
            anonymousClass182.A0S("avatar_revision_id", str3);
        }
        String str4 = c102134ij.A04;
        if (str4 != null) {
            anonymousClass182.A0S("avatar_sticker_id", str4);
        }
        String str5 = c102134ij.A05;
        if (str5 != null) {
            anonymousClass182.A0S("avatar_style", str5);
        }
        String str6 = c102134ij.A06;
        if (str6 != null) {
            anonymousClass182.A0S("custom_avatar_cdn_url", str6);
        }
        String str7 = c102134ij.A07;
        if (str7 != null) {
            anonymousClass182.A0S("expression_id", str7);
        }
        Boolean bool = c102134ij.A00;
        if (bool != null) {
            anonymousClass182.A0T("has_avatar", bool.booleanValue());
        }
        String str8 = c102134ij.A08;
        if (str8 != null) {
            anonymousClass182.A0S("media_type", str8);
        }
        String str9 = c102134ij.A09;
        if (str9 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        }
        anonymousClass182.A0a();
    }
}
