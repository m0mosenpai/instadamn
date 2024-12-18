package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class OUN {
    public final InterfaceC16660sJ A01 = C57657Pi8.A00;
    public final InterfaceC16660sJ A02 = C57658Pi9.A00;
    public final InterfaceC16660sJ A03 = C57659PiA.A00;
    public final InterfaceC16660sJ A04 = C57660PiB.A00;
    public final InterfaceC16660sJ A05 = new C57752Pjf(this, 32);
    public final InterfaceC16660sJ A06 = new C57752Pjf(this, 33);
    public final InterfaceC16660sJ A00 = C57656Pi7.A00;

    public static final List A00(List list, String str) {
        double d;
        boolean isEmpty = list.isEmpty();
        Double valueOf = Double.valueOf(1.0d);
        if (!isEmpty && list.size() <= 1) {
            HashMap hashMap = ((Example) MSZ.A0o(list, list.size())).A02;
            FeatureData A0K = MSW.A0K("111", hashMap);
            if (A0K != null) {
                d = A0K.A00;
            } else {
                d = -1.0d;
            }
            FeatureData A0K2 = MSW.A0K(str, hashMap);
            if (A0K2 != null) {
                double d2 = A0K2.A00;
                if (d2 != -1.0d && d != -1.0d && d2 <= d) {
                    valueOf = MSY.A0Y();
                }
            }
            List A1J = AbstractC166987dD.A1J(valueOf);
            A1J.toString();
            return A1J;
        }
        list.size();
        return AbstractC166987dD.A1J(valueOf);
    }
}
