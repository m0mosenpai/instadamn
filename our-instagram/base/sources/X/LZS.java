package X;

/* loaded from: classes8.dex */
public final class LZS implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "setting_header";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZS lzs = (LZS) obj;
        C14360o3.A0B(lzs, 0);
        if (C14360o3.A0K(this.A00, lzs.A00) && C14360o3.A0K(this.A01, lzs.A01)) {
            return true;
        }
        return false;
    }

    public LZS(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
