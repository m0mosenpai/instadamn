package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LZN implements InterfaceC66482zP {
    public final List A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "sort_and_filter_option";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZN lzn = (LZN) obj;
        C14360o3.A0B(lzn, 0);
        return C14360o3.A0K(this.A00, lzn.A00);
    }

    public LZN(List list) {
        this.A00 = list;
    }
}
