package X;

import com.instagram.music.common.model.WordOffset;
import java.io.IOException;

/* renamed from: X.I4d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40749I4d {
    public static WordOffset parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            WordOffset wordOffset = new WordOffset();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("start_index".equals(A0s)) {
                    wordOffset.A02 = c16l.A1D();
                } else if ("end_index".equals(A0s)) {
                    wordOffset.A00 = c16l.A1D();
                } else if ("start_offset_ms".equals(A0s)) {
                    wordOffset.A03 = c16l.A1D();
                } else if ("end_offset_ms".equals(A0s)) {
                    wordOffset.A01 = c16l.A1D();
                } else if ("trailing_space".equals(A0s)) {
                    wordOffset.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return wordOffset;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
