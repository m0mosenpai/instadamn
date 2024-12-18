package X;

import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTATextVariantSource;
import java.io.IOException;

/* renamed from: X.Eup, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33701Eup {
    public static IGCTATextVariantImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            IGCTATextVariantSource iGCTATextVariantSource = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cta_text_replacement".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_emoji".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("language".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("text_source".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGCTATextVariantSource = (IGCTATextVariantSource) IGCTATextVariantSource.A01.get(A1P);
                    if (iGCTATextVariantSource == null) {
                        iGCTATextVariantSource = IGCTATextVariantSource.A07;
                    }
                }
                c16l.A0z();
            }
            return new IGCTATextVariantImpl(iGCTATextVariantSource, bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
