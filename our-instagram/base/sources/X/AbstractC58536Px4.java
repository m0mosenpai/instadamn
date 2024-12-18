package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.Px4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58536Px4 implements Iterable, Serializable {
    public static final AbstractC58536Px4 A01 = new C58535Px3(AbstractC62398S9x.A05);
    public static final InterfaceC65432Tk3 A02;
    public int A00 = 0;

    public final int A02() {
        C58535Px3 c58535Px3 = (C58535Px3) this;
        if (c58535Px3 instanceof C60803RTo) {
            return ((C60803RTo) c58535Px3).A00;
        }
        return c58535Px3.A00.length;
    }

    public final AbstractC58536Px4 A03(int i) {
        C58535Px3 c58535Px3 = (C58535Px3) this;
        int A00 = A00(0, i, c58535Px3.A02());
        if (A00 == 0) {
            return A01;
        }
        return new C60803RTo(c58535Px3.A00, c58535Px3.A05(), A00);
    }

    public abstract boolean equals(Object o);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Tk3] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        if (AbstractC62372S8w.A00 != null && !AbstractC62372S8w.A01) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        A02 = r0;
    }

    public static int A00(int startIndex, int endIndex, int size) {
        int i = endIndex - startIndex;
        if ((startIndex | endIndex | i | (size - endIndex)) < 0) {
            if (startIndex >= 0) {
                if (endIndex < startIndex) {
                    throw new IndexOutOfBoundsException(AnonymousClass001.A02(startIndex, endIndex, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(AnonymousClass001.A02(endIndex, size, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(AnonymousClass001.A0c("Beginning index: ", " < 0", startIndex));
        }
        return i;
    }

    public static C58535Px3 A01(byte[] bytes, int offset, int size) {
        A00(offset, offset + size, bytes.length);
        return new C58535Px3(A02.AKv(bytes, offset, size));
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A022 = A02();
            C58535Px3 c58535Px3 = (C58535Px3) this;
            byte[] bArr = c58535Px3.A00;
            int A05 = c58535Px3.A05();
            i = A022;
            Charset charset = AbstractC62398S9x.A04;
            for (int i2 = A05; i2 < A05 + A022; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new TT5(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A022 = A02();
        Integer valueOf = Integer.valueOf(A022);
        if (A022 <= 50) {
            A0R = S3V.A00(this);
        } else {
            A0R = AnonymousClass001.A0R(S3V.A00(A03(47)), "...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, A0R);
    }

    public final byte[] A04() {
        int A022 = A02();
        if (A022 == 0) {
            return AbstractC62398S9x.A05;
        }
        byte[] bArr = new byte[A022];
        C58535Px3 c58535Px3 = (C58535Px3) this;
        if (c58535Px3 instanceof C60803RTo) {
            C60803RTo c60803RTo = (C60803RTo) c58535Px3;
            System.arraycopy(((C58535Px3) c60803RTo).A00, c60803RTo.A01, bArr, 0, A022);
            return bArr;
        }
        System.arraycopy(c58535Px3.A00, 0, bArr, 0, A022);
        return bArr;
    }
}
