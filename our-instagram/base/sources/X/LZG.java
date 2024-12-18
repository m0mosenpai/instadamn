package X;

/* loaded from: classes8.dex */
public final class LZG implements InterfaceC66482zP {
    public final MX6 A00;

    public LZG(MX6 mx6) {
        C14360o3.A0B(mx6, 1);
        this.A00 = mx6;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        MX6 mx6;
        LZG lzg = (LZG) obj;
        MX6 mx62 = this.A00;
        if (lzg != null) {
            mx6 = lzg.A00;
        } else {
            mx6 = null;
        }
        return C14360o3.A0K(mx62, mx6);
    }
}
