package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Wku, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70948Wku implements InterfaceC58191Pqx {
    public long A00;
    public C40R A02;
    public long A03;
    public boolean A04;
    public final U92 A05;
    public final Drawable A06;
    public final View.OnClickListener A07;
    public final String A08;
    public final /* synthetic */ C43631zr A0A;
    public final java.util.Set A09 = new HashSet();
    public C50627MWo A01 = new C50627MWo(A00(false), C05F.A00);

    public C70948Wku(C40R c40r, C43631zr c43631zr, long j) {
        this.A0A = c43631zr;
        this.A03 = j;
        this.A02 = c40r;
        this.A00 = j;
        this.A05 = new U92(this, c43631zr, j);
        this.A06 = C43631zr.A00(this.A02, c43631zr);
        this.A08 = C43631zr.A02(this.A02, c43631zr);
        this.A07 = new WNV(34, this, c43631zr);
        if (c43631zr.A02 < 0) {
            C40R c40r2 = this.A02;
            C43631zr.A04(c43631zr, c40r2.A05, c40r2.A08, "Timer started from init", null, c40r2.A07);
            A02(true);
        }
    }

    public final C47981LJa A00(boolean z) {
        if (z) {
            return new C47981LJa(null, 4, "Unused", null, AbstractC167007dF.A0f(this.A0A.A09, this.A08, 2131952981));
        }
        int ceil = (int) Math.ceil(this.A00 / 1000.0d);
        Context context = this.A0A.A09;
        String A0a = AbstractC31177DnL.A0a(context, ceil, 2131952980);
        C14360o3.A07(A0a);
        return new C47981LJa(this.A07, 4, A0a, context.getString(2131952979), AbstractC167007dF.A0f(context, this.A08, 2131952982));
    }

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
        this.A09.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A09.remove(c3o0);
    }

    public final void A01() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((C3O0) it.next()).A0B(this);
        }
    }

    public final void A02(boolean z) {
        if (!this.A04) {
            C43631zr c43631zr = this.A0A;
            C40R c40r = this.A02;
            C43631zr.A04(c43631zr, c40r.A05, c40r.A08, AnonymousClass001.A1D("Timer started from init: ", z), null, c40r.A07);
            this.A05.start();
            this.A04 = true;
        }
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return EnumC40111tc.A04;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return (int) (((this.A00 * 1.0d) / this.A03) * 100.0d);
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        return (Integer) this.A01.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        return (C47981LJa) this.A01.A01;
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        return this.A06;
    }
}
