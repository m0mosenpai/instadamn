package X;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EUW extends C1P1 {
    public FragmentActivity A00;
    public InterfaceC11380iw A01;
    public C07270a1 A02;
    public C3O0 A03;
    public boolean A04;
    public final android.net.Uri A05;
    public final String A06;
    public final C6WQ A07;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1749067234);
        EfQ efQ = (EfQ) obj;
        int A032 = C0f9.A03(1315927710);
        User user = ((EfU) efQ).A00;
        AbstractC31177DnL.A1O(user);
        C1Q9 c1q9 = C1Q9.A0u;
        C07270a1 c07270a1 = this.A02;
        c1q9.A02(c07270a1).A04().A0C("instagram_id", user.getId());
        C35161Ff3 c35161Ff3 = new C35161Ff3();
        c35161Ff3.A02();
        c35161Ff3.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A0B), AbstractC167007dF.A0h("EMAIL_LINK_ONETAP"));
        FD1.A00(c07270a1, c35161Ff3, "", user.getId(), null, null, null);
        FragmentActivity fragmentActivity = this.A00;
        String str = efQ.A07;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession A02 = AbstractC31525Dt9.A02(fragmentActivity, interfaceC11380iw, c07270a1, user, str, false);
        if (efQ.A00 != null && efQ.A01 != null) {
            new Handler().post(new RunnableC36938GPh(A02, efQ, this));
        } else {
            AbstractC31525Dt9.A05(fragmentActivity, this.A05, interfaceC11380iw, A02);
        }
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
        A0P.E77("has_one_clicked_logged_in", true);
        A0P.apply();
        C0f9.A0A(1701975600, A032);
        C0f9.A0A(672191894, A03);
    }

    public EUW(android.net.Uri uri, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, C3O0 c3o0, String str, boolean z) {
        C6WQ A0i = AbstractC31174DnI.A0i(fragmentActivity);
        this.A07 = A0i;
        A0i.A00(fragmentActivity.getString(2131965724));
        this.A05 = uri;
        this.A06 = str;
        this.A02 = c07270a1;
        this.A01 = interfaceC11380iw;
        this.A00 = fragmentActivity;
        this.A04 = z;
        this.A03 = c3o0;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        android.net.Uri uri;
        int A03 = C0f9.A03(806586516);
        C1Q9 c1q9 = C1Q9.A1D;
        C07270a1 c07270a1 = this.A02;
        C19280xC A05 = c1q9.A02(c07270a1).A05(null, EnumC31713DwI.A0r);
        A05.A0C("event_type", "one_click");
        A05.A0C("uid_encoded", this.A06);
        AbstractC31173DnH.A1S(A05, c07270a1);
        Object A00 = abstractC115105If.A00();
        if (A00 != null) {
            C40781ul c40781ul = (C40781ul) A00;
            String errorMessage = c40781ul.getErrorMessage();
            if (AbstractC31525Dt9.A09(abstractC115105If)) {
                C32196ECr c32196ECr = (C32196ECr) A00;
                C34643FOa c34643FOa = c32196ECr.A01;
                new Handler().post(new RunnableC36939GPi(c32196ECr.A00, c34643FOa, this));
                i = -1990073696;
                C0f9.A0A(i, A03);
            }
            if ("invalid_link".equals(c40781ul.mErrorType)) {
                AbstractC31173DnH.A1S(C1Q9.A0t.A02(c07270a1).A04(), c07270a1);
                C193328hC A0H = AbstractC31171DnF.A0H(this.A00);
                A0H.A0A(2131961994);
                A0H.A0r(errorMessage);
                DialogInterfaceOnClickListenerC35454FkB.A02(A0H, this, 20, 2131973289);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(this, 19), A0H);
            } else if (!TextUtils.isEmpty(errorMessage) && !errorMessage.equals("checkpoint_required")) {
                C9GR.A0G(errorMessage);
            }
            if (this.A04 && AbstractC31174DnI.A06(c07270a1) > 0) {
                C14H A002 = C14H.A00();
                FragmentActivity fragmentActivity = this.A00;
                Intent A01 = A002.A01(fragmentActivity);
                uri = this.A05;
                if (uri != null || uri.getBooleanQueryParameter("redirect_on_fail", true)) {
                    A01.setData(uri);
                }
                C12260kU.A0C(fragmentActivity, A01);
            }
            i = -943820181;
            C0f9.A0A(i, A03);
        }
        AbstractC31171DnF.A0z(2131976159);
        if (this.A04) {
            C14H A0022 = C14H.A00();
            FragmentActivity fragmentActivity2 = this.A00;
            Intent A012 = A0022.A01(fragmentActivity2);
            uri = this.A05;
            if (uri != null) {
            }
            A012.setData(uri);
            C12260kU.A0C(fragmentActivity2, A012);
        }
        i = -943820181;
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-10864417);
        super.onFinish();
        C6WQ c6wq = this.A07;
        if (c6wq.isShowing()) {
            c6wq.hide();
        }
        C0f9.A0A(-1898441754, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1220440710);
        super.onStart();
        C6WQ c6wq = this.A07;
        if (!c6wq.isShowing()) {
            C0fJ.A00(c6wq);
        }
        C0f9.A0A(-1426610705, A03);
    }
}
