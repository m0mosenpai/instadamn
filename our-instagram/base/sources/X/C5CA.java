package X;

/* renamed from: X.5CA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CA extends C0YY implements InterfaceC16620sF {
    public static final C5CA A00 = new C5CA();

    public C5CA() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        C5C8 c5c8 = (C5C8) obj2;
        String str = c5c8.A00;
        Object obj3 = c5c8.A03;
        if (obj3 == null) {
            obj3 = C16930sl.A00;
        }
        C5C7 c5c7 = C5C9.A01;
        Object A002 = C5C9.A00(c5c7, c6mr, obj3);
        Object obj4 = c5c8.A02;
        if (obj4 == null) {
            obj4 = C16930sl.A00;
        }
        return AbstractC16960so.A1M(str, A002, C5C9.A00(c5c7, c6mr, obj4), C5C9.A00(c5c7, c6mr, c5c8.A01));
    }
}
