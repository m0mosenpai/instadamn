package X;

/* renamed from: X.TuC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65794TuC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C95734Sh A02;
    public final /* synthetic */ C4RV A03;
    public final /* synthetic */ C4RU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public RunnableC65794TuC(C95734Sh c95734Sh, C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2) {
        this.A02 = c95734Sh;
        this.A04 = c4ru;
        this.A03 = c4rv;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A01 = j;
        this.A00 = i;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4R6 c4r6 = this.A02.A02;
        C4RU c4ru = this.A04;
        C4RV c4rv = this.A03;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A05;
        long j = this.A01;
        c4r6.Cie(c4rv, c4ru, str, str2, str3, this.A08, this.A00, j, this.A09, this.A0A);
    }
}
