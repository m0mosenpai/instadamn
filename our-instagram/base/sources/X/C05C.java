package X;

import java.lang.Thread;

/* renamed from: X.05C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05C implements C0OO {
    public static C05C A07;
    public final C0LW A01;
    public final C14690oh A02;
    public final C04440Lk A03;
    public final C05E A04;
    public final C0Pe A05;
    public final Object A06 = new Object();
    public int A00 = 1;

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0F;
    }

    @Override // X.C0OO
    public final void start() {
        C0PB.A00("JavascriptCrashDetector");
        A07 = this;
        if (C03400Gs.A01() != null) {
            C03400Gs.A03(new InterfaceC03430Gv() { // from class: X.05M
                @Override // X.InterfaceC03430Gv
                public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
                    C14360o3.A0B(thread, 0);
                    C14360o3.A0B(th, 1);
                    return 0;
                }
            }, 100);
        } else {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0Os
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C14360o3.A0B(thread, 0);
                    C14360o3.A0B(th, 1);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    public C05C(C0LW c0lw, C14690oh c14690oh, C04440Lk c04440Lk, C05E c05e, C0Pe c0Pe) {
        this.A05 = c0Pe;
        this.A01 = c0lw;
        this.A03 = c04440Lk;
        this.A02 = c14690oh;
        this.A04 = c05e;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
