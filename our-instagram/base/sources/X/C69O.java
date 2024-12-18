package X;

import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import java.io.IOException;

/* renamed from: X.69O, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C69O {
    public static C52r parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IgShowreelCompositionImpl igShowreelCompositionImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("showreel_composition".equals(A0q)) {
                    igShowreelCompositionImpl = AbstractC105404p6.parseFromJson(c16l);
                } else if ("showreel_native_animation".equals(A0q)) {
                    igShowreelNativeAnimation = C52l.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C52r(igShowreelCompositionImpl, igShowreelNativeAnimation);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C52r c52r) {
        anonymousClass182.A0d();
        IgShowreelComposition igShowreelComposition = c52r.A00;
        if (igShowreelComposition != null) {
            anonymousClass182.A0r("showreel_composition");
            AbstractC105404p6.A00(anonymousClass182, igShowreelComposition.F6Y());
        }
        IgShowreelNativeAnimation igShowreelNativeAnimation = c52r.A01;
        if (igShowreelNativeAnimation != null) {
            anonymousClass182.A0r("showreel_native_animation");
            C52l.A00(anonymousClass182, igShowreelNativeAnimation);
        }
        anonymousClass182.A0a();
    }
}
