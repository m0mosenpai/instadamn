package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OaY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55078OaY {
    public static final C55078OaY A00 = new Object();

    public static final void A00(Exception exc, String str) {
        C14360o3.A0B(str, 1);
        C0f5 AEp = C18950wb.A01.AEp(str, 817899803);
        if (exc != null) {
            AEp.ERI(exc);
        }
        AEp.report();
    }

    public final FeatureData A01(String str, List list) {
        C14360o3.A0B(list, 1);
        if (list.isEmpty()) {
            A00(null, AnonymousClass001.A0R("Empty list for calculating average value of signals, featureId: ", str));
            return new FeatureData(null, null, null, null, 0.0d, 16383, 0L);
        }
        Type type = Type.A06;
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += MSY.A07(it);
        }
        return new FeatureData(type, str, null, null, j / list.size(), 16372, 0L);
    }

    public final FeatureData A02(String str, List list, int i) {
        String str2;
        C14360o3.A0B(list, 2);
        if (!list.isEmpty()) {
            List A0Z = AbstractC001800i.A0Z(list);
            return new FeatureData(Type.A09, str, null, null, 0.0d, 16376, AbstractC166987dD.A0N(A0Z.get(AbstractC50522MSa.A0B(A0Z, i) - 1)));
        }
        boolean isEmpty = list.isEmpty();
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (isEmpty) {
            str2 = "Empty list for getting value at percentile of signals, featureId: ";
        } else {
            A1C.append("Invalid percentile ");
            A1C.append(i);
            str2 = ", featureId: ";
        }
        A00(null, MSZ.A0u(str2, str, A1C));
        return new FeatureData(null, null, null, null, 0.0d, 16383, 0L);
    }
}
