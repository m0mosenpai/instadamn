package X;

/* renamed from: X.Ior, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42329Ior implements InterfaceC66482zP {
    public final C38659Gz0 A00;
    public final IJI A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38659Gz0 c38659Gz0;
        C42329Ior c42329Ior = (C42329Ior) obj;
        C38659Gz0 c38659Gz02 = this.A00;
        if (c42329Ior != null) {
            c38659Gz0 = c42329Ior.A00;
        } else {
            c38659Gz0 = null;
        }
        return C14360o3.A0K(c38659Gz02, c38659Gz0);
    }

    public C42329Ior(C38659Gz0 c38659Gz0, IJI iji, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = c38659Gz0;
        this.A01 = iji;
    }
}
