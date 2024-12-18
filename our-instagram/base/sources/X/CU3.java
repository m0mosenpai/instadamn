package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class CU3 {
    public COQ A01;
    public final List A02 = AbstractC166987dD.A1E();
    public int A00 = 0;
    public final ArrayList A03 = AbstractC166987dD.A1E();

    public final CT1 A00() {
        ArrayList arrayList = this.A03;
        int i = this.A00;
        this.A00 = i + 1;
        CT1 ct1 = (CT1) AbstractC001800i.A0O(arrayList, i);
        if (ct1 == null) {
            CT1 ct12 = new CT1(Integer.valueOf(this.A00));
            arrayList.add(ct12);
            return ct12;
        }
        return ct1;
    }
}
