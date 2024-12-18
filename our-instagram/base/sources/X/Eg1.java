package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* loaded from: classes6.dex */
public class Eg1 extends C32547EUx {
    public C18920wW A00;
    public C6WQ A01;
    public final InterfaceC11380iw A02;
    public final C07270a1 A03;
    public final String A04;
    public final boolean A05;

    public Eg1(android.net.Uri uri, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, String str, String str2) {
        super(fragmentActivity, uri, interfaceC11380iw, c07270a1, interfaceC37227Gac, null, enumC31713DwI, C05F.A01, str, null, null, null);
        this.A03 = c07270a1;
        this.A04 = str2;
        C6WQ c6wq = new C6WQ(fragmentActivity, true);
        this.A01 = c6wq;
        c6wq.A00(AnonymousClass001.A0R("logging into ", str));
        this.A02 = interfaceC11380iw;
        this.A05 = true;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, c07270a1);
    }

    @Override // X.C32547EUx
    public void A04(EfU efU) {
        int A03 = C0f9.A03(974862511);
        C83743oJ.A01(this.A03).A0G(this.A04);
        super.A04(efU);
        C0f9.A0A(1779656767, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        String str;
        String str2;
        C115115Ig c115115Ig;
        int A03 = C0f9.A03(-670556778);
        if (this.A05) {
            this.A01.dismiss();
        }
        if (!(abstractC115105If instanceof C115115Ig) || (c115115Ig = (C115115Ig) abstractC115105If) == null || (str = ((C40781ul) c115115Ig.A00).mErrorBody) == null) {
            str = "other";
        }
        if (!AbstractC31525Dt9.A09(abstractC115105If)) {
            super.onFail(abstractC115105If);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "sso_failed");
            AbstractC31179DnN.A15(A0f);
            AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
            AbstractC31171DnF.A1E(A0f, "unknown");
            A0f.AAP("login_userid", this.A04);
            AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
            EnumC31713DwI enumC31713DwI = this.A08;
            if (enumC31713DwI == null) {
                str2 = "";
            } else {
                str2 = enumC31713DwI.A01;
            }
            AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
            AbstractC31175DnJ.A14(A0f, this.A02);
            A0f.A7v("fallback_shown", false);
            A0f.AAP("error", str);
            AbstractC35274Fh9.A0B(A0f, this.A03);
        } else {
            super.onFail(abstractC115105If);
        }
        C0f9.A0A(2066800333, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1911861531);
        super.onStart();
        if (this.A05) {
            C0fJ.A00(this.A01);
        }
        C0f9.A0A(1370635869, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(545729823, C32547EUx.A00(this, obj, -1013902471));
    }

    public Eg1(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, String str, String str2) {
        super((Activity) AbstractC13320mI.A00(fragment.getContext(), Activity.class), AbstractC31525Dt9.A01(fragment), interfaceC11380iw, c07270a1, interfaceC37227Gac, null, enumC31713DwI, C05F.A01, str, null, null, null);
        this.A03 = c07270a1;
        this.A04 = str2;
        C6WQ A0T = AbstractC31180DnO.A0T(fragment);
        this.A01 = A0T;
        A0T.A00(fragment.getString(2131965724));
        this.A02 = interfaceC11380iw;
        this.A05 = true;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, c07270a1);
    }
}
