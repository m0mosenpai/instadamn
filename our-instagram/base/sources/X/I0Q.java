package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I0Q {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IIt, java.lang.Object] */
    public static C41128IIt parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("qid".equals(A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    String A1Q = c16l.A1Q();
                    if ("single".equals(A1Q)) {
                        num = C05F.A00;
                    } else if ("multiple".equals(A1Q)) {
                        num = C05F.A01;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                    obj.A01 = num;
                } else if ("total_responders".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("answers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C41101IHs parseFromJson = I0P.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
