package X;

import java.io.IOException;

/* renamed from: X.I6z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40823I6z {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IJB, java.lang.Object] */
    public static IJB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ar_content".equals(A0s)) {
                    obj.A00 = AbstractC40806I6i.parseFromJson(c16l);
                } else if ("media_content".equals(A0s)) {
                    obj.A01 = AbstractC40819I6v.parseFromJson(c16l);
                } else if ("product_image_content".equals(A0s)) {
                    obj.A02 = AbstractC40820I6w.parseFromJson(c16l);
                } else if ("product_video_content".equals(A0s)) {
                    obj.A03 = AbstractC40821I6x.parseFromJson(c16l);
                } else if ("reel_content".equals(A0s)) {
                    obj.A04 = AbstractC40822I6y.parseFromJson(c16l);
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
}
