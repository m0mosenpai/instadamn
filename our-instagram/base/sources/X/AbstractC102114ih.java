package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102114ih {
    public static C102154il parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C102134ij c102134ij = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f = null;
            String str6 = null;
            Float f2 = null;
            String str7 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str8 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str9 = null;
            C102134ij c102134ij2 = null;
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
                } else if ("author_avatar_sticker".equals(A0q)) {
                    c102134ij = AbstractC102124ii.parseFromJson(c16l);
                } else if ("avatar_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("custom_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("display_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("expression_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
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
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
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
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("viewer_avatar_sticker".equals(A0q)) {
                    c102134ij2 = AbstractC102124ii.parseFromJson(c16l);
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
            return new C102154il(c102134ij, c102134ij2, stickerTraySurface, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C102154il c102154il) {
        anonymousClass182.A0d();
        String str = c102154il.A0H;
        if (str != null) {
            anonymousClass182.A0S("attribution", str);
        }
        String str2 = c102154il.A0I;
        if (str2 != null) {
            anonymousClass182.A0S("attribution_url", str2);
        }
        C102134ij c102134ij = c102154il.A00;
        if (c102134ij != null) {
            anonymousClass182.A0r("author_avatar_sticker");
            AbstractC102124ii.A00(anonymousClass182, c102134ij);
        }
        String str3 = c102154il.A0J;
        if (str3 != null) {
            anonymousClass182.A0S("avatar_style", str3);
        }
        String str4 = c102154il.A0K;
        if (str4 != null) {
            anonymousClass182.A0S("custom_text_color", str4);
        }
        String str5 = c102154il.A0L;
        if (str5 != null) {
            anonymousClass182.A0S("display_type", str5);
        }
        Float f = c102154il.A04;
        if (f != null) {
            anonymousClass182.A0P("end_time_ms", f.floatValue());
        }
        String str6 = c102154il.A0M;
        if (str6 != null) {
            anonymousClass182.A0S("expression_id", str6);
        }
        Float f2 = c102154il.A05;
        if (f2 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str7 = c102154il.A0N;
        if (str7 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7);
        }
        Integer num = c102154il.A0C;
        if (num != null) {
            anonymousClass182.A0Q("is_fb_sticker", num.intValue());
        }
        Integer num2 = c102154il.A0D;
        if (num2 != null) {
            anonymousClass182.A0Q("is_hidden", num2.intValue());
        }
        Integer num3 = c102154il.A0E;
        if (num3 != null) {
            anonymousClass182.A0Q("is_pinned", num3.intValue());
        }
        Integer num4 = c102154il.A0F;
        if (num4 != null) {
            anonymousClass182.A0Q("is_sticker", num4.intValue());
        }
        String str8 = c102154il.A0O;
        if (str8 != null) {
            anonymousClass182.A0S("media_type", str8);
        }
        Float f3 = c102154il.A06;
        if (f3 != null) {
            anonymousClass182.A0P("rotation", f3.floatValue());
        }
        Float f4 = c102154il.A07;
        if (f4 != null) {
            anonymousClass182.A0P("start_time_ms", f4.floatValue());
        }
        Integer num5 = c102154il.A0G;
        if (num5 != null) {
            anonymousClass182.A0Q("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = c102154il.A03;
        if (subscriptionStickerDict != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = c102154il.A02;
        if (stickerTraySurface != null) {
            anonymousClass182.A0S("surface", stickerTraySurface.A00);
        }
        String str9 = c102154il.A0P;
        if (str9 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        }
        C102134ij c102134ij2 = c102154il.A01;
        if (c102134ij2 != null) {
            anonymousClass182.A0r("viewer_avatar_sticker");
            AbstractC102124ii.A00(anonymousClass182, c102134ij2);
        }
        Float f5 = c102154il.A08;
        if (f5 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = c102154il.A09;
        if (f6 != null) {
            anonymousClass182.A0P("x", f6.floatValue());
        }
        Float f7 = c102154il.A0A;
        if (f7 != null) {
            anonymousClass182.A0P("y", f7.floatValue());
        }
        Float f8 = c102154il.A0B;
        if (f8 != null) {
            anonymousClass182.A0P("z", f8.floatValue());
        }
        anonymousClass182.A0a();
    }
}
