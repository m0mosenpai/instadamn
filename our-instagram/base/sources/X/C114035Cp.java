package X;

import java.util.List;

/* renamed from: X.5Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114035Cp extends C0YY implements InterfaceC16660sJ {
    public static final C114035Cp A00 = new C114035Cp();

    public C114035Cp() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        if (C14360o3.A0K(obj, false)) {
            A002 = 9205357640488583168L;
        } else {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Number number2 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            C14360o3.A0A(number);
            float floatValue = number.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                number2 = (Number) obj3;
            }
            C14360o3.A0A(number2);
            A002 = AbstractC119395aw.A00(floatValue, number2.floatValue());
        }
        return new C119365at(A002);
    }
}
