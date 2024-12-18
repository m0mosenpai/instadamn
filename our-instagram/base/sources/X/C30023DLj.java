package X;

import java.util.List;

/* renamed from: X.DLj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30023DLj extends C0YY implements InterfaceC16660sJ {
    public static final C30023DLj A00 = new C30023DLj();

    public C30023DLj() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C118135Vx c118135Vx;
        C14360o3.A0B(obj, 0);
        List list = (List) obj;
        C122225gI c122225gI = C122225gI.A02;
        Object obj2 = list.get(0);
        long j = C118135Vx.A01;
        C28797CnT c28797CnT = AbstractC28160Cb7.A0G;
        C14360o3.A0K(obj2, false);
        C118135Vx c118135Vx2 = null;
        if (obj2 != null) {
            c118135Vx = (C118135Vx) c28797CnT.A00.invoke(obj2);
        } else {
            c118135Vx = null;
        }
        C14360o3.A0A(c118135Vx);
        long j2 = c118135Vx.A00;
        Object A0t = AbstractC25227BEk.A0t(list);
        C14360o3.A0K(A0t, false);
        if (A0t != null) {
            c118135Vx2 = (C118135Vx) c28797CnT.A00.invoke(A0t);
        }
        C14360o3.A0A(c118135Vx2);
        return new C122225gI(j2, c118135Vx2.A00);
    }
}
