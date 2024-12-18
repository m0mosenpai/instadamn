package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3I implements InterfaceC37156GYt {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final E70 A04;
    public final InterfaceC190658cN A05;
    public final C2056398n A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public G3I(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, FragmentActivity fragmentActivity, UserSession userSession, E70 e70, InterfaceC190658cN interfaceC190658cN, C2056398n c2056398n, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1J(userSession, 3, interfaceC190658cN);
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = e70;
        this.A06 = c2056398n;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A05 = interfaceC190658cN;
        this.A01 = onCheckedChangeListener;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        C36731GHa A02;
        FragmentActivity fragmentActivity = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A03;
        E70 e70 = this.A04;
        C2056398n c2056398n = this.A06;
        boolean z = this.A09;
        boolean z2 = this.A08;
        boolean z3 = this.A07;
        InterfaceC190658cN interfaceC190658cN = this.A05;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A01;
        if (z) {
            int i = 2131959150;
            if (z2) {
                i = 2131959149;
            }
            InterfaceC19630xq interfaceC19630xq = c2056398n.A00;
            AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "thread_translation_tooltip_impression", 0);
            boolean z4 = e70.A0y;
            C5SU A0U = AbstractC167007dF.A0U(fragmentActivity, i);
            A0U.A02();
            A0U.A0B = false;
            A0U.A0A = false;
            A0U.A04 = new EfP(c2056398n, 8);
            A02 = new C33241Elb(onCheckedChangeListener, userSession, A0U, z4);
        } else {
            A02 = C36731GHa.A02(onCheckedChangeListener, 2131960741, e70.A0y);
        }
        A02.A09 = interfaceC190658cN;
        String A08 = C4GQ.A08(context, userSession, e70.A0P, AbstractC31171DnF.A0n(e70.A0c), false);
        C14360o3.A07(A08);
        int i2 = 2131960742;
        if (z3) {
            i2 = 2131960743;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, A08, i2));
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36876855491952762L);
        if (A04.length() > 0) {
            A02.A0C = true;
            String A0p = AbstractC166997dE.A0p(context, 2131960721);
            A0H.append((CharSequence) " ");
            A0H.append((CharSequence) A0p).setSpan(new C52790NXz(fragmentActivity, userSession, A04, context.getColor(AbstractC53242c7.A06(fragmentActivity)), 2), A0H.length(), A0H.length(), 33);
        }
        A02.A0A = A0H;
        return AbstractC166987dD.A1J(A02);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return AbstractC34095F2x.A00(this.A03, this.A04);
    }
}
