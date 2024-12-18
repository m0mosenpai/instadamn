package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.Cfi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28379Cfi {
    public static final float A00(InterfaceC30923Dia interfaceC30923Dia, Integer num) {
        C14360o3.A0B(num, 1);
        EnumC191908em A03 = A03(interfaceC30923Dia);
        C14360o3.A0B(A03, 0);
        return XPC.A00(A03).Ema(num);
    }

    public static InterfaceC31072DlE A02(InterfaceC30923Dia interfaceC30923Dia) {
        EnumC191908em A03 = A03(interfaceC30923Dia);
        C14360o3.A0B(A03, 0);
        return XPC.A00(A03);
    }

    public static final EnumC191908em A03(InterfaceC30923Dia interfaceC30923Dia) {
        C26088BgY c26088BgY;
        EnumC191908em enumC191908em;
        C14360o3.A0B(interfaceC30923Dia, 0);
        if (!(interfaceC30923Dia instanceof C26088BgY) || (c26088BgY = (C26088BgY) interfaceC30923Dia) == null || (enumC191908em = c26088BgY.A00) == null) {
            return EnumC191908em.A04;
        }
        return enumC191908em;
    }

    public static final int A01(EnumC72394Xcg enumC72394Xcg, InterfaceC30923Dia interfaceC30923Dia) {
        AbstractC167017dG.A1N(interfaceC30923Dia, enumC72394Xcg);
        EnumC191908em A03 = A03(interfaceC30923Dia);
        C14360o3.A0B(A03, 0);
        ColorData AIU = XPC.A00(A03).AIU(enumC72394Xcg);
        if (AIU != null) {
            if (interfaceC30923Dia.CSM()) {
                return AIU.A00;
            }
            return AIU.A01;
        }
        return -1;
    }
}
