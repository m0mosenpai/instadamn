package X;

/* loaded from: classes8.dex */
public final class LZE implements InterfaceC66482zP {
    public final long A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "singleton";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZE lze = (LZE) obj;
        if (lze == null || this.A00 != lze.A00) {
            return false;
        }
        return true;
    }

    public LZE(long j) {
        this.A00 = j;
    }
}
