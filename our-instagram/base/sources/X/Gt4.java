package X;

import android.app.Application;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class Gt4 extends C193578hc {
    public List A00;
    public final UserSession A01;
    public final C40957ICe A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC19390xP A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gt4(Application application, UserSession userSession, C40957ICe c40957ICe, C52678NSa c52678NSa, String str) {
        super(application);
        AbstractC25234BEr.A1P(application, c52678NSa, userSession);
        this.A02 = c40957ICe;
        this.A01 = userSession;
        this.A00 = C16930sl.A00;
        this.A04 = AbstractC53649Nnu.A00(AbstractC141776au.A00(this), new MZP(new PageFetcher(new PagingConfig(20, 20, 60, false), new C29637D3x(new C57259Pbh(str, c52678NSa, 14), null, 1)).A03, 20));
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A03 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
    }
}
