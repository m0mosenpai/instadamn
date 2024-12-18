package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.invite.repository.InviteContactRepository;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.BbM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25805BbM extends C193578hc {
    public final Application A00;
    public final UserSession A01;
    public final InviteContactRepository A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25805BbM(Application application, UserSession userSession, InviteContactRepository inviteContactRepository) {
        super(application);
        C14360o3.A0B(application, 1);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = inviteContactRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26040BfT(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63));
        this.A04 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(new QIw());
        this.A07 = A1H2;
        this.A05 = AbstractC208910l.A02(A1H2);
        this.A03 = AbstractC25225BEi.A1H(new LinkedHashSet());
    }

    public final void A0F(String str) {
        C14360o3.A0B(str, 0);
        C05A c05a = this.A04;
        Iterable iterable = (Iterable) this.A03.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : iterable) {
            C26055Bfi c26055Bfi = (C26055Bfi) obj;
            if (AbstractC001900j.A0a(c26055Bfi.A03, AbstractC25228BEl.A1A(str), true) || AbstractC001900j.A0a(c26055Bfi.A04, AbstractC25228BEl.A1A(str), true)) {
                A1E.add(obj);
            }
        }
        c05a.Egh(new C26040BfT(C05F.A01, str, A1E, 52));
    }

    public final void A0E(EnumC33510Erj enumC33510Erj) {
        AbstractC166987dD.A1Z(new MCG(enumC33510Erj, this, (InterfaceC23621Ds) null, 49), AbstractC141776au.A00(this));
        InviteContactRepository inviteContactRepository = this.A02;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), C10Q.A01(new D5K(this, null, 1), inviteContactRepository.A02, inviteContactRepository.A01, inviteContactRepository.A03, inviteContactRepository.A00));
    }
}
