package X;

/* renamed from: X.Wd6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70572Wd6 implements YOy {
    public final /* synthetic */ C106724rU A00;
    public final /* synthetic */ C106744rW A01;
    public final /* synthetic */ String A02;

    @Override // X.YOy
    public final void DNg() {
    }

    public C70572Wd6(C106724rU c106724rU, C106744rW c106744rW, String str) {
        this.A01 = c106744rW;
        this.A00 = c106724rU;
        this.A02 = str;
    }

    @Override // X.YOy
    public final void DNH(C69479Vo2 c69479Vo2) {
        C106724rU c106724rU = this.A00;
        long j = c106724rU.A08;
        String str = c106724rU.A0A;
        c69479Vo2.A02 = j;
        c69479Vo2.A09 = str;
        C106744rW c106744rW = this.A01;
        String str2 = this.A02;
        Object remove = c106744rW.A05.remove(str2);
        if (remove != null) {
            c106744rW.A08.remove(remove);
        }
        c106744rW.A07.remove(str2);
        c106744rW.A04.A04(str2);
    }
}
