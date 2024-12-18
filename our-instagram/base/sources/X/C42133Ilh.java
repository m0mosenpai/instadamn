package X;

/* renamed from: X.Ilh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42133Ilh implements InterfaceC23511Cn {
    public final int A00;
    public final Object A01;

    public C42133Ilh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC23511Cn
    public final void EpC(C11R c11r) {
        int i;
        boolean z;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c11r, 0);
                i = 5;
                z = true;
                i2 = ((C42194Img) this.A01).A00;
                i3 = 1829080448;
                break;
            case 1:
                C14360o3.A0B(c11r, 0);
                C42196Imi c42196Imi = (C42196Imi) this.A01;
                i = 5;
                if (c42196Imi.A03) {
                    i = 1;
                }
                z = true;
                i2 = c42196Imi.A00;
                i3 = 607231408;
                break;
            default:
                i2 = 0;
                C14360o3.A0B(c11r, 0);
                AbstractC42195Imh abstractC42195Imh = (AbstractC42195Imh) this.A01;
                if (abstractC42195Imh instanceof Hc7) {
                    i3 = 1812936113;
                } else if (abstractC42195Imh instanceof C39480Hc6) {
                    i3 = 611258025;
                } else if (abstractC42195Imh instanceof C39479Hc5) {
                    i3 = 1896466993;
                } else if (abstractC42195Imh instanceof C39478Hc4) {
                    i3 = 1201242664;
                } else if (!(abstractC42195Imh instanceof C39482HcA) && !(abstractC42195Imh instanceof Hc9)) {
                    if (abstractC42195Imh instanceof C39477Hc3) {
                        i3 = 2108339649;
                    } else if (abstractC42195Imh instanceof C39476Hc2) {
                        i3 = 802726432;
                    } else if (abstractC42195Imh instanceof C39481Hc8) {
                        i3 = 2131697699;
                    } else {
                        i3 = 1236399;
                    }
                } else {
                    i3 = 1332375112;
                }
                i = 3;
                z = true;
                break;
        }
        C1GJ.A05(c11r, i3, i, i2, z, z);
    }
}
