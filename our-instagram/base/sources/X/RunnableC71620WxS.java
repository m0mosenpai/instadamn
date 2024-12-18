package X;

/* renamed from: X.WxS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71620WxS implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WDD A01;
    public final /* synthetic */ VDI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC71620WxS(WDD wdd, VDI vdi, String str, String str2, String str3, long j) {
        this.A01 = wdd;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = vdi;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WDD.A01(this.A01, this.A02, this.A05, this.A04, this.A03, this.A00);
    }
}
