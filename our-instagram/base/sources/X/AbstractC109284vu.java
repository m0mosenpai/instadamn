package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109284vu {
    public static C109354wK parseFromJson(C16L c16l) {
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
            Float f2 = null;
            String str5 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str6 = null;
            StoryPromptTappableData storyPromptTappableData = null;
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
                } else if ("media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("prompt_sticker".equals(A0q)) {
                    storyPromptTappableData = AbstractC109294vv.parseFromJson(c16l);
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
            return new C109354wK(stickerTraySurface, storyPromptTappableData, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109354wK c109354wK) {
        anonymousClass182.A0d();
        String str = c109354wK.A0G;
        if (str != null) {
            anonymousClass182.A0S("attribution", str);
        }
        String str2 = c109354wK.A0H;
        if (str2 != null) {
            anonymousClass182.A0S("attribution_url", str2);
        }
        String str3 = c109354wK.A0I;
        if (str3 != null) {
            anonymousClass182.A0S("custom_text_color", str3);
        }
        String str4 = c109354wK.A0J;
        if (str4 != null) {
            anonymousClass182.A0S("display_type", str4);
        }
        Float f = c109354wK.A03;
        if (f != null) {
            anonymousClass182.A0P("end_time_ms", f.floatValue());
        }
        Float f2 = c109354wK.A04;
        if (f2 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str5 = c109354wK.A0K;
        if (str5 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
        }
        Integer num = c109354wK.A0B;
        if (num != null) {
            anonymousClass182.A0Q("is_fb_sticker", num.intValue());
        }
        Integer num2 = c109354wK.A0C;
        if (num2 != null) {
            anonymousClass182.A0Q("is_hidden", num2.intValue());
        }
        Integer num3 = c109354wK.A0D;
        if (num3 != null) {
            anonymousClass182.A0Q("is_pinned", num3.intValue());
        }
        Integer num4 = c109354wK.A0E;
        if (num4 != null) {
            anonymousClass182.A0Q("is_sticker", num4.intValue());
        }
        String str6 = c109354wK.A0L;
        if (str6 != null) {
            anonymousClass182.A0S("media_type", str6);
        }
        StoryPromptTappableData storyPromptTappableData = c109354wK.A01;
        if (storyPromptTappableData != null) {
            anonymousClass182.A0r("prompt_sticker");
            AbstractC109294vv.A00(anonymousClass182, storyPromptTappableData, true);
        }
        Float f3 = c109354wK.A05;
        if (f3 != null) {
            anonymousClass182.A0P("rotation", f3.floatValue());
        }
        Float f4 = c109354wK.A06;
        if (f4 != null) {
            anonymousClass182.A0P("start_time_ms", f4.floatValue());
        }
        Integer num5 = c109354wK.A0F;
        if (num5 != null) {
            anonymousClass182.A0Q("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = c109354wK.A02;
        if (subscriptionStickerDict != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = c109354wK.A00;
        if (stickerTraySurface != null) {
            anonymousClass182.A0S("surface", stickerTraySurface.A00);
        }
        Float f5 = c109354wK.A07;
        if (f5 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = c109354wK.A08;
        if (f6 != null) {
            anonymousClass182.A0P("x", f6.floatValue());
        }
        Float f7 = c109354wK.A09;
        if (f7 != null) {
            anonymousClass182.A0P("y", f7.floatValue());
        }
        Float f8 = c109354wK.A0A;
        if (f8 != null) {
            anonymousClass182.A0P("z", f8.floatValue());
        }
        anonymousClass182.A0a();
    }
}
