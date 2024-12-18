package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95734Sh implements Handler.Callback {
    public final Handler A00;
    public final C4RP A01;
    public final C4R6 A02;
    public final C4R7 A03;
    public final String A04;
    public final AtomicBoolean A05;
    public final Thread A06;

    public C95734Sh(Looper looper, C4RP c4rp, C4R6 c4r6, C4R7 c4r7, String str) {
        C14360o3.A0B(looper, 3);
        this.A01 = c4rp;
        this.A04 = str;
        this.A02 = c4r6;
        this.A03 = c4r7;
        Handler handler = new Handler(looper, this);
        this.A00 = handler;
        Thread thread = handler.getLooper().getThread();
        C14360o3.A07(thread);
        this.A06 = thread;
        this.A05 = new AtomicBoolean(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        C0SJ A02 = C06600Wq.A02("GrootPlayerLogger", 0);
        try {
            if (message.what == 1) {
                Object obj = message.obj;
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                AtomicBoolean atomicBoolean = this.A05;
                if (!atomicBoolean.get()) {
                    C4RP c4rp = this.A01;
                    C4RQ c4rq = c4rp.A0I;
                    if (c4rq.A0J() && c4rp.A0N.get()) {
                        AbstractC459729h.A01("GrootPlayerLogger", "Heartbeat: vid %s, reason: %s", this.A04, str);
                        c4rq.A08();
                        if (!atomicBoolean.get()) {
                            Handler handler = this.A00;
                            handler.sendMessageDelayed(handler.obtainMessage(1, str), 0L);
                        }
                    }
                }
            }
            A02.close();
            return true;
        } finally {
        }
    }

    public static final void A00(C95734Sh c95734Sh, Runnable runnable) {
        try {
            Runnable A00 = C0SX.A00(runnable, "GrootPlayerLogger", 0);
            if (Thread.currentThread() == c95734Sh.A06) {
                A00.run();
            } else {
                c95734Sh.A00.post(A00);
            }
        } finally {
            AbstractC95954Te.A00();
        }
    }
}
