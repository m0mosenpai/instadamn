package X;

/* renamed from: X.NTx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52712NTx extends AbstractC54988OTw {
    public C51870MwE A00;
    public final InterfaceC16820sZ A01;
    public final C05A A02;
    public final C0UO A03;
    public final InterfaceC16820sZ A04;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        X.MSY.A1N(r1, r3.A02);
        r3.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0010, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = new X.C51870MwE(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (X.C14360o3.A0K(r3.A00, r1) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C52712NTx r3) {
        /*
            X.0sZ r0 = r3.A04
            java.lang.Object r0 = r0.invoke()
            X.MsA r0 = (X.C51679MsA) r0
            if (r0 == 0) goto Le
            java.util.List r2 = r0.A07
            if (r2 != 0) goto L12
        Le:
            X.0sl r2 = X.C16930sl.A00
            if (r0 == 0) goto L16
        L12:
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L18
        L16:
            java.lang.String r0 = ""
        L18:
            X.MwE r1 = new X.MwE
            r1.<init>(r2, r0)
            X.MwE r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 != 0) goto L2c
            X.05A r0 = r3.A02
            X.MSY.A1N(r1, r0)
            r3.A00 = r1
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52712NTx.A00(X.NTx):void");
    }

    public C52712NTx(C54446O4a c54446O4a, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(c54446O4a);
        this.A04 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(new C51870MwE(c16930sl, ""));
        this.A02 = A00;
        this.A00 = new C51870MwE(c16930sl, "");
        this.A03 = AbstractC208910l.A02(A00);
    }
}
