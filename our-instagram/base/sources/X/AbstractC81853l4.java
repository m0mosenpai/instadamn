package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import java.io.IOException;

/* renamed from: X.3l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81853l4 {
    public static C81863l6 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str = null;
            C110284xz c110284xz = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            IgUserBioLinkTypeEnum igUserBioLinkTypeEnum = null;
            String str6 = null;
            Boolean bool3 = null;
            String str7 = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("click_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fb_biolink_social_context".equals(A0q)) {
                    c110284xz = AbstractC110274xx.parseFromJson(c16l);
                } else if ("group_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("image_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("is_pinned".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_verified".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("link_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("link_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    igUserBioLinkTypeEnum = (IgUserBioLinkTypeEnum) IgUserBioLinkTypeEnum.A01.get(A1P);
                    if (igUserBioLinkTypeEnum == null) {
                        igUserBioLinkTypeEnum = IgUserBioLinkTypeEnum.A08;
                    }
                } else if ("lynx_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("open_external_url_with_in_app_browser".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_pinned", "UserBioLinkDictImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (str5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("link_id", "UserBioLinkDictImpl");
                } else if (igUserBioLinkTypeEnum == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("link_type", "UserBioLinkDictImpl");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(DialogModule.KEY_TITLE, "UserBioLinkDictImpl");
                } else if (str8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("url", "UserBioLinkDictImpl");
                } else {
                    return new C81863l6(c110284xz, igUserBioLinkTypeEnum, bool3, str, str2, str3, str4, str5, str6, str7, str8, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_verified", "UserBioLinkDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
