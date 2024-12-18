package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;

/* loaded from: classes12.dex */
public final class YAR implements InterfaceC31072DlE {
    public static final YAR A00 = new Object();

    @Override // X.InterfaceC31072DlE
    public final C25547BRj AEB(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 4 && A03 != 5) {
            return YAQ.A00.AEB(num);
        }
        return new C25547BRj(EnumC72394Xcg.A0Z, 1.0f, 0);
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 == 0 || A03 == 2) {
            return false;
        }
        return XPD.A00.AVw(num);
    }

    @Override // X.InterfaceC31072DlE
    public final ColorData AIU(EnumC72394Xcg enumC72394Xcg) {
        int A002 = AbstractC72046XLm.A00(enumC72394Xcg);
        if (A002 != 62) {
            if (A002 != 144) {
                return XPD.A00.AIU(enumC72394Xcg);
            }
            return AbstractC72046XLm.A02(-1, -14931149);
        }
        return AbstractC72046XLm.A02(-14931149, -920329);
    }

    @Override // X.InterfaceC31072DlE
    public final int AKz(Integer num) {
        return AbstractC72046XLm.A03(num).AKz(num);
    }

    @Override // X.InterfaceC31072DlE
    public final OpacityData E2H(EnumC27390C6t enumC27390C6t) {
        float f;
        int A002 = AbstractC72046XLm.A00(enumC27390C6t);
        if (A002 != 1) {
            if (A002 != 2) {
                if (A002 != 5) {
                    return YAQ.A00.E2H(enumC27390C6t);
                }
                f = 0.0f;
            } else {
                return new OpacityData(0.03f, 0.05f);
            }
        } else {
            f = 0.1f;
        }
        return new OpacityData(f, f);
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        return AbstractC72046XLm.A03(num).Em4(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        return AbstractC72046XLm.A03(num).Ema(num);
    }

    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        return AbstractC72046XLm.A03(num).F8x(num);
    }
}
