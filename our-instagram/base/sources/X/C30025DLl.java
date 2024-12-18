package X;

import java.util.List;

/* renamed from: X.DLl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30025DLl extends C0YY implements InterfaceC16660sJ {
    public static final C30025DLl A00 = new C30025DLl();

    public C30025DLl() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        C14360o3.A0B(obj, 0);
        if (obj.equals(false)) {
            A002 = C118135Vx.A01;
        } else {
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
            Object A0t = AbstractC25227BEk.A0t(list);
            if (A0t != null) {
                c118145Vy = (C118145Vy) A0t;
            }
            C14360o3.A0A(c118145Vy);
            A002 = AbstractC118155Vz.A00(floatValue, c118145Vy.A00);
        }
        return new C118135Vx(A002);
    }
}
