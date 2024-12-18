package X;

import android.app.Application;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BbP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25808BbP extends C193578hc {
    public C28224CcU A00;
    public C28224CcU A01;
    public CQN A02;
    public final UserSession A03;
    public final C28374Cfc A04;
    public final CQM A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C0UO A0B;

    public static final void A01(C25808BbP c25808BbP) {
        C38687GzS c38687GzS;
        C28224CcU c28224CcU;
        C38687GzS c38687GzS2;
        Object value;
        C26043BfW c26043BfW;
        Integer num;
        C28224CcU c28224CcU2 = c25808BbP.A00;
        if (c28224CcU2 != null && (c38687GzS = c28224CcU2.A01) != null && (c28224CcU = c25808BbP.A01) != null && (c38687GzS2 = c28224CcU.A01) != null) {
            C05A c05a = c25808BbP.A0A;
            do {
                value = c05a.getValue();
                c26043BfW = (C26043BfW) value;
                num = C05F.A00;
            } while (!c05a.AIi(value, C26043BfW.A00(c26043BfW.A01, c26043BfW.A00, num, c26043BfW.A04, c26043BfW.A02, c26043BfW.A05, c26043BfW.A06)));
            c25808BbP.A02 = new CQN(AbstractC23641Du.A03(num, AnonymousClass191.A00, new D4w(c38687GzS, c38687GzS2, c25808BbP, null, 1, false), AbstractC141776au.A00(c25808BbP)), false);
            return;
        }
        A00(c25808BbP);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25808BbP(Application application, Rect rect, UserSession userSession, C28374Cfc c28374Cfc, CQM cqm) {
        super(application);
        C8CT c8ct = new C8CT(userSession, application);
        C8CW c8cw = new C8CW(userSession);
        AbstractC167017dG.A1P(application, userSession);
        C14360o3.A0B(c28374Cfc, 3);
        this.A03 = userSession;
        this.A04 = c28374Cfc;
        this.A05 = cqm;
        this.A07 = DH0.A00(c8cw, new C8CY(c8cw.A00), 29);
        this.A06 = DH0.A00(c8ct, new C8CY(c8ct.A00), 30);
        Integer num = C05F.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C26043BfW(null, null, num, num, C05F.A01, C16930sl.A00, false));
        this.A0A = A1H;
        this.A0B = A1H;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A08 = c24721Ip;
        this.A09 = AbstractC07080Za.A03(c24721Ip);
        AbstractC23641Du.A03(num, C12L.A00.AOT(308548615, 3), new PZV(rect, this, null, 15), AbstractC141776au.A00(this));
        C141796aw A00 = AbstractC141776au.A00(this);
        PYv pYv = new PYv(this, null, 36);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A03(num, anonymousClass191, pYv, A00);
        AbstractC23641Du.A03(num, anonymousClass191, new PYv(this, null, 37), AbstractC141776au.A00(this));
    }

    public static final void A00(C25808BbP c25808BbP) {
        Object value;
        C26043BfW c26043BfW;
        Integer num;
        C28224CcU c28224CcU;
        List list;
        C05A c05a = c25808BbP.A0A;
        do {
            value = c05a.getValue();
            c26043BfW = (C26043BfW) value;
            num = C05F.A0C;
            c28224CcU = c26043BfW.A01;
            list = c26043BfW.A05;
        } while (!c05a.AIi(value, C26043BfW.A00(c28224CcU, c26043BfW.A00, num, c26043BfW.A04, c26043BfW.A02, list, c26043BfW.A06)));
    }
}
