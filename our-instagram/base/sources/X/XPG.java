package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes12.dex */
public final class XPG implements InterfaceC31072DlE {
    public static final XPG A00 = new Object();

    @Override // X.InterfaceC31072DlE
    public final C25547BRj AEB(Integer num) {
        C14360o3.A0B(num, 0);
        return XPE.A00.AEB(num);
    }

    @Override // X.InterfaceC31072DlE
    public final ColorData AIU(EnumC72394Xcg enumC72394Xcg) {
        C14360o3.A0B(enumC72394Xcg, 0);
        return XPE.A00.AIU(enumC72394Xcg);
    }

    @Override // X.InterfaceC31072DlE
    public final OpacityData E2H(EnumC27390C6t enumC27390C6t) {
        C14360o3.A0B(enumC27390C6t, 0);
        return XPE.A00.E2H(enumC27390C6t);
    }

    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        C14360o3.A0B(num, 0);
        return XPF.A00.F8x(num);
    }

    @Override // X.InterfaceC31072DlE
    public final int AKz(Integer num) {
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
            case 6:
            case 10:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 25:
            case 26:
                return 16;
            case 1:
            case 4:
            case 5:
            case 18:
            default:
                return XPD.A00.AKz(num);
            case 2:
            case 3:
            case 23:
                return 24;
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 22:
                return 8;
            case 8:
                return 4;
            case 9:
                return 32;
            case 14:
            case 21:
                return 12;
            case 24:
                return 20;
        }
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        if (AbstractC72046XLm.A01(num) == 8) {
            return true;
        }
        return XPF.A00.AVw(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        return AbstractC72046XLm.A03(num).Em4(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        if (AbstractC72046XLm.A01(num) == 4) {
            return 8.0f;
        }
        return XPD.A00.Ema(num);
    }
}
