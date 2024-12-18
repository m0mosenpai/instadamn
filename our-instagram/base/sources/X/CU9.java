package X;

/* loaded from: classes5.dex */
public final class CU9 {
    public int A00;
    public CAN A01;
    public CAN A02;
    public Long A03;
    public boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.CAN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.CAN] */
    public final void A00(C5C3 c5c3) {
        C5C3 c5c32;
        String str;
        C5C3 c5c33;
        this.A04 = false;
        CAN can = this.A02;
        if (can != null) {
            c5c32 = can.A01;
        } else {
            c5c32 = null;
        }
        if (!c5c3.equals(c5c32)) {
            String str2 = c5c3.A01.A00;
            CAN can2 = this.A02;
            if (can2 != null && (c5c33 = can2.A01) != null) {
                str = c5c33.A01.A00;
            } else {
                str = null;
            }
            boolean A0K = C14360o3.A0K(str2, str);
            CAN can3 = this.A02;
            if (A0K) {
                if (can3 != null) {
                    can3.A01 = c5c3;
                    return;
                }
                return;
            }
            CAN obj = new Object();
            obj.A00 = can3;
            obj.A01 = c5c3;
            this.A02 = obj;
            this.A01 = null;
            int length = this.A00 + str2.length();
            this.A00 = length;
            if (length <= 100000 || can3 == null) {
                return;
            }
            do {
                CAN can4 = obj.A00;
                if (can4 != null && can4.A00 != null) {
                    obj = obj.A00;
                } else {
                    obj.A00 = null;
                    return;
                }
            } while (obj != 0);
        }
    }
}
