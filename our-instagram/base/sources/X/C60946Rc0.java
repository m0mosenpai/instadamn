package X;

/* renamed from: X.Rc0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60946Rc0 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C64477TFn A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60946Rc0(C64477TFn c64477TFn) {
        super(266, 4, false, false);
        this.A00 = c64477TFn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41341vj c41341vj;
        float f;
        float f2;
        long j;
        long j2;
        synchronized (this.A00) {
            synchronized (C41341vj.class) {
                try {
                    c41341vj = C41341vj.A06;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c41341vj != null) {
                C41341vj.A01(c41341vj, "foreground");
                C62907SWo c62907SWo = c41341vj.A03;
                if (c62907SWo != null) {
                    C0XI c0xi = (C0XI) c41341vj.A01.A03;
                    synchronized (c62907SWo) {
                        try {
                            C0XO c0xo = c62907SWo.A02;
                            c0xi.A04(c0xo);
                            C0XO c0xo2 = c62907SWo.A01;
                            C0XO c0xo3 = c62907SWo.A00;
                            c0xo.A06(c0xo2, c0xo3);
                            f = ((C06340Va) c0xo2.A04(C06340Va.class)).A00;
                            f2 = ((C06340Va) c0xo.A04(C06340Va.class)).A00;
                            j = ((C05680Rs) c0xo3.A04(C05680Rs.class)).A00;
                            j2 = ((C05680Rs) c0xo3.A04(C05680Rs.class)).A01;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c62907SWo.A03, "android_battery_duration");
                    if (A0f.isSampled()) {
                        A0f.A8I("enter_battery_level_percent", Double.valueOf(f));
                        A0f.A8I("exit_battery_level_percent", Double.valueOf(f2));
                        A0f.A9K("realtime_ms", Long.valueOf(j));
                        A0f.A9K("uptime_ms", Long.valueOf(j2));
                        A0f.Cht();
                    }
                }
            }
        }
    }
}
