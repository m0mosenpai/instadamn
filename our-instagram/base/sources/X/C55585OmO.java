package X;

/* renamed from: X.OmO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55585OmO implements InterfaceC65452xh {
    public int A00;
    public int A02;
    public int A04;
    public final InterfaceC58162PqR A05;
    public final InterfaceC58162PqR A06;
    public final InterfaceC65452xh A07;
    public int A03 = 1;
    public int A01 = 1;

    public C55585OmO(InterfaceC58162PqR interfaceC58162PqR, InterfaceC58162PqR interfaceC58162PqR2, InterfaceC65452xh interfaceC65452xh) {
        this.A06 = interfaceC58162PqR;
        this.A05 = interfaceC58162PqR2;
        this.A07 = interfaceC65452xh;
        this.A02 = interfaceC58162PqR.Bdd();
        this.A00 = interfaceC58162PqR.Bdc();
        this.A04 = interfaceC58162PqR.C0r();
    }

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
        this.A07.D2j(i + this.A02, i2, obj);
    }

    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
        if (i >= this.A04 && this.A01 != 2) {
            int min = Math.min(i2, this.A00);
            if (min > 0) {
                this.A01 = 3;
                this.A07.D2j(this.A02 + i, min, EnumC53108NeL.PLACEHOLDER_TO_ITEM);
                this.A00 -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.A07.DMJ(i + min + this.A02, i3);
            }
        } else if (i <= 0 && this.A03 != 2) {
            int i4 = this.A02;
            int min2 = Math.min(i2, i4);
            if (min2 > 0) {
                this.A03 = 3;
                this.A07.D2j((-min2) + i4, min2, EnumC53108NeL.PLACEHOLDER_TO_ITEM);
                i4 = this.A02 - min2;
                this.A02 = i4;
            }
            int i5 = i2 - min2;
            if (i5 > 0) {
                this.A07.DMJ(i4, i5);
            }
        } else {
            this.A07.DMJ(i + this.A02, i2);
        }
        this.A04 += i2;
    }

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
        InterfaceC65452xh interfaceC65452xh = this.A07;
        int i3 = this.A02;
        interfaceC65452xh.DTy(i + i3, i2 + i3);
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
        if (i + i2 >= this.A04 && this.A01 != 3) {
            int min = Math.min(this.A05.Bdc() - this.A00, i2);
            if (min < 0) {
                min = 0;
            }
            int i3 = i2 - min;
            if (min > 0) {
                this.A01 = 2;
                this.A07.D2j(this.A02 + i, min, EnumC53108NeL.ITEM_TO_PLACEHOLDER);
                this.A00 += min;
            }
            if (i3 > 0) {
                this.A07.DfC(i + min + this.A02, i3);
            }
        } else if (i <= 0 && this.A03 != 3) {
            int Bdd = this.A05.Bdd();
            int i4 = this.A02;
            int min2 = Math.min(Bdd - i4, i2);
            if (min2 < 0) {
                min2 = 0;
            }
            int i5 = i2 - min2;
            if (i5 > 0) {
                this.A07.DfC(i4, i5);
            }
            if (min2 > 0) {
                this.A03 = 2;
                this.A07.D2j(this.A02, min2, EnumC53108NeL.ITEM_TO_PLACEHOLDER);
                this.A02 += min2;
            }
        } else {
            this.A07.DfC(i + this.A02, i2);
        }
        this.A04 -= i2;
    }
}
