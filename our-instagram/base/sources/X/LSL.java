package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LSL implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ MPU A01;
    public final /* synthetic */ C1336561u A02;
    public final /* synthetic */ String A03;

    public LSL(LK0 lk0, MPU mpu, C1336561u c1336561u, String str) {
        this.A00 = lk0;
        this.A02 = c1336561u;
        this.A03 = str;
        this.A01 = mpu;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        LK0 lk0;
        Object obj2;
        Object obj3;
        List list;
        Object obj4;
        byte[] bArr;
        C47500KyT c47500KyT = (C47500KyT) obj;
        if (c47500KyT != null) {
            byte[] bArr2 = c47500KyT.A01;
            if (bArr2.length != 0) {
                String str = this.A03;
                MPU mpu = this.A01;
                L9N A00 = C1336361s.A00(bArr2);
                if (A00 != null) {
                    Iterator it = A00.A00.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (C14360o3.A0K(((C46521KiL) obj3).A00, str)) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    C46521KiL c46521KiL = (C46521KiL) obj3;
                    if (c46521KiL != null && (list = c46521KiL.A01) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj4 = it2.next();
                                if (C14360o3.A0K(((C46522KiM) obj4).A00, mpu.getId())) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        C46522KiM c46522KiM = (C46522KiM) obj4;
                        if (c46522KiM != null && (bArr = c46522KiM.A01) != null) {
                            lk0 = this.A00;
                            obj2 = new K50(bArr);
                            lk0.A05(obj2);
                        }
                    }
                }
            }
        }
        lk0 = this.A00;
        obj2 = K51.A00;
        lk0.A05(obj2);
    }
}
