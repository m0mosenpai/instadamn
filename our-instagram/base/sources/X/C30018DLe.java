package X;

import java.util.List;

/* renamed from: X.DLe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30018DLe extends C0YY implements InterfaceC16660sJ {
    public static final C30018DLe A00 = new C30018DLe();

    public C30018DLe() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28253Ccy c28253Ccy;
        C28254Ccz c28254Ccz;
        C118135Vx c118135Vx;
        C122225gI c122225gI;
        C14360o3.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        if (obj2 != null) {
            c28253Ccy = (C28253Ccy) obj2;
        } else {
            c28253Ccy = null;
        }
        C14360o3.A0A(c28253Ccy);
        int i = c28253Ccy.A00;
        Object A0t = AbstractC25227BEk.A0t(list);
        if (A0t != null) {
            c28254Ccz = (C28254Ccz) A0t;
        } else {
            c28254Ccz = null;
        }
        C14360o3.A0A(c28254Ccz);
        int i2 = c28254Ccz.A00;
        Object obj3 = list.get(2);
        long j = C118135Vx.A01;
        C28797CnT c28797CnT = AbstractC28160Cb7.A0G;
        C14360o3.A0K(obj3, false);
        if (obj3 != null) {
            c118135Vx = (C118135Vx) c28797CnT.A00.invoke(obj3);
        } else {
            c118135Vx = null;
        }
        C14360o3.A0A(c118135Vx);
        long j2 = c118135Vx.A00;
        Object obj4 = list.get(3);
        C122225gI c122225gI2 = C122225gI.A02;
        C5C7 c5c7 = AbstractC28160Cb7.A0B;
        if (!C14360o3.A0K(obj4, false) && obj4 != null) {
            c122225gI = (C122225gI) c5c7.EKR(obj4);
        } else {
            c122225gI = null;
        }
        return new C5W4(null, c122225gI, null, i, i2, 0, Integer.MIN_VALUE, j2);
    }
}
