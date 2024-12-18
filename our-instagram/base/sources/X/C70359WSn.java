package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WSn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70359WSn implements InterfaceC71840X6y {
    public final List A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static List A00(C70359WSn c70359WSn, C69599Vs2 c69599Vs2) {
        boolean z;
        String str;
        int i;
        WFa wFa = new WFa(c69599Vs2.A04);
        ?? r9 = c70359WSn.A00;
        while (wFa.A00 - wFa.A01 > 0) {
            int A05 = wFa.A05();
            int A052 = wFa.A01 + wFa.A05();
            if (A05 == 134) {
                r9 = new ArrayList();
                int A053 = wFa.A05() & 31;
                for (int i2 = 0; i2 < A053; i2++) {
                    String A0I = wFa.A0I(AbstractC50482Ts.A05, 3);
                    int A054 = wFa.A05();
                    boolean z2 = true;
                    if ((A054 & 128) != 0) {
                        z = true;
                        i = A054 & 63;
                        str = "application/cea-708";
                    } else {
                        z = false;
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A055 = (byte) wFa.A05();
                    wFa.A0P(1);
                    List list = null;
                    if (z) {
                        if ((A055 & 64) == 0) {
                            z2 = false;
                        }
                        byte[] bArr = new byte[1];
                        if (z2) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        list = Collections.singletonList(bArr);
                    }
                    C70116W4o c70116W4o = new C70116W4o();
                    c70116W4o.A00(str);
                    c70116W4o.A0V = A0I;
                    c70116W4o.A02 = i;
                    c70116W4o.A0X = list;
                    r9.add(new C70130W5r(c70116W4o));
                }
            }
            wFa.A0O(A052);
            r9 = r9;
        }
        return r9;
    }

    public C70359WSn(List list) {
        this.A00 = list;
    }

    public C70359WSn() {
        this(ImmutableList.of());
    }
}
