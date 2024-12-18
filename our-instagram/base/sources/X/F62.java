package X;

import com.instagram.save.model.SavedCollection;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F62 {
    public static C33491iB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C33491iB c33491iB = new C33491iB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33491iB.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("collection".equals(A0q)) {
                    SavedCollection parseFromJson = C70139W6r.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33491iB.A01 = parseFromJson;
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c33491iB.A02 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c33491iB, A0q);
                }
                c16l.A0z();
            }
            return c33491iB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
