package X;

/* loaded from: classes8.dex */
public final class LZR implements InterfaceC66482zP {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "close_friends_story_row_view_model";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        LZR lzr = (LZR) obj;
        boolean z2 = this.A01;
        if (lzr != null) {
            z = lzr.A01;
        } else {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return true;
    }

    public LZR(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
