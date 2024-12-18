package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.IOException;

/* renamed from: X.LCo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47868LCo {
    public static C45026JwH parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            DirectAnimatedMedia directAnimatedMedia = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            DirectAnimatedMedia directAnimatedMedia2 = null;
            Boolean bool = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1337);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tray_preview_image".equals(A0s)) {
                    directAnimatedMedia = AbstractC47867LCn.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    directAnimatedMedia2 = AbstractC47867LCn.parseFromJson(c16l);
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_trending");
                }
                c16l.A0z();
            }
            if (directAnimatedMedia == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("tray_preview_image", c16l, "GifSearchItem");
            } else if (directAnimatedMedia2 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_trending", c16l, "GifSearchItem");
                } else {
                    return new C45026JwH(directAnimatedMedia, directAnimatedMedia2, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "GifSearchItem");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C45026JwH c45026JwH) {
        anonymousClass182.A0d();
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A01;
        if (directAnimatedMedia != null) {
            anonymousClass182.A0r("tray_preview_image");
            AbstractC47867LCn.A00(anonymousClass182, directAnimatedMedia);
        }
        DirectAnimatedMedia directAnimatedMedia2 = c45026JwH.A00;
        if (directAnimatedMedia2 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(1337));
            AbstractC47867LCn.A00(anonymousClass182, directAnimatedMedia2);
        }
        anonymousClass182.A0T("is_trending", c45026JwH.A02);
        anonymousClass182.A0a();
    }
}
