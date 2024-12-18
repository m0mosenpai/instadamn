package X;

import com.instagram.model.mediasize.AdditionalCandidatesImpl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.1rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39121rl {
    public static AdditionalCandidatesImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ExtendedImageUrl extendedImageUrl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ExtendedImageUrl extendedImageUrl2 = null;
            ExtendedImageUrl extendedImageUrl3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("first_frame".equals(A0q)) {
                    extendedImageUrl = C17Y.parseFromJson(c16l);
                } else if ("igtv_first_frame".equals(A0q)) {
                    extendedImageUrl2 = C17Y.parseFromJson(c16l);
                } else if ("smart_frame".equals(A0q)) {
                    extendedImageUrl3 = C17Y.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new AdditionalCandidatesImpl(extendedImageUrl, extendedImageUrl2, extendedImageUrl3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
