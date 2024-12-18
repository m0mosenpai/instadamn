package X;

/* renamed from: X.Wd5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70571Wd5 implements YOy {
    public final /* synthetic */ C106724rU A00;
    public final /* synthetic */ C106744rW A01;
    public final /* synthetic */ String A02;

    @Override // X.YOy
    public final void DNg() {
    }

    public C70571Wd5(C106724rU c106724rU, C106744rW c106744rW, String str) {
        this.A01 = c106744rW;
        this.A00 = c106724rU;
        this.A02 = str;
    }

    @Override // X.YOy
    public final void DNH(C69479Vo2 c69479Vo2) {
        long j = this.A00.A08;
        c69479Vo2.A00++;
        if (!c69479Vo2.A0G) {
            c69479Vo2.A0G = true;
            c69479Vo2.A03 = j;
        }
        c69479Vo2.A05 = j;
        C106744rW.A01(this.A01, c69479Vo2, this.A02);
    }
}
