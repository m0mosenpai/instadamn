package X;

/* loaded from: classes9.dex */
public final class Ov9 implements InterfaceC66482zP {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "share_to_my_week_row_view_model";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Ov9 ov9 = (Ov9) obj;
        if (ov9 == null || this.A01 != ov9.A01) {
            return false;
        }
        return true;
    }

    public Ov9(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
