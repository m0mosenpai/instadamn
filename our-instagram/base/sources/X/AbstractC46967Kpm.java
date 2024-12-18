package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.Kpm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46967Kpm {
    public static C35831m3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35831m3 c35831m3 = new C35831m3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c35831m3.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("music_id".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35831m3.A02 = A0m;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35831m3.A04 = A0m2;
                } else if ("subtitle".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c35831m3.A03 = A0m3;
                } else if ("url".equals(A0q)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c35831m3.A05 = A0m4;
                } else if ("cover_thumbnail_url".equals(A0q)) {
                    ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c35831m3.A01 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c35831m3, A0q);
                }
                c16l.A0z();
            }
            return c35831m3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
