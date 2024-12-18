package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.1tP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40001tP {
    public static VideoVersion parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            DirectMediaFallbackUrl directMediaFallbackUrl = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            Long l = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fallback".equals(A0q)) {
                    directMediaFallbackUrl = AbstractC101884hz.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("url_expiration_timestamp_us".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new VideoVersion(directMediaFallbackUrl, num, num2, num3, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, VideoVersion videoVersion) {
        anonymousClass182.A0d();
        DirectMediaFallbackUrl directMediaFallbackUrl = videoVersion.A00;
        if (directMediaFallbackUrl != null) {
            anonymousClass182.A0r("fallback");
            anonymousClass182.A0d();
            String str = directMediaFallbackUrl.A00;
            if (str != null) {
                anonymousClass182.A0S("url", str);
            }
            anonymousClass182.A0a();
        }
        Integer num = videoVersion.A01;
        if (num != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
        }
        String str2 = videoVersion.A05;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        Integer num2 = videoVersion.A02;
        if (num2 != null) {
            anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num2.intValue());
        }
        String str3 = videoVersion.A06;
        if (str3 != null) {
            anonymousClass182.A0S("url", str3);
        }
        Long l = videoVersion.A04;
        if (l != null) {
            anonymousClass182.A0R("url_expiration_timestamp_us", l.longValue());
        }
        Integer num3 = videoVersion.A03;
        if (num3 != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num3.intValue());
        }
        anonymousClass182.A0a();
    }
}
