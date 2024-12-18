package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LSR implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ InterfaceC50419MNy A01;
    public final /* synthetic */ MPU A02;
    public final /* synthetic */ C1336561u A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public LSR(LK0 lk0, InterfaceC50419MNy interfaceC50419MNy, MPU mpu, C1336561u c1336561u, String str, boolean z) {
        this.A03 = c1336561u;
        this.A04 = str;
        this.A02 = mpu;
        this.A01 = interfaceC50419MNy;
        this.A00 = lk0;
        this.A05 = z;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.KiL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.KiL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.KiM, java.lang.Object] */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        Boolean bool;
        List list;
        L9N A00;
        Object obj2;
        Object obj3;
        C47500KyT c47500KyT = (C47500KyT) obj;
        byte[] bArr = null;
        if (c47500KyT != null) {
            bool = Boolean.valueOf(c47500KyT.A00);
        } else {
            bool = null;
        }
        if (AbstractC166997dE.A1Z(bool, true)) {
            bArr = C1336561u.A03;
        } else if (c47500KyT != null) {
            bArr = c47500KyT.A01;
        }
        C1336561u c1336561u = this.A03;
        String str = this.A04;
        MPU mpu = this.A02;
        byte[] EqB = this.A01.EqB();
        String id = mpu.getId();
        C14360o3.A0B(id, 1);
        ?? obj4 = new Object();
        obj4.A00 = id;
        obj4.A01 = EqB;
        List A1J = AbstractC166987dD.A1J(obj4);
        ?? obj5 = new Object();
        obj5.A00 = str;
        obj5.A01 = A1J;
        if (bArr != null && (A00 = C1336361s.A00(bArr)) != null) {
            List list2 = A00.A00;
            Iterator it = list2.iterator();
            while (true) {
                obj2 = null;
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
            ArrayList A1F = AbstractC166987dD.A1F(list2);
            if (c46521KiL == null) {
                A1F.add(obj5);
                list = A1F;
            } else {
                List list3 = c46521KiL.A01;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C14360o3.A0K(((C46522KiM) next).A00, id)) {
                        obj2 = next;
                        break;
                    }
                }
                ArrayList A1F2 = AbstractC166987dD.A1F(list3);
                if (obj2 != null) {
                    A1F2.remove(obj2);
                }
                A1F2.add(obj4);
                ?? obj6 = new Object();
                obj6.A00 = str;
                obj6.A01 = A1F2;
                A1F.remove(c46521KiL);
                A1F.add(obj6);
                list = A1F;
            }
        } else {
            list = AbstractC166987dD.A1J(obj5);
        }
        byte[] A01 = C1336361s.A01(new L9N(list));
        if (A01 == null) {
            this.A00.A05(new K54(AbstractC166987dD.A14("can't serialize data for user")));
        } else {
            LK0.A01(C1336561u.A02(c1336561u, str, A01, this.A05), this.A00, 6);
        }
    }
}
