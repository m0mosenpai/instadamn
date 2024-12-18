package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.LuC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49499LuC implements InterfaceC58191Pqx, InterfaceC65982ya {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C47Z A04;
    public final java.util.Set A05 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC58191Pqx
    public final void EDp(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A05.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A05.remove(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return this.A04.A1G;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A04.A03();
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        C47Z c47z = this.A04;
        EnumC915447k enumC915447k = c47z.A6J;
        EnumC915447k enumC915447k2 = EnumC915447k.A02;
        if (enumC915447k == enumC915447k2 && c47z.A0m()) {
            return C05F.A00;
        }
        if (c47z.A1f == enumC915447k2) {
            return C05F.A01;
        }
        return C05F.A0N;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        Integer num;
        String string;
        C47Z c47z = this.A04;
        C38709H2v c38709H2v = c47z.A0v;
        if (c38709H2v != null) {
            num = c38709H2v.A00;
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null) {
            String A10 = AbstractC43593JPy.A10(new SimpleDateFormat("LLL d, h:mm a z", Locale.US), num.intValue() * 1000);
            Context context = this.A00;
            return new C47981LJa(AbstractC166997dE.A0p(context, 2131956776), AbstractC31177DnL.A0b(context, A10, 2131956774));
        }
        if (c47z.A0l != null) {
            return new C47981LJa(2131955822, 2131955822);
        }
        E72 e72 = c47z.A0m;
        if (e72 != null && e72.A01) {
            z = true;
        }
        if (z) {
            Context context2 = this.A00;
            return new C47981LJa(null, 8, 10000L, AbstractC166997dE.A0p(context2, 2131973881), context2.getString(2131956026), null);
        }
        if (this.A03 != null) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36326365238212435L)) {
                Context context3 = this.A00;
                String A0p = AbstractC166997dE.A0p(context3, 2131973881);
                if (C0BQ.A00(userSession).CLL()) {
                    string = AbstractC31178DnM.A0c(context3, AbstractC166987dD.A10(userSession), 2131969477);
                } else {
                    string = context3.getString(2131969478);
                }
                C14360o3.A07(string);
                return new C47981LJa(new ViewOnClickListenerC48065LPq(this, 1), 8, AbstractC166997dE.A0i(c06090Tz, userSession, 36607840215045791L), A0p, string, context3.getString(2131969476));
            }
        }
        return new C47981LJa(2131973881, 2131973841);
    }

    @Override // X.InterfaceC58191Pqx
    public final /* synthetic */ Drawable C7z() {
        return null;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        C47Z c47z = this.A04;
        if (AbstractC167007dF.A1X(c47z.A1G, EnumC40111tc.A0A)) {
            try {
                return AbstractC189168Zk.A02(c47z).A33;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return c47z.A33;
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((C3O0) it.next()).A0B(this);
        }
    }

    @Override // X.InterfaceC58191Pqx
    public final void DhE() {
        C40131tg c40131tg = C40121td.A0G;
        Context context = this.A00;
        C40121td A01 = c40131tg.A01(context, this.A02);
        C47Z c47z = this.A04;
        C150856qj.A02(context);
        A01.A08(c47z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49499LuC)) {
            return false;
        }
        return C14360o3.A0K(this.A04.A35, ((C49499LuC) obj).A04.A35);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04.A35});
    }

    public C49499LuC(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C47Z c47z) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = interfaceC60442pS;
        this.A04 = c47z;
    }
}
