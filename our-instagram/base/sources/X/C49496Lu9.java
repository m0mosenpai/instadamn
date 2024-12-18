package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Lu9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49496Lu9 implements InterfaceC58191Pqx {
    public int A00;
    public final Drawable A02;
    public final C47981LJa A03;
    public Integer A01 = C05F.A00;
    public final HashSet A04 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        return null;
    }

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

    public final void A00(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C3O0) it.next()).A0B(this);
        }
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return EnumC40111tc.A0F;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        return this.A01;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        return this.A03;
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        return this.A02;
    }

    public C49496Lu9(Context context, Drawable drawable) {
        this.A02 = drawable;
        this.A03 = new C47981LJa(AbstractC166997dE.A0p(context, 2131975436), AbstractC166997dE.A0p(context, 2131975435));
    }
}
