package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.HmZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39886HmZ {
    public static CreatorViewerSignalReelsTextDetailsImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            FormattedStringImpl formattedStringImpl = null;
            ClipsTextFormatType clipsTextFormatType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1L(A0s)) {
                    formattedStringImpl = IO9.parseFromJson(c16l);
                } else if ("text_format_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsTextFormatType = AbstractC93084Fj.A00(A1P);
                }
                c16l.A0z();
            }
            return new CreatorViewerSignalReelsTextDetailsImpl(clipsTextFormatType, formattedStringImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
