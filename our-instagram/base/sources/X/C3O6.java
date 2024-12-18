package X;

/* renamed from: X.3O6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3O6 extends C3O7 {
    public int A00 = 0;
    public boolean A02 = true;
    public int A01 = 0;
    public boolean A03 = false;

    public final boolean A0e() {
        int i;
        EnumC56102hy enumC56102hy;
        EnumC56102hy enumC56102hy2;
        EnumC56102hy enumC56102hy3;
        boolean A0W;
        int i2 = 0;
        boolean z = true;
        while (true) {
            i = ((C3O7) this).A00;
            if (i2 >= i) {
                break;
            }
            C56082hw c56082hw = ((C3O7) this).A01[i2];
            if (this.A02 || c56082hw.A0V()) {
                int i3 = this.A00;
                if (i3 != 0 && i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        A0W = c56082hw.A0X();
                    }
                } else {
                    A0W = c56082hw.A0W();
                }
                if (!A0W) {
                    z = false;
                }
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < ((C3O7) this).A00; i5++) {
            C56082hw c56082hw2 = ((C3O7) this).A01[i5];
            if (this.A02 || c56082hw2.A0V()) {
                if (!z2) {
                    int i6 = this.A00;
                    if (i6 == 0) {
                        enumC56102hy3 = EnumC56102hy.LEFT;
                    } else if (i6 == 1) {
                        enumC56102hy3 = EnumC56102hy.RIGHT;
                    } else if (i6 == 2) {
                        enumC56102hy3 = EnumC56102hy.TOP;
                    } else {
                        if (i6 == 3) {
                            enumC56102hy3 = EnumC56102hy.BOTTOM;
                        }
                        z2 = true;
                    }
                    i4 = c56082hw2.A0A(enumC56102hy3).A00();
                    z2 = true;
                }
                int i7 = this.A00;
                if (i7 == 0) {
                    enumC56102hy2 = EnumC56102hy.LEFT;
                } else {
                    if (i7 == 1) {
                        enumC56102hy = EnumC56102hy.RIGHT;
                    } else if (i7 == 2) {
                        enumC56102hy2 = EnumC56102hy.TOP;
                    } else if (i7 == 3) {
                        enumC56102hy = EnumC56102hy.BOTTOM;
                    }
                    i4 = Math.max(i4, c56082hw2.A0A(enumC56102hy).A00());
                }
                i4 = Math.min(i4, c56082hw2.A0A(enumC56102hy2).A00());
            }
        }
        int i8 = i4 + this.A01;
        int i9 = this.A00;
        if (i9 != 0 && i9 != 1) {
            A0K(i8, i8);
        } else {
            A0J(i8, i8);
        }
        this.A03 = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015e, code lost:
    
        if (r1 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0157, code lost:
    
        if (r2 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        if (r0.A08() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
    
        if (r0.A08() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r1 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        r17 = 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    @Override // X.C56082hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.C56142i3 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3O6.A0O(X.2i3, boolean):void");
    }

    @Override // X.C56082hw
    public final boolean A0W() {
        return this.A03;
    }

    @Override // X.C56082hw
    public final boolean A0X() {
        return this.A03;
    }

    public final int A0d() {
        int i = this.A00;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // X.C56082hw
    public final String toString() {
        String A0g = AnonymousClass001.A0g("[Barrier] ", this.A0n, " {");
        for (int i = 0; i < ((C3O7) this).A00; i++) {
            C56082hw c56082hw = ((C3O7) this).A01[i];
            if (i > 0) {
                A0g = AnonymousClass001.A0R(A0g, ", ");
            }
            A0g = AnonymousClass001.A0R(A0g, c56082hw.A0n);
        }
        return AnonymousClass001.A0R(A0g, "}");
    }
}
