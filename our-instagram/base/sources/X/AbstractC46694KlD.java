package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KlD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46694KlD {
    public static C47297Kv8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47297Kv8 c47297Kv8 = new C47297Kv8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("prompts".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            KzF parseFromJson = AbstractC46693KlC.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c47297Kv8.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c47297Kv8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
