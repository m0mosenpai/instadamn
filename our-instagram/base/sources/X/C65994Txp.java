package X;

/* renamed from: X.Txp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65994Txp implements InterfaceC98244b3 {
    public long A00;
    public C4C7 A01;
    public final C98254b4 A05;
    public final android.net.Uri A06;
    public final C4XF A07;
    public final InterfaceC71863X7w A08;
    public final C4UP A09;
    public volatile boolean A0A;
    public final /* synthetic */ C65771Ttm A0B;
    public final C4XJ A04 = new Object();
    public boolean A02 = true;
    public final long A03 = C98264b5.A03.getAndIncrement();

    @Override // X.InterfaceC98244b3
    public final void AGY() {
        this.A0A = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r11.A00 == null) goto L29;
     */
    @Override // X.InterfaceC98244b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChG() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65994Txp.ChG():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.4XJ] */
    public C65994Txp(android.net.Uri uri, C4XF c4xf, InterfaceC71863X7w interfaceC71863X7w, C65771Ttm c65771Ttm, InterfaceC92354Bq interfaceC92354Bq, C4UP c4up) {
        this.A0B = c65771Ttm;
        this.A06 = uri;
        this.A05 = new C98254b4(interfaceC92354Bq);
        this.A08 = interfaceC71863X7w;
        this.A07 = c4xf;
        this.A09 = c4up;
    }
}
