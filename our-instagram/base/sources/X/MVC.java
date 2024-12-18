package X;

import android.text.SpannableString;

/* loaded from: classes9.dex */
public final class MVC extends C0T6 {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MVC(String str, int i, int i2) {
        this((Integer) null, str, i, i2);
        this.A04 = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L2a;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L9b
            r1 = 2
            boolean r0 = r3 instanceof X.MVC
            if (r0 == 0) goto L28
            X.MVC r3 = (X.MVC) r3
            int r0 = r3.A04
            if (r0 != r1) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L28
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L28
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L90
        L28:
            r0 = 0
            return r0
        L2a:
            if (r2 == r3) goto L9b
            java.lang.Class r1 = r2.getClass()
            if (r3 == 0) goto L6a
            java.lang.Class r0 = r3.getClass()
        L36:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            r1 = 1
            boolean r0 = r3 instanceof X.MVC
            if (r0 == 0) goto L28
            X.MVC r3 = (X.MVC) r3
            int r0 = r3.A04
            if (r0 != r1) goto L28
            java.lang.Object r0 = r2.A02
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r3.A02
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L28
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L94
        L6a:
            r0 = 0
            goto L36
        L6c:
            if (r2 == r3) goto L9b
            r1 = 0
            boolean r0 = r3 instanceof X.MVC
            if (r0 == 0) goto L28
            X.MVC r3 = (X.MVC) r3
            int r0 = r3.A04
            if (r0 != r1) goto L28
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L28
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 == r0) goto L90
            goto L28
        L90:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L94:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9b
            goto L28
        L9b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVC.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L2f;
                default: goto L5;
            }
        L5:
            int r0 = r2.A01
            int r1 = r0 * 31
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
            int r1 = X.AbstractC166997dE.A0K(r0, r1)
        L14:
            java.lang.Object r0 = r2.A02
            if (r0 == 0) goto L4c
            int r0 = r0.hashCode()
        L1c:
            int r1 = r1 + r0
            return r1
        L1e:
            java.lang.String r0 = r2.A03
            int r1 = X.AbstractC166987dD.A0J(r0)
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            goto L14
        L2f:
            java.lang.Object r0 = r2.A02
            java.lang.String r0 = r0.toString()
            int r1 = X.AbstractC166987dD.A0J(r0)
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L4c
            int r0 = r0.hashCode()
            goto L1c
        L4c:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVC.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Text(text=");
        A1C.append(this.A02);
        A1C.append(", color=");
        A1C.append(this.A00);
        A1C.append(", style=");
        A1C.append(this.A01);
        A1C.append(", contentDescription=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }

    public MVC(SpannableString spannableString, String str, int i, int i2) {
        this.A04 = 1;
        this.A02 = spannableString;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
    }

    public MVC(Integer num, String str, int i, int i2) {
        this.A04 = 0;
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
    }

    public MVC() {
        this.A04 = 2;
        this.A04 = 2;
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = "";
        this.A02 = null;
    }
}
