package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: X.PuR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58387PuR implements Iterable, Serializable {
    public static final InterfaceC65298ThW A01;
    public static final AbstractC58387PuR A02 = new C58386PuQ(AbstractC58376PuG.A04);
    public int A00 = 0;

    public final int A01() {
        C58386PuQ c58386PuQ = (C58386PuQ) this;
        if (c58386PuQ instanceof Q7M) {
            return ((Q7M) c58386PuQ).A00;
        }
        return c58386PuQ.A00.length;
    }

    public abstract boolean equals(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ThW] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        if (AbstractC58393PuX.A00 != null && !AbstractC58393PuX.A01) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        A01 = r0;
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
        int i = this.A00;
        if (i == 0) {
            int A012 = A01();
            C58386PuQ c58386PuQ = (C58386PuQ) this;
            byte[] bArr = c58386PuQ.A00;
            int A022 = c58386PuQ.A02();
            i = A012;
            Charset charset = AbstractC58376PuG.A03;
            for (int i2 = A022; i2 < A022 + A012; i2++) {
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
        return String.format("<ByteString@%s size=%d>", AbstractC25228BEl.A1Z(AbstractC58322PtE.A0q(this), A01()));
    }
}
