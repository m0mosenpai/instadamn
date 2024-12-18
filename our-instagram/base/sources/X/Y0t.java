package X;

/* loaded from: classes12.dex */
public final class Y0t {
    public final AbstractC40081tZ A00;
    public final InterfaceC40591uS A01;

    public final void A01(AbstractC04050Jw[] abstractC04050JwArr, int i) {
        int i2 = 0;
        while (i > 0) {
            AbstractC40081tZ abstractC40081tZ = this.A00;
            int i3 = i;
            AbstractC41001v7 abstractC41001v7 = abstractC40081tZ.A02;
            if (abstractC41001v7 == null) {
                i3 = Math.min(i, abstractC40081tZ.A04);
            } else {
                int i4 = abstractC41001v7.A00;
                int i5 = i4 + i;
                int i6 = abstractC40081tZ.A04;
                if (i5 > i6) {
                    if (i4 < i6) {
                        i3 = i6 - i4;
                    } else {
                        int i7 = abstractC40081tZ.A03;
                        if (i7 <= i5) {
                            i3 = Math.max(1, i7 - i4);
                        }
                    }
                }
            }
            abstractC40081tZ.A05(abstractC04050JwArr, i2, i3);
            A00(this);
            i2 += i3;
            i -= i3;
        }
    }

    public static void A00(Y0t y0t) {
        InterfaceC40591uS interfaceC40591uS = y0t.A01;
        AbstractC40081tZ abstractC40081tZ = y0t.A00;
        interfaceC40591uS.EWx(abstractC40081tZ.A07());
        interfaceC40591uS.Ct6();
        AbstractC41001v7 abstractC41001v7 = abstractC40081tZ.A02;
        if (abstractC41001v7 != null && abstractC41001v7.A00 >= abstractC40081tZ.A04) {
            interfaceC40591uS.Ct2();
        }
        AbstractC41001v7 abstractC41001v72 = abstractC40081tZ.A02;
        if (abstractC41001v72 != null && abstractC41001v72.A00 >= abstractC40081tZ.A03) {
            abstractC40081tZ.A02();
        }
    }

    public Y0t(AbstractC40081tZ abstractC40081tZ, InterfaceC40591uS interfaceC40591uS) {
        this.A00 = abstractC40081tZ;
        this.A01 = interfaceC40591uS;
    }
}
