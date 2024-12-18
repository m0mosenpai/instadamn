package X;

/* renamed from: X.9BE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BE extends C0T6 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C9BE(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A04 = i;
        if (i != 0) {
            this.A03 = z;
            this.A01 = z2;
            this.A02 = z3;
            this.A00 = z4;
            this.A06 = z5;
            this.A07 = z6;
            this.A05 = z7;
            return;
        }
        this.A07 = z;
        this.A00 = z2;
        this.A03 = z3;
        this.A05 = z4;
        this.A01 = z5;
        this.A02 = z6;
        this.A06 = z7;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A04 != 0) {
            if (this != obj) {
                if (obj instanceof C9BE) {
                    C9BE c9be = (C9BE) obj;
                    if (c9be.A04 == 1 && this.A03 == c9be.A03 && this.A01 == c9be.A01 && this.A02 == c9be.A02 && this.A00 == c9be.A00 && this.A06 == c9be.A06 && this.A07 == c9be.A07) {
                        z = this.A05;
                        z2 = c9be.A05;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9BE)) {
                return false;
            }
            C9BE c9be2 = (C9BE) obj;
            if (c9be2.A04 != 0 || this.A07 != c9be2.A07 || this.A00 != c9be2.A00 || this.A03 != c9be2.A03 || this.A05 != c9be2.A05 || this.A01 != c9be2.A01 || this.A02 != c9be2.A02) {
                return false;
            }
            z = this.A06;
            z2 = c9be2.A06;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (this.A04 != 0) {
            int i2 = 1237;
            if (this.A03) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            int i4 = 1237;
            if (this.A01) {
                i4 = 1231;
            }
            int i5 = (i3 + i4) * 31;
            int i6 = 1237;
            if (this.A02) {
                i6 = 1231;
            }
            int i7 = (i5 + i6) * 31;
            int i8 = 1237;
            if (this.A00) {
                i8 = 1231;
            }
            int i9 = (i7 + i8) * 31;
            int i10 = 1237;
            if (this.A06) {
                i10 = 1231;
            }
            int i11 = (i9 + i10) * 31;
            int i12 = 1237;
            if (this.A07) {
                i12 = 1231;
            }
            i = (i11 + i12) * 31;
            z = this.A05;
        } else {
            int i13 = 1237;
            if (this.A07) {
                i13 = 1231;
            }
            int i14 = i13 * 31;
            int i15 = 1237;
            if (this.A00) {
                i15 = 1231;
            }
            int i16 = (i14 + i15) * 31;
            int i17 = 1237;
            if (this.A03) {
                i17 = 1231;
            }
            int i18 = (i16 + i17) * 31;
            int i19 = 1237;
            if (this.A05) {
                i19 = 1231;
            }
            int i20 = (i18 + i19) * 31;
            int i21 = 1237;
            if (this.A01) {
                i21 = 1231;
            }
            int i22 = (i20 + i21) * 31;
            int i23 = 1237;
            if (this.A02) {
                i23 = 1231;
            }
            i = (i22 + i23) * 31;
            z = this.A06;
        }
        int i24 = 1237;
        if (z) {
            i24 = 1231;
        }
        return i + i24;
    }

    public final String toString() {
        StringBuilder sb;
        boolean z;
        if (this.A04 != 0) {
            sb = new StringBuilder();
            sb.append("GlassesUIAttributes(isVisible=");
            sb.append(this.A03);
            sb.append(", isRightSide=");
            sb.append(this.A01);
            sb.append(", isStatusIndicatorExpanded=");
            sb.append(this.A02);
            sb.append(", isErrorHintMessageVisible=");
            sb.append(this.A00);
            sb.append(", isFirstTimeUserBottomSheetVisible=");
            sb.append(this.A06);
            sb.append(", isPermissionsDialogVisible=");
            sb.append(this.A07);
            sb.append(", deviceIsReadyToConnect=");
            z = this.A05;
        } else {
            sb = new StringBuilder();
            sb.append("CLNoticeEligibilityCacheStateKey(isUserPublic=");
            sb.append(this.A07);
            sb.append(", hasLinkedFb=");
            sb.append(this.A00);
            sb.append(", storyAutoXpostEnabled=");
            sb.append(this.A03);
            sb.append(", feedAutoXpostEnabled=");
            sb.append(this.A05);
            sb.append(", reelsCcpAutoXpostEnabled=");
            sb.append(this.A01);
            sb.append(", reelsXarAutoXpostEnabled=");
            sb.append(this.A02);
            sb.append(", isContentReshare=");
            z = this.A06;
        }
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9BE(int r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            r9 = r16
            r8 = r15
            r7 = r14
            r4 = r13
            r3 = r12
            r2 = 1
            r1 = r10
            r10.A04 = r2
            r0 = r11 & 1
            if (r0 == 0) goto Lf
            r3 = 0
        Lf:
            r0 = r11 & 2
            if (r0 == 0) goto L14
            r4 = 0
        L14:
            r5 = 0
            r0 = r11 & 16
            if (r0 == 0) goto L1a
            r7 = 0
        L1a:
            r0 = r11 & 32
            if (r0 == 0) goto L1f
            r8 = 0
        L1f:
            r0 = r11 & 64
            if (r0 == 0) goto L24
            r9 = 0
        L24:
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BE.<init>(int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
