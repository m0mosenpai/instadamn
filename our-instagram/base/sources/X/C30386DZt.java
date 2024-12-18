package X;

/* renamed from: X.DZt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30386DZt extends C0YY implements InterfaceC16620sF {
    public static final C30386DZt A00 = new C30386DZt();

    public C30386DZt() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        EnumC27392C6v enumC27392C6v;
        C5C7 c5c7;
        C6MR c6mr = (C6MR) obj;
        C127015of c127015of = (C127015of) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c6mr, c127015of);
        Object obj3 = c127015of.A02;
        if (obj3 instanceof C5W4) {
            enumC27392C6v = EnumC27392C6v.A02;
        } else if (obj3 instanceof C5W3) {
            enumC27392C6v = EnumC27392C6v.A03;
        } else if (obj3 instanceof C25790Bb7) {
            enumC27392C6v = EnumC27392C6v.A06;
        } else if (obj3 instanceof C27974CUw) {
            enumC27392C6v = EnumC27392C6v.A05;
        } else {
            enumC27392C6v = EnumC27392C6v.A04;
        }
        int ordinal = enumC27392C6v.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        C14360o3.A0C(obj3, AbstractC111324zv.A00(4970));
                        c5c7 = AbstractC28160Cb7.A0C;
                    }
                    return AbstractC16960so.A1M(enumC27392C6v, obj3, Integer.valueOf(c127015of.A01), Integer.valueOf(c127015of.A00), c127015of.A03);
                }
                C14360o3.A0C(obj3, AbstractC111324zv.A00(4971));
                c5c7 = AbstractC28160Cb7.A0D;
            } else {
                C14360o3.A0C(obj3, AbstractC111324zv.A00(4969));
                c5c7 = AbstractC28160Cb7.A08;
            }
        } else {
            C14360o3.A0C(obj3, AbstractC111324zv.A00(4968));
            c5c7 = AbstractC28160Cb7.A06;
        }
        obj3 = AbstractC28160Cb7.A00(c5c7, c6mr, obj3);
        return AbstractC16960so.A1M(enumC27392C6v, obj3, Integer.valueOf(c127015of.A01), Integer.valueOf(c127015of.A00), c127015of.A03);
    }
}
