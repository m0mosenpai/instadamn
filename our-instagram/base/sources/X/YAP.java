package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;

/* loaded from: classes12.dex */
public final class YAP implements InterfaceC31072DlE {
    public static final YAP A00 = new Object();

    @Override // X.InterfaceC31072DlE
    public final C25547BRj AEB(Integer num) {
        C14360o3.A0B(num, 0);
        return YAO.A00.AEB(num);
    }

    @Override // X.InterfaceC31072DlE
    public final OpacityData E2H(EnumC27390C6t enumC27390C6t) {
        C14360o3.A0B(enumC27390C6t, 0);
        return YAO.A00.E2H(enumC27390C6t);
    }

    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        C14360o3.A0B(num, 0);
        return YAO.A00.F8x(num);
    }

    @Override // X.InterfaceC31072DlE
    public final ColorData AIU(EnumC72394Xcg enumC72394Xcg) {
        if (AbstractC72046XLm.A00(enumC72394Xcg) == 107) {
            return new ColorData(-1, -1);
        }
        return YAO.A00.AIU(enumC72394Xcg);
    }

    @Override // X.InterfaceC31072DlE
    public final int AKz(Integer num) {
        int A01 = AbstractC72046XLm.A01(num);
        if (A01 == 15) {
            return 8;
        }
        if (A01 != 17) {
            if (A01 == 19) {
                return 8;
            }
            return YAO.A00.AKz(num);
        }
        return 12;
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        return AbstractC72046XLm.A03(num).AVw(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        return AbstractC72046XLm.A03(num).Em4(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        int A01 = AbstractC72046XLm.A01(num);
        if (A01 != 24) {
            if (A01 == 35 || A01 == 36) {
                return 6.0f;
            }
            return YAO.A00.Ema(num);
        }
        return 52.0f;
    }
}
