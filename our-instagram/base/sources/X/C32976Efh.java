package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Efh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32976Efh extends C32547EUx {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final C07270a1 A02;
    public final C6WQ A03;

    public C32976Efh(Activity activity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1) {
        super(activity, null, interfaceC11380iw, c07270a1, null, EnumC31713DwI.A0l, C05F.A01, null);
        this.A02 = c07270a1;
        C6WQ c6wq = new C6WQ(activity);
        this.A03 = c6wq;
        c6wq.A00(activity.getString(2131965724));
        this.A00 = activity;
        this.A01 = interfaceC11380iw;
    }

    private void A01(C07270a1 c07270a1, UserSession userSession, String str, String str2, boolean z) {
        int i;
        if (z && userSession != null) {
            A02(AbstractC166997dE.A0Y(userSession), C1Q9.A0w);
            i = AbstractC31174DnI.A06(userSession);
        } else {
            i = -1;
        }
        C19280xC A05 = C1Q9.A0m.A02(this.A02).A05(null, EnumC31713DwI.A0l);
        A05.A09("successful", Boolean.valueOf(z));
        A05.A08(Integer.valueOf(i), "accounts_count");
        A05.A0C("current_activity", str);
        if (str2 != null) {
            A05.A0C("error", str2);
        }
        AbstractC31173DnH.A1S(A05, c07270a1);
    }

    @Override // X.C32547EUx
    public final void A04(EfU efU) {
        int A03 = C0f9.A03(-333812134);
        User user = efU.A00;
        user.A03.Edl(efU.A08);
        AbstractC31177DnL.A1O(user);
        C07270a1 c07270a1 = this.A02;
        Activity activity = this.A00;
        String str = efU.A07;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession A02 = AbstractC31525Dt9.A02(activity, interfaceC11380iw, c07270a1, user, str, false);
        InterfaceC02900Bo A00 = C0BQ.A00(A02);
        if (A00.BOZ() == 1) {
            AbstractC31525Dt9.A07(activity, null, interfaceC11380iw, A02, AbstractC31171DnF.A01(), false, true, false, false);
        } else if (A00.AGB(activity, A02, user)) {
            A00.E45(activity, null, A02, user, "feed_force_logout_login");
        }
        A01(c07270a1, A02, activity.toString(), null, true);
        C0f9.A0A(-302824895, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(-438331120);
        super.onFail(abstractC115105If);
        C07270a1 c07270a1 = this.A02;
        String obj = this.A00.toString();
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = "unknown";
        }
        A01(c07270a1, null, obj, str, false);
        C0f9.A0A(290517843, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(782163787);
        super.onFinish();
        this.A03.hide();
        C0f9.A0A(-845612712, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1860293603);
        super.onStart();
        C0fJ.A00(this.A03);
        C0f9.A0A(1207077447, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(915540589, C32547EUx.A00(this, obj, 833879310));
    }
}
