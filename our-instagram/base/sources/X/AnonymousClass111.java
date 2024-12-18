package X;

/* renamed from: X.111, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AnonymousClass111 {
    public static final int A00 = (int) AbstractC213012h.A00(16, "kotlinx.coroutines.flow.defaultConcurrency", 2147483647L);

    public static final InterfaceC19390xP A00(InterfaceC19390xP interfaceC19390xP, int i) {
        if (i > 0) {
            if (i == 1) {
                return new C15870qh(interfaceC19390xP);
            }
            return new AnonymousClass056(C05F.A00, AnonymousClass191.A00, interfaceC19390xP, i, -2);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Expected positive concurrency level, but had ", i));
    }

    public static final C007802s A01(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        return A02(new C0X1(null, interfaceC16620sF), interfaceC19390xP);
    }

    public static final C007802s A02(InterfaceC16610sE interfaceC16610sE, InterfaceC19390xP interfaceC19390xP) {
        return new C007802s(C05F.A00, AnonymousClass191.A00, interfaceC16610sE, interfaceC19390xP, -2);
    }

    public static final C013404z A03(Iterable iterable) {
        return new C013404z(C05F.A00, iterable, AnonymousClass191.A00, -2);
    }

    public static final C013404z A04(InterfaceC19390xP... interfaceC19390xPArr) {
        return A03(new C16980sq(interfaceC19390xPArr));
    }
}
