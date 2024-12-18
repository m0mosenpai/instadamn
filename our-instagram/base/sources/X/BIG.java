package X;

import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import java.util.List;

/* loaded from: classes5.dex */
public final class BIG extends C0YY implements InterfaceC16660sJ {
    public static final BIG A00 = new BIG();

    public BIG() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        Object obj2 = list.get(0);
        C14360o3.A0C(obj2, AbstractC111324zv.A00(11));
        Float f = null;
        if (!AbstractC166987dD.A1a(obj2)) {
            return null;
        }
        C5C7 c5c7 = C25287BHf.A0C;
        Object obj3 = list.get(1);
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.compose.ui.gradientspinner.Segment>");
        int A0D = AbstractC25230BEn.A0D(list.get(2), "null cannot be cast to non-null type kotlin.Int");
        int A0D2 = AbstractC25230BEn.A0D(list.get(3), "null cannot be cast to non-null type kotlin.Int");
        int A0D3 = AbstractC25230BEn.A0D(list.get(4), "null cannot be cast to non-null type kotlin.Int");
        int A0D4 = AbstractC25230BEn.A0D(list.get(5), "null cannot be cast to non-null type kotlin.Int");
        Object obj4 = list.get(6);
        C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.compose.ui.gradientspinner.BezierControlPoints");
        Object obj5 = list.get(7);
        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.Float");
        C25287BHf c25287BHf = new C25287BHf((BezierControlPoints) obj4, (List) obj3, AbstractC166987dD.A09(obj5), A0D, A0D2, A0D3, A0D4);
        Object obj6 = list.get(8);
        C14360o3.A0C(obj6, "null cannot be cast to non-null type kotlin.Float");
        c25287BHf.A01 = AbstractC166987dD.A09(obj6);
        Object obj7 = list.get(9);
        C14360o3.A0C(obj7, "null cannot be cast to non-null type kotlin.Float");
        c25287BHf.A00 = AbstractC166987dD.A09(obj7);
        Object obj8 = list.get(10);
        if (obj8 instanceof Float) {
            f = (Float) obj8;
        }
        c25287BHf.A02 = f;
        AbstractC25227BEk.A1A(c25287BHf.A09, true);
        return c25287BHf;
    }
}
