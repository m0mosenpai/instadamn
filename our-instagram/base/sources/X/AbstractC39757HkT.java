package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import java.io.IOException;

/* renamed from: X.HkT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39757HkT {
    public static H2L parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            SoundPlatformProduct soundPlatformProduct = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("sound_platform_product".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    soundPlatformProduct = (SoundPlatformProduct) SoundPlatformProduct.A01.get(A1P);
                    if (soundPlatformProduct == null) {
                        soundPlatformProduct = SoundPlatformProduct.A0S;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "AudioGoDarkInfoTextImpl");
            } else if (soundPlatformProduct == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sound_platform_product", c16l, "AudioGoDarkInfoTextImpl");
            } else {
                return new H2L(soundPlatformProduct, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
