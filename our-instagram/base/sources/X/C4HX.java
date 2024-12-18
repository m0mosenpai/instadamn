package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectPreview;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4HX, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4HX {
    public static EffectPreview parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AttributionUserImpl attributionUserImpl = null;
            String str = null;
            EffectActionSheet effectActionSheet = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            String str8 = null;
            EffectThumbnailImageDict effectThumbnailImageDict = null;
            String str9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("attribution_user".equals(A0q)) {
                    attributionUserImpl = C4HY.parseFromJson(c16l);
                } else if ("device_position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("effect_action_sheet".equals(A0q)) {
                    effectActionSheet = AbstractC93484Hh.parseFromJson(c16l);
                } else if ("effect_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("failure_code".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (TraceFieldType.FailureReason.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("is_age_restricted".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("save_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("thumbnail_image".equals(A0q)) {
                    effectThumbnailImageDict = AbstractC93474He.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (attributionUserImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("attribution_user", "EffectPreview");
            } else if (str6 != null || !(c16l instanceof C07950bF)) {
                if (str7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "EffectPreview");
                } else if (str8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("save_status", "EffectPreview");
                } else {
                    return new EffectPreview(attributionUserImpl, simpleImageUrl, effectActionSheet, effectThumbnailImageDict, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
                }
            } else {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "EffectPreview");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, EffectPreview effectPreview) {
        anonymousClass182.A0d();
        AttributionUser attributionUser = effectPreview.A00;
        if (attributionUser != null) {
            anonymousClass182.A0r("attribution_user");
            C4HY.A00(anonymousClass182, attributionUser.Eqz());
        }
        String str = effectPreview.A05;
        if (str != null) {
            anonymousClass182.A0S("device_position", str);
        }
        EffectActionSheet effectActionSheet = effectPreview.A02;
        if (effectActionSheet != null) {
            anonymousClass182.A0r("effect_action_sheet");
            anonymousClass182.A0d();
            List<String> list = effectActionSheet.A00;
            if (list != null) {
                C16V.A03(anonymousClass182, "primary_actions");
                for (String str2 : list) {
                    if (str2 != null) {
                        anonymousClass182.A0u(str2);
                    }
                }
                anonymousClass182.A0Z();
            }
            List<String> list2 = effectActionSheet.A01;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "secondary_actions");
                for (String str3 : list2) {
                    if (str3 != null) {
                        anonymousClass182.A0u(str3);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str4 = effectPreview.A06;
        if (str4 != null) {
            anonymousClass182.A0S("effect_id", str4);
        }
        String str5 = effectPreview.A07;
        if (str5 != null) {
            anonymousClass182.A0S("failure_code", str5);
        }
        String str6 = effectPreview.A08;
        if (str6 != null) {
            anonymousClass182.A0S(TraceFieldType.FailureReason, str6);
        }
        String str7 = effectPreview.A09;
        if (str7 != null) {
            anonymousClass182.A0S("formatted_clips_media_count", str7);
        }
        ImageUrl imageUrl = effectPreview.A01;
        if (imageUrl != null) {
            anonymousClass182.A0r("icon_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        String str8 = effectPreview.A0A;
        if (str8 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
        }
        Boolean bool = effectPreview.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_age_restricted", bool.booleanValue());
        }
        String str9 = effectPreview.A0B;
        if (str9 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
        }
        String str10 = effectPreview.A0C;
        if (str10 != null) {
            anonymousClass182.A0S("save_status", str10);
        }
        EffectThumbnailImageDict effectThumbnailImageDict = effectPreview.A03;
        if (effectThumbnailImageDict != null) {
            anonymousClass182.A0r("thumbnail_image");
            anonymousClass182.A0d();
            ImageUrl imageUrl2 = effectThumbnailImageDict.A00;
            if (imageUrl2 != null) {
                anonymousClass182.A0r("uri");
                AbstractC222616c.A01(anonymousClass182, imageUrl2);
            }
            anonymousClass182.A0a();
        }
        String str11 = effectPreview.A0D;
        if (str11 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str11);
        }
        anonymousClass182.A0a();
    }
}
