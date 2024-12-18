package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDictImpl;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObjectImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ADJ {
    public static WhatsAppChannelShareToIgStoryStickerTappableObjectImpl parseFromJson(C16L c16l) {
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
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            WhatsAppChannelShareToIgStoryStickerDictImpl whatsAppChannelShareToIgStoryStickerDictImpl = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attribution".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("attribution_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("custom_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("display_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("end_time_ms".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("is_fb_sticker".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("is_hidden".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("is_pinned".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("is_sticker".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("media_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("rotation".equals(A0s)) {
                    f3 = AbstractC167007dF.A0Z(c16l);
                } else if ("start_time_ms".equals(A0s)) {
                    f4 = AbstractC167007dF.A0Z(c16l);
                } else if ("sticker_style_enum".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("subscription_sticker".equals(A0s)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if ("surface".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    stickerTraySurface = AbstractC41282IOx.A01(A1P);
                } else if (AbstractC111324zv.A00(1375).equals(A0s)) {
                    whatsAppChannelShareToIgStoryStickerDictImpl = AbstractC225579xc.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    f5 = AbstractC167007dF.A0Z(c16l);
                } else if ("x".equals(A0s)) {
                    f6 = AbstractC167007dF.A0Z(c16l);
                } else if ("y".equals(A0s)) {
                    f7 = AbstractC167007dF.A0Z(c16l);
                } else if ("z".equals(A0s)) {
                    f8 = AbstractC167007dF.A0Z(c16l);
                }
                c16l.A0z();
            }
            return new WhatsAppChannelShareToIgStoryStickerTappableObjectImpl(stickerTraySurface, subscriptionStickerDict, whatsAppChannelShareToIgStoryStickerDictImpl, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, WhatsAppChannelShareToIgStoryStickerTappableObjectImpl whatsAppChannelShareToIgStoryStickerTappableObjectImpl, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0G;
        if (str != null) {
            anonymousClass182.A0S("attribution", str);
        }
        String str2 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0H;
        if (str2 != null) {
            anonymousClass182.A0S("attribution_url", str2);
        }
        String str3 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0I;
        if (str3 != null) {
            anonymousClass182.A0S("custom_text_color", str3);
        }
        String str4 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0J;
        if (str4 != null) {
            anonymousClass182.A0S("display_type", str4);
        }
        Float f = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A03;
        if (f != null) {
            anonymousClass182.A0P("end_time_ms", f.floatValue());
        }
        Float f2 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A04;
        if (f2 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str5 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0K;
        if (str5 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
        }
        Integer num = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0B;
        if (num != null) {
            anonymousClass182.A0Q("is_fb_sticker", num.intValue());
        }
        Integer num2 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0C;
        if (num2 != null) {
            anonymousClass182.A0Q("is_hidden", num2.intValue());
        }
        Integer num3 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0D;
        if (num3 != null) {
            anonymousClass182.A0Q("is_pinned", num3.intValue());
        }
        Integer num4 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0E;
        if (num4 != null) {
            anonymousClass182.A0Q("is_sticker", num4.intValue());
        }
        String str6 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0L;
        if (str6 != null) {
            anonymousClass182.A0S("media_type", str6);
        }
        Float f3 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A05;
        if (f3 != null) {
            anonymousClass182.A0P("rotation", f3.floatValue());
        }
        Float f4 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A06;
        if (f4 != null) {
            anonymousClass182.A0P("start_time_ms", f4.floatValue());
        }
        Integer num5 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0F;
        if (num5 != null) {
            anonymousClass182.A0Q("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A01;
        if (subscriptionStickerDict != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A00;
        if (stickerTraySurface != null) {
            anonymousClass182.A0S("surface", stickerTraySurface.A00);
        }
        WhatsAppChannelShareToIgStoryStickerDict whatsAppChannelShareToIgStoryStickerDict = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A02;
        if (whatsAppChannelShareToIgStoryStickerDict != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(1375));
            WhatsAppChannelShareToIgStoryStickerDictImpl F3w = whatsAppChannelShareToIgStoryStickerDict.F3w();
            anonymousClass182.A0d();
            String str7 = F3w.A00;
            if (str7 != null) {
                anonymousClass182.A0S("attribution_url", str7);
            }
            anonymousClass182.A0a();
        }
        Float f5 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A07;
        if (f5 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A08;
        if (f6 != null) {
            anonymousClass182.A0P("x", f6.floatValue());
        }
        Float f7 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A09;
        if (f7 != null) {
            anonymousClass182.A0P("y", f7.floatValue());
        }
        Float f8 = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0A;
        if (f8 != null) {
            anonymousClass182.A0P("z", f8.floatValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
