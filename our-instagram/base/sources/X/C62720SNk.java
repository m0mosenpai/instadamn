package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.SNk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62720SNk {
    public static C62720SNk A02;
    public final ArrayList A01 = AbstractC25225BEi.A17(8);
    public final C63305ShB A00 = C63305ShB.A00();

    public final void A00(Bundle bundle) {
        C63305ShB c63305ShB = this.A00;
        if (c63305ShB.A01 != null) {
            ArrayList arrayList = this.A01;
            AbstractC166997dE.A1X(arrayList, System.currentTimeMillis());
            if (arrayList.size() >= 8) {
                C63305ShB.A02(new QDr(bundle, c63305ShB, A01()), c63305ShB, false);
            }
        }
    }

    public final long[] A01() {
        ArrayList arrayList = this.A01;
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            C14360o3.A07(obj);
            jArr[i] = AbstractC166987dD.A0N(obj);
        }
        arrayList.clear();
        return jArr;
    }
}
