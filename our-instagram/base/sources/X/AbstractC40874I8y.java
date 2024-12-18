package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I8y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40874I8y {
    public static C51750MtZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51750MtZ c51750MtZ = new C51750MtZ(8);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("blocks".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            TextWithEntitiesBlockDict parseFromJson = AbstractC40416Hw4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c51750MtZ.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c51750MtZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
