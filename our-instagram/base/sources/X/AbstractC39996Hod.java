package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hod, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39996Hod {
    public static Map A00(JKJ jkj) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jkj.Bbr() != null) {
            A1I.put("paymentMode", jkj.Bbr());
        }
        if (jkj.C4C() != null) {
            A1I.put("supportedContainerTypes", jkj.C4C());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
