package X;

import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import java.io.IOException;

/* renamed from: X.Hqj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40116Hqj {
    public static C67x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            NotePogImageDict notePogImageDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            NotePogVideoDict notePogVideoDict = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_dict".equals(A0s)) {
                    notePogImageDict = AbstractC40112Hqf.parseFromJson(c16l);
                } else if ("video_dict".equals(A0s)) {
                    notePogVideoDict = AbstractC40114Hqh.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C67x(notePogImageDict, notePogVideoDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
