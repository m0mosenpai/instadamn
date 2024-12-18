package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Dp6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31284Dp6 implements InterfaceC50493MQv {
    public int A00;
    public FragmentActivity A01;
    public InterfaceC11380iw A02;
    public UserSession A03;
    public C163947Vi A04;
    public InterfaceC163837Ux A05;
    public boolean A06;
    public final int A07;
    public final Capabilities A08;
    public final C7O4 A09;
    public final C164677Yg A0A;
    public final C37004GRv A0B;
    public final FFZ A0C;
    public final C7VF A0D;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC50493MQv
    public final synchronized AbstractC46524KiP Csr() {
        AbstractC46524KiP abstractC46524KiP;
        Capabilities capabilities;
        AbstractC46524KiP abstractC46524KiP2;
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C163947Vi c163947Vi = this.A04;
        abstractC46524KiP = null;
        InterfaceC83733oI interfaceC83733oI = null;
        C7TT c7tt = null;
        abstractC46524KiP = null;
        abstractC46524KiP = null;
        abstractC46524KiP = null;
        abstractC46524KiP = null;
        abstractC46524KiP = null;
        if (!this.A06 && fragmentActivity != null && userSession != null && interfaceC11380iw != null && c163947Vi != null && this.A00 < C05F.A00(26).length) {
            Integer[] A00 = C05F.A00(26);
            int i = this.A00;
            this.A00 = i + 1;
            switch (A00[i].intValue()) {
                case 0:
                    abstractC46524KiP2 = new C43699JUj(fragmentActivity, interfaceC11380iw, userSession);
                    break;
                case 1:
                    abstractC46524KiP2 = new C31300DpM(fragmentActivity, userSession);
                    break;
                case 2:
                    abstractC46524KiP2 = new JU1(fragmentActivity, userSession, this.A0C);
                    break;
                case 3:
                    abstractC46524KiP2 = new JU4(fragmentActivity, userSession, this.A0C);
                    break;
                case 4:
                    abstractC46524KiP2 = new JU5(fragmentActivity, userSession);
                    break;
                case 5:
                    abstractC46524KiP2 = new JU6(fragmentActivity, userSession);
                    break;
                case 6:
                    abstractC46524KiP2 = new C31301DpN(fragmentActivity, userSession);
                    break;
                case 7:
                    InterfaceC163837Ux interfaceC163837Ux = this.A05;
                    if (interfaceC163837Ux != null && (capabilities = this.A08) != null) {
                        C7TT C7W = interfaceC163837Ux.C7W();
                        C14360o3.A07(C7W);
                        abstractC46524KiP2 = new C31306DpS(fragmentActivity, userSession, capabilities, C7W, this.A07);
                        break;
                    } else {
                        abstractC46524KiP2 = new Object();
                        break;
                    }
                    break;
                case 8:
                    abstractC46524KiP2 = new JUB(fragmentActivity, interfaceC11380iw, userSession);
                    break;
                case 9:
                    abstractC46524KiP2 = new C31311DpX(interfaceC11380iw, userSession, c163947Vi);
                    break;
                case 10:
                    abstractC46524KiP2 = new JU8(userSession, AbstractC2056298m.A00(userSession));
                    break;
                case 11:
                    abstractC46524KiP2 = new C31308DpU(fragmentActivity, userSession);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    InterfaceC163837Ux interfaceC163837Ux2 = this.A05;
                    if (interfaceC163837Ux2 != null) {
                        interfaceC83733oI = interfaceC163837Ux2.CCa();
                    }
                    abstractC46524KiP2 = new C31309DpV(fragmentActivity, userSession, interfaceC83733oI);
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    abstractC46524KiP2 = new C31304DpQ(fragmentActivity, userSession);
                    break;
                case 14:
                    abstractC46524KiP2 = new C31299DpL(fragmentActivity, userSession, this.A0A);
                    break;
                case Process.SIGTERM /* 15 */:
                    abstractC46524KiP2 = new C31298DpK(fragmentActivity, interfaceC11380iw, userSession, this.A0D);
                    break;
                case 16:
                    abstractC46524KiP2 = new C31297DpJ(fragmentActivity, interfaceC11380iw, userSession);
                    break;
                case 17:
                    C7O4 c7o4 = this.A09;
                    if (c7o4 != null) {
                        abstractC46524KiP2 = new C31295DpH(c7o4);
                        break;
                    } else {
                        abstractC46524KiP2 = new Object();
                        break;
                    }
                case 18:
                    abstractC46524KiP2 = new C65762Ttd(fragmentActivity, interfaceC11380iw, userSession);
                    break;
                case Process.SIGSTOP /* 19 */:
                    abstractC46524KiP2 = new C31293DpF(interfaceC11380iw, userSession, this.A0B);
                    break;
                case 20:
                    abstractC46524KiP2 = new C31290DpC(fragmentActivity, userSession);
                    break;
                case 21:
                    abstractC46524KiP2 = new C31291DpD(userSession);
                    break;
                case 22:
                    abstractC46524KiP2 = new C31292DpE(userSession);
                    break;
                case 23:
                    InterfaceC163837Ux interfaceC163837Ux3 = this.A05;
                    if (interfaceC163837Ux3 != null) {
                        c7tt = interfaceC163837Ux3.C7W();
                    }
                    abstractC46524KiP2 = new C31288DpA(fragmentActivity, userSession, c7tt);
                    break;
                case 24:
                    abstractC46524KiP2 = new C37420Ge0(userSession);
                    break;
                case 25:
                    abstractC46524KiP2 = new C31324Dpm(userSession);
                    break;
                default:
                    throw new RuntimeException();
            }
            abstractC46524KiP = abstractC46524KiP2;
        }
        return abstractC46524KiP;
    }

    @Override // X.InterfaceC50493MQv
    public final void E5G() {
    }

    @Override // X.InterfaceC50493MQv
    public final synchronized void destroy() {
        this.A06 = true;
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
    }

    @Override // X.InterfaceC50493MQv
    public final synchronized void reset() {
        this.A00 = 0;
    }

    public C31284Dp6(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7O4 c7o4, C164677Yg c164677Yg, C37004GRv c37004GRv, FFZ ffz, C163947Vi c163947Vi, InterfaceC163837Ux interfaceC163837Ux, C7VF c7vf, int i) {
        this.A01 = fragmentActivity;
        this.A0D = c7vf;
        this.A08 = capabilities;
        this.A05 = interfaceC163837Ux;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A07 = i;
        this.A09 = c7o4;
        this.A04 = c163947Vi;
        this.A0A = c164677Yg;
        this.A0B = c37004GRv;
        this.A0C = ffz;
    }
}
