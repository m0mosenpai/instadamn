package X;

/* loaded from: classes11.dex */
public final class UQ7 extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UQ7(int r7) {
        /*
            r6 = this;
            r0 = r6
            r6.A04 = r7
            switch(r7) {
                case 6: goto L14;
                case 7: goto L10;
                default: goto L6;
            }
        L6:
            r1 = 0
            r3 = 0
            r5 = 8
        La:
            r2 = r1
            r4 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L10:
            r1 = 0
            r3 = 0
            r5 = 7
            goto La
        L14:
            r1 = -1
            r3 = 0
            r5 = 6
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ7.<init>(int):void");
    }

    public final float A00(UQ7 uq7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = uq7.A02;
        int i6 = uq7.A01;
        if (i5 - i6 != 0) {
            int i7 = uq7.A00;
            int i8 = uq7.A03;
            if (i7 - i8 != 0 && (i = this.A01) < i5 && i6 < (i2 = this.A02) && (i3 = this.A03) < i7 && i8 < (i4 = this.A00)) {
                if (i < i6) {
                    i = i6;
                }
                if (i3 < i8) {
                    i3 = i8;
                }
                if (i2 <= i5) {
                    i5 = i2;
                }
                if (i4 <= i7) {
                    i7 = i4;
                }
                return ((i5 - i) * (i7 - i3)) / ((i2 - i) * (i4 - i3));
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto La;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto Le;
                case 5: goto L12;
                case 6: goto L36;
                case 7: goto L54;
                case 8: goto L78;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto La0
            r1 = 0
            goto L7c
        Le:
            if (r2 == r3) goto La0
            r1 = 4
            goto L39
        L12:
            if (r2 == r3) goto La0
            r1 = 5
            boolean r0 = r3 instanceof X.UQ7
            if (r0 == 0) goto L9e
            X.UQ7 r3 = (X.UQ7) r3
            int r0 = r3.A04
            if (r0 != r1) goto L9e
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L9e
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 != r0) goto L9e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L9e
            int r1 = r2.A02
            int r0 = r3.A02
            goto L9c
        L36:
            if (r2 == r3) goto La0
            r1 = 6
        L39:
            boolean r0 = r3 instanceof X.UQ7
            if (r0 == 0) goto L9e
            X.UQ7 r3 = (X.UQ7) r3
            int r0 = r3.A04
            if (r0 != r1) goto L9e
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L9e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L9e
            int r1 = r2.A03
            int r0 = r3.A03
            goto L96
        L54:
            if (r2 == r3) goto La0
            r1 = 7
            boolean r0 = r3 instanceof X.UQ7
            if (r0 == 0) goto L9e
            X.UQ7 r3 = (X.UQ7) r3
            int r0 = r3.A04
            if (r0 != r1) goto L9e
            int r1 = r2.A02
            int r0 = r3.A02
            if (r1 != r0) goto L9e
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L9e
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 != r0) goto L9e
            int r1 = r2.A01
            int r0 = r3.A01
            goto L9c
        L78:
            if (r2 == r3) goto La0
            r1 = 8
        L7c:
            boolean r0 = r3 instanceof X.UQ7
            if (r0 == 0) goto L9e
            X.UQ7 r3 = (X.UQ7) r3
            int r0 = r3.A04
            if (r0 != r1) goto L9e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L9e
            int r1 = r2.A03
            int r0 = r3.A03
            if (r1 != r0) goto L9e
            int r1 = r2.A02
            int r0 = r3.A02
        L96:
            if (r1 != r0) goto L9e
            int r1 = r2.A00
            int r0 = r3.A00
        L9c:
            if (r1 == r0) goto La0
        L9e:
            r0 = 0
            return r0
        La0:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ7.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A04) {
            case 0:
            case 8:
                i3 = ((this.A01 * 31) + this.A03) * 31;
                i4 = this.A02;
                i = (i3 + i4) * 31;
                i2 = this.A00;
                return i + i2;
            case 1:
            case 2:
            case 3:
            default:
                return super.hashCode();
            case 4:
            case 6:
                i3 = ((this.A02 * 31) + this.A01) * 31;
                i4 = this.A03;
                i = (i3 + i4) * 31;
                i2 = this.A00;
                return i + i2;
            case 5:
                i = ((((this.A00 * 31) + this.A03) * 31) + this.A01) * 31;
                i2 = this.A02;
                return i + i2;
            case 7:
                i = ((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31;
                i2 = this.A01;
                return i + i2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder sb;
        int i;
        String str;
        switch (this.A04) {
            case 0:
                sb = new StringBuilder();
                sb.append("ImmutableRect(left=");
                sb.append(this.A01);
                sb.append(", top=");
                sb.append(this.A03);
                sb.append(", right=");
                sb.append(this.A02);
                str = ", bottom=";
                sb.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(sb, i);
            case 6:
                sb = new StringBuilder();
                sb.append("RtcViewMeasurements(systemTopInset=");
                sb.append(this.A02);
                sb.append(MSV.A00(641));
                sb.append(this.A01);
                sb.append(", topControlsVisibleHeight=");
                sb.append(this.A03);
                str = ", bottomControlsVisibleHeight=";
                sb.append(str);
                i = this.A00;
                return AbstractC25236BEt.A0Z(sb, i);
            case 7:
                sb = new StringBuilder();
                sb.append("VOffset(topHeightPx=");
                sb.append(this.A02);
                sb.append(", bottomHeightPx=");
                sb.append(this.A00);
                sb.append(", topOffsetPx=");
                sb.append(this.A03);
                sb.append(", bottomOffsetPx=");
                i = this.A01;
                return AbstractC25236BEt.A0Z(sb, i);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public UQ7(int i, int i2, int i3, int i4, int i5) {
        this.A04 = i5;
        switch (i5) {
            case 0:
            case 8:
                this.A01 = i;
                this.A03 = i2;
                this.A02 = i3;
                this.A00 = i4;
                return;
            case 1:
                this.A01 = i;
                this.A00 = i2;
                this.A02 = i3;
                this.A03 = i4;
                return;
            case 2:
                this.A02 = i;
                this.A03 = i2;
                this.A01 = i3;
                this.A00 = i4;
                return;
            case 3:
                this.A01 = i;
                this.A02 = i2;
                this.A00 = i3;
                this.A03 = i4;
                return;
            case 4:
            case 6:
                this.A02 = i;
                this.A01 = i2;
                this.A03 = i3;
                this.A00 = i4;
                return;
            case 5:
                this.A00 = i;
                this.A03 = i2;
                this.A01 = i3;
                this.A02 = i4;
                return;
            case 7:
            default:
                this.A02 = i;
                this.A00 = i2;
                this.A03 = i3;
                this.A01 = i4;
                return;
        }
    }
}
