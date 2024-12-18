package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LBF {
    public static K8B parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8B k8b = new K8B();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8b.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, k8b, A0s);
                }
                c16l.A0z();
            }
            return k8b;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
