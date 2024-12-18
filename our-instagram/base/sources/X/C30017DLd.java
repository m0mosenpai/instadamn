package X;

import java.util.List;

/* renamed from: X.DLd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30017DLd extends C0YY implements InterfaceC16660sJ {
    public static final C30017DLd A00 = new C30017DLd();

    public C30017DLd() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        C14360o3.A0B(obj, 0);
        if (obj.equals(false)) {
            A002 = 9205357640488583168L;
        } else {
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
            Object A0t = AbstractC25227BEk.A0t(list);
            if (A0t != null) {
                number2 = (Number) A0t;
            }
            C14360o3.A0A(number2);
            A002 = AbstractC119395aw.A00(floatValue, number2.floatValue());
        }
        return AbstractC25225BEi.A0R(A002);
    }
}
