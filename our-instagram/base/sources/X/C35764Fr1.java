package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.util.Iterator;

/* renamed from: X.Fr1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35764Fr1 implements InterfaceC58362lv {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C07270a1 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C35764Fr1(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, UserSession userSession, Double d, String str, String str2, String str3) {
        this.A07 = str;
        this.A02 = c07270a1;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A04 = d;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Iterator A1J = AbstractC25226BEj.A1J(obj);
        boolean z = false;
        while (A1J.hasNext()) {
            E6N e6n = (E6N) A1J.next();
            if (this.A07.equals(e6n.A03)) {
                C31456Ds0 c31456Ds0 = new C31456Ds0(30, this, e6n);
                FragmentActivity fragmentActivity = this.A00;
                C07270a1 c07270a1 = this.A02;
                QJ0 qj0 = (QJ0) e6n.A02;
                C1ON A0B = AbstractC35276FhB.A0B(c07270a1, AbstractC35276FhB.A0H(FxcalAccountType.A05, qj0.A01, this.A03.userId), null, qj0.A04, C16030qx.A00(fragmentActivity), AbstractC31172DnG.A10(fragmentActivity), "account_switcher", null);
                A0B.A00 = c31456Ds0;
                C1GJ.A03(A0B);
                z = true;
            }
        }
        if (!z) {
            FragmentActivity fragmentActivity2 = this.A00;
            AbstractC167007dF.A1D(fragmentActivity2, 1, this.A02);
            AbstractC31176DnK.A0v(fragmentActivity2);
            boolean A06 = C1AD.A06(C06090Tz.A05, 2324155693201963306L);
            UserSession userSession = this.A03;
            InterfaceC02900Bo A00 = C0BQ.A00(userSession);
            String str = this.A05;
            AbstractC35178FfV.A00().A01(fragmentActivity2, A00.AEY(fragmentActivity2, null, userSession, str, false).A00, userSession, !A06);
            userSession.getClass();
            C31514Dsy.A03(userSession, null, null, "intra_app", this.A06, str, null, null, null, null, this.A04.doubleValue(), false, true, false);
        }
    }
}
