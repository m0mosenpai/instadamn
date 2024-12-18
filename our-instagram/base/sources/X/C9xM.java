package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9xM, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9xM {
    public static C38766H5g parseFromJson(C16L c16l) {
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
            C189138Ze c189138Ze = null;
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
                } else if (AbstractC111324zv.A00(2413).equals(A0s)) {
                    c189138Ze = AEH.parseFromJson(c16l);
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
            return new C38766H5g(stickerTraySurface, subscriptionStickerDict, c189138Ze, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
