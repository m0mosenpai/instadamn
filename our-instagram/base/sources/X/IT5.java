package X;

import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IT5 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HAg, X.1um, X.1ul] */
    public static C38884HAg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_more".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC37300Gc1.A1S(A0s)) {
                        c40791um.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC58317Pt9.A00(1021).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                UpcomingEventImpl parseFromJson = IT3.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c40791um.A01 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
