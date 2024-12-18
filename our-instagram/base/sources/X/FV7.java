package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FV7 {
    public static ECQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ECQ ecq = new ECQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FRM parseFromJson = F70.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ecq.A00 = arrayList;
                } else if ("more_available".equals(A0s)) {
                    ecq.A01 = c16l.A0d();
                } else if ("epoch_derivation_set".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else {
                    C55702hA.A01(c16l, ecq, A0s);
                }
                c16l.A0z();
            }
            return ecq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
