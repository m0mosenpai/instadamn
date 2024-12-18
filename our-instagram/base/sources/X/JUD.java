package X;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JUD implements Comparator {
    public final int A00;

    public JUD(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return AbstractC001800i.A0g(iterable, new JUD(i));
    }

    public static void A01(int i, List list) {
        C01T.A1D(list, new JUD(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x022c, code lost:
    
        if (r8.A05 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0242, code lost:
    
        if (r1.A05 == null) goto L55;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence, java.lang.String] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JUD.compare(java.lang.Object, java.lang.Object):int");
    }
}
