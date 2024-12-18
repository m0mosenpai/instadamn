package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Arrays;

/* renamed from: X.6Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137076Il {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Constraints A05;
    public final /* synthetic */ C6IO A07;
    public C28373Cfb[] A06 = Xk4.A00;
    public int A04 = 1;

    public C137076Il(C6IO c6io) {
        this.A07 = c6io;
    }

    public final void A00(C6Ih c6Ih, C5BH c5bh, C19L c19l, int i, int i2, int i3) {
        C28373Cfb[] c28373CfbArr;
        C137056Ij c137056Ij;
        C28373Cfb[] c28373CfbArr2 = this.A06;
        int length = c28373CfbArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                C28373Cfb c28373Cfb = c28373CfbArr2[i4];
                if (c28373Cfb != null && c28373Cfb.A05) {
                    break;
                } else {
                    i4++;
                }
            } else {
                this.A03 = i;
                this.A02 = i2;
                break;
            }
        }
        int Bda = c6Ih.Bda();
        int length2 = this.A06.length;
        while (true) {
            c28373CfbArr = this.A06;
            if (Bda >= length2) {
                break;
            }
            C28373Cfb c28373Cfb2 = c28373CfbArr[Bda];
            if (c28373Cfb2 != null) {
                c28373Cfb2.A03();
            }
            Bda++;
        }
        if (c28373CfbArr.length != c6Ih.Bda()) {
            Object[] copyOf = Arrays.copyOf(this.A06, c6Ih.Bda());
            C14360o3.A07(copyOf);
            this.A06 = (C28373Cfb[]) copyOf;
        }
        this.A05 = new Constraints(c6Ih.AqS());
        this.A00 = i3;
        this.A01 = c6Ih.BL6();
        this.A04 = c6Ih.Bz0();
        int Bda2 = c6Ih.Bda();
        C6IO c6io = this.A07;
        for (int i5 = 0; i5 < Bda2; i5++) {
            Object BbK = c6Ih.BbK(i5);
            if ((BbK instanceof C137056Ij) && (c137056Ij = (C137056Ij) BbK) != null) {
                C28373Cfb c28373Cfb3 = this.A06[i5];
                if (c28373Cfb3 == null) {
                    c28373Cfb3 = new C28373Cfb(c5bh, new DGT(c6io, 16), c19l);
                    this.A06[i5] = c28373Cfb3;
                }
                c28373Cfb3.A03 = c137056Ij.A00;
            } else {
                C28373Cfb c28373Cfb4 = this.A06[i5];
                if (c28373Cfb4 != null) {
                    c28373Cfb4.A03();
                }
                this.A06[i5] = null;
            }
        }
    }
}
