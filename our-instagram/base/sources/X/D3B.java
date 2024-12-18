package X;

import com.meta.compose.component.swipeable.SwipeableState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class D3B implements InterfaceC19960yQ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ SwipeableState A01;

    public D3B(SwipeableState swipeableState, float f) {
        this.A01 = swipeableState;
        this.A00 = f;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List A1J;
        Object A00;
        Map map = (Map) obj;
        SwipeableState swipeableState = this.A01;
        Float A002 = AbstractC27718CKl.A00(swipeableState.A07.getValue(), map);
        C14360o3.A0A(A002);
        float floatValue = A002.floatValue();
        float A03 = AbstractC25231BEo.A03(swipeableState.A09);
        java.util.Set keySet = map.keySet();
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) swipeableState.A0C.getValue();
        float f = this.A00;
        float A032 = AbstractC25231BEo.A03(swipeableState.A0D);
        float f2 = floatValue;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : keySet) {
            if (AbstractC166987dD.A09(obj2) <= A03 + 0.001d) {
                A1E.add(obj2);
            }
        }
        Float A07 = AbstractC001800i.A07(A1E);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj3 : keySet) {
            if (AbstractC166987dD.A09(obj3) >= A03 - 0.001d) {
                A1E2.add(obj3);
            }
        }
        Float A08 = AbstractC001800i.A08(A1E2);
        if (A07 == null) {
            A1J = AbstractC16960so.A1O(A08);
        } else if (A08 != null && !C14360o3.A0J(A07, A08)) {
            A1J = AbstractC16960so.A1Q(A07, A08);
        } else {
            A1J = AbstractC166987dD.A1J(A07);
        }
        int size = A1J.size();
        if (size != 0) {
            if (size != 1) {
                float A04 = AbstractC167007dF.A04(A1J, 0);
                f2 = AbstractC167007dF.A04(A1J, 1);
                if (floatValue > A03 ? f <= (-A032) || A03 <= AbstractC166987dD.A09(interfaceC16620sF.invoke(Float.valueOf(f2), Float.valueOf(A04))) : f < A032 && A03 < AbstractC166987dD.A09(interfaceC16620sF.invoke(Float.valueOf(A04), Float.valueOf(f2)))) {
                    f2 = A04;
                }
            } else {
                f2 = AbstractC167007dF.A04(A1J, 0);
            }
        }
        Object obj4 = map.get(AbstractC25225BEi.A10(f2));
        if (obj4 != null && AbstractC25231BEo.A1a(obj4, swipeableState.A0E)) {
            A00 = swipeableState.A0F.collect(new BTR(7, swipeableState.A02, swipeableState, obj4), interfaceC23621Ds);
            if (A00 != C1JX.A02) {
                A00 = C0eB.A00;
            }
        } else {
            A00 = SwipeableState.A00(swipeableState.A02, swipeableState, interfaceC23621Ds, floatValue);
        }
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }
}
