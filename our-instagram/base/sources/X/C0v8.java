package X;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0v8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0v8 extends AbstractRunnableC14200nk {
    public long A00;
    public C0o7 A01;
    public final C0SJ A02;
    public final Runnable A03;
    public volatile boolean A04;
    public final /* synthetic */ C0o8 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0v8(C0SJ c0sj, C0o8 c0o8, Runnable runnable, int i, int i2) {
        super(i, i2, false, false);
        this.A05 = c0o8;
        this.A03 = runnable;
        this.A02 = c0sj;
        this.A00 = Long.MAX_VALUE;
        C18180v3 c18180v3 = AbstractC14310nv.A00;
        if (c18180v3 != null) {
            c18180v3.A00(this);
        }
    }

    public final void A00() {
        C0o7 c0o7;
        C0o8 c0o8 = this.A05;
        synchronized (c0o8.A04) {
            if (this.A01 == null && !this.A04) {
                int i = this.runnableId;
                long j = c0o8.A02;
                if (AbstractC14310nv.A00 != null) {
                    C14120nc.A00().ATO(new C18190v4(i));
                }
                C0w9 c0w9 = C0w9.A01;
                String format = String.format(Locale.ENGLISH, "Background task stuck: runnableId=%d timeoutMs=%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Long.valueOf(j)}, 2));
                C14360o3.A07(format);
                c0w9.EmO("IG_EXECUTOR_STUCK_SIMPLE_WORKER", format, 100000);
                c0o8.A0C++;
                if (c0o8.A0B < c0o8.A01) {
                    c0o8.A0B++;
                    c0o7 = new C0o7(c0o8, c0o8.A07, false);
                } else {
                    c0o8.A0A++;
                    c0o7 = new C0o7(c0o8, c0o8.A06, true);
                }
                this.A01 = c0o7;
                c0o7.A00.A05(c0o7, c0o7.A03);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0SJ c0sj;
        C0o8 c0o8 = this.A05;
        this.A00 = SystemClock.uptimeMillis();
        c0o8.A08.A02(this);
        C18180v3 c18180v3 = AbstractC14310nv.A00;
        if (c18180v3 != null) {
            c18180v3.A03(this);
        }
        C0SJ c0sj2 = this.A02;
        if (c0sj2 != null) {
            c0sj = C06600Wq.A01(c0sj2, c0sj2.getType());
        } else {
            c0sj = null;
        }
        try {
            this.A03.run();
        } catch (Throwable th) {
            if (c18180v3 != null) {
                try {
                    c18180v3.A01(this);
                } finally {
                    if (c18180v3 != null) {
                        c18180v3.A02(this);
                    }
                    if (c0sj != null) {
                        c0sj.close();
                    }
                }
            }
            throw th;
        }
    }
}
