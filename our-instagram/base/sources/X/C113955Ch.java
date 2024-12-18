package X;

import java.util.List;

/* renamed from: X.5Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113955Ch extends C0YY implements InterfaceC16660sJ {
    public static final C113955Ch A00 = new C113955Ch();

    public C113955Ch() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1132359l c1132359l;
        C119365at c119365at;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        C122215gH c122215gH = C122215gH.A03;
        Object obj2 = list.get(0);
        long j = C1132359l.A01;
        InterfaceC113995Cl interfaceC113995Cl = C5C9.A0J;
        C14360o3.A0K(obj2, false);
        Number number = null;
        if (obj2 != null) {
            c1132359l = (C1132359l) interfaceC113995Cl.EKR(obj2);
        } else {
            c1132359l = null;
        }
        C14360o3.A0A(c1132359l);
        long j2 = c1132359l.A00;
        Object obj3 = list.get(1);
        InterfaceC113995Cl interfaceC113995Cl2 = C5C9.A0K;
        C14360o3.A0K(obj3, false);
        if (obj3 != null) {
            c119365at = (C119365at) interfaceC113995Cl2.EKR(obj3);
        } else {
            c119365at = null;
        }
        C14360o3.A0A(c119365at);
        long j3 = c119365at.A00;
        Object obj4 = list.get(2);
        if (obj4 != null) {
            number = (Number) obj4;
        }
        C14360o3.A0A(number);
        return new C122215gH(number.floatValue(), j2, j3);
    }
}
