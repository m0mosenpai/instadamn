package X;

import android.graphics.drawable.Drawable;
import java.util.HashSet;

/* renamed from: X.Lu8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49495Lu8 implements InterfaceC58191Pqx {
    public int A00;
    public final HashSet A01 = AbstractC166987dD.A1H();
    public final Drawable A02;

    @Override // X.InterfaceC58191Pqx
    public final void DhE() {
    }

    @Override // X.InterfaceC58191Pqx
    public final void EDp(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A01.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A01.remove(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return EnumC40111tc.A05;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        if (this.A00 >= 100) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        return this.A02;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        return null;
    }

    public C49495Lu8(Drawable drawable, int i) {
        this.A02 = drawable;
        this.A00 = i;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        return new C47981LJa(2131957065, 2131957065);
    }
}
