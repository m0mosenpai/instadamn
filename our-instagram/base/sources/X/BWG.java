package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BWG extends C0YY implements InterfaceC16660sJ {
    public static final BWG A00 = new BWG();

    public BWG() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C5C7 c5c7 = BVY.A0b;
        int A0D = AbstractC25230BEn.A0D(AbstractC166987dD.A16(list), "null cannot be cast to non-null type kotlin.Int");
        Object A0t = AbstractC25227BEk.A0t(list);
        C14360o3.A0C(A0t, "null cannot be cast to non-null type kotlin.Float");
        return new BVY(new DGT(list, 19), AbstractC166987dD.A09(A0t), A0D);
    }
}
