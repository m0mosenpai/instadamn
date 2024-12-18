package X;

/* renamed from: X.5zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133045zT {
    public int A00;
    public Object[] A01;
    public final Object[] A02;

    public final void A01(Object obj) {
        int i = this.A00;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.A01[4] = objArr;
            this.A01 = objArr;
            i = 0;
        }
        this.A01[i] = obj;
        this.A00 = i + 1;
    }

    public final void A00(InterfaceC42101x0 interfaceC42101x0) {
        for (Object[] objArr = this.A02; objArr != null; objArr = objArr[4]) {
            int i = 0;
            do {
                Object obj = objArr[i];
                if (obj == null) {
                    break;
                } else if (!interfaceC42101x0.test(obj)) {
                    i++;
                } else {
                    return;
                }
            } while (i < 4);
        }
    }

    public C133045zT() {
        Object[] objArr = new Object[5];
        this.A02 = objArr;
        this.A01 = objArr;
    }
}
