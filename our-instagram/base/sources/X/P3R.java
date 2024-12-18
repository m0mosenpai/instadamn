package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class P3R implements InterfaceC58191Pqx {
    public int A00;
    public final HashSet A01;
    public final Context A02;
    public final C47Z A03;
    public final String A04;

    public P3R(Context context, C47Z c47z) {
        C14360o3.A0B(c47z, 2);
        this.A02 = context;
        this.A03 = c47z;
        this.A01 = AbstractC166987dD.A1H();
        this.A04 = c47z.A33;
    }

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
        return EnumC40111tc.A0Q;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        if (this.A00 < 100) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        String A0P = AbstractC167027dH.A0P(this.A02, 2131970084);
        C14360o3.A07(A0P);
        return new C47981LJa(null, 8, AbstractC167007dF.A0d(), A0P, null, null);
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        return null;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        return this.A04;
    }
}
