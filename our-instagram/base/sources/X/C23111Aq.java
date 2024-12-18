package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.1Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23111Aq {
    public static C23111Aq A0A;
    public InterfaceC24811Iz A00;
    public C1F1 A02;
    public Executor A03;
    public Executor A04;
    public final Context A05;
    public final SharedPreferences A06;
    public final LightweightQuickPerformanceLogger A07;
    public final C23141At A08;
    public final Executor A09 = new Executor() { // from class: X.1Ar
        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            C23111Aq c23111Aq = C23111Aq.this;
            while (true) {
                InterfaceC24811Iz interfaceC24811Iz = AbstractC24641Ih.A02;
                c23111Aq.A00 = interfaceC24811Iz;
                if (interfaceC24811Iz == null) {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.1MP
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("Storage", 504504151, 4, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            runnable.run();
                        }
                    });
                    return;
                }
            }
        }
    };
    public C23131As A01 = C23131As.A02;

    public final synchronized C23131As A01() {
        return this.A01;
    }

    public final synchronized Executor A04(Integer num) {
        Executor executor;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                executor = this.A09;
            } else {
                executor = this.A04;
                if (executor == null) {
                    executor = A03(num);
                    this.A04 = executor;
                }
            }
        } else {
            executor = this.A03;
            if (executor == null) {
                executor = A03(num);
                this.A03 = executor;
            }
        }
        return executor;
    }

    public final synchronized void A05(String str) {
        C23131As c23131As;
        if (TextUtils.isEmpty(str)) {
            c23131As = C23131As.A02;
        } else {
            c23131As = new C23131As(str, str);
        }
        this.A01 = c23131As;
    }

    public static synchronized C23111Aq A00() {
        C23111Aq c23111Aq;
        synchronized (C23111Aq.class) {
            c23111Aq = A0A;
        }
        return c23111Aq;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.1F1] */
    public final C1F1 A02() {
        C1F1 c1f1 = this.A02;
        if (c1f1 == null) {
            Context context = this.A05;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
            ?? obj = new Object();
            obj.A01 = Collections.synchronizedMap(new HashMap());
            obj.A00 = C23161Av.A00(context).AXd(null, 1565991015);
            obj.A02 = scheduledThreadPoolExecutor;
            this.A02 = obj;
            return obj;
        }
        return c1f1;
    }

    public C23111Aq(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C23141At A00;
        SharedPreferences sharedPreferences;
        this.A05 = context.getApplicationContext();
        synchronized (C23141At.class) {
            A00 = C23141At.A02.A00(context);
        }
        this.A08 = A00;
        this.A07 = lightweightQuickPerformanceLogger;
        try {
            sharedPreferences = context.getSharedPreferences("ig_cask_metadata_store", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.A06 = sharedPreferences;
    }

    public final ExecutorC14040nU A03(Integer num) {
        InterfaceC14020nS A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                throw new IllegalArgumentException("Cannot create new idle executor, use getExecutor instead");
            }
            C0o0 A002 = AbstractC14350nz.A00();
            A002.A01 = "Cask_Serial_Executor";
            A00 = new C18240vB(A002);
        } else {
            A00 = C14120nc.A00();
        }
        return new ExecutorC14040nU(A00, 617, 4, false, true);
    }
}
