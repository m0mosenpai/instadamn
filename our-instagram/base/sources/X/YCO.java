package X;

/* loaded from: classes12.dex */
public abstract class YCO implements YOu {
    public int A00 = 0;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;

    public final void A05(int i) {
        this.A03 = false;
        this.A00 = i;
        this.A04 = true;
    }

    public final void A06(int i, Object obj) {
        this.A03 = false;
        this.A00 = i;
        this.A02 = obj;
    }

    @Override // X.YOu
    public final C72865XpU EKx() {
        this.A03 = true;
        return Csq(null);
    }

    public static void A00(YCO yco, InterfaceC73605YNu interfaceC73605YNu, int i) {
        yco.A06(i, new YD5(interfaceC73605YNu));
    }

    public static void A01(YCO yco, Object obj, int i) {
        yco.A06(i, new YD4(obj));
    }

    public static void A02(YD8 yd8, Object obj) {
        yd8.A02.A00(new YD4(obj));
        yd8.A03.A00(null);
    }

    public static void A03(YD6 yd6, Class cls, int i) {
        YD9 yd9 = new YD9(cls);
        C72863XpS c72863XpS = yd6.A01;
        c72863XpS.A00.put(Integer.valueOf(i), yd9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x013b, code lost:
    
        if (r4 != 200) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0155, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0141, code lost:
    
        if (r4 != (-1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0a80, code lost:
    
        if (r0.A01 != false) goto L526;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:146:0x007b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0058. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:522:0x0a1e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b8  */
    /* JADX WARN: Type inference failed for: r0v100, types: [X.YNu, X.YCf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v247, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v319, types: [X.YCf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v324, types: [X.YNu, X.YCf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v325, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.YNu, X.YCf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v149, types: [X.YNu] */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.XXq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.XXq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [X.YNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [X.YCO, X.XYC] */
    /* JADX WARN: Type inference failed for: r2v73, types: [X.XXq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.YCO, X.XYI] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v31, types: [X.YCO, X.XYM] */
    /* JADX WARN: Type inference failed for: r3v32, types: [X.YCO] */
    /* JADX WARN: Type inference failed for: r3v36, types: [X.YCO, X.XYK] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.YCO, X.XYH] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.YCO, X.XYC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A04() {
        /*
            Method dump skipped, instructions count: 2974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YCO.A04():void");
    }

    @Override // X.YOu
    public final C72865XpU Csq(Object obj) {
        boolean z = true;
        Object obj2 = null;
        if (!this.A03) {
            this.A01 = obj;
            this.A02 = null;
            this.A03 = true;
            do {
                this.A04 = false;
                A04();
            } while (this.A04);
            z = this.A03;
            obj2 = this.A02;
        }
        return new C72865XpU(z, obj2);
    }
}
