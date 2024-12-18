package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AKN {
    public int A00;
    public int A01;
    public int A02;
    public BD9 A03;
    public boolean A04;
    public int A05;
    public final C203758zj A06;
    public final BEQ A07;
    public final InterfaceC179497xz A08;
    public final C23432Aa5 A09;
    public final C23385AYj A0A;
    public final InterfaceC178817wt A0B;
    public final AVY A0C;
    public final AWH A0D;
    public final InterfaceC179867yc A0E;
    public final InterfaceC175597rZ A0F;
    public final InterfaceC178737wl A0G;
    public final AZZ A0H;
    public final String A0I;
    public final ViewGroup A0J;
    public final BBT A0K;
    public final C1814883b A0L;
    public final AnonymousClass818 A0M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.7ws, java.lang.Object, X.7vf] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.8zj] */
    public AKN(Map map) {
        C23385AYj c23385AYj;
        ?? obj = new Object();
        obj.A00 = null;
        obj.A03 = false;
        obj.A02 = false;
        obj.A01 = false;
        this.A06 = obj;
        C1814883b c1814883b = new C1814883b();
        this.A0L = c1814883b;
        C224679vs c224679vs = A4I.A08;
        C14360o3.A0B(c224679vs, 0);
        String str = (String) map.get(c224679vs);
        this.A0I = str;
        C224679vs c224679vs2 = A4I.A03;
        C14360o3.A0B(c224679vs2, 0);
        BBT bbt = (BBT) map.get(c224679vs2);
        this.A0K = bbt;
        C224679vs c224679vs3 = A4I.A09;
        C14360o3.A0B(c224679vs3, 0);
        AnonymousClass818 anonymousClass818 = (AnonymousClass818) map.get(c224679vs3);
        this.A0M = anonymousClass818;
        C224679vs c224679vs4 = A4I.A0B;
        C14360o3.A0B(c224679vs4, 0);
        if (map.containsKey(c224679vs4)) {
            this.A0J = (ViewGroup) map.get(c224679vs4);
        } else {
            this.A0J = null;
        }
        C224679vs c224679vs5 = A4I.A00;
        C14360o3.A0B(c224679vs5, 0);
        if (map.containsKey(c224679vs5)) {
            this.A05 = AbstractC166987dD.A0H(map.get(c224679vs5));
        }
        C224679vs c224679vs6 = A4I.A0A;
        C14360o3.A0B(c224679vs6, 0);
        if (map.containsKey(c224679vs6)) {
            this.A00 = AbstractC166987dD.A0H(map.get(c224679vs6));
        }
        C224679vs c224679vs7 = BE2.A01;
        C14360o3.A0B(c224679vs7, 0);
        if (map.containsKey(c224679vs7)) {
            BE2 be2 = (BE2) map.get(c224679vs7);
            C224679vs c224679vs8 = A4I.A02;
            C14360o3.A0B(c224679vs8, 0);
            c23385AYj = be2.AL8((Context) map.get(c224679vs8), str);
        } else {
            C224679vs c224679vs9 = A4I.A02;
            C14360o3.A0B(c224679vs9, 0);
            Context context = (Context) map.get(c224679vs9);
            C224679vs c224679vs10 = A4I.A05;
            C14360o3.A0B(c224679vs10, 0);
            C150486px c150486px = (C150486px) map.get(c224679vs10);
            C224679vs c224679vs11 = A4I.A01;
            C14360o3.A0B(c224679vs11, 0);
            List list = (List) map.get(c224679vs11);
            C14360o3.A0B(context, 0);
            AbstractC167027dH.A0a(1, str, anonymousClass818, c150486px, bbt);
            C14360o3.A0B(list, 6);
            C178017va c178017va = new C178017va(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BCP) it.next()).Ehs(c178017va);
            }
            C23385AYj A00 = C178267w0.A00(context, c178017va);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A00.A02((InterfaceC178287w2) ((BCP) it2.next()).ALQ(A00));
            }
            A00.A01(new C180027ys(A00), InterfaceC179927yi.A00);
            A00.A01(new C179557y5(A00), InterfaceC179567y6.A00);
            C180147z4 A02 = AbstractC178227vw.A02(A00, InterfaceC178737wl.A00, true);
            A02.EfR(30);
            C178087vh A002 = C175607ra.A00(A00, A02, InterfaceC178787wq.A00);
            A00.A01(new C179987yo(A00), InterfaceC179997yp.A00);
            A00.A01(new C180007yq(A00), InterfaceC180017yr.A00);
            A00.A01(new C180037yt(A00), InterfaceC179947yk.A00);
            C178087vh c178087vh = BEL.A00;
            ?? obj2 = new Object();
            obj2.A00 = A00;
            A00.A01(obj2, c178087vh);
            A00.A01(new C211499Wy(A00), BEQ.A01);
            AbstractC224569vh.A00(c150486px, A00, bbt, c1814883b, anonymousClass818);
            A00.A01(new C9X1(A00), InterfaceC180067yw.A04);
            AbstractC178807ws.A03(A00, A002, anonymousClass818, 1);
            c23385AYj = A00;
        }
        this.A0A = c23385AYj;
        C23432Aa5 c23432Aa5 = new C23432Aa5(c23385AYj);
        this.A09 = c23432Aa5;
        this.A0G = (InterfaceC178737wl) this.A0A.Aq0(InterfaceC178737wl.A00);
        this.A0E = (InterfaceC179867yc) this.A0A.Aq0(InterfaceC179867yc.A00);
        this.A0B = (InterfaceC178817wt) this.A0A.Aq0(InterfaceC178817wt.A01);
        this.A07 = (BEQ) this.A0A.Aq0(BEQ.A01);
        this.A08 = (InterfaceC179497xz) this.A0A.Aq0(InterfaceC179497xz.A01);
        this.A0F = ((InterfaceC178787wq) this.A0A.Aq0(InterfaceC178787wq.A00)).Bma();
        C224679vs c224679vs12 = A4I.A06;
        C14360o3.A0B(c224679vs12, 0);
        if (map.containsKey(c224679vs12)) {
            obj.A02 = AbstractC166987dD.A1a(map.get(c224679vs12));
        }
        C224679vs c224679vs13 = A4I.A04;
        C14360o3.A0B(c224679vs13, 0);
        if (map.containsKey(c224679vs13)) {
            obj.A01 = AbstractC166987dD.A1a(map.get(c224679vs13));
        }
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            this.A04 = false;
            View Bfy = this.A0E.Bfy();
            C14360o3.A07(Bfy);
            viewGroup.addView(Bfy);
        } else {
            C224679vs c224679vs14 = A4I.A07;
            C14360o3.A0B(c224679vs14, 0);
            if (map.containsKey(c224679vs14)) {
                this.A04 = true;
                C51737MtK c51737MtK = (C51737MtK) map.get(c224679vs14);
                this.A02 = c51737MtK.A01;
                this.A01 = c51737MtK.A00;
                C179427xs c179427xs = new C179427xs(new C178747wm(), new C179387xo(), new C179417xr(), true);
                c179427xs.A03(this.A02, this.A01, 0);
                this.A0B.BQq().A8h(c179427xs, 0);
            }
        }
        c23432Aa5.A03(this.A05);
        if (this.A00 == 0) {
            C23432Aa5.A00(c23432Aa5).enable(false);
        }
        this.A0H = new AZZ(this, 1);
        this.A0C = new AVY(this);
        this.A0D = new AWH(this);
    }

    public static void A00(AKN akn) {
        akn.A08.DfO(new C23495AbB(true));
    }

    public static final void A01(AKN akn) {
        C179457xv c179457xv;
        AnonymousClass810 anonymousClass810;
        AZ9 az9 = new AZ9();
        az9.A05 = new AZK(akn, 0);
        int i = akn.A02;
        int i2 = akn.A01;
        az9.A01 = i;
        az9.A00 = i2;
        if (az9.A02 != null && (anonymousClass810 = (c179457xv = az9.A03).A04) != null) {
            anonymousClass810.A01();
            c179457xv.A04 = null;
        }
        AZ9.A00(az9);
        InterfaceC178817wt interfaceC178817wt = akn.A0B;
        interfaceC178817wt.BQq().EWA(new C1809380v(new C178747wm(), az9, false), 0);
        C179407xq A01 = az9.A01(akn.A02, akn.A01, 0);
        C14360o3.A07(A01);
        akn.A0F.Emi(new C23402AZb(akn));
        interfaceC178817wt.FBm(0, A01.A01, A01.A00, AbstractC167007dF.A1P(akn.A05, 1), akn.A02, akn.A01);
    }

    public final void A02() {
        C23432Aa5 c23432Aa5 = this.A09;
        c23432Aa5.EKd();
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                c23432Aa5.A04(this.A0C);
                return;
            }
            return;
        }
        this.A0E.A9y(this.A0H);
    }
}
