package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HvZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40386HvZ {
    public static C51756Mtf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("clips_items".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C51756Mtf((List) arrayList, 23);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
