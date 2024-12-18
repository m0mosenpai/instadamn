package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nqj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53793Nqj {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.O1h] */
    public static C54375O1h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (DialogModule.KEY_ITEMS.equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    obj.A00 = arrayList;
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
