package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.LSv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48146LSv implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C48146LSv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40701ud c40701ud, Object obj, int i) {
        c40701ud.ATV(new C48146LSv(obj, i), interfaceC48192Ji, c1Dk);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        InterfaceC16820sZ interfaceC16820sZ;
        MPT mpt;
        C05A c05a;
        Object c51758Mth;
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        InterfaceC16660sJ interfaceC16660sJ2;
        switch (this.A00) {
            case 0:
                C0K8.A0F("VestaLoginServerProvider", "[BEGIN] GraphQL query failed", th);
                C47774L7w c47774L7w = (C47774L7w) this.A01;
                C14360o3.A0A(th);
                c47774L7w.A00(th);
                return;
            case 1:
                C0K8.A0F("VestaLoginServerProvider", "[FINISH] GraphQL query failed", th);
                L7Q l7q = (L7Q) this.A01;
                C14360o3.A0A(th);
                l7q.A00(th);
                return;
            case 2:
                C0K8.A0F("VestaLoginServerProvider", "[INIT] GraphQL query failed", th);
                C47768L7p c47768L7p = (C47768L7p) this.A01;
                C14360o3.A0A(th);
                c47768L7p.A00(th);
                return;
            case 3:
                C0K8.A0F("VestaRegisterServerProvider", "[BEGIN] GraphQL query failed", th);
                L8A l8a = (L8A) this.A01;
                C14360o3.A0A(th);
                l8a.A00(th);
                return;
            case 4:
                C0K8.A0F("VestaRegisterServerProvider", "[FINISH] GraphQL query failed", th);
                C47739L6b c47739L6b = (C47739L6b) this.A01;
                C14360o3.A0A(th);
                c47739L6b.A00(th);
                return;
            case 5:
                C0K8.A0F("VestaRegisterServerProvider", "[INIT] GraphQL query failed", th);
                L81 l81 = (L81) this.A01;
                C14360o3.A0A(th);
                l81.A00(th);
                return;
            case 6:
            case 25:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return;
            case 7:
                mpt = ((C47499KyS) this.A01).A00.A01;
                mpt.onFailure(th);
                return;
            case 8:
                mpt = ((L2F) this.A01).A00.A01;
                mpt.onFailure(th);
                return;
            case 9:
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                interfaceC24741Ir.F8s(new MU9(th.toString(), 0));
                interfaceC24741Ir.AID(null);
                return;
            case 10:
            case 11:
            default:
                ((C2JL) this.A01).onFailure(th);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC16820sZ = ((L2P) this.A01).A01;
                interfaceC16820sZ.invoke();
                return;
            case 14:
                C48253LXc c48253LXc = (C48253LXc) this.A01;
                LL0.A03(c48253LXc, c48253LXc.A00, C05F.A0f, null, null, null, null, null, th, null);
                c05a = c48253LXc.A04;
                c51758Mth = new C51758Mth(null, 1, 10, true);
                c05a.Egh(c51758Mth);
                return;
            case Process.SIGTERM /* 15 */:
            case 16:
                c05a = ((C44475Jlh) this.A01).A01;
                c51758Mth = LX8.A00;
                c05a.Egh(c51758Mth);
                return;
            case 17:
                C47612L0x c47612L0x = (C47612L0x) this.A01;
                C47285Kuw c47285Kuw = c47612L0x.A01;
                C48593LeV.A03(c47285Kuw.A00, AbstractC166997dE.A0p(c47612L0x.A00, 2131952663), false);
                return;
            case 18:
            case Process.SIGSTOP /* 19 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = th.toString();
                interfaceC16660sJ.invoke(obj);
                return;
            case 20:
                interfaceC16660sJ2 = ((C47679L3m) this.A01).A03;
                C14360o3.A0A(th);
                interfaceC16660sJ2.invoke(th);
                return;
            case 21:
                interfaceC16660sJ2 = (InterfaceC16660sJ) this.A01;
                C14360o3.A0A(th);
                interfaceC16660sJ2.invoke(th);
                return;
            case 22:
                interfaceC16660sJ2 = ((C47645L2e) this.A01).A02;
                C14360o3.A0A(th);
                interfaceC16660sJ2.invoke(th);
                return;
            case 23:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = AbstractC166997dE.A0a();
                interfaceC16660sJ.invoke(obj);
                return;
            case 24:
                C0K8.A0G("BackgroundThemeManager", "Failed to load background", th);
                return;
        }
    }
}
