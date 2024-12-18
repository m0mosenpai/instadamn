package X;

import java.util.List;

/* renamed from: X.5Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114015Cn extends C0YY implements InterfaceC16660sJ {
    public static final C114015Cn A00 = new C114015Cn();

    public C114015Cn() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        if (C14360o3.A0K(obj, false)) {
            A002 = C118135Vx.A01;
        } else {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C118145Vy c118145Vy = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            C14360o3.A0A(number);
            float floatValue = number.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                c118145Vy = (C118145Vy) obj3;
            }
            C14360o3.A0A(c118145Vy);
            A002 = AbstractC118155Vz.A00(floatValue, c118145Vy.A00);
        }
        return new C118135Vx(A002);
    }
}
