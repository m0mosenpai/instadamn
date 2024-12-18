package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I7H {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Irm, java.lang.Object] */
    public static C42507Irm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1W(A0s)) {
                    obj.A00 = AbstractC166997dE.A0d(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC37300Gc1.A1S(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("num_results".equals(A0s)) {
                        c16l.A1D();
                    } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C41643IbZ parseFromJson = I8O.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    }
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
