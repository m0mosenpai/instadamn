package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LSK implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ MPU A01;
    public final /* synthetic */ C1336561u A02;
    public final /* synthetic */ String A03;

    public LSK(LK0 lk0, MPU mpu, C1336561u c1336561u, String str) {
        this.A02 = c1336561u;
        this.A03 = str;
        this.A01 = mpu;
        this.A00 = lk0;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.KiL, java.lang.Object] */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        byte[] bArr;
        L9N A00;
        Object obj2;
        C47500KyT c47500KyT = (C47500KyT) obj;
        Boolean bool = null;
        if (c47500KyT != null) {
            bArr = c47500KyT.A01;
            bool = Boolean.valueOf(c47500KyT.A00);
        } else {
            bArr = null;
        }
        C1336561u c1336561u = this.A02;
        String str = this.A03;
        MPU mpu = this.A01;
        if (bArr != null && (A00 = C1336361s.A00(bArr)) != null) {
            List list = A00.A00;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C46521KiL) obj2).A00, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C46521KiL c46521KiL = (C46521KiL) obj2;
            if (c46521KiL != null) {
                List list2 = c46521KiL.A01;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C14360o3.A0K(((C46522KiM) next).A00, mpu.getId())) {
                        if (next != null) {
                            ArrayList A1F = AbstractC166987dD.A1F(list2);
                            ArrayList A1F2 = AbstractC166987dD.A1F(list);
                            A1F.remove(next);
                            ?? obj3 = new Object();
                            obj3.A00 = str;
                            obj3.A01 = A1F;
                            A1F2.remove(c46521KiL);
                            A1F2.add(obj3);
                            byte[] A01 = C1336361s.A01(new L9N(A1F2));
                            if (A01 != null) {
                                if (AbstractC166997dE.A1Z(bool, true)) {
                                    str = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                                }
                                LK0.A01(C1336561u.A02(c1336561u, str, A01, false), this.A00, 7);
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.A00.A05(K53.A00);
    }
}
