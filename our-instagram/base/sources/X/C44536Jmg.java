package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jmg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44536Jmg extends AbstractC52922bZ {
    public final EnumC31515Dsz A00;
    public final C12N A01;
    public final C25671My A02;
    public final UserSession A03;
    public final FRP A04;
    public final FanClubPromoAndWelcomeVideoApi A05;
    public final PendingMediaStore A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C0UO A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C44536Jmg(EnumC31515Dsz enumC31515Dsz, C12N c12n, C25671My c25671My, UserSession userSession, FRP frp, FanClubPromoAndWelcomeVideoApi fanClubPromoAndWelcomeVideoApi, PendingMediaStore pendingMediaStore, boolean z, boolean z2) {
        AbstractC167007dF.A1G(userSession, 1, pendingMediaStore);
        AbstractC25233BEq.A0y(7, c25671My, frp, c12n);
        this.A03 = userSession;
        this.A00 = enumC31515Dsz;
        this.A0D = z;
        this.A0E = z2;
        this.A06 = pendingMediaStore;
        this.A05 = fanClubPromoAndWelcomeVideoApi;
        this.A02 = c25671My;
        this.A04 = frp;
        this.A01 = c12n;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A07 = A12;
        this.A08 = AbstractC07080Za.A03(A12);
        C008002u A1H = AbstractC25225BEi.A1H(0);
        this.A0A = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C26076Bg5());
        this.A0B = A1H2;
        C43817JZf c43817JZf = new C43817JZf(AnonymousClass111.A02(new C50541MSu(11, null), C0ST.A01(new C43818JZg(29, new AnonymousClass625(c25671My).A00(C2Q5.class), this))), 16);
        AnonymousClass059 A01 = AbstractC208910l.A01(new JWd((C38321qM) null, (String) null, (DefaultConstructorMarker) null, 7, 13, false), AbstractC141776au.A00(this), c43817JZf, C10I.A00);
        this.A0C = A01;
        this.A09 = C10Q.A00(new MCZ(this, 4), A1H2, A01, A1H);
        AbstractC23641Du.A05(((C12M) this.A01).A04, new MBp(this, null, 19), AbstractC141776au.A00(this));
    }

    public static final C38321qM A00(C26076Bg5 c26076Bg5, JWd jWd) {
        long j;
        if (jWd.A02) {
            return null;
        }
        long j2 = c26076Bg5.A00;
        C38321qM c38321qM = (C38321qM) c26076Bg5.A01;
        long j3 = 0;
        if (c38321qM != null) {
            j = c38321qM.A1B();
        } else {
            j = 0;
        }
        long max = Math.max(j2, j);
        C38321qM c38321qM2 = (C38321qM) jWd.A00;
        if (c38321qM2 != null) {
            j3 = c38321qM2.A1B();
        }
        if (max <= j3) {
            return c38321qM2;
        }
        return c38321qM;
    }
}
