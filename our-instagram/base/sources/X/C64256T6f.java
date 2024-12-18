package X;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.T6f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64256T6f implements InterfaceC65599Tno {
    public final ROC A00;

    @Override // X.InterfaceC65599Tno
    public final void FFK(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int A01 = AbstractC31176DnK.A01(list, i4);
                i3 += ROC.A00((A01 >> 31) ^ (A01 + A01));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                int A012 = AbstractC31176DnK.A01(list, i2);
                A00.A0D((A012 >> 31) ^ (A012 + A012));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            ROC roc = this.A00;
            int A013 = AbstractC31176DnK.A01(list, i2);
            roc.A0H(i, (A013 >> 31) ^ (A013 + A013));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FFR(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ROC.A00(AbstractC31176DnK.A01(list, i4));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0D(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0H(i, AbstractC31176DnK.A01(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FFT(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ROC.A01(AbstractC58320PtC.A0A(list, i4));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0N(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0J(i, AbstractC58320PtC.A0A(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FG2(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3++;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0A(AbstractC166987dD.A1a(list.get(i2)) ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0L(i, AbstractC166987dD.A1a(list.get(i2)));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGE(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A00.A0O((AbstractC64539TIv) list.get(i2), i);
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGU(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0M(AbstractC58320PtC.A09(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0I(i, AbstractC58320PtC.A09(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGi(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ROC.A01(AbstractC31176DnK.A01(list, i4));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0C(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0F(i, AbstractC31176DnK.A01(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGo(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0B(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0E(i, AbstractC31176DnK.A01(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGr(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0M(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0I(i, AbstractC58320PtC.A0A(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGu(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0B(Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2)));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0E(i, Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2)));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGx(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ROC.A01(AbstractC31176DnK.A01(list, i4));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0C(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0F(i, AbstractC31176DnK.A01(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FGz(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ROC.A01(AbstractC58320PtC.A0A(list, i4));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0N(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0J(i, AbstractC58320PtC.A0A(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FH3(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0B(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0E(i, AbstractC31176DnK.A01(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FH6(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                A00.A0M(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0I(i, AbstractC58320PtC.A0A(list, i2));
            i2++;
        }
    }

    public static ROC A00(C64256T6f c64256T6f, int i) {
        ROC roc = c64256T6f.A00;
        roc.A0G(i, 2);
        return roc;
    }

    public static C64256T6f A01(ROC roc) {
        C64256T6f c64256T6f = roc.A01;
        if (c64256T6f == null) {
            return new C64256T6f(roc);
        }
        return c64256T6f;
    }

    @Override // X.InterfaceC65599Tno
    public final void FFJ(int i, int i2) {
        this.A00.A0H(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // X.InterfaceC65599Tno
    public final void FFL(int i, long j) {
        ROC roc = this.A00;
        roc.A0J(i, (j >> 63) ^ (j + j));
    }

    @Override // X.InterfaceC65599Tno
    public final void FFM(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            ROC A00 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long A0A = AbstractC58320PtC.A0A(list, i4);
                i3 += ROC.A01((A0A >> 63) ^ (A0A + A0A));
            }
            A00.A0D(i3);
            while (i2 < list.size()) {
                long A0A2 = AbstractC58320PtC.A0A(list, i2);
                A00.A0N((A0A2 >> 63) ^ (A0A2 + A0A2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            ROC roc = this.A00;
            long A0A3 = AbstractC58320PtC.A0A(list, i2);
            roc.A0J(i, (A0A3 >> 63) ^ (A0A3 + A0A3));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    @Deprecated
    public final void FFN(int i) {
        this.A00.A0G(i, 3);
    }

    @Override // X.InterfaceC65599Tno
    public final void FFO(int i, String str) {
        this.A00.A0K(i, str);
    }

    @Override // X.InterfaceC65599Tno
    public final void FFP(int i, List list) {
        int i2 = 0;
        if (list instanceof InterfaceC65685Ts7) {
            InterfaceC65685Ts7 interfaceC65685Ts7 = (InterfaceC65685Ts7) list;
            while (i2 < list.size()) {
                Object FGK = interfaceC65685Ts7.FGK(i2);
                boolean z = FGK instanceof String;
                ROC roc = this.A00;
                if (z) {
                    roc.A0K(i, (String) FGK);
                } else {
                    roc.A0O((AbstractC64539TIv) FGK, i);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0K(i, AbstractC25226BEj.A1I(list, i2));
            i2++;
        }
    }

    @Override // X.InterfaceC65599Tno
    public final void FFQ(int i, int i2) {
        this.A00.A0H(i, i2);
    }

    @Override // X.InterfaceC65599Tno
    public final void FFS(int i, long j) {
        this.A00.A0J(i, j);
    }

    @Override // X.InterfaceC65599Tno
    public final void FFs(int i, boolean z) {
        this.A00.A0L(i, z);
    }

    @Override // X.InterfaceC65599Tno
    public final void FG9(AbstractC64539TIv abstractC64539TIv, int i) {
        this.A00.A0O(abstractC64539TIv, i);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGL(int i, double d) {
        this.A00.A0I(i, Double.doubleToRawLongBits(d));
    }

    @Override // X.InterfaceC65599Tno
    @Deprecated
    public final void FGX(int i) {
        this.A00.A0G(i, 4);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGc(int i, int i2) {
        this.A00.A0F(i, i2);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGk(int i, int i2) {
        this.A00.A0E(i, i2);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGq(int i, long j) {
        this.A00.A0I(i, j);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGt(int i, float f) {
        this.A00.A0E(i, Float.floatToRawIntBits(f));
    }

    @Override // X.InterfaceC65599Tno
    public final void FGv(InterfaceC65591TnW interfaceC65591TnW, Object obj, int i) {
        ROC roc = this.A00;
        roc.A0G(i, 3);
        interfaceC65591TnW.FGe(roc.A01, obj);
        roc.A0G(i, 4);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGw(int i, int i2) {
        this.A00.A0F(i, i2);
    }

    @Override // X.InterfaceC65599Tno
    public final void FGy(int i, long j) {
        this.A00.A0J(i, j);
    }

    @Override // X.InterfaceC65599Tno
    public final void FH1(InterfaceC65591TnW interfaceC65591TnW, Object obj, int i) {
        InterfaceC65665Tqv interfaceC65665Tqv = (InterfaceC65665Tqv) obj;
        ROC roc = this.A00;
        roc.A0D((i << 3) | 2);
        roc.A0D(((AbstractC64251T6a) interfaceC65665Tqv).A0I(interfaceC65591TnW));
        interfaceC65591TnW.FGe(roc.A01, interfaceC65665Tqv);
    }

    @Override // X.InterfaceC65599Tno
    public final void FH2(int i, int i2) {
        this.A00.A0E(i, i2);
    }

    @Override // X.InterfaceC65599Tno
    public final void FH5(int i, long j) {
        this.A00.A0I(i, j);
    }

    public C64256T6f(ROC roc) {
        Charset charset = AbstractC63328Shc.A02;
        this.A00 = roc;
        roc.A01 = this;
    }
}
