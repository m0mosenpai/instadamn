package X;

/* renamed from: X.YHb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73511YHb implements Runnable {
    public final /* synthetic */ YEU A00;
    public final /* synthetic */ C69479Vo2 A01;

    public RunnableC73511YHb(YEU yeu, C69479Vo2 c69479Vo2) {
        this.A00 = yeu;
        this.A01 = c69479Vo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69479Vo2 c69479Vo2 = this.A01;
        YEU yeu = this.A00;
        YOy yOy = yeu.A00;
        if (c69479Vo2 == null) {
            yOy.DNg();
        } else {
            yOy.DNH(c69479Vo2);
        }
        C106744rW.A02(yeu.A01, yeu.A02);
    }
}
