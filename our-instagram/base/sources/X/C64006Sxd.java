package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Sxd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64006Sxd implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C64006Sxd(C58444PvN c58444PvN, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 16:
                this.A01 = c58444PvN;
                return;
            default:
                this.A01 = c58444PvN;
                return;
        }
    }

    public static void A00(InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40701ud c40701ud, Object obj, int i) {
        c40701ud.ATV(new C64006Sxd(obj, i), interfaceC48192Ji, c1Dk);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C58444PvN c58444PvN;
        Object A01;
        InterfaceC16660sJ interfaceC16660sJ;
        switch (this.A00) {
            case 0:
                C0K8.A0C("TokenAcknowledger", "ackTokenWithFbid failure");
                return;
            case 1:
                c58444PvN = (C58444PvN) this.A01;
                A01 = SSG.A01(th);
                c58444PvN.A03(A01);
                return;
            case 2:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                C14360o3.A0C(th, AbstractC111324zv.A00(2804));
                interfaceC23621Ds.resumeWith(new UM0(th));
                return;
            case 3:
                C58681Pzu c58681Pzu = ((C58679Pzs) this.A01).A00;
                C14360o3.A0A(th);
                c58681Pzu.A01(new Q07(), th);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            default:
                ((C2JL) this.A01).onFailure(th);
                return;
            case 8:
                ((AbstractC25011Ke) this.A01).set(null);
                return;
            case 10:
                c58444PvN = (C58444PvN) this.A01;
                A01 = SSG.A01((Throwable) S84.A00.apply(th));
                c58444PvN.A03(A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                C14360o3.A0A(th);
                interfaceC16660sJ.invoke(th);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                interfaceC16660sJ.invoke(th);
                return;
            case 14:
                SHQ shq = (SHQ) this.A01;
                C14360o3.A0A(th);
                InAppPurchaseControllerCoro.A0A(shq.A00, shq.A01, C16930sl.A00);
                return;
            case Process.SIGTERM /* 15 */:
                SMB smb = (SMB) this.A01;
                C14360o3.A0A(th);
                smb.A00(th);
                return;
            case 16:
                c58444PvN = (C58444PvN) this.A01;
                A01 = C63406Sjd.A06(th);
                c58444PvN.A03(A01);
                return;
            case 17:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
        }
    }

    public C64006Sxd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
