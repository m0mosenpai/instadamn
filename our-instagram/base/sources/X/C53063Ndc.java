package X;

import android.app.Application;
import androidx.paging.PageEvent$StaticList;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ndc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53063Ndc extends Gt5 {
    public ArrayList A00;
    public InterfaceC19390xP A01;
    public final UserSession A02;
    public final C27831COu A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53063Ndc(Application application, UserSession userSession, C27831COu c27831COu, C52678NSa c52678NSa, EnumC39549HdL enumC39549HdL, HYD hyd) {
        super(application, null, userSession, c52678NSa, enumC39549HdL, hyd, null, null);
        AbstractC25233BEq.A0w(1, application, hyd, c52678NSa);
        this.A03 = c27831COu;
        this.A02 = userSession;
        this.A01 = A00();
        this.A00 = AbstractC166987dD.A1E();
    }

    private final InterfaceC19390xP A00() {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        return AbstractC53649Nnu.A00(AbstractC141776au.A00(this), new MWG(23, this, new PageFetcher(new PagingConfig(5, 5, 15, false), new C29637D3x(new D87(userSession, 17), null, 1)).A03));
    }

    @Override // X.Gt5
    public final ArrayList A0F() {
        return this.A00;
    }

    @Override // X.Gt5
    public final InterfaceC19390xP A0G() {
        C16440rp c16440rp = new C16440rp(new PageEvent$StaticList(null, null, C16930sl.A00));
        return C10E.A00(new C54991OTz(C54991OTz.A04, C54991OTz.A06, C57277Pbz.A00, c16440rp));
    }

    @Override // X.Gt5
    public final InterfaceC19390xP A0H() {
        return this.A01;
    }

    @Override // X.Gt5
    public final void A0I() {
        this.A01 = A00();
    }
}
