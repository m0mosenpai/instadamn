package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hox, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40016Hox {
    public static Map A00(AnonymousClass536 anonymousClass536) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (anonymousClass536.B7l() != null) {
            A1I.put("footerSubtype", anonymousClass536.B7l());
        }
        if (anonymousClass536.CQI() != null) {
            A1I.put("isAutofillEnabled", anonymousClass536.CQI());
        }
        if (anonymousClass536.BiX() != null) {
            List<JKL> BiX = anonymousClass536.BiX();
            ArrayList arrayList = null;
            if (BiX != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JKL jkl : BiX) {
                    if (jkl != null) {
                        arrayList.add(jkl.F7o());
                    }
                }
            }
            A1I.put("promoCodes", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
