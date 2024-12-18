package X;

/* renamed from: X.Fxw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36182Fxw implements InterfaceC66482zP {
    public final int A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36182Fxw c36182Fxw = (C36182Fxw) obj;
        if (c36182Fxw == null || this.A00 != c36182Fxw.A00) {
            return false;
        }
        return true;
    }

    public C36182Fxw(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "hall_pass_row_view_model";
    }
}
