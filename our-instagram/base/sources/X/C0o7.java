package X;

/* renamed from: X.0o7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0o7 implements Runnable {
    public final C12T A00;
    public final boolean A01;
    public volatile boolean A02;
    public final /* synthetic */ C0o8 A03;

    @Override // java.lang.Runnable
    public final void run() {
        C0o8 c0o8;
        C0v8 c0v8;
        while (true) {
            int i = 0;
            while (true) {
                c0o8 = this.A03;
                int i2 = c0o8.A00;
                if ((i2 >= 0 && i2 < c0o8.A05.get() - 1) || (c0v8 = (C0v8) c0o8.A09.A01()) == null) {
                    break;
                }
                try {
                    c0v8.run();
                } catch (Throwable th) {
                    CLX.A00(AnonymousClass191.A00, th);
                }
                c0v8.A04 = true;
                synchronized (c0v8.A05.A04) {
                    C0o7 c0o7 = c0v8.A01;
                    if (c0o7 != null) {
                        r5.A0C--;
                        c0o7.A02 = true;
                    }
                }
                i++;
                if (i >= 16) {
                    C12T c12t = this.A00;
                    if (c12t.A02(c0o8)) {
                        c12t.A05(this, c0o8);
                        return;
                    }
                }
                if (this.A01 && (this.A02 || (c0o8.A0B - c0o8.A0C) + c0o8.A0A > c0o8.A01)) {
                    break;
                }
            }
            synchronized (c0o8.A04) {
                if (!this.A01 || (c0o8.A09.A00() != 0 && !this.A02 && (c0o8.A0B - c0o8.A0C) + c0o8.A0A <= c0o8.A01 && !C0o8.A00(c0o8))) {
                    if (c0o8.A09.A00() == 0 || C0o8.A00(c0o8)) {
                        break;
                    }
                }
            }
        }
        c0o8.A0B--;
        c0o8.A05.decrementAndGet();
        AbstractC14390oB.A01.F8m(C0eB.A00);
    }

    public C0o7(C0o8 c0o8, C12T c12t, boolean z) {
        this.A03 = c0o8;
        this.A00 = c12t;
        this.A01 = z;
        c0o8.A05.incrementAndGet();
    }
}
