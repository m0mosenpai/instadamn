package X;

/* renamed from: X.Wxa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71628Wxa implements Runnable {
    public final /* synthetic */ C95734Sh A00;
    public final /* synthetic */ C5n5 A01;
    public final /* synthetic */ C117275Sm A02;
    public final /* synthetic */ C4RV A03;
    public final /* synthetic */ C4RU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public RunnableC71628Wxa(C95734Sh c95734Sh, C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str, boolean z) {
        this.A00 = c95734Sh;
        this.A04 = c4ru;
        this.A03 = c4rv;
        this.A01 = c5n5;
        this.A02 = c117275Sm;
        this.A06 = z;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4R6 c4r6 = this.A00.A02;
        C4RU c4ru = this.A04;
        C4RV c4rv = this.A03;
        c4r6.CjA(this.A01, this.A02, c4rv, c4ru, this.A05, this.A06);
    }
}
