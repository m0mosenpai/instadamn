package X;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes9.dex */
public final class NAC extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public NAC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1670053094);
                i = 686698706;
                break;
            case 1:
                A03 = C0f9.A03(927985635);
                C55217Oeg.A07((InterfaceC58140Pq5) this.A01, (C38321qM) this.A03, (java.util.Set) this.A02, false);
                i = -192958796;
                break;
            default:
                A03 = C0f9.A03(159185637);
                C55034OZb c55034OZb = (C55034OZb) this.A04;
                c55034OZb.A01 = AbstractC166997dE.A0a();
                C55034OZb.A00((Activity) this.A02, (Intent) this.A01, (AbstractC12990ll) this.A03, c55034OZb);
                i = -1534029311;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1797879525);
                N2Y n2y = (N2Y) obj;
                int A0N = AbstractC167017dG.A0N(n2y, 306362002);
                A00(n2y, this);
                C0f9.A0A(1297249105, A0N);
                i = -304154363;
                break;
            case 1:
                A03 = C0f9.A03(-1810371826);
                N2Y n2y2 = (N2Y) obj;
                int A0N2 = AbstractC167017dG.A0N(n2y2, 1768783347);
                A00(n2y2, this);
                C0f9.A0A(318903379, A0N2);
                i = 1141412300;
                break;
            default:
                A03 = C0f9.A03(-1440782089);
                N3C n3c = (N3C) obj;
                int A0N3 = AbstractC167017dG.A0N(n3c, 71481095);
                C55034OZb c55034OZb = (C55034OZb) this.A04;
                c55034OZb.A01 = Boolean.valueOf(n3c.A03);
                c55034OZb.A00 = n3c;
                C55034OZb.A00((Activity) this.A02, (Intent) this.A01, (AbstractC12990ll) this.A03, c55034OZb);
                C0f9.A0A(-1009836097, A0N3);
                i = -2093154451;
                break;
        }
        C0f9.A0A(i, A03);
    }

    public static void A00(N2Y n2y, NAC nac) {
        InterfaceC58218PrO F7f = n2y.F7f();
        C38321qM c38321qM = (C38321qM) nac.A03;
        java.util.Set set = (java.util.Set) nac.A02;
        InterfaceC58140Pq5 interfaceC58140Pq5 = (InterfaceC58140Pq5) nac.A01;
        C51779Muj c51779Muj = (C51779Muj) F7f;
        C55217Oeg.A05(C55217Oeg.A00(c51779Muj.A00), interfaceC58140Pq5, c38321qM, c51779Muj.A01, c51779Muj.A03, c51779Muj.A02, set);
    }
}
