package X;

import java.util.List;

/* renamed from: X.DLk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30024DLk extends C0YY implements InterfaceC16660sJ {
    public static final C30024DLk A00 = new C30024DLk();

    public C30024DLk() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        C14360o3.A0B(obj, 0);
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
        Object A0t = AbstractC25227BEk.A0t(list);
        if (A0t != null) {
            number2 = (Number) A0t;
        }
        C14360o3.A0A(number2);
        return new C5C2(C60Z.A00(intValue, number2.intValue()));
    }
}
