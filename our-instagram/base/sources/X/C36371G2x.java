package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36371G2x implements InterfaceC37156GYt {
    public final UserSession A00;
    public final C34425FFp A01;
    public final E70 A02;
    public final Context A03;
    public final FragmentActivity A04;

    public C36371G2x(Context context, FragmentActivity fragmentActivity, UserSession userSession, C34425FFp c34425FFp, E70 e70) {
        C14360o3.A0B(userSession, 3);
        this.A03 = context;
        this.A04 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = e70;
        this.A01 = c34425FFp;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A03;
        C31335Dq0 A01 = C31335Dq0.A01(context, 2131958827);
        String A0p = AbstractC166997dE.A0p(context, 2131958829);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A08;
        E70 e70 = this.A02;
        C54737OFo c54737OFo = new C54737OFo(null, null, null, new G9H(this, 19), enumC53237Nga, null, null, null, null, null, null, null, A0p, null, null, e70.A0y, true);
        C35246Fgf A00 = C35246Fgf.A00(context, 2131958828);
        C142846ck A002 = AbstractC147806l5.A00(this.A00);
        int A06 = e70.A06();
        String A03 = E70.A03(e70);
        String str = e70.A0Q;
        C25531Mh A0I = AbstractC31172DnG.A0I(A002);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A002);
            AbstractC31174DnI.A1K(A0I, "translation_section_rendered");
            A0I.A0o("thread_channel_controls");
            AbstractC31177DnL.A1H(A0I, A002, AbstractC31179DnN.A0a(A0I, "thread_details", A03, str, A06));
        }
        return AbstractC16960so.A1Q(A01, c54737OFo, A00, new C35119FeM(true));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        boolean z;
        C81543kP c81543kP;
        List list;
        List list2;
        E70 e70 = this.A02;
        UserSession userSession = this.A00;
        if (e70.A0E(userSession.userId) && ((c81543kP = e70.A0E) == null || (((list = c81543kP.A0D) == null || list.isEmpty()) && ((list2 = c81543kP.A0E) == null || list2.isEmpty())))) {
            z = false;
        } else {
            z = true;
        }
        if (!C18U.A06(C06090Tz.A05, userSession, 36319377327463729L) || !z) {
            return false;
        }
        return true;
    }
}
