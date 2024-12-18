package X;

/* renamed from: X.Tyj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66046Tyj {
    public Throwable A00;
    public Throwable A01;

    public static void A00(C66046Tyj c66046Tyj, Throwable th) {
        String str;
        Throwable th2 = c66046Tyj.A01;
        if (th2 == null) {
            th2 = th;
        }
        c66046Tyj.A01 = th2;
        if (c66046Tyj.A00 != null) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            th = new Throwable(AnonymousClass001.A0R(" Exception2: ", str), new Throwable("exception1", c66046Tyj.A00));
        }
        c66046Tyj.A00 = th;
    }

    public final void A01() {
        Throwable th = this.A01;
        if (th == null) {
        } else {
            throw th;
        }
    }
}
