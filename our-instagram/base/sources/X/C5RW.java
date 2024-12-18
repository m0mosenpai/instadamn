package X;

import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import java.io.IOException;

/* renamed from: X.5RW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5RW {
    public static OriginalityFollowButtonInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_original_author_in_author_exp".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("show_follow_bottom_sheet_button".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new OriginalityFollowButtonInfoImpl(bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
