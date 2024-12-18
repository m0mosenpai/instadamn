package X;

/* renamed from: X.WxK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71614WxK implements Runnable {
    public final /* synthetic */ C1573774t A00;
    public final /* synthetic */ C7UR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public RunnableC71614WxK(C1573774t c1573774t, C7UR c7ur, String str, String str2, boolean z) {
        this.A01 = c7ur;
        this.A00 = c1573774t;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7UR c7ur = this.A01;
        C1573774t c1573774t = this.A00;
        String str = c1573774t.A01;
        String str2 = this.A02;
        C7UR.A03(c7ur, str, str2);
        C11T.A02(new RunnableC71613WxJ(c1573774t, c7ur, this.A03, str2, this.A04));
    }
}
