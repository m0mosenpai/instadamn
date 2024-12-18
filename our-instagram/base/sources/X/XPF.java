package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;

/* loaded from: classes12.dex */
public final class XPF implements InterfaceC31072DlE {
    public static final XPF A00 = new Object();

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
    public final int AKz(Integer num) {
        return AbstractC72046XLm.A03(num).AKz(num);
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        if (AbstractC72046XLm.A01(num) == 5) {
            return true;
        }
        return XPE.A00.AVw(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        return AbstractC72046XLm.A03(num).Em4(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        return AbstractC72046XLm.A03(num).Ema(num);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        EnumC72437Xdh enumC72437Xdh;
        float f;
        Integer num2;
        float f2;
        COS cos;
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 15.6f;
                num2 = C05F.A00;
                f2 = 0.09f;
                cos = new COS(1.0002f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 1:
                enumC72437Xdh = EnumC72437Xdh.A09;
                num2 = C05F.A0N;
                cos = new COS(1.0002f);
                f = 15.6f;
                f2 = 0.09f;
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 2:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 24.0f;
                num2 = C05F.A0C;
                f2 = 0.9f;
                cos = new COS(1.0001f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 3:
                enumC72437Xdh = EnumC72437Xdh.A09;
                num2 = C05F.A0C;
                cos = new COS(1.0001f);
                f = 24.0f;
                f2 = 0.9f;
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 4:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 17.1f;
                num2 = C05F.A0C;
                f2 = 0.43f;
                cos = new COS(1.0001f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 5:
                enumC72437Xdh = EnumC72437Xdh.A09;
                num2 = C05F.A00;
                cos = new COS(1.0001f);
                f = 13.5f;
                f2 = 0.0f;
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 6:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 13.0f;
                num2 = C05F.A0N;
                f2 = 0.0f;
                cos = new COS(1.0001f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 7:
                enumC72437Xdh = EnumC72437Xdh.A09;
                num2 = C05F.A01;
                cos = new COS(1.0001f);
                f = 15.2f;
                f2 = 0.3f;
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 8:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 13.5f;
                num2 = C05F.A01;
                f2 = 0.0f;
                cos = new COS(1.0001f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            case 9:
                enumC72437Xdh = EnumC72437Xdh.A09;
                f = 11.1f;
                num2 = C05F.A01;
                f2 = 0.44f;
                cos = new COS(1.0001f);
                return new CSN(cos, num2, enumC72437Xdh, f, f2);
            default:
                return XPD.A00.F8x(num);
        }
    }
}
