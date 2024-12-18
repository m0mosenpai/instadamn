package X;

/* renamed from: X.Iop, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42327Iop implements InterfaceC66482zP {
    public final C38052Gof A00;
    public final C38645Gym A01;
    public final String A02;
    public final String A03;

    public C42327Iop(C38052Gof c38052Gof, C38645Gym c38645Gym, String str, String str2) {
        C14360o3.A0B(str, 2);
        this.A01 = c38645Gym;
        this.A02 = str;
        this.A00 = c38052Gof;
        this.A03 = str2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38645Gym c38645Gym;
        C42327Iop c42327Iop = (C42327Iop) obj;
        C38645Gym c38645Gym2 = this.A01;
        if (c42327Iop != null) {
            c38645Gym = c42327Iop.A01;
        } else {
            c38645Gym = null;
        }
        if (C14360o3.A0K(c38645Gym2, c38645Gym) && C14360o3.A0K(this.A02, c42327Iop.A02) && C14360o3.A0K(this.A00, c42327Iop.A00)) {
            return true;
        }
        return false;
    }
}
