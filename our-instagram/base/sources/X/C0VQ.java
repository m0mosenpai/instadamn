package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0VQ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0VQ {
    public TraceContext A00;
    public String A01;
    public boolean A02;
    public int A03;
    public MultiBufferLogger A04;
    public volatile boolean A05;

    public boolean A06() {
        return false;
    }

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public final MultiBufferLogger A02() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A04 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A04;
    }

    public final void A03() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    MultiBufferLogger A02 = A02();
                    try {
                        int writeStandardEntry = A02.writeStandardEntry(6, 21, 0L, 0, 0, 0, 0L);
                        String str = this.A01;
                        A02.writeBytesEntry(0, 83, writeStandardEntry, AnonymousClass001.A0R("ensureSoLibLoaded: ", str));
                        C09170dP.A0C(str);
                        this.A02 = true;
                        A02.writeStandardEntry(6, 22, 0L, 0, 0, 0, 0L);
                    } catch (Throwable th) {
                        A02.writeStandardEntry(6, 22, 0L, 0, 0, 0, 0L);
                        throw th;
                    }
                }
            }
        }
    }

    public C0VQ(String str) {
        this.A01 = str;
        this.A02 = str == null;
    }

    private void A00(TraceContext traceContext) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A03;
        if (i != 0) {
            int i2 = TraceEvents.sProviders & i;
            i = this.A03;
            if (i2 == i) {
                return;
            }
        }
        if (i != 0) {
            disable();
            this.A00 = null;
        }
        if (supportedProviders != 0) {
            this.A00 = traceContext;
            enable();
        }
        this.A03 = supportedProviders;
    }

    public final void A04(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A03 = C0f9.A03(565695267);
        if (this.A03 != 0 && (traceContext.A02 & getSupportedProviders()) != 0) {
            A03();
            onTraceEnded(traceContext, c20020yW);
            A00(traceContext);
            A02().removeBuffer(traceContext.A09);
            i = -886804755;
        } else {
            i = 1976702663;
        }
        C0f9.A0A(i, A03);
    }

    public final void A05(TraceContext traceContext, C20020yW c20020yW) {
        int i;
        int A03 = C0f9.A03(-968538987);
        if ((traceContext.A02 & getSupportedProviders()) == 0) {
            i = 1275317900;
        } else {
            A02().addBuffer(traceContext.A09);
            A03();
            A00(traceContext);
            onTraceStarted(traceContext, c20020yW);
            i = 1881992226;
        }
        C0f9.A0A(i, A03);
    }

    public void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        C0f9.A0A(1865772379, C0f9.A03(1938718220));
    }

    public void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        C0f9.A0A(-1160728573, C0f9.A03(-1179025468));
    }
}
