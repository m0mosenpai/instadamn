package X;

/* loaded from: classes8.dex */
public final class LZW implements InterfaceC66482zP {
    public final Integer A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZW lzw = (LZW) obj;
        C14360o3.A0B(lzw, 0);
        return C14360o3.A0K(this.A01, lzw.A01);
    }

    public LZW(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
