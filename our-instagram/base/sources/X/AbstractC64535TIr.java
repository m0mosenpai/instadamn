package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.TIr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64535TIr implements Iterable, Serializable {
    public static final AbstractC64535TIr A01 = new RZ1(SVC.A05);
    public int A00 = 0;

    public final int A00() {
        RZ1 rz1 = (RZ1) this;
        if (rz1 instanceof RZ0) {
            return ((RZ0) rz1).A00;
        }
        return rz1.A00.length;
    }

    public final AbstractC64535TIr A01(int i) {
        int i2;
        RZ1 rz1 = (RZ1) this;
        int A00 = rz1.A00();
        if ((i | i | (A00 - i)) < 0) {
            if (i < 0) {
                throw AbstractC25229BEm.A0l("Beginning index larger than ending index: ", ", ", 0, i);
            }
            throw AbstractC25229BEm.A0l("End index: ", " >= ", i, A00);
        }
        byte[] bArr = rz1.A00;
        if (rz1 instanceof RZ0) {
            i2 = ((RZ0) rz1).A01;
        } else {
            i2 = 0;
        }
        return new RZ0(bArr, i2, i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        if (i2 == 0) {
            int A00 = A00();
            RZ1 rz1 = (RZ1) this;
            byte[] bArr = rz1.A00;
            if (rz1 instanceof RZ0) {
                i = ((RZ0) rz1).A01;
            } else {
                i = 0;
            }
            i2 = A00;
            Charset charset = SVC.A04;
            for (int i3 = i; i3 < i + A00; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A00 = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new TT5(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A00 = A00();
        Integer valueOf = Integer.valueOf(A00);
        if (A00 <= 50) {
            A0R = AbstractC62237S3i.A00(this);
        } else {
            A0R = AnonymousClass001.A0R(AbstractC62237S3i.A00(A01(47)), "...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, A0R);
    }
}
