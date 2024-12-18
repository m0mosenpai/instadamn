package X;

import java.util.ArrayList;

/* renamed from: X.3O7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3O7 extends C56082hw implements C3O8 {
    public C56082hw[] A01 = new C56082hw[4];
    public int A00 = 0;

    public final void A0c(C72508XfN c72508XfN, ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            C56082hw c56082hw = this.A01[i2];
            ArrayList arrayList2 = c72508XfN.A04;
            if (!arrayList2.contains(c56082hw)) {
                arrayList2.add(c56082hw);
            }
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            AbstractC72872Xq6.A00(this.A01[i3], c72508XfN, arrayList, i);
        }
    }
}
