package X;

import com.google.common.collect.ImmutableList;
import com.instagram.music.common.model.LyricsPhrase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Gol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38058Gol {
    public static C38059Gom parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38059Gom c38059Gom = new C38059Gom();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("phrases".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            LyricsPhrase parseFromJson = AbstractC40746I4a.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38059Gom.A00 = arrayList;
                }
                c16l.A0z();
            }
            if (!c38059Gom.A00.isEmpty()) {
                c38059Gom.A00 = ImmutableList.copyOf((Collection) C41601Iap.A00(c38059Gom.A00));
                return c38059Gom;
            }
            return c38059Gom;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
