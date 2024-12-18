package X;

import java.util.List;

/* renamed from: X.5C5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5C5 extends C0YY implements InterfaceC16660sJ {
    public static final C5C5 A00 = new C5C5();

    public C5C5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5C8 c5c8;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C5C7 c5c7 = C5C9.A00;
        C5C2 c5c2 = null;
        if (!C14360o3.A0K(obj2, false) && obj2 != null) {
            c5c8 = (C5C8) c5c7.EKR(obj2);
        } else {
            c5c8 = null;
        }
        C14360o3.A0A(c5c8);
        Object obj3 = list.get(1);
        C5C7 c5c72 = C5C9.A0G;
        if (!C14360o3.A0K(obj3, false) && obj3 != null) {
            c5c2 = (C5C2) c5c72.EKR(obj3);
        }
        C14360o3.A0A(c5c2);
        return new C5C3(c5c8, null, c5c2.A00);
    }
}
