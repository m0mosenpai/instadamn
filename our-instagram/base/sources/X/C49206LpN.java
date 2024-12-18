package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.LpN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49206LpN implements InterfaceC163857Uz {
    public C51760Mtj A00;
    public AnonymousClass988 A01;
    public boolean A02;
    public final Context A03;
    public final C42201xA A04;
    public final C42201xA A05;
    public final UserSession A08;
    public final C7O4 A09;
    public final C7K6 A0A;
    public final C48713Lgh A0B;
    public final L52 A0C;
    public final L9F A0D;
    public final InterfaceC164017Vq A0E;
    public final boolean A0G;
    public final C164087Vx A0J;
    public final InterfaceC163557Ts A0K;
    public final InterfaceC09390do A0F = AbstractC09440dt.A00(EnumC09460dv.A02, new MHH(this, 39));
    public final C41761wQ A07 = new C41761wQ(null);
    public final C41761wQ A06 = new C41761wQ(null);
    public final C42221xC A0H = AbstractC43592JPx.A0Q(C48418LbX.A00, C43601JQh.A00(A02(), MKW.A00, 7));
    public final C42221xC A0I = AbstractC43592JPx.A0Q(C48420LbZ.A00, C43601JQh.A00(A02(), MKZ.A00, 7));

    public final void A03(String str) {
        String str2 = str;
        if (!(!C14360o3.A0K(str, this.A0K.BPb()))) {
            str2 = null;
        }
        this.A0D.A01(new BJF(str2, null, 2, 3, this.A0G), JQ1.A0E(this.A05, this));
        this.A07.A02(this.A0C.A02.A0G(), new C49796Lz3(str2, this, 0));
    }

    @Override // X.InterfaceC163857Uz
    public final C160787Im BT7(String str) {
        C14360o3.A0B(str, 0);
        return this.A0B.A05.A01(str);
    }

    @Override // X.InterfaceC163857Uz
    public final C161577Ls CDC() {
        return new C161577Ls(null, null, false);
    }

    @Override // X.InterfaceC163857Uz
    public final boolean CWY() {
        return false;
    }

    @Override // X.InterfaceC163857Uz
    public final C47385Kwa ChY(L1N l1n, String str) {
        C14360o3.A0B(str, 0);
        C42221xC A00 = C48433Lbm.A00(((C137756Lx) this.A0F.getValue()).A01, str);
        C5Fn A002 = AbstractC137146It.A00("load_media_from_msys_media_cache");
        C41761wQ A0S = AbstractC31174DnI.A0S();
        A0S.A02(A00.A0P(A002), new C44109JeZ(10, l1n, A0S));
        return new C47385Kwa(A0S);
    }

    @Override // X.InterfaceC163857Uz
    public final void D7z(InterfaceC83713oG interfaceC83713oG) {
        Long l;
        AbstractC09800fd.A01("MsysThreadViewDataLoader.onCreate", -133446104);
        try {
            L52 l52 = this.A0C;
            l52.A01.accept(AbstractC140946Yw.A03(interfaceC83713oG));
            L9F l9f = this.A0D;
            C42201xA c42201xA = this.A05;
            l9f.A01(new BJF(null, null, 3, 3, this.A0G), JQ1.A0E(c42201xA, this));
            A00();
            C7O4 c7o4 = this.A09;
            if (c7o4 != null) {
                String str = c7o4.A06;
                if (str != null) {
                    l = AbstractC166997dE.A0j(str);
                } else {
                    l = null;
                }
                this.A00 = new C51760Mtj(29, l, c7o4.A0C, c7o4.A02);
            }
            EK6(false);
            this.A0E.Eml(null);
            C41761wQ c41761wQ = this.A06;
            JQn.A00(C43601JQh.A00(C43597JQd.A02(l52.A02, MKT.A00, 38), MKU.A00, 7).A0G(), c41761wQ, this, 36);
            JQn.A00(c42201xA.A0F(), c41761wQ, this, 37);
            AbstractC09800fd.A00(-1918388508);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1640103345);
            throw th;
        }
    }

    @Override // X.InterfaceC163857Uz
    public final void EJh() {
    }

    @Override // X.InterfaceC163857Uz
    public final void EJv() {
    }

    @Override // X.InterfaceC163857Uz
    public final boolean Eip() {
        return true;
    }

    @Override // X.InterfaceC163857Uz
    public final void FBJ(boolean z) {
    }

    private final void A00() {
        JQn.A00(C43601JQh.A00(C137766Ly.A00(((C137756Lx) this.A0F.getValue()).A01), GVa.A00, 7), this.A07, this, 48);
        this.A02 = true;
    }

    public static final void A01(C49206LpN c49206LpN) {
        JQn.A00(c49206LpN.A0C.A02.A0G(), c49206LpN.A07, c49206LpN, 47);
    }

    public final C42221xC A02() {
        return C43597JQd.A02(this.A0C.A02, MKV.A00, 38);
    }

    @Override // X.InterfaceC163857Uz
    public final void Chf() {
        JQn.A00(this.A0C.A02.A0G(), this.A07, this, 38);
    }

    @Override // X.InterfaceC163857Uz
    public final void D8Q() {
        this.A0J.A02(this.A0B);
    }

    @Override // X.InterfaceC163857Uz
    public final void D9u(C44150JfF c44150JfF, C3o9 c3o9) {
        this.A06.A01();
    }

    @Override // X.InterfaceC163857Uz
    public final void E40() {
        JQn.A00(this.A0C.A02.A0G(), this.A07, this, 43);
    }

    @Override // X.InterfaceC163857Uz
    public final void EK6(boolean z) {
        JQn.A00(this.A0C.A02.A0G(), this.A07, this, 44);
    }

    @Override // X.InterfaceC163857Uz
    public final void onDestroyView() {
        this.A0A.A01 = true;
        C164087Vx c164087Vx = this.A0J;
        c164087Vx.A01 = null;
        c164087Vx.A02 = null;
        c164087Vx.A03 = null;
    }

    @Override // X.InterfaceC163857Uz
    public final void onPause() {
        this.A07.A01();
        this.A02 = false;
    }

    @Override // X.InterfaceC163857Uz
    public final void onResume() {
        if (!this.A02) {
            A00();
            JQn.A00(this.A0C.A02.A0G(), this.A07, this, 46);
        }
        C41761wQ c41761wQ = this.A07;
        JQn.A00(C42221xC.A01(new YO2() { // from class: X.La5
            @Override // X.YO2
            public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return AbstractC166987dD.A1L(obj, obj2);
            }
        }, this.A0C.A02, this.A0B.A02), c41761wQ, this, 39);
        JQn.A00(this.A0I, c41761wQ, this, 40);
        C42221xC c42221xC = this.A0H;
        C2DU c2du = (C2DU) AbstractC28761aE.A00(this.A08);
        JQn.A00(AbstractC43592JPx.A0R(C43601JQh.A00(C42221xC.A01(new YO2() { // from class: X.La6
            @Override // X.YO2
            public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return AbstractC166987dD.A1L(obj, obj2);
            }
        }, c42221xC, c2du.A09.A0O((C5Fn) c2du.A0L.getValue())), MKX.A00, 7)), c41761wQ, this, 41);
        JQn.A00(AbstractC43592JPx.A0Q(C48419LbY.A00, C43601JQh.A00(A02(), MKY.A00, 7)), c41761wQ, this, 42);
    }

    public C49206LpN(Context context, UserSession userSession, Capabilities capabilities, C7O4 c7o4, C165937bL c165937bL, C164087Vx c164087Vx, C7K6 c7k6, C7WA c7wa, C98K c98k, InterfaceC165067Zv interfaceC165067Zv, AnonymousClass988 anonymousClass988, AnonymousClass988 anonymousClass9882, InterfaceC163557Ts interfaceC163557Ts, C48713Lgh c48713Lgh, InterfaceC164017Vq interfaceC164017Vq, InterfaceC164017Vq interfaceC164017Vq2, InterfaceC164017Vq interfaceC164017Vq3, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A03 = context;
        this.A08 = userSession;
        this.A01 = anonymousClass988;
        this.A0B = c48713Lgh;
        this.A0A = c7k6;
        this.A0G = z;
        this.A0E = interfaceC164017Vq2;
        this.A09 = c7o4;
        this.A0J = c164087Vx;
        this.A0K = interfaceC163557Ts;
        this.A0C = new L52(userSession, c165937bL, interfaceC164017Vq, interfaceC164017Vq3, str, interfaceC16660sJ);
        DirectThreadThemeInfo A00 = AbstractC125795mU.A00();
        this.A05 = AbstractC42021ws.A01(C7ID.A00.A01(this.A03, this.A01, A00, C05F.A00));
        this.A04 = AbstractC42021ws.A00();
        this.A0D = new L9F(context, userSession, capabilities, c7wa, c98k, interfaceC165067Zv, this.A01, anonymousClass9882, interfaceC16820sZ, interfaceC16820sZ2);
    }
}
