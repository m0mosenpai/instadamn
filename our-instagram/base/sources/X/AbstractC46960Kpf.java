package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.Kpf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46960Kpf {
    public static C33231hl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C33231hl c33231hl = new C33231hl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33231hl.A02 = AbstractC31172DnG.A0o(c16l);
                } else if ("sticker_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c33231hl.A04 = A1P;
                } else if ("sticker_image_url".equals(A0q)) {
                    ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33231hl.A03 = parseFromJson;
                } else if ("replied_to_message".equals(A0q)) {
                    c33231hl.A01 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33231hl, A0q);
                }
                c16l.A0z();
            }
            return c33231hl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
