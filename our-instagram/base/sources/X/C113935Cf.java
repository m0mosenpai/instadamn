package X;

import java.util.List;

/* renamed from: X.5Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113935Cf extends C0YY implements InterfaceC16660sJ {
    public static final C113935Cf A00 = new C113935Cf();

    public C113935Cf() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Number number2 = null;
        if (obj2 != null) {
            number = (Number) obj2;
        } else {
            number = null;
        }
        C14360o3.A0A(number);
        int intValue = number.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            number2 = (Number) obj3;
        }
        C14360o3.A0A(number2);
        return new C5C2(C60Z.A00(intValue, number2.intValue()));
    }
}
