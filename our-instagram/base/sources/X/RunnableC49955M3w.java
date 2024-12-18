package X;

/* renamed from: X.M3w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49955M3w implements Runnable {
    public final /* synthetic */ C4FT A00;
    public final /* synthetic */ Integer A01;

    public RunnableC49955M3w(C4FT c4ft, Integer num) {
        this.A01 = num;
        this.A00 = c4ft;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A01.intValue()) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 4:
            case 5:
            case 6:
            default:
                C4FT c4ft = this.A00;
                if (c4ft != null) {
                    c4ft.A00();
                    return;
                }
                return;
        }
    }
}
