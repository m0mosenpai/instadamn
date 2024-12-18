package X;

/* renamed from: X.58g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1129758g {
    public boolean A00;
    public final C18590vm A01;
    public final C57S A02;

    public static final void A00(C1129758g c1129758g) {
        c1129758g.A01.A08();
        int i = 0;
        c1129758g.A00 = false;
        C57S c57s = c1129758g.A02;
        int i2 = c57s.A00;
        if (i2 > 0) {
            Object[] objArr = c57s.A02;
            do {
                ((InterfaceC16820sZ) objArr[i]).invoke();
                i++;
            } while (i < i2);
        }
        c57s.A01();
    }

    public static final void A01(C1129758g c1129758g) {
        C18590vm c18590vm = c1129758g.A01;
        Object[] objArr = c18590vm.A03;
        long[] jArr = c18590vm.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C58Z c58z = (C58Z) objArr[(i << 3) + i3];
                            EnumC118935aA enumC118935aA = (EnumC118935aA) C5EJ.A00(c58z).A01.A03(c58z);
                            if (enumC118935aA != null) {
                                c58z.A00 = enumC118935aA;
                            } else {
                                AbstractC28290Cdc.A02("committing a node that was not updated in the current transaction");
                                throw C00O.createAndThrow();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c18590vm.A08();
        c1129758g.A00 = false;
        c1129758g.A02.A01();
    }

    public C1129758g() {
        long[] jArr = AbstractC004701m.A00;
        this.A01 = new C18590vm(6);
        this.A02 = new C57S(new InterfaceC16820sZ[16]);
    }
}
