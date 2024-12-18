package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Efe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32973Efe extends C32547EUx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C84613qA A01;
    public final /* synthetic */ C07270a1 A02;
    public final /* synthetic */ EV5 A03;
    public final /* synthetic */ C34561FKv A04;
    public final /* synthetic */ List A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32973Efe(android.net.Uri uri, FragmentActivity fragmentActivity, C84613qA c84613qA, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, G9Q g9q, EV5 ev5, C34561FKv c34561FKv, EnumC31713DwI enumC31713DwI, Integer num, String str, List list, int i) {
        super(fragmentActivity, uri, interfaceC11380iw, c07270a1, g9q, enumC31713DwI, num, str);
        this.A02 = c07270a1;
        this.A04 = c34561FKv;
        this.A03 = ev5;
        this.A00 = i;
        this.A05 = list;
        this.A01 = c84613qA;
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        boolean A1a = AbstractC167017dG.A1a(userSession, user);
        if (this.A04.A02) {
            C83743oJ A01 = C83743oJ.A01(userSession);
            String id = user.getId();
            EV5 ev5 = this.A03;
            U7K u7k = U7H.A04;
            InterfaceC11380iw interfaceC11380iw = ev5.A05;
            C14360o3.A0A(interfaceC11380iw);
            A01.A09(ev5.A01, interfaceC11380iw, userSession, C05F.A05, id, A1a);
        }
        super.A03(userSession, user);
    }

    @Override // X.C32547EUx
    public final void A04(EfU efU) {
        int A0N = AbstractC167017dG.A0N(efU, 740076642);
        C83743oJ.A01(this.A02).A0G(this.A04.A00.getId());
        super.A04(efU);
        C0f9.A0A(-1824396854, A0N);
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1039330655);
        EV5 ev5 = this.A03;
        C19280xC A00 = C19280xC.A00(ev5, "deferred_recovered_account_skipped");
        A00.A0C("account_id", this.A04.A00.getId());
        AbstractC31173DnH.A1S(A00, this.A02);
        int i = this.A00 + 1;
        if (i < this.A05.size()) {
            EV5.A00(this.A01, ev5, i);
        } else {
            EV5.A01(ev5);
        }
        C0f9.A0A(-1566302930, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(98845441, C32547EUx.A00(this, obj, 24673539));
    }
}
