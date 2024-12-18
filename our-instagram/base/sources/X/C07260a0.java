package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07260a0 implements Comparable {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public final int A04;
    public final int A05;
    public final int A06;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L5e
            r2 = 0
            if (r5 == 0) goto L26
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L26
            X.0a0 r5 = (X.C07260a0) r5
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L26
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L26
            java.util.List r1 = r4.A02
            java.util.List r0 = r5.A02
            if (r1 != 0) goto L27
            if (r0 == 0) goto L2e
        L26:
            return r2
        L27:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            return r2
        L2e:
            java.util.List r1 = r4.A03
            java.util.List r0 = r5.A03
            if (r1 != 0) goto L37
            if (r0 == 0) goto L3e
            return r2
        L37:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            return r2
        L3e:
            java.util.List r1 = r4.A00
            java.util.List r0 = r5.A00
            if (r1 != 0) goto L47
            if (r0 == 0) goto L4e
            return r2
        L47:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4e
            return r2
        L4e:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 != 0) goto L57
            if (r0 == 0) goto L5e
            return r2
        L57:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            return r2
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07260a0.equals(java.lang.Object):boolean");
    }

    public final void A00() {
        int size;
        int i = this.A06;
        if (i != -1) {
            List list = this.A02;
            int i2 = 0;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            int i3 = i - size;
            List list2 = this.A00;
            if (list2 != null) {
                i2 = list2.size();
            }
            A01("qpl_internal__lost_annotation_count", i3 - i2);
        }
    }

    public final void A01(String str, int i) {
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        list.add(str);
        this.A01.add(Integer.valueOf(i));
    }

    public final void A02(String str, String str2) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        if (this.A03 == null) {
            this.A03 = new ArrayList();
        }
        list.add(str);
        this.A03.add(str2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C07260a0 c07260a0 = (C07260a0) obj;
        int i = this.A05;
        int i2 = c07260a0.A05;
        if (i == i2 && (i = this.A04) == (i2 = c07260a0.A04)) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        int i = ((217 + this.A05) * 31) + this.A04;
        List list = this.A02;
        if (list != null) {
            i = (i * 31) + list.hashCode();
        }
        List list2 = this.A03;
        if (list2 != null) {
            i = (i * 31) + list2.hashCode();
        }
        List list3 = this.A00;
        if (list3 != null) {
            i = (i * 31) + list3.hashCode();
        }
        List list4 = this.A01;
        if (list4 != null) {
            return (i * 31) + list4.hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarkerRecord{markerId=");
        sb.append(this.A05);
        sb.append(", instanceKey=");
        sb.append(this.A04);
        sb.append(", strAnnotationKeys=");
        sb.append(this.A02);
        sb.append(", strAnnotationValues=");
        sb.append(this.A03);
        sb.append(", intAnnotationKeys=");
        sb.append(this.A00);
        sb.append(", intAnnotationValues=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C07260a0(int i, int i2, int i3) {
        this.A05 = i;
        this.A04 = i2;
        this.A06 = i3;
    }
}
