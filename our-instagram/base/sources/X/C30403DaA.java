package X;

/* renamed from: X.DaA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30403DaA extends C0YY implements InterfaceC16620sF {
    public static final C30403DaA A00 = new C30403DaA();

    public C30403DaA() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c6mr, interfaceC74953Yl);
        C5C8 c5c8 = (C5C8) interfaceC74953Yl.getValue();
        String str = c5c8.A00;
        Object obj3 = c5c8.A03;
        if (obj3 == null) {
            obj3 = C16930sl.A00;
        }
        C5C7 c5c7 = AbstractC28160Cb7.A00;
        Object A002 = AbstractC28160Cb7.A00(c5c7, c6mr, obj3);
        Object obj4 = c5c8.A02;
        if (obj4 == null) {
            obj4 = C16930sl.A00;
        }
        return AbstractC16960so.A1M(str, A002, AbstractC28160Cb7.A00(c5c7, c6mr, obj4), AbstractC28160Cb7.A00(c5c7, c6mr, c5c8.A03(0, str.length() - (A1R ? 1 : 0))));
    }
}
