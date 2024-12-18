package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: X.LuA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49497LuA implements InterfaceC58191Pqx {
    public int A00;
    public Drawable A02;
    public UserSession A03;
    public final int A04;
    public final Timer A05;
    public final Context A06;
    public final HashSet A07 = AbstractC166987dD.A1H();
    public Integer A01 = C05F.A00;

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
        this.A07.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A07.remove(c3o0);
        this.A05.cancel();
    }

    public final void A00() {
        Iterator A13 = AbstractC166997dE.A13(this.A07);
        while (A13.hasNext()) {
            ((C3O0) AbstractC166997dE.A0l(A13)).A0B(this);
        }
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
        return this.A01;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        Context context = this.A06;
        return new C47981LJa(null, 8, null, AbstractC166997dE.A0p(context, 2131952738), context.getString(2131952737), null);
    }

    @Override // X.InterfaceC58191Pqx
    public final Drawable C7z() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return this.A06.getDrawable(R.drawable.instagram_gen_ai_home_pano_outline_24);
        }
        return drawable;
    }

    public C49497LuA(Drawable drawable, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = drawable;
        this.A04 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36605486573294861L);
        Timer timer = new Timer();
        this.A05 = timer;
        this.A06 = AbstractC25225BEi.A0F(this.A03);
        this.A03 = this.A03;
        this.A02 = this.A02;
        timer.schedule(new M9v(this), 1000L, 1000L);
    }
}
