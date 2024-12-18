package X;

/* renamed from: X.WxI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71612WxI implements Runnable {
    public final /* synthetic */ C1573774t A00;
    public final /* synthetic */ C7UR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public RunnableC71612WxI(C1573774t c1573774t, C7UR c7ur, String str, String str2, boolean z) {
        this.A01 = c7ur;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c1573774t;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7UR.A02(this.A00, this.A01, this.A03, this.A02);
    }
}
