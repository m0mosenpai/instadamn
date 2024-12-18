package X;

import java.util.List;

/* renamed from: X.5NG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NG {
    public int A00;
    public C5NH A01;
    public Boolean A02;
    public String A03;
    public String A04 = "";
    public String A05 = "";
    public List A06;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1.equals(r0) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L44
            boolean r0 = r5 instanceof X.C5NG
            r2 = 0
            if (r0 == 0) goto L22
            X.5NG r5 = (X.C5NG) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L22
            X.5NH r1 = r4.A01
            X.5NH r0 = r5.A01
            if (r1 != r0) goto L22
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L23
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L26
        L22:
            return r2
        L23:
            if (r0 == 0) goto L26
            return r2
        L26:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L33
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            return r2
        L33:
            if (r0 == 0) goto L36
            return r2
        L36:
            java.util.List r1 = r4.A06
            java.util.List r0 = r5.A06
            if (r1 == 0) goto L41
            boolean r3 = r1.equals(r0)
            return r3
        L41:
            if (r0 == 0) goto L44
            r3 = 0
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5NG.equals(java.lang.Object):boolean");
    }

    public final String A00() {
        List list = this.A06;
        if (list != null && this.A00 < list.size()) {
            return (String) this.A06.get(this.A00);
        }
        return "";
    }

    public final void A01(int i) {
        List list = this.A06;
        if (list == null || i >= list.size()) {
            C0w9.A03("ReelAsset", "Invalid index specified for setSelectedIndex");
        }
        this.A00 = i;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C5NH c5nh = this.A01;
        int i4 = 0;
        if (c5nh != null) {
            i = c5nh.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        List list = this.A06;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.A04;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return ((i7 + i4) * 31) + this.A00;
    }
}
