package X;

import android.app.Activity;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jmf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44535Jmf extends AbstractC52922bZ {
    public C45077Jx6 A00;
    public final Activity A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final C47541Kz9 A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C0UO A09;

    public C44535Jmf(Activity activity, AbstractC018607g abstractC018607g, UserSession userSession, C47541Kz9 c47541Kz9) {
        AbstractC25233BEq.A0w(2, userSession, activity, abstractC018607g);
        this.A04 = c47541Kz9;
        this.A03 = userSession;
        this.A01 = activity;
        this.A02 = abstractC018607g;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
        this.A06 = AbstractC53649Nnu.A00(AbstractC141776au.A00(this), new PageFetcher(new PagingConfig(5, 5, 20, false), new C29637D3x(new C50151MDe(this, 21), null, 1)).A03);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A08 = A1A;
        this.A09 = A1A;
    }

    public static final void A00(C44535Jmf c44535Jmf, int i) {
        AbstractC166987dD.A1Z(new C57155PYz(c44535Jmf, null, i, 9), AbstractC141776au.A00(c44535Jmf));
        AnonymousClass229.A01(c44535Jmf.A03).A1R(EnumC50631MWs.A02, "AC_BROWSER_MORE_THREE_DOTS_MENU_REMOVE_BUTTON");
    }
}
