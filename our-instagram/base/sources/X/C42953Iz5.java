package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Iz5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42953Iz5 implements InterfaceC669530m {
    public int A00;
    public int A01;
    public C1ON A02;
    public InterfaceC670130s A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final UserSession A08;
    public final C26191Pa A09;
    public final C31G A0A;
    public final C1PY A0B;
    public final InterfaceC101974iC A0C;
    public final IKQ A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final InterfaceC16590sC A0H;

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        this.A06 = false;
        C1PY c1py = this.A0B;
        c1py.A00.remove(this.A0C);
        C1ON c1on = this.A02;
        if (c1on != null) {
            c1on.cancel();
        }
        this.A02 = null;
        C26191Pa c26191Pa = this.A09;
        c26191Pa.A04 = false;
        c26191Pa.A06 = false;
    }

    public /* synthetic */ C42953Iz5(UserSession userSession, C26191Pa c26191Pa, C31G c31g, C1PY c1py, String str, String str2, String str3, int i) {
        J7J j7j = new J7J(C1GJ.A00, 3);
        this.A08 = userSession;
        this.A0E = str;
        this.A07 = i;
        this.A0B = c1py;
        this.A0F = str2;
        this.A0G = str3;
        this.A09 = c26191Pa;
        this.A0A = c31g;
        this.A0H = j7j;
        this.A04 = C05F.A00;
        this.A05 = true;
        this.A00 = i;
        this.A0C = new C37482Gf0(this, 0);
        this.A0D = new IKQ(new C37477Gev(this, 1), userSession, str2, i);
    }

    private final void A00(int i) {
        Integer num = C05F.A01;
        this.A04 = num;
        String str = this.A0G;
        if (str != null) {
            UserSession userSession = this.A08;
            String str2 = this.A0F;
            int i2 = this.A07;
            String str3 = this.A0E;
            C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
            A0q.A09(num);
            A0q.A0B("profile_ads/get_profile_ads/");
            A0q.A0R(H9Z.class, C37463Geh.class);
            A0q.A9s("profile_id", str2);
            A0q.A0D("entry_point_index", i2);
            A0q.A0D("ad_request_index", i);
            AbstractC37300Gc1.A0y(A0q, str3);
            C1ON A0T = AbstractC31172DnG.A0T(A0q, "seed_media_id", str);
            A0T.A00 = new C37476Geu(3, this.A0D, false);
            InterfaceC16590sC interfaceC16590sC = this.A0H;
            Boolean A0b = AbstractC166997dE.A0b();
            interfaceC16590sC.invoke(A0T, 1901924650, 2, A0b, A0b);
            this.A02 = A0T;
        }
    }

    public static final boolean A01(C42953Iz5 c42953Iz5, int i) {
        if (c42953Iz5.A06) {
            int i2 = c42953Iz5.A01;
            IKQ ikq = c42953Iz5.A0D;
            if (i2 <= ikq.A00 && i >= ikq.A01 && c42953Iz5.A04 == C05F.A00) {
                if (!C18U.A06(C06090Tz.A05, c42953Iz5.A08, 36320695881507640L) || ikq.A01 != -1) {
                    c42953Iz5.A00(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        H9Z h9z;
        if (C18U.A06(C06090Tz.A05, this.A08, 36320695881507640L) && (h9z = this.A0D.A03) != null) {
            this.A09.A00(h9z);
        }
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        this.A00 = i;
        return A01(this, i);
    }

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        AbstractC167017dG.A1O(interfaceC670130s, anonymousClass320);
        this.A06 = true;
        this.A03 = interfaceC670130s;
        C1PY c1py = this.A0B;
        InterfaceC101974iC interfaceC101974iC = this.A0C;
        if (interfaceC101974iC != null) {
            List list = c1py.A00;
            if (!list.contains(interfaceC101974iC)) {
                list.add(interfaceC101974iC);
            }
        }
        C26191Pa c26191Pa = this.A09;
        c26191Pa.A04 = false;
        c26191Pa.A06 = true;
        if (!c26191Pa.A02(new C37476Geu(3, this.A0D, true), null, null)) {
            A00(anonymousClass320.A01);
        }
        return true;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
    }
}
