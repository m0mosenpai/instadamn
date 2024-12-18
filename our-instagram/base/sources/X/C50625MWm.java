package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MWm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50625MWm {
    public static int A02;
    public final int A00;
    public final InterfaceC57988PnY A01;

    private final boolean A00(Object obj) {
        int i;
        if (obj != null && (i = this.A00) != -1 && ((Tx0) obj).A0F) {
            int i2 = A02;
            if (i2 < i) {
                A02 = i2 + 1;
            } else {
                return false;
            }
        }
        return true;
    }

    public final List A01() {
        Object nut;
        ArrayList arrayList = new ArrayList();
        C65956Tx8 B2L = this.A01.B2L();
        A02 = 0;
        List list = B2L.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object obj2 = B2L.A01.get(i);
            if (!(obj instanceof InterfaceC66482zP)) {
                if (obj instanceof C65741TtG) {
                    if (A00(obj2) && obj2 != null) {
                        obj = new C50622MWj((Tx0) obj2, (C65741TtG) obj);
                        arrayList.add(obj);
                    }
                } else if (obj instanceof C68090V9z) {
                    if (A00(obj2) && obj2 != null) {
                        obj = new NUW((C68090V9z) obj, (Tx0) obj2);
                        arrayList.add(obj);
                    }
                } else if (obj instanceof HYX) {
                    if (A00(obj2) && obj2 != null) {
                        obj = new NUZ((HYX) obj, (Tx0) obj2);
                        arrayList.add(obj);
                    }
                } else if (obj instanceof C66130U0o) {
                    if (A00(obj2) && obj2 != null) {
                        obj = new MZR((C66130U0o) obj, (Tx0) obj2);
                        arrayList.add(obj);
                    }
                } else if (obj instanceof HYY) {
                    HYY hyy = (HYY) obj;
                    if (hyy.A06() != null && A00(obj2) && obj2 != null) {
                        obj = new NUV(hyy, (Tx0) obj2);
                        arrayList.add(obj);
                    }
                } else if (C51760Mtj.A04(obj, 48)) {
                    if (obj2 != null) {
                        obj = new MZW((C51760Mtj) obj, (VWV) obj2);
                        arrayList.add(obj);
                    }
                } else {
                    if (!(obj instanceof C38657Gyy)) {
                        if (obj instanceof C54189NxQ) {
                            obj = new NUR();
                        } else if (obj instanceof MZV) {
                            nut = new MZT((MZV) obj);
                        } else {
                            if ((obj instanceof NUN) && A00(obj2) && obj2 != null) {
                                obj = new NUX((NUN) obj, (Tx0) obj2);
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        nut = new NUT((C38657Gyy) obj);
                    }
                    obj = nut;
                    arrayList.add(obj);
                }
            }
            if (obj == null) {
            }
            arrayList.add(obj);
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public C50625MWm(InterfaceC57988PnY interfaceC57988PnY, int i) {
        this.A01 = interfaceC57988PnY;
        this.A00 = i;
    }
}
