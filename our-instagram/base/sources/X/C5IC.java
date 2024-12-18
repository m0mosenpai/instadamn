package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.5IC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IC {
    public final Collection A00;
    public final Collection A01;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L30
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.5IC r5 = (X.C5IC) r5
            java.util.Collection r1 = r4.A01
            java.util.Collection r0 = r5.A01
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            java.util.Collection r1 = r4.A00
            java.util.Collection r0 = r5.A00
            if (r1 == 0) goto L2d
            boolean r3 = r1.equals(r0)
            return r3
        L2d:
            if (r0 == 0) goto L30
            r3 = 0
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5IC.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        Collection collection = this.A01;
        int i2 = 0;
        if (collection != null) {
            i = collection.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Collection collection2 = this.A00;
        if (collection2 != null) {
            i2 = collection2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidationResult{validContent=");
        sb.append(this.A01);
        sb.append(", invalidatedContent=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C5IC(Collection collection, Collection collection2) {
        this.A01 = Collections.unmodifiableCollection(collection);
        this.A00 = Collections.unmodifiableCollection(collection2);
    }
}
