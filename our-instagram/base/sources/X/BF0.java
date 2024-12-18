package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BF0 implements C33R {
    public final int A00;
    public final Object A01;

    public BF0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        InterfaceC119545bC interfaceC119545bC;
        C51762Yz c51762Yz;
        Object obj;
        boolean z;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 4) {
                    return;
                }
                ((C51762Yz) this.A01).A03(new DRQ(c75113Zb, 21));
                return;
            case 1:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 4) {
                    return;
                }
                C119565bE c119565bE = (C119565bE) ((InterfaceC74953Yl) this.A01).getValue();
                int i2 = c75113Zb.A02;
                InterfaceC119545bC interfaceC119545bC2 = c119565bE.A02;
                if (interfaceC119545bC2.BIi() == i2) {
                    return;
                }
                if (c119565bE.A07) {
                    InterfaceC119545bC interfaceC119545bC3 = c119565bE.A04;
                    int i3 = 0;
                    if (i2 > interfaceC119545bC3.BIi()) {
                        int i4 = c119565bE.A01 - 1;
                        int i5 = i2;
                        if (i2 > i4) {
                            i5 = i4;
                        }
                        interfaceC119545bC3.EWE(i5);
                        interfaceC119545bC = c119565bE.A06;
                        interfaceC119545bC.EWE(Math.max(0, (interfaceC119545bC3.BIi() - 5) + 1));
                    } else {
                        interfaceC119545bC = c119565bE.A06;
                        if (i2 < interfaceC119545bC.BIi()) {
                            int i6 = i2;
                            if (i2 < 0) {
                                i6 = 0;
                            }
                            interfaceC119545bC.EWE(i6);
                            interfaceC119545bC3.EWE(Math.min((interfaceC119545bC.BIi() + 5) - 1, c119565bE.A01 - 1));
                        }
                    }
                    InterfaceC119545bC interfaceC119545bC4 = c119565bE.A05;
                    interfaceC119545bC4.EWE(Math.max(0, interfaceC119545bC.BIi() - 2));
                    InterfaceC119545bC interfaceC119545bC5 = c119565bE.A03;
                    interfaceC119545bC5.EWE(Math.min(interfaceC119545bC3.BIi() + 2, c119565bE.A01 - 1));
                    if (interfaceC119545bC.BIi() != interfaceC119545bC4.BIi() && interfaceC119545bC3.BIi() != interfaceC119545bC5.BIi()) {
                        if (i2 > interfaceC119545bC2.BIi()) {
                            if (i2 == interfaceC119545bC3.BIi() && interfaceC119545bC5.BIi() - i2 == 2) {
                                i3 = 1;
                            }
                        } else if (i2 == interfaceC119545bC.BIi() && i2 - interfaceC119545bC4.BIi() == 2) {
                            i3 = -1;
                        }
                    }
                    c119565bE.A00 = i3;
                }
                interfaceC119545bC2.EWE(i2);
                return;
            case 2:
                C14360o3.A0B(c75113Zb, 0);
                ((C3Y1) this.A01).DSJ(c75113Zb, i);
                return;
            case 3:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 10) {
                    return;
                }
                ((C2XI) this.A01).A00(Boolean.valueOf(c75113Zb.A1y));
                return;
            case 4:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 42) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                WeakReference weakReference = c75113Zb.A1X;
                if (weakReference != null) {
                    obj = weakReference.get();
                } else {
                    obj = null;
                }
                c51762Yz.A01(obj);
                return;
            case 5:
                if (i != 63) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                obj = Long.valueOf(((C37727Gj2) C37727Gj2.A02.getValue()).A00());
                c51762Yz.A01(obj);
                return;
            case 6:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 5) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                z = c75113Zb.A28;
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case 7:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 33) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                z = c75113Zb.A2A;
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case 8:
                z = false;
                C14360o3.A0B(c75113Zb, 0);
                if (i != 29) {
                    return;
                }
                Integer num = c75113Zb.A10;
                Integer num2 = C05F.A00;
                c51762Yz = (C51762Yz) this.A01;
                if (num != num2) {
                    z = true;
                }
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case 9:
                C14360o3.A0B(c75113Zb, 0);
                c51762Yz = (C51762Yz) this.A01;
                if (c51762Yz.A03 == null || i != 46) {
                    return;
                }
                float f = 1.0f;
                if (c75113Zb.A1p) {
                    f = 0.0f;
                }
                obj = Float.valueOf(f);
                c51762Yz.A01(obj);
                return;
            case 10:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 49) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                z = c75113Zb.A29;
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case 11:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 65) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                z = c75113Zb.A24;
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 61) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                obj = c75113Zb.A3R.A00;
                c51762Yz.A01(obj);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 18) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                z = c75113Zb.A1v;
                obj = Boolean.valueOf(z);
                c51762Yz.A01(obj);
                return;
            case 14:
                C14360o3.A0B(c75113Zb, 0);
                if (i != 73) {
                    return;
                }
                c51762Yz = (C51762Yz) this.A01;
                obj = c75113Zb.A0n;
                c51762Yz.A01(obj);
                return;
            default:
                C14360o3.A0B(c75113Zb, 0);
                if (i == 73) {
                    EnumC37732Gj7 enumC37732Gj7 = c75113Zb.A0n;
                    EnumC37732Gj7 enumC37732Gj72 = EnumC37732Gj7.A02;
                    C37634GhT c37634GhT = (C37634GhT) this.A01;
                    if (enumC37732Gj7 == enumC37732Gj72) {
                        c37634GhT.A0G.A0B();
                        return;
                    } else {
                        if (!c37634GhT.A0I) {
                            return;
                        }
                        c37634GhT.A0G.A0C();
                        return;
                    }
                }
                return;
        }
    }
}
