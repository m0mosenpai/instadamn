package X;

import java.util.List;

/* renamed from: X.5CX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CX extends C0YY implements InterfaceC16660sJ {
    public static final C5CX A00 = new C5CX();

    public C5CX() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new C122195gF(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
