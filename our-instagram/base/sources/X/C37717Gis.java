package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gis, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37717Gis implements InterfaceC62242sP {
    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ C5I4 AMc(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        return new C5IE(c206239Bg);
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ int Aa7(Object obj) {
        C120985dq c120985dq;
        C42159Im7 A03;
        List list;
        C120985dq c120985dq2;
        C206239Bg c206239Bg = (C206239Bg) obj;
        boolean z = true;
        if (c206239Bg == null || (c120985dq2 = (C120985dq) c206239Bg.A03) == null || !c120985dq2.A0G()) {
            z = false;
        }
        if (z) {
            if (c206239Bg == null || (c120985dq = (C120985dq) c206239Bg.A03) == null || (A03 = c120985dq.A03()) == null || (list = (List) A03.A01.A00) == null) {
                return 0;
            }
            return list.size();
        }
        if (c206239Bg == null) {
            return 0;
        }
        C120985dq c120985dq3 = (C120985dq) c206239Bg.A03;
        C14360o3.A0B(c120985dq3, 0);
        if (!AbstractC37647Ghg.A00(c120985dq3)) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ai1(Object obj) {
        C38321qM A0G = AbstractC37301Gc2.A0G((C120985dq) obj);
        if (A0G != null) {
            return A0G.A2N();
        }
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BK4(Object obj) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        return c120985dq.getId();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ List BV9(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        if (c120985dq.A0G()) {
            C9C2 c9c2 = c120985dq.A03().A01;
            C16930sl c16930sl = C16930sl.A00;
            String str = c9c2.A02;
            IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = (IntentAwareAdsInfoIntf) c9c2.A01;
            C14360o3.A0B(str, 0);
            AbstractC167017dG.A1P(intentAwareAdsInfoIntf, c16930sl);
            C9C2 c9c22 = new C9C2(intentAwareAdsInfoIntf, str, c16930sl);
            List A01 = C42159Im7.A01(c120985dq);
            ArrayList A0q = AbstractC167017dG.A0q(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                A0q.add(new C206239Bg(C128085qc.A01(c9c22, (C40971v4) it.next()), (C671831j) c206239Bg.A04));
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX7(Object obj) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 != EnumC129395t1.A0B) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX8(Object obj) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        return AbstractC37647Ghg.A01(c120985dq.A01);
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CYw(Object obj) {
        C120985dq c120985dq;
        C206239Bg c206239Bg = (C206239Bg) obj;
        if (c206239Bg != null && (c120985dq = (C120985dq) c206239Bg.A03) != null && c120985dq.A0G()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CZK(Object obj) {
        EnumC129395t1 enumC129395t1;
        C120985dq c120985dq;
        C206239Bg c206239Bg = (C206239Bg) obj;
        if (c206239Bg != null && (c120985dq = (C120985dq) c206239Bg.A03) != null) {
            enumC129395t1 = c120985dq.A01;
        } else {
            enumC129395t1 = null;
        }
        return AbstractC167007dF.A1X(enumC129395t1, EnumC129395t1.A0B);
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdX(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        if (c206239Bg != null) {
            return AbstractC37647Ghg.A00(AbstractC37301Gc2.A0A(c206239Bg.A03));
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ahy(Object obj) {
        C120985dq A0A = AbstractC37301Gc2.A0A(obj);
        if (A0A.A01 == EnumC129395t1.A09) {
            return A0A.A01().A00;
        }
        C38321qM c38321qM = A0A.A02;
        if (c38321qM == null) {
            return null;
        }
        return c38321qM.A2M();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BF8(Object obj) {
        C120985dq A0G = AbstractC37302Gc3.A0G(obj);
        if (!A0G.A0H() && A0G.A01 != EnumC129395t1.A05) {
            return AbstractC25226BEj.A1E(A0G);
        }
        return A0G.getId();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BFA(Object obj) {
        return AbstractC37301Gc2.A0A(obj).getId();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX6(Object obj) {
        return AbstractC37301Gc2.A0A(obj).A0G();
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ boolean ACQ(Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ boolean ACU(Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ int AZN(Object obj) {
        return -1;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer BVE(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ EnumC26291Pk BYX(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdY(Object obj) {
        return false;
    }
}
