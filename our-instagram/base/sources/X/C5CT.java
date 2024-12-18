package X;

import java.util.List;

/* renamed from: X.5CT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CT extends C0YY implements InterfaceC16660sJ {
    public static final C5CT A00 = new C5CT();

    public C5CT() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5W3 c5w3;
        C5W3 c5w32;
        C5W3 c5w33;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C5C7 c5c7 = C5C9.A0B;
        C5W3 c5w34 = null;
        if (!C14360o3.A0K(obj2, false) && obj2 != null) {
            c5w3 = (C5W3) c5c7.EKR(obj2);
        } else {
            c5w3 = null;
        }
        Object obj3 = list.get(1);
        if (!C14360o3.A0K(obj3, false) && obj3 != null) {
            c5w32 = (C5W3) c5c7.EKR(obj3);
        } else {
            c5w32 = null;
        }
        Object obj4 = list.get(2);
        if (!C14360o3.A0K(obj4, false) && obj4 != null) {
            c5w33 = (C5W3) c5c7.EKR(obj4);
        } else {
            c5w33 = null;
        }
        Object obj5 = list.get(3);
        if (!C14360o3.A0K(obj5, false) && obj5 != null) {
            c5w34 = (C5W3) c5c7.EKR(obj5);
        }
        return new C28222CcS(c5w3, c5w32, c5w33, c5w34);
    }
}
