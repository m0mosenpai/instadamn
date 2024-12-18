package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36966GQj implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C33090Eip A03;
    public final /* synthetic */ String A04;

    public RunnableC36966GQj(Context context, FragmentActivity fragmentActivity, UserSession userSession, C33090Eip c33090Eip, String str) {
        this.A03 = c33090Eip;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33090Eip c33090Eip = this.A03;
        AbstractC33541EsF abstractC33541EsF = (AbstractC33541EsF) c33090Eip.A08.getValue();
        if ((abstractC33541EsF instanceof C32807EcB) && !AbstractC166987dD.A1a(((C32807EcB) abstractC33541EsF).A00)) {
            UserSession userSession = this.A02;
            Context context = this.A00;
            FragmentActivity fragmentActivity = this.A01;
            String str = this.A04;
            C14360o3.A0B(userSession, 0);
            AbstractC167027dH.A13(context, fragmentActivity, str);
            C34676FPl c34676FPl = new C34676FPl(context, userSession, new C36381G3h(fragmentActivity, userSession, c33090Eip, str));
            String str2 = c33090Eip.A04;
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            C35142Fej.A00(userSession, "customer_details_tos_impression", str2, c16920sk);
            AbstractC166987dD.A1W(AbstractC54025Nub.A00(c34676FPl.A00, c34676FPl.A00()));
            return;
        }
        UserSession userSession2 = this.A02;
        FragmentActivity fragmentActivity2 = this.A01;
        String str3 = this.A04;
        C14360o3.A0B(userSession2, 0);
        AbstractC167027dH.A13(fragmentActivity2, str3, c33090Eip);
        C31812DyW c31812DyW = new C31812DyW(userSession2, c33090Eip);
        ELF elf = new ELF();
        elf.A05 = c31812DyW;
        AbstractC31174DnI.A1M(AbstractC31174DnI.A0N(elf, fragmentActivity2, userSession2), str3);
    }
}
