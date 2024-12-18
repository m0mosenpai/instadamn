package X;

import java.util.List;

/* renamed from: X.5CP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CP extends C0YY implements InterfaceC16660sJ {
    public static final C5CP A00 = new C5CP();

    public C5CP() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28253Ccy c28253Ccy;
        C28254Ccz c28254Ccz;
        C118135Vx c118135Vx;
        C122225gI c122225gI;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        if (obj2 != null) {
            c28253Ccy = (C28253Ccy) obj2;
        } else {
            c28253Ccy = null;
        }
        C14360o3.A0A(c28253Ccy);
        int i = c28253Ccy.A00;
        Object obj3 = list.get(1);
        if (obj3 != null) {
            c28254Ccz = (C28254Ccz) obj3;
        } else {
            c28254Ccz = null;
        }
        C14360o3.A0A(c28254Ccz);
        int i2 = c28254Ccz.A00;
        Object obj4 = list.get(2);
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        InterfaceC113995Cl interfaceC113995Cl = C5C9.A0L;
        C14360o3.A0K(obj4, false);
        if (obj4 != null) {
            c118135Vx = (C118135Vx) interfaceC113995Cl.EKR(obj4);
        } else {
            c118135Vx = null;
        }
        C14360o3.A0A(c118135Vx);
        long j = c118135Vx.A00;
        Object obj5 = list.get(3);
        C122225gI c122225gI2 = C122225gI.A02;
        C5C7 c5c7 = C5C9.A0E;
        if (!C14360o3.A0K(obj5, false) && obj5 != null) {
            c122225gI = (C122225gI) c5c7.EKR(obj5);
        } else {
            c122225gI = null;
        }
        return new C5W4(null, c122225gI, null, i, i2, 0, Integer.MIN_VALUE, j);
    }
}
