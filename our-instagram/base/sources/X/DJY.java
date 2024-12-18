package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class DJY extends C0YY implements InterfaceC16660sJ {
    public static final DJY A00 = new DJY();

    public DJY() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6M3 c6m3;
        List list = (List) obj;
        C5C7 c5c7 = C28364CfO.A05;
        Object A0t = AbstractC25227BEk.A0t(list);
        C14360o3.A0C(A0t, AbstractC111324zv.A00(11));
        if (AbstractC166987dD.A1a(A0t)) {
            c6m3 = C6M3.Vertical;
        } else {
            c6m3 = C6M3.Horizontal;
        }
        Object A16 = AbstractC166987dD.A16(list);
        C14360o3.A0C(A16, "null cannot be cast to non-null type kotlin.Float");
        return new C28364CfO(c6m3, AbstractC166987dD.A09(A16));
    }
}
