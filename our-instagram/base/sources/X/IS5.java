package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IS5 {
    public static HAB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAB hab = new HAB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keywords".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Keyword parseFromJson = MZ7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hab.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, hab, A0s);
                }
                c16l.A0z();
            }
            return hab;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
