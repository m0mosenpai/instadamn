package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AKB {
    public C1OK A00;
    public C22895A7p A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final UserSession A06;
    public final C1GL A07;
    public final InterfaceC13380mO A08;
    public final C13400mQ A09;
    public final A6I A0A;
    public final Runnable A0B;
    public final Map A0C;
    public final boolean A0D;

    public static void A01(AKB akb) {
        UserSession userSession;
        Integer num;
        C1ON A01;
        InterfaceC58133Ppw c24207AoU;
        String str;
        akb.A04 = false;
        List list = akb.A02;
        if (list != null) {
            boolean z = akb.A0D;
            if (!z && !list.isEmpty()) {
                Object obj = akb.A02.get(0);
                Map map = akb.A0C;
                if (map.containsKey(obj)) {
                    akb.A01 = (C22895A7p) map.get(obj);
                    A00(akb);
                    return;
                }
            }
            C1OK c1ok = new C1OK();
            akb.A00 = c1ok;
            C1OL c1ol = c1ok.A00;
            if (!z) {
                if (!akb.A02.isEmpty()) {
                    str = (String) akb.A02.get(0);
                } else {
                    str = "";
                }
                userSession = akb.A06;
                num = C05F.A01;
                A01 = AbstractC23052AEi.A00(c1ol, userSession, str);
                c24207AoU = new C24209AoW(akb, str);
            } else {
                userSession = akb.A06;
                num = C05F.A01;
                A01 = AbstractC23052AEi.A01(c1ol, userSession, akb.A02);
                c24207AoU = new C24207AoU(akb);
            }
            A01.A00 = new C52228N9r(c1ol, userSession, c24207AoU, num);
            akb.A07.schedule(A01);
        }
    }

    public AKB(UserSession userSession, C1GL c1gl, A6I a6i, int i, boolean z) {
        Handler handler = new Handler();
        this.A07 = c1gl;
        this.A06 = userSession;
        this.A0D = z;
        this.A0A = a6i;
        this.A05 = handler;
        this.A0C = AbstractC166987dD.A1G();
        Wi0 wi0 = new Wi0(this, 5);
        this.A08 = wi0;
        this.A09 = new C13400mQ(handler, wi0, i);
        this.A0B = new RunnableC24511AtU(this);
    }

    public static void A00(AKB akb) {
        if (akb.A03) {
            C22895A7p c22895A7p = akb.A01;
            if (c22895A7p == null) {
                c22895A7p = new C22895A7p(false, null);
                akb.A01 = c22895A7p;
            }
            boolean z = c22895A7p.A01;
            A6I a6i = akb.A0A;
            if (z) {
                C8YE.A03(a6i.A00, c22895A7p.A00);
            } else {
                C8YE c8ye = a6i.A00;
                c8ye.A0A.E4v();
                c8ye.A03 = null;
            }
        }
    }
}
