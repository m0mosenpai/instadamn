package X;

/* loaded from: classes11.dex */
public final class WXe implements C2W5 {
    public final C2W5 A00;
    public final boolean A01;
    public final float[] A02;

    @Override // X.C2W5
    public final C2W5 AnV(int i) {
        return this.A00.AnV(i);
    }

    @Override // X.C2W5
    public final int Ang() {
        return this.A00.Ang();
    }

    @Override // X.C2W5
    public final Object BMS() {
        return this.A00.BMS();
    }

    @Override // X.C2W5
    public final int Bat() {
        return this.A00.Bat();
    }

    @Override // X.C2W5
    public final int Bau() {
        return this.A00.Bau();
    }

    @Override // X.C2W5
    public final int Baw() {
        return this.A00.Baw();
    }

    @Override // X.C2W5
    public final int Bax() {
        return this.A00.Bax();
    }

    @Override // X.C2W5
    public final C2WC Bmi() {
        return this.A00.Bmi();
    }

    @Override // X.C2W5
    public final int CI4(int i) {
        return this.A00.CI4(i);
    }

    @Override // X.C2W5
    public final int CIb(int i) {
        return this.A00.CIb(i);
    }

    @Override // X.C2W5
    public final int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        float f = fArr[0];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        int round = height + Math.round(f);
        float f2 = fArr[3];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return round + Math.round(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (java.lang.Float.isNaN(r1) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (java.lang.Float.isNaN(r1) == false) goto L10;
     */
    @Override // X.C2W5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getWidth() {
        /*
            r5 = this;
            X.2W5 r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L36
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L36
        L15:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L2b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L2b
        L25:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L2b:
            r0 = 2
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L25
            r1 = 0
            goto L25
        L36:
            r0 = 1
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L15
            r1 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WXe.getWidth():int");
    }

    public WXe(C2W5 c2w5, float[] fArr, boolean z) {
        this.A00 = c2w5;
        this.A02 = fArr;
        this.A01 = z;
    }
}
