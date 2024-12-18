package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Efy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32992Efy extends Eg1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Double A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32992Efy(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, UserSession userSession, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, Double d, String str, String str2, String str3, String str4, String str5) {
        super(fragment, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, str, str2);
        this.A00 = userSession;
        this.A01 = d;
        this.A03 = str3;
        this.A04 = str4;
        this.A02 = str5;
    }

    @Override // X.Eg1, X.C32547EUx
    public final void A04(EfU efU) {
        int A03 = C0f9.A03(1572492987);
        super.A04(efU);
        UserSession userSession = this.A00;
        userSession.getClass();
        double doubleValue = this.A01.doubleValue();
        String str = this.A03;
        String str2 = this.A04;
        C31514Dsy.A03(userSession, AbstractC25228BEl.A13(str2), AbstractC25228BEl.A13(str2), "intra_app", str, this.A02, null, null, null, null, doubleValue, false, true, true);
        C0f9.A0A(1909963606, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-379191514);
        super.onFail(abstractC115105If);
        C0f9.A0A(746284879, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(2049177287, C32547EUx.A00(this, obj, -558343583));
    }
}
