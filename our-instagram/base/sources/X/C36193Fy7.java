package X;

/* renamed from: X.Fy7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36193Fy7 implements InterfaceC66482zP {
    public final int A00;
    public final boolean A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36193Fy7 c36193Fy7 = (C36193Fy7) obj;
        if (c36193Fy7 != null && this.A01 == c36193Fy7.A01 && this.A00 == c36193Fy7.A00) {
            return true;
        }
        return false;
    }

    public C36193Fy7(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "audience_lists_row_view_model";
    }
}
