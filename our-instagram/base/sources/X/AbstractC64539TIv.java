package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.TIv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64539TIv implements Iterable, Serializable {
    public static final AbstractC64539TIv A01 = new ROE(AbstractC63328Shc.A05);
    public int A00 = 0;

    public abstract byte A02(int i);

    public abstract byte A03(int i);

    public final int A04() {
        return this.A00;
    }

    public abstract int A05();

    public abstract int A06(int i, int i2, int i3);

    public abstract AbstractC64539TIv A07(int i, int i2);

    public final String A08(Charset charset) {
        return A05() == 0 ? "" : A09(charset);
    }

    public abstract String A09(Charset charset);

    public abstract void A0A(SSM ssm);

    public abstract boolean A0B();

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new TT2(this);
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw AbstractC25229BEm.A0l("Beginning index larger than ending index: ", ", ", i, i2);
                }
                throw AbstractC25229BEm.A0l("End index: ", " >= ", i2, i3);
            }
            throw AbstractC58320PtC.A0q(i);
        }
        return i4;
    }

    public static ROE A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new ROE(AbstractC58319PtB.A1X(bArr, i2, i));
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A05 = A05();
            i = A06(A05, 0, A05);
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A05 = A05();
        Integer valueOf = Integer.valueOf(A05);
        if (A05 <= 50) {
            concat = AbstractC62222S2s.A00(this);
        } else {
            concat = AbstractC62222S2s.A00(A07(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, concat);
    }
}
