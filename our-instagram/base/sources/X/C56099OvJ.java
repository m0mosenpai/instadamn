package X;

/* renamed from: X.OvJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56099OvJ implements InterfaceC66482zP {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "your_story_row_view_model";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C56099OvJ c56099OvJ = (C56099OvJ) obj;
        boolean z2 = this.A02;
        if (c56099OvJ != null) {
            z = c56099OvJ.A02;
        } else {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return true;
    }

    public C56099OvJ(Integer num, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = num;
    }
}
