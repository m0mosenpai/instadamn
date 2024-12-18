package X;

/* renamed from: X.MJf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50301MJf extends C0YY implements InterfaceC16660sJ {
    public static final C50301MJf A00 = new C50301MJf();

    public C50301MJf() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C83403nh c83403nh = (C83403nh) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(c83403nh);
        String A0g = c83403nh.A0g();
        if (A0g == null) {
            A0g = "";
        }
        A0x.append(A0g);
        A0x.append(':');
        A0x.append(c83403nh.C8i());
        return A0x.toString();
    }
}
