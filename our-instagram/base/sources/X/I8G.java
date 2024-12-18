package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I8G {
    public static C41034IFd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41034IFd c41034IFd = new C41034IFd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1Q(A0s)) {
                    c41034IFd.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(3027).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            TextWithEntitiesBlockDict parseFromJson = AbstractC40416Hw4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c41034IFd.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c41034IFd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
