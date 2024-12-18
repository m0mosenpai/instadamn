package X;

import com.instagram.api.schemas.StoryLinkInfoDict;
import java.io.IOException;

/* renamed from: X.4tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108134tw {
    public static StoryLinkInfoDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("click_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("custom_cta".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("display_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_dynamic_dwell_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_universal_link".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("link_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("link_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("open_external_browser".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("should_read_creator_dynamic_dwell_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("tap_state".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new StoryLinkInfoDict(bool, bool2, bool3, bool4, num, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryLinkInfoDict storyLinkInfoDict, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = storyLinkInfoDict.A05;
        if (str != null) {
            anonymousClass182.A0S("click_id", str);
        }
        String str2 = storyLinkInfoDict.A06;
        if (str2 != null) {
            anonymousClass182.A0S("custom_cta", str2);
        }
        String str3 = storyLinkInfoDict.A07;
        if (str3 != null) {
            anonymousClass182.A0S("display_url", str3);
        }
        Boolean bool = storyLinkInfoDict.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_dynamic_dwell_enabled", bool.booleanValue());
        }
        Boolean bool2 = storyLinkInfoDict.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("is_universal_link", bool2.booleanValue());
        }
        String str4 = storyLinkInfoDict.A08;
        if (str4 != null) {
            anonymousClass182.A0S("link_title", str4);
        }
        String str5 = storyLinkInfoDict.A09;
        if (str5 != null) {
            anonymousClass182.A0S("link_type", str5);
        }
        Boolean bool3 = storyLinkInfoDict.A02;
        if (bool3 != null) {
            anonymousClass182.A0T("open_external_browser", bool3.booleanValue());
        }
        Boolean bool4 = storyLinkInfoDict.A03;
        if (bool4 != null) {
            anonymousClass182.A0T("should_read_creator_dynamic_dwell_enabled", bool4.booleanValue());
        }
        Integer num = storyLinkInfoDict.A04;
        if (num != null) {
            anonymousClass182.A0Q("tap_state", num.intValue());
        }
        String str6 = storyLinkInfoDict.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("url", str6);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
