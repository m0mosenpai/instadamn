package X;

import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import com.instagram.api.schemas.OriginalityInfoImpl;
import com.instagram.api.schemas.OriginalitySourceMediaInfoImpl;
import java.io.IOException;

/* renamed from: X.3x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88473x4 {
    public static OriginalityInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            OriginalityFollowButtonInfoImpl originalityFollowButtonInfoImpl = null;
            OriginalitySourceMediaInfoImpl originalitySourceMediaInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_remove_originality_label".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("follow_button_info".equals(A0q)) {
                    originalityFollowButtonInfoImpl = C5RW.parseFromJson(c16l);
                } else if ("original_media".equals(A0q)) {
                    originalitySourceMediaInfoImpl = C5RZ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new OriginalityInfoImpl(originalityFollowButtonInfoImpl, originalitySourceMediaInfoImpl, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
