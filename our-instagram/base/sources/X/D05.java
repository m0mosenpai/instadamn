package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes5.dex */
public final class D05 implements InterfaceC31162Dn6 {
    public final UserSession A00;
    public final InterfaceC31137Dmc A01;
    public final String A02;

    @Override // X.InterfaceC31162Dn6
    public final void CK8(C120985dq c120985dq, BPP bpp, int i) {
        List list;
        C14360o3.A0B(bpp, 1);
        InterfaceC31137Dmc interfaceC31137Dmc = this.A01;
        InterfaceC31076DlJ C56 = interfaceC31137Dmc.C56();
        C14360o3.A0B(C56, 1);
        EnumC25465BOe enumC25465BOe = bpp.A02;
        switch (enumC25465BOe.ordinal()) {
            case 0:
                C56.DwX(bpp.A00, bpp.A01, false, false);
                break;
            case 1:
                C56.DwZ(bpp.A00, bpp.A01);
                break;
            case 2:
                C56.DwW(bpp.A00, bpp.A01);
                break;
            case 3:
                C56.Dwa(bpp.A00);
                break;
            case 4:
                C56.DwV(bpp.A00, bpp.A01);
                break;
            case 5:
                C56.DwM(bpp.A00);
                break;
            case 6:
                C56.DwP();
                break;
            case 7:
                C56.DwQ(bpp.A00);
                break;
            case 8:
                C56.DwT(bpp.A00);
                break;
            case 9:
                C56.DwS(bpp.A00);
                break;
            case 10:
                C56.DwU(bpp.A00);
                break;
            case 11:
                C56.DwL(bpp.A00);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C56.DwK(bpp.A00, bpp.A01, C05F.A01, false);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C56.DFC(bpp.A00);
                break;
            case 14:
                C38321qM c38321qM = bpp.A00;
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                if (A0u != null) {
                    list = A0u.AvR();
                } else {
                    list = null;
                }
                String id = c38321qM.getId();
                if (id != null) {
                    C56.DwR(list, id);
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case Process.SIGTERM /* 15 */:
                C56.DTX(bpp.A00);
                break;
            case 16:
                C56.DOH();
                break;
            case 17:
                C56.DJ4(bpp.A00);
                break;
            case 18:
            case 23:
            case 24:
                break;
            case Process.SIGSTOP /* 19 */:
                C56.D8f(bpp.A00);
                break;
            case 20:
                C56.Djp(bpp.A00);
                break;
            case 21:
            case 22:
                C56.Dwb(bpp.A00);
                break;
            default:
                throw B4Z.A00();
        }
        interfaceC31137Dmc.EI7(bpp.A00, bpp.A01, enumC25465BOe, i);
    }

    @Override // X.InterfaceC31162Dn6
    public final void CKA(C120985dq c120985dq, BPP bpp, InterfaceC30862Dhb interfaceC30862Dhb, int i) {
        AbstractC25233BEq.A0v(0, bpp, c120985dq, interfaceC30862Dhb);
        if (interfaceC30862Dhb instanceof D07) {
            D07 d07 = (D07) interfaceC30862Dhb;
            CZH.A01(C8i.ATTRIBUTE_IMPRESSION, d07.A00, this.A00, d07.A01, "reels");
        } else if (!(interfaceC30862Dhb instanceof BQE)) {
            throw B4Z.A00();
        }
        this.A01.DjZ(c120985dq, bpp.A00, bpp.A01, bpp.A02, i);
    }

    @Override // X.InterfaceC31162Dn6
    public final void E5h(C38321qM c38321qM) {
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        C14360o3.A0B(c38321qM, 0);
        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
        if (Asm != null && (B0S = Asm.B0S()) != null && (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0O(B0S, 0)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
            UserSession userSession = this.A00;
            BME.A00(userSession).A00(userSession, "on_touch_down", effectId, this.A02);
        }
    }

    @Override // X.InterfaceC30981Djc
    public final void EXA(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXF(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31044Dki
    public final void EXJ(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXP(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXQ(InterfaceC16820sZ interfaceC16820sZ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXS(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXV(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXW(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXX(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXY(InterfaceC16820sZ interfaceC16820sZ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXa(InterfaceC16820sZ interfaceC16820sZ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXb(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXl(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXn(InterfaceC16820sZ interfaceC16820sZ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31015DkE
    public final void EXq(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31015DkE
    public final void EXr(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXs(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXu(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXv(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXw(InterfaceC16610sE interfaceC16610sE) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXx(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXy(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXz(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31044Dki
    public final void EY0(InterfaceC16590sC interfaceC16590sC) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31044Dki
    public final void EY1(C0s8 c0s8) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31162Dn6
    public final void EY2(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    public D05(UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, String str) {
        AbstractC167027dH.A13(userSession, interfaceC31137Dmc, str);
        this.A00 = userSession;
        this.A01 = interfaceC31137Dmc;
        this.A02 = str;
    }
}
