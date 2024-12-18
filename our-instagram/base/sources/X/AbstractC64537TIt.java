package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.TIt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64537TIt implements Iterable, Serializable {
    public static final AbstractC64537TIt A01 = new RMJ(AbstractC62395S9u.A05);
    public int A00 = 0;

    public static RMJ A01(byte[] bArr, int i) {
        A00(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new RMJ(bArr2);
    }

    public final int A02() {
        RMJ rmj = (RMJ) this;
        if (rmj instanceof RMI) {
            return ((RMI) rmj).A01;
        }
        return rmj.A00.length;
    }

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C64762TSw(this);
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

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        if (i2 == 0) {
            int A02 = A02();
            i2 = A02;
            RMJ rmj = (RMJ) this;
            if (rmj instanceof RMI) {
                i = ((RMI) rmj).A00;
            } else {
                i = 0;
            }
            Charset charset = AbstractC62395S9u.A02;
            for (int i3 = i; i3 < i + A02; i3++) {
                i2 = (i2 * 31) + rmj.A00[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A00 = i2;
        }
        return i2;
    }

    public final String toString() {
        int i;
        AbstractC64537TIt rmi;
        String concat;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A02 = A02();
        Integer valueOf = Integer.valueOf(A02);
        if (A02 <= 50) {
            concat = AbstractC62206S2b.A00(this);
        } else {
            RMJ rmj = (RMJ) this;
            int A00 = A00(0, 47, rmj.A02());
            if (A00 == 0) {
                rmi = A01;
            } else {
                byte[] bArr = rmj.A00;
                if (rmj instanceof RMI) {
                    i = ((RMI) rmj).A00;
                } else {
                    i = 0;
                }
                rmi = new RMI(bArr, i, A00);
            }
            concat = AbstractC62206S2b.A00(rmi).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, concat);
    }

    public final byte[] A03() {
        int A02 = A02();
        if (A02 == 0) {
            return AbstractC62395S9u.A05;
        }
        byte[] bArr = new byte[A02];
        RMJ rmj = (RMJ) this;
        if (rmj instanceof RMI) {
            RMI rmi = (RMI) rmj;
            System.arraycopy(((RMJ) rmi).A00, rmi.A00, bArr, 0, A02);
            return bArr;
        }
        System.arraycopy(rmj.A00, 0, bArr, 0, A02);
        return bArr;
    }
}
