package X;

import com.facebook.R;

/* loaded from: classes10.dex */
public final class QIw extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public QIw(int i, int i2, int i3, int i4) {
        this.A00 = i4;
        switch (i4) {
            case 0:
            case 4:
                this.A02 = i;
                this.A03 = i2;
                this.A01 = i3;
                return;
            case 1:
            case 3:
                this.A01 = i;
                this.A02 = i2;
                this.A03 = i3;
                return;
            case 2:
            default:
                this.A02 = i;
                this.A01 = i2;
                this.A03 = i3;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 1: goto La;
                case 2: goto Le;
                case 3: goto L26;
                case 4: goto L44;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L65
            r1 = 1
            goto L29
        Le:
            if (r2 == r3) goto L65
            r1 = 2
            boolean r0 = r3 instanceof X.QIw
            if (r0 == 0) goto L63
            X.QIw r3 = (X.QIw) r3
            int r0 = r3.A00
            if (r0 != r1) goto L63
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L63
            int r1 = r2.A01
            int r0 = r3.A01
            goto L3d
        L26:
            if (r2 == r3) goto L65
            r1 = 3
        L29:
            boolean r0 = r3 instanceof X.QIw
            if (r0 == 0) goto L63
            X.QIw r3 = (X.QIw) r3
            int r0 = r3.A00
            if (r0 != r1) goto L63
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L63
            int r1 = r2.A02
            int r0 = r3.A02
        L3d:
            if (r1 != r0) goto L63
            int r1 = r2.A03
            int r0 = r3.A03
            goto L61
        L44:
            if (r2 == r3) goto L65
            r1 = 4
            boolean r0 = r3 instanceof X.QIw
            if (r0 == 0) goto L63
            X.QIw r3 = (X.QIw) r3
            int r0 = r3.A00
            if (r0 != r1) goto L63
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L63
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 != r0) goto L63
            int r1 = r2.A01
            int r0 = r3.A01
        L61:
            if (r1 == r0) goto L65
        L63:
            r0 = 0
            return r0
        L65:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QIw.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 1:
            case 3:
                i3 = this.A01 * 31;
                i4 = this.A02;
                i = (i3 + i4) * 31;
                i2 = this.A03;
                return i + i2;
            case 2:
                i3 = this.A02 * 31;
                i4 = this.A01;
                i = (i3 + i4) * 31;
                i2 = this.A03;
                return i + i2;
            case 4:
                i = ((this.A02 * 31) + this.A03) * 31;
                i2 = this.A01;
                return i + i2;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SavedState(firstVisiblePosition=");
        A1C.append(this.A01);
        A1C.append(", offsetX=");
        A1C.append(this.A02);
        A1C.append(", offsetY=");
        return AbstractC25236BEt.A0Z(A1C, this.A03);
    }

    public static int A00(Object obj, Object obj2) {
        C14360o3.A07(obj);
        return ((QIw) ((QKE) obj2).A02.A02).A01;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QIw() {
        this(R.drawable.instagram_error_pano_outline_24, 2131961889, 2131975768, 4);
        this.A00 = 4;
    }
}
