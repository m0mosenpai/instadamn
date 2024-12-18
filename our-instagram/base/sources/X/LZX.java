package X;

/* loaded from: classes8.dex */
public final class LZX implements InterfaceC66482zP {
    public final int A00;
    public final C3PR A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZX lzx = (LZX) obj;
        C14360o3.A0B(lzx, 0);
        return C14360o3.A0K(this.A02, lzx.A02);
    }

    public LZX(C3PR c3pr, String str, int i) {
        AbstractC167017dG.A1R(str, c3pr);
        this.A00 = i;
        this.A02 = str;
        this.A01 = c3pr;
    }
}
