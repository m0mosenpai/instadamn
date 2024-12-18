package X;

/* renamed from: X.XMq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72072XMq extends C5Ti {
    public static final C72072XMq A00 = new C72072XMq();

    public C72072XMq() {
        super(0, 2);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return "composition";
        }
        return super.A01(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        C5Z4 c5z4 = (C5Z4) c5z5;
        Object[] objArr = c5z4.A03.A07;
        int i = c5z4.A01;
        ((InterfaceC16660sJ) objArr[i]).invoke(objArr[i + 1]);
    }
}
