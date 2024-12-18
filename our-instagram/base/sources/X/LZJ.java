package X;

/* loaded from: classes8.dex */
public final class LZJ implements InterfaceC66482zP {
    public final String A00;

    public LZJ(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "ai_sticker_error_message";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZJ lzj = (LZJ) obj;
        C14360o3.A0B(lzj, 0);
        return C14360o3.A0K(lzj.A00, this.A00);
    }
}
