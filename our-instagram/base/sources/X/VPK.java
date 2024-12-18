package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThreadThemeType;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VPK {
    public static C45069Jwy parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            C45123Jxs c45123Jxs = null;
            String str = null;
            ArrayList arrayList2 = null;
            URS urs = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ThreadThemeType threadThemeType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alternative_themes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C45069Jwy parseFromJson = parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("background_asset".equals(A0s)) {
                    c45123Jxs = VPH.parseFromJson(c16l);
                } else if ("background_preview_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("gradient_colors".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("icon_asset".equals(A0s)) {
                    urs = VPI.parseFromJson(c16l);
                } else if ("icon_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_deprecated".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("theme_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("theme_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    threadThemeType = (ThreadThemeType) ThreadThemeType.A01.get(A1P);
                    if (threadThemeType == null) {
                        threadThemeType = ThreadThemeType.A09;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("alternative_themes", c16l, "ThreadTheme");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("gradient_colors", c16l, "ThreadTheme");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("icon_url", c16l, "ThreadTheme");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_deprecated", c16l, "ThreadTheme");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "ThreadTheme");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("theme_id", c16l, "ThreadTheme");
                } else if (threadThemeType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("theme_type", c16l, "ThreadTheme");
                } else {
                    return new C45069Jwy(c45123Jxs, urs, threadThemeType, str, str2, str3, str4, arrayList, arrayList2, l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("background_preview_url", c16l, "ThreadTheme");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
