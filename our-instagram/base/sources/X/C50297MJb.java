package X;

/* renamed from: X.MJb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50297MJb extends C0YY implements InterfaceC16660sJ {
    public static final C50297MJb A00 = new C50297MJb();

    public C50297MJb() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C83403nh c83403nh = (C83403nh) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(c83403nh);
        String A0h = c83403nh.A0h();
        if (A0h == null) {
            A0h = "";
        }
        A0x.append(A0h);
        A0x.append(": ");
        return AbstractC166997dE.A0v(c83403nh.A10, A0x);
    }
}
