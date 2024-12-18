package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.52e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1117752e {
    public static C52i parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            String str3 = null;
            C1117952g c1117952g = null;
            String str4 = null;
            C1117952g c1117952g2 = null;
            String str5 = null;
            Float f = null;
            String str6 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_height".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("image_width".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_save_allowed".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_saved".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_trending".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("media_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("source_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("source_media_owner".equals(A0q)) {
                    c1117952g = AbstractC1117852f.parseFromJson(c16l);
                } else if ("source_media_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("sticker_creator".equals(A0q)) {
                    c1117952g2 = AbstractC1117852f.parseFromJson(c16l);
                } else if ("sticker_creator_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("sticker_duration".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("sticker_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("strong_id__".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "CutoutStickerImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("media_url", "CutoutStickerImpl");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("sticker_type", "CutoutStickerImpl");
                } else {
                    return new C52i(c1117952g, c1117952g2, bool2, bool3, f, num, num2, str, str2, str3, str4, str5, str6, str7, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_save_allowed", "CutoutStickerImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
