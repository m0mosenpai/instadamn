package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LZD implements InterfaceC66482zP {
    public final List A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZD lzd = (LZD) obj;
        C14360o3.A0B(lzd, 0);
        return C14360o3.A0K(this.A00, lzd.A00);
    }

    public LZD(List list) {
        this.A00 = list;
    }
}
