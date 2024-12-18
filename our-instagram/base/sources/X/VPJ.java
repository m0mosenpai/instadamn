package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VPJ {
    public static UPJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            Float f = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_versions2".equals(A0s)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("media_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("original_height".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("original_width".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("video_duration".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("video_versions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            URT parseFromJson = VPM.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "ThemeVideoBackground");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("original_height", c16l, "ThemeVideoBackground");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("original_width", c16l, "ThemeVideoBackground");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("video_duration", c16l, "ThemeVideoBackground");
                } else {
                    return new UPJ(imageInfoImpl, str, arrayList, f.floatValue(), num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("media_type", c16l, "ThemeVideoBackground");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
