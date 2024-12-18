package X;

import com.instagram.discovery.refinement.model.Refinement;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hze, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40620Hze {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51755Mte c51755Mte = new C51755Mte(18);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37301Gc2.A1W(c16l, c16l.A0q())) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Refinement parseFromJson = AbstractC40619Hzd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c51755Mte.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c51755Mte;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
