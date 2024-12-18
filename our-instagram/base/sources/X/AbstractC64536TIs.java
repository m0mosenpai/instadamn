package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.TIs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64536TIs implements Iterable, Serializable {
    public static final AbstractC64536TIs A01 = new RLN(AbstractC62394S9t.A05);
    public int A00 = 0;

    public final int A01() {
        RLN rln = (RLN) this;
        if (rln instanceof RLM) {
            return ((RLM) rln).A00;
        }
        return rln.A00.length;
    }

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C64761TSv(this);
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
            byte[] bArr = ((RLN) this).A00;
            i = A012;
            Charset charset = AbstractC62394S9t.A02;
            for (int i2 = 0; i2 < A012; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    public final String toString() {
        AbstractC64536TIs rlm;
        String concat;
        Locale locale = Locale.ROOT;
        String A0q = AbstractC58322PtE.A0q(this);
        int A012 = A01();
        Integer valueOf = Integer.valueOf(A012);
        if (A012 <= 50) {
            concat = S2U.A00(this);
        } else {
            RLN rln = (RLN) this;
            int A00 = A00(0, 47, rln.A01());
            if (A00 == 0) {
                rlm = A01;
            } else {
                rlm = new RLM(rln.A00, A00);
            }
            concat = S2U.A00(rlm).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A0q, valueOf, concat);
    }
}
