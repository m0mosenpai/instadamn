package X;

import android.content.Context;
import androidx.compose.ui.window.PopupLayout;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class MEC extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEC(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = str;
        this.A01 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Long l;
        switch (this.A00) {
            case 0:
                ((PopupLayout) this.A03).A0B((AnonymousClass583) this.A01, (CUY) this.A04, this.A05, (InterfaceC16820sZ) this.A02);
                return C0eB.A00;
            case 1:
                LB7.A01((Context) this.A01, (C6FQ) this.A02, (InterfaceC103384lE) this.A03, (UserSession) this.A04, this.A05);
                return C0eB.A00;
            case 2:
                C166007bS c166007bS = (C166007bS) this.A03;
                String str = this.A05;
                List list = (List) this.A04;
                AbstractC167017dG.A1N(str, list);
                C28238Cci c28238Cci = C28238Cci.A00;
                UserSession userSession = c166007bS.A02;
                AbstractC43594JPz.A0O(userSession).markerPoint(309476254, "restrict_account_screen_restrict_click");
                c28238Cci.A01(userSession);
                C166007bS.A02(c166007bS, "restrict_accounts_action", str, list);
                ((C05A) this.A01).Egh(new C9BX(AbstractC001800i.A0a((Iterable) this.A02)));
                return C0eB.A00;
            case 3:
                AbstractC161267Kl abstractC161267Kl = (AbstractC161267Kl) this.A04;
                Object obj = this.A03;
                String str2 = this.A05;
                C7Ko c7Ko = abstractC161267Kl.A02;
                c7Ko.A00(str2, new C50169MDw(31, abstractC161267Kl, obj), 200L);
                c7Ko.A00(str2, new C50169MDw(30, this.A02, this.A01), 500L);
                return C0eB.A00;
            case 4:
                PendingMediaStore pendingMediaStore = (PendingMediaStore) this.A03;
                C31211eQ c31211eQ = (C31211eQ) this.A04;
                C11T.A02(new M70((InterfaceC37261GbE) this.A01, (C1OW) this.A02, c31211eQ, pendingMediaStore, (PendingMediaStoreSerializer) c31211eQ.A05.getValue(), this.A05));
                return C0eB.A00;
            case 5:
                JI6 ji6 = ((HZ7) this.A04).A03;
                C41753IeT c41753IeT = new C41753IeT(ji6.C02());
                C41617Ib7 c41617Ib7 = new C41617Ib7(ji6.C02().A04);
                c41617Ib7.A04.put(((C39350HZp) ((IN1) this.A03)).A02, EnumC39591He1.A04);
                c41753IeT.A04 = new C41723Idu(c41617Ib7);
                ji6.Eej(new C41726Idx(c41753IeT));
                JLH BcS = ((InterfaceC43546JLg) this.A01).BcS();
                String str3 = null;
                if (BcS != null) {
                    l = BcS.BF7();
                } else {
                    l = null;
                }
                String.valueOf(l);
                C14360o3.A0A(ji6.C02().A08);
                User user = JQ0.A0a(ji6).A0B;
                if (user != null) {
                    str3 = AbstractC76433bn.A00(user);
                }
                C14360o3.A0A(str3);
                return C0eB.A00;
            case 6:
                AnonymousClass389.A02((AnonymousClass389) this.A04);
                C38321qM c38321qM = (C38321qM) this.A01;
                String id = c38321qM.getId();
                if (id != null) {
                    if (c38321qM.A5M()) {
                        C14360o3.A0A(c38321qM.A1h(id));
                    }
                    ((InterfaceC31040Dke) this.A03).Dfp();
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            default:
                ((CWZ) this.A02).A03(new ME8(this.A01, this.A04, this.A03, this.A05, 22));
                return C0eB.A00;
        }
    }
}
