package X;

import java.util.List;

/* renamed from: X.5CZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CZ extends C0YY implements InterfaceC16660sJ {
    public static final C5CZ A00 = new C5CZ();

    public C5CZ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C118135Vx c118135Vx;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        C122225gI c122225gI = C122225gI.A02;
        Object obj2 = list.get(0);
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        InterfaceC113995Cl interfaceC113995Cl = C5C9.A0L;
        C14360o3.A0K(obj2, false);
        C118135Vx c118135Vx2 = null;
        if (obj2 != null) {
            c118135Vx = (C118135Vx) interfaceC113995Cl.EKR(obj2);
        } else {
            c118135Vx = null;
        }
        C14360o3.A0A(c118135Vx);
        long j = c118135Vx.A00;
        Object obj3 = list.get(1);
        C14360o3.A0K(obj3, false);
        if (obj3 != null) {
            c118135Vx2 = (C118135Vx) interfaceC113995Cl.EKR(obj3);
        }
        C14360o3.A0A(c118135Vx2);
        return new C122225gI(j, c118135Vx2.A00);
    }
}
