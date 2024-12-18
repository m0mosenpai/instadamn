package X;

import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEY {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.ui.text.TextColors, java.lang.Object] */
    public static TextColors parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("shadow".equals(A0s)) {
                    obj.A01 = AbstractC22758A2c.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TextColors textColors) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("color", textColors.A00);
        if (textColors.A01 != null) {
            anonymousClass182.A0r("shadow");
            TextShadow textShadow = textColors.A01;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("color", textShadow.A00);
            anonymousClass182.A0Q("distance_resource_id", textShadow.A01);
            anonymousClass182.A0Q("radius_resource_id", textShadow.A02);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
