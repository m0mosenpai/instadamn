package X;

/* renamed from: X.Ios, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42330Ios implements InterfaceC66482zP {
    public final C38628GyV A00;
    public final C38052Gof A01;
    public final C41643IbZ A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A02();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42330Ios c42330Ios = (C42330Ios) obj;
        C14360o3.A0B(c42330Ios, 0);
        if (C14360o3.A0K(this.A02, c42330Ios.A02) && C14360o3.A0K(this.A03, c42330Ios.A03) && this.A00 == c42330Ios.A00 && this.A01 == c42330Ios.A01 && this.A04 == c42330Ios.A04) {
            return true;
        }
        return false;
    }

    public C42330Ios(C38628GyV c38628GyV, C38052Gof c38052Gof, C41643IbZ c41643IbZ, String str, boolean z) {
        AbstractC167017dG.A1R(str, c38628GyV);
        this.A02 = c41643IbZ;
        this.A03 = str;
        this.A00 = c38628GyV;
        this.A01 = c38052Gof;
        this.A04 = z;
    }
}
