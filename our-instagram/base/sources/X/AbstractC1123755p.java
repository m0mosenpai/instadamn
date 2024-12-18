package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.venue.LocationDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.55p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123755p {
    public static C1123855q parseFromJson(C16L c16l) {
        String A1P;
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
            Float f = null;
            C1124055s c1124055s = null;
            Float f2 = null;
            String str5 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            LocationDict locationDict = null;
            String str6 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("attribution".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("attribution_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("custom_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("display_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("guide_summary".equals(A0q)) {
                    c1124055s = I0F.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("is_fb_sticker".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("is_hidden".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_pinned".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("is_sticker".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("location".equals(A0q)) {
                    locationDict = AbstractC84373pU.parseFromJson(c16l);
                } else if ("media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("rotation".equals(A0q)) {
                    f3 = new Float(c16l.A0U());
                } else if ("start_time_ms".equals(A0q)) {
                    f4 = new Float(c16l.A0U());
                } else if ("sticker_style_enum".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("subscription_sticker".equals(A0q)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if ("surface".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    stickerTraySurface = AbstractC41282IOx.A01(A1P);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f5 = new Float(c16l.A0U());
                } else if ("x".equals(A0q)) {
                    f6 = new Float(c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f7 = new Float(c16l.A0U());
                } else if ("z".equals(A0q)) {
                    f8 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new C1123855q(stickerTraySurface, subscriptionStickerDict, c1124055s, locationDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1123855q c1123855q) {
        anonymousClass182.A0d();
        String str = c1123855q.A0H;
        if (str != null) {
            anonymousClass182.A0S("attribution", str);
        }
        String str2 = c1123855q.A0I;
        if (str2 != null) {
            anonymousClass182.A0S("attribution_url", str2);
        }
        String str3 = c1123855q.A0J;
        if (str3 != null) {
            anonymousClass182.A0S("custom_text_color", str3);
        }
        String str4 = c1123855q.A0K;
        if (str4 != null) {
            anonymousClass182.A0S("display_type", str4);
        }
        Float f = c1123855q.A04;
        if (f != null) {
            anonymousClass182.A0P("end_time_ms", f.floatValue());
        }
        C1124055s c1124055s = c1123855q.A02;
        if (c1124055s != null) {
            anonymousClass182.A0r("guide_summary");
            anonymousClass182.A0d();
            anonymousClass182.A0T("can_viewer_reshare", c1124055s.A08);
            String str5 = c1124055s.A06;
            if (str5 != null) {
                anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str5);
            }
            anonymousClass182.A0T("feedback_enabled", c1124055s.A09);
            anonymousClass182.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c1124055s.A01);
            anonymousClass182.A0T("is_draft", c1124055s.A0A);
            H7P h7p = c1124055s.A04;
            if (h7p != null) {
                anonymousClass182.A0r("mixed_cover_media");
                IQS.A00(anonymousClass182, h7p);
            }
            anonymousClass182.A0Q("num_items", c1124055s.A00);
            User user = c1124055s.A05;
            if (user != null) {
                anonymousClass182.A0r("owner");
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            String str6 = c1124055s.A07;
            if (str6 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str6);
            }
            GuideTypeStr guideTypeStr = c1124055s.A03;
            if (guideTypeStr != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, guideTypeStr.A00);
            }
            anonymousClass182.A0R(MSV.A00(1692), c1124055s.A02);
            anonymousClass182.A0a();
        }
        Float f2 = c1123855q.A05;
        if (f2 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str7 = c1123855q.A0L;
        if (str7 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7);
        }
        Integer num = c1123855q.A0C;
        if (num != null) {
            anonymousClass182.A0Q("is_fb_sticker", num.intValue());
        }
        Integer num2 = c1123855q.A0D;
        if (num2 != null) {
            anonymousClass182.A0Q("is_hidden", num2.intValue());
        }
        Integer num3 = c1123855q.A0E;
        if (num3 != null) {
            anonymousClass182.A0Q("is_pinned", num3.intValue());
        }
        Integer num4 = c1123855q.A0F;
        if (num4 != null) {
            anonymousClass182.A0Q("is_sticker", num4.intValue());
        }
        LocationDict locationDict = c1123855q.A03;
        if (locationDict != null) {
            anonymousClass182.A0r("location");
            AbstractC84373pU.A00(anonymousClass182, locationDict);
        }
        String str8 = c1123855q.A0M;
        if (str8 != null) {
            anonymousClass182.A0S("media_type", str8);
        }
        Float f3 = c1123855q.A06;
        if (f3 != null) {
            anonymousClass182.A0P("rotation", f3.floatValue());
        }
        Float f4 = c1123855q.A07;
        if (f4 != null) {
            anonymousClass182.A0P("start_time_ms", f4.floatValue());
        }
        Integer num5 = c1123855q.A0G;
        if (num5 != null) {
            anonymousClass182.A0Q("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = c1123855q.A01;
        if (subscriptionStickerDict != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = c1123855q.A00;
        if (stickerTraySurface != null) {
            anonymousClass182.A0S("surface", stickerTraySurface.A00);
        }
        Float f5 = c1123855q.A08;
        if (f5 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = c1123855q.A09;
        if (f6 != null) {
            anonymousClass182.A0P("x", f6.floatValue());
        }
        Float f7 = c1123855q.A0A;
        if (f7 != null) {
            anonymousClass182.A0P("y", f7.floatValue());
        }
        Float f8 = c1123855q.A0B;
        if (f8 != null) {
            anonymousClass182.A0P("z", f8.floatValue());
        }
        anonymousClass182.A0a();
    }
}
