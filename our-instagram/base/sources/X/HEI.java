package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEI extends C7E1 implements InterfaceC152956uP {
    public EnumC33341Eoa A00;
    public C41030IEz A01;
    public C32432EQk A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C155946zO A07;
    public final HDJ A08;
    public final C32429EQh A09;
    public final C32429EQh A0A;
    public final C168737g7 A0B;
    public final C32440EQs A0C;
    public final C31566Dts A0D;
    public final String A0E;
    public final Map A0F;
    public final java.util.Set A0G = AbstractC166987dD.A1H();
    public final C155376yQ A0H;
    public final JG6 A0I;
    public final HFL A0J;
    public final C153006uU A0K;
    public final InterfaceC62602sz A0L;
    public final C65842yM A0M;

    public HEI(Context context, UserSession userSession, C155376yQ c155376yQ, InterfaceC60442pS interfaceC60442pS, JH9 jh9, HDJ hdj, EnumC33341Eoa enumC33341Eoa, C38U c38u, InterfaceC62602sz interfaceC62602sz, boolean z) {
        JG6 jg6 = new JG6() { // from class: X.ItV
            @Override // X.JG6
            public final AbstractC39655Hik Bsw(C38321qM c38321qM) {
                if (HEI.this.A0G.contains(c38321qM.getId())) {
                    return HLU.A00;
                }
                return HLS.A00;
            }
        };
        this.A0I = jg6;
        this.A06 = context;
        this.A08 = hdj;
        this.A0H = c155376yQ;
        this.A07 = new C155946zO(new C155936zN(context, interfaceC60442pS, userSession), c38u, C05F.A01);
        this.A0L = interfaceC62602sz;
        this.A0F = AbstractC166987dD.A1G();
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0B = c168737g7;
        C32440EQs c32440EQs = new C32440EQs(context);
        this.A0C = c32440EQs;
        C31566Dts c31566Dts = new C31566Dts(context, new GYQ() { // from class: X.J14
            @Override // X.GYQ
            public final void Cuc(C31335Dq0 c31335Dq0) {
                HEI hei = HEI.this;
                hei.A0C();
                HDJ hdj2 = hei.A08;
                if (!hei.A03) {
                    hdj2.A09.A00(8);
                }
                hdj2.A00.A0T();
            }
        });
        this.A0D = c31566Dts;
        this.A02 = new C32432EQk(context);
        C153006uU c153006uU = new C153006uU(context);
        this.A0K = c153006uU;
        HFL hfl = new HFL(context, interfaceC60442pS, userSession, jh9, jg6, false, true, false);
        this.A0J = hfl;
        C65842yM c65842yM = new C65842yM(context);
        this.A0M = c65842yM;
        C32429EQh c32429EQh = new C32429EQh(context);
        this.A0A = c32429EQh;
        C32429EQh c32429EQh2 = new C32429EQh(context);
        this.A09 = c32429EQh2;
        this.A0E = context.getString(2131961561);
        this.A00 = enumC33341Eoa;
        this.A05 = z;
        A0B(c168737g7, c32440EQs, c31566Dts, this.A02, c153006uU, hfl, c65842yM, c32429EQh, c32429EQh2);
    }

    public static void A00(HEI hei) {
        C211739Zk c211739Zk;
        InterfaceC65642y0 interfaceC65642y0;
        C155946zO c155946zO = hei.A07;
        c155946zO.A08(hei.A0H);
        hei.A06();
        if (hei.A01 != null) {
            hei.A09(hei.A0B, new C31335Dq0(2131975135), new Object());
            hei.A08(hei.A0C, new C36731GHa(new C35745Fqd(hei, 27), 2131975136, hei.A01.A01));
            C41030IEz c41030IEz = hei.A01;
            if (c41030IEz != null) {
                hei.A08(hei.A02, new C35200Ffs(ViewOnClickListenerC42032Ik1.A00(hei, 27), C84963qk.A02(AbstractC166997dE.A0N(hei.A08), c41030IEz.A00), 2131975137, 0));
            }
            if (c155946zO.A02() != 0) {
                C31335Dq0 c31335Dq0 = new C31335Dq0(2131969528);
                c31335Dq0.A0G = hei.A0E;
                hei.A08(hei.A0D, c31335Dq0);
            }
        }
        if (c155946zO.A02() != 0 && hei.A05) {
            int ordinal = hei.A00.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c211739Zk = new C211739Zk(hei.A06.getString(2131974318), Integer.valueOf(R.drawable.instagram_warning_pano_outline_24));
                    c211739Zk.A00 = 2131974317;
                    c211739Zk.A01 = new C42680Iub(hei, 2);
                    interfaceC65642y0 = hei.A09;
                }
            } else {
                c211739Zk = new C211739Zk(hei.A06.getString(2131969505), Integer.valueOf(R.drawable.instagram_info_pano_outline_24));
                c211739Zk.A00 = 2131969506;
                c211739Zk.A01 = new C42680Iub(hei, 1);
                interfaceC65642y0 = hei.A0A;
            }
            hei.A08(interfaceC65642y0, c211739Zk);
        }
        if (!hei.A04 || AbstractC166987dD.A1b(((AbstractC65332xV) c155946zO).A01)) {
            for (int i = 0; i < c155946zO.A02(); i++) {
                Object A0F = c155946zO.A0F(i);
                Map map = hei.A0F;
                C153336v2 c153336v2 = (C153336v2) map.get(AbstractC166997dE.A0u(A0F));
                if (c153336v2 == null) {
                    c153336v2 = new C153336v2();
                    c153336v2.A03 = hei.A03;
                    map.put(AbstractC166997dE.A0u(A0F), c153336v2);
                }
                boolean z = true;
                if (hei.A0L.CLJ() || i != c155946zO.A02() - 1) {
                    z = false;
                }
                c153336v2.A00(i, z);
                c153336v2.A03 = hei.A03;
                hei.A09(hei.A0J, A0F, c153336v2);
            }
        }
        if (!hei.A04 || hei.A0L.CLJ()) {
            hei.A08(hei.A0M, hei.A0L);
        }
        hei.A07();
    }

    public final void A0C() {
        boolean z = this.A03;
        boolean z2 = !z;
        if (z != z2) {
            this.A03 = z2;
            if (z2) {
                this.A0G.clear();
            }
            C0fA.A00(this, -347549398);
        }
        this.A0G.clear();
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        Object obj = this.A0F.get(str);
        obj.getClass();
        return (C153336v2) obj;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A07.A02() == 0 && this.A01 == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }
}
