package X;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EUX extends C1P1 {
    public InterfaceC11380iw A00;
    public C07270a1 A01;
    public C34929FaF A02;
    public C34616FMz A03;
    public final android.net.Uri A04;
    public final FragmentActivity A05;
    public final C6WQ A06;
    public final String A07;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1100643335);
        EfU efU = (EfU) obj;
        int A032 = C0f9.A03(-1810184901);
        User user = efU.A00;
        AbstractC31177DnL.A1O(user);
        C1Q9 c1q9 = C1Q9.A0u;
        C07270a1 c07270a1 = this.A01;
        c1q9.A02(c07270a1).A04().A0C("instagram_id", user.getId());
        C35161Ff3 c35161Ff3 = new C35161Ff3();
        c35161Ff3.A02();
        c35161Ff3.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A0B), AbstractC167007dF.A0h("EMAIL_LINK_ONETAP"));
        FD1.A00(c07270a1, c35161Ff3, "", user.getId(), null, null, null);
        FragmentActivity fragmentActivity = this.A05;
        String str = efU.A07;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession A02 = AbstractC31525Dt9.A02(fragmentActivity, interfaceC11380iw, c07270a1, user, str, false);
        AbstractC31525Dt9.A07(fragmentActivity, this.A04, interfaceC11380iw, A02, AbstractC31171DnF.A01(), true, false, true, false);
        C34616FMz c34616FMz = this.A03;
        c34616FMz.A04 = true;
        String A0q = AbstractC31176DnK.A0q(A02);
        c34616FMz.A03 = A0q;
        C34929FaF.A00(this.A02, c34616FMz.A00, c34616FMz.A01, c34616FMz.A02, A0q, c34616FMz.A04);
        InterfaceC19610xo ARD = AbstractC31174DnI.A0f().ARD();
        ARD.E77("has_one_clicked_logged_in", true);
        ARD.apply();
        C0f9.A0A(1700754649, A032);
        C0f9.A0A(-1265239319, A03);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.FMz, java.lang.Object] */
    public EUX(android.net.Uri uri, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, String str, String str2) {
        C6WQ A0i = AbstractC31174DnI.A0i(fragmentActivity);
        this.A06 = A0i;
        A0i.A00(fragmentActivity.getString(2131965724));
        this.A04 = uri;
        this.A07 = str;
        this.A01 = c07270a1;
        this.A00 = interfaceC11380iw;
        this.A05 = fragmentActivity;
        this.A02 = new C34929FaF(interfaceC11380iw, c07270a1);
        ?? obj = new Object();
        obj.A01 = str2;
        obj.A00 = EnumC31713DwI.A0t;
        obj.A02 = str;
        this.A03 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        DialogInterfaceOnClickListenerC35454FkB dialogInterfaceOnClickListenerC35454FkB;
        DialogInterfaceOnClickListenerC35454FkB dialogInterfaceOnClickListenerC35454FkB2;
        int A03 = C0f9.A03(1172842726);
        C1Q9 c1q9 = C1Q9.A1D;
        C07270a1 c07270a1 = this.A01;
        C19280xC A05 = c1q9.A02(c07270a1).A05(null, EnumC31713DwI.A0r);
        A05.A0C("event_type", "one_click");
        A05.A0C("uid_encoded", this.A07);
        AbstractC31173DnH.A1S(A05, c07270a1);
        C34616FMz c34616FMz = this.A03;
        c34616FMz.A04 = false;
        C34929FaF.A00(this.A02, c34616FMz.A00, c34616FMz.A01, c34616FMz.A02, c34616FMz.A03, false);
        EfU efU = (EfU) abstractC115105If.A00();
        if (efU == null) {
            i = 1422846675;
        } else if (AbstractC31525Dt9.A09(abstractC115105If)) {
            C34643FOa c34643FOa = ((C32196ECr) efU).A01;
            new Handler().post(new RunnableC36940GPj(((C32196ECr) efU).A00, c34643FOa, this));
            i = 542722757;
        } else {
            String str = efU.mErrorTitle;
            String errorMessage = efU.getErrorMessage();
            ArrayList arrayList = efU.A0A;
            FragmentActivity fragmentActivity = this.A05;
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            if (TextUtils.isEmpty(str)) {
                str = fragmentActivity.getString(2131961880);
            }
            A0H.A05 = str;
            if (TextUtils.isEmpty(errorMessage)) {
                errorMessage = fragmentActivity.getString(2131972429);
            }
            A0H.A0r(errorMessage);
            if (arrayList != null && !arrayList.isEmpty()) {
                FM6 fm6 = (FM6) arrayList.get(0);
                String str2 = fm6.A01;
                EnumC33368Ep1 enumC33368Ep1 = EnumC33368Ep1.SWITCH_TO_SIGNUP_FLOW;
                if (enumC33368Ep1 == fm6.A00) {
                    dialogInterfaceOnClickListenerC35454FkB = DialogInterfaceOnClickListenerC35454FkB.A00(this, 21);
                } else {
                    dialogInterfaceOnClickListenerC35454FkB = null;
                }
                A0H.A0c(dialogInterfaceOnClickListenerC35454FkB, str2);
                if (arrayList.size() > 1) {
                    FM6 fm62 = (FM6) arrayList.get(1);
                    String str3 = fm62.A01;
                    if (enumC33368Ep1 == fm62.A00) {
                        dialogInterfaceOnClickListenerC35454FkB2 = DialogInterfaceOnClickListenerC35454FkB.A00(this, 21);
                    } else {
                        dialogInterfaceOnClickListenerC35454FkB2 = null;
                    }
                    A0H.A0d(dialogInterfaceOnClickListenerC35454FkB2, str3);
                }
            } else {
                A0H.A0J(null, 2131960994);
            }
            if (!fragmentActivity.isFinishing()) {
                C11T.A02(new GN7(A0H));
            }
            i = -131258822;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(427358625);
        super.onFinish();
        C6WQ c6wq = this.A06;
        if (c6wq.isShowing()) {
            c6wq.hide();
        }
        C0f9.A0A(881896084, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-508739484);
        super.onStart();
        C6WQ c6wq = this.A06;
        if (!c6wq.isShowing()) {
            C0fJ.A00(c6wq);
        }
        C0f9.A0A(875489093, A03);
    }
}
