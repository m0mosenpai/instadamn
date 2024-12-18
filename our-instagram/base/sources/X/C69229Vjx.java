package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Arrays;

/* renamed from: X.Vjx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69229Vjx {
    public final C70724Wfp A00;
    public final C25671My A01;
    public final C67972V4m A02;
    public final C3A9 A03;

    public C69229Vjx(Fragment fragment, UserSession userSession, ReboundViewPager reboundViewPager, C67972V4m c67972V4m, UBD ubd) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        this.A01 = A00;
        C70724Wfp c70724Wfp = new C70724Wfp(1, c67972V4m, this);
        this.A00 = c70724Wfp;
        this.A02 = c67972V4m;
        this.A03 = new C3A9(new C65927TwY(ubd, 2), new WkD(fragment, reboundViewPager), Arrays.asList(new V85(reboundViewPager, c67972V4m, ubd)));
        A00.A01(c70724Wfp, C70712Wfb.class);
    }
}
