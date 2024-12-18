package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.LuB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49498LuB implements InterfaceC58191Pqx, InterfaceC65982ya {
    public final C47Z A00;
    public final String A01;
    public final Context A02;
    public final boolean A05;
    public final HashSet A04 = AbstractC166987dD.A1H();
    public final EnumC40111tc A03 = EnumC40111tc.A0Q;

    @Override // X.InterfaceC58191Pqx
    public final void DhE() {
    }

    @Override // X.InterfaceC58191Pqx
    public final void EDp(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A04.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A04.remove(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return this.A03;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A00.A03();
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        C115435Kd c115435Kd;
        C47Z c47z = this.A00;
        if (c47z.A0m()) {
            return C05F.A00;
        }
        if (c47z.A1f == EnumC915447k.A02 || ((c115435Kd = c47z.A6I) != null && c115435Kd.A00 == 403)) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        int i = 2131969109;
        if (this.A05) {
            i = 2131969110;
        }
        return new C47981LJa(i, 0);
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        if (this.A01 == null) {
            return this.A02.getDrawable(R.drawable.grid_camera_icon_small);
        }
        return null;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        return this.A01;
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        Iterator A13 = AbstractC166997dE.A13(this.A04);
        while (A13.hasNext()) {
            ((C3O0) A13.next()).A0B(this);
        }
    }

    public C49498LuB(Context context, C47Z c47z, boolean z) {
        this.A02 = context;
        this.A00 = c47z;
        this.A05 = z;
        String str = c47z.A33;
        this.A01 = str == null ? c47z.A3K : str;
    }
}
