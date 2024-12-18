package X;

/* loaded from: classes8.dex */
public final class LZP implements InterfaceC66482zP {
    public final EnumC53237Nga A00;
    public final Integer A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZP lzp = (LZP) obj;
        C14360o3.A0B(lzp, 0);
        if (C14360o3.A0K(this.A01, lzp.A01) && this.A00 == lzp.A00) {
            return true;
        }
        return false;
    }

    public LZP(EnumC53237Nga enumC53237Nga, Integer num) {
        this.A01 = num;
        this.A00 = enumC53237Nga;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(2131953034);
    }
}
