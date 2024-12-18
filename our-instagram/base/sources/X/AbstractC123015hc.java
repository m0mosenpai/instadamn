package X;

import java.io.IOException;

/* renamed from: X.5hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123015hc {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5hd, java.lang.Object] */
    public static C123025hd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (!"comments".equals(A0q) && !"likes".equals(A0q) && !"usertags".equals(A0q) && !"relationships".equals(A0q) && !"requests".equals(A0q) && !"photos_of_you".equals(A0q) && !"campaign_notifications".equals(A0q) && !"story_mentions".equals(A0q)) {
                    if ("double_toasting".equals(A0q)) {
                        c16l.A0d();
                    } else if (!"shopping_notification".equals(A0q) && !"tab_count".equals(A0q)) {
                    }
                    c16l.A0z();
                }
                c16l.A1D();
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
