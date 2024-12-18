package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.5KS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KS {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public volatile boolean A05;
    public final Object A04 = new Object();
    public final C5KT A03 = new C5KT();

    private final void A00() {
        String str;
        if (!this.A02) {
            return;
        }
        if (!A0E()) {
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception A05 = A05();
        if (A05 != null) {
            str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        } else if (A0F()) {
            str = "result ".concat(String.valueOf(String.valueOf(A06())));
        } else if (this.A05) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        throw new IllegalStateException("Complete with: ".concat(str), A05);
    }

    public static final void A01(C5KS c5ks) {
        synchronized (c5ks.A04) {
            if (!c5ks.A02) {
                return;
            }
            c5ks.A03.A01(c5ks);
        }
    }

    public final C5KS A02(InterfaceC65423Tju interfaceC65423Tju, Executor executor) {
        C5KS c5ks = new C5KS();
        this.A03.A00(new T7G(interfaceC65423Tju, c5ks, executor));
        A01(this);
        return c5ks;
    }

    public final C5KS A03(YO0 yo0) {
        this.A03.A00(new XOE(yo0, AbstractC58437PvG.A00));
        A01(this);
        return this;
    }

    public final C5KS A04(YO1 yo1, Executor executor) {
        this.A03.A00(new XMA(yo1, executor));
        A01(this);
        return this;
    }

    public final Exception A05() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A06() {
        Object obj;
        synchronized (this.A04) {
            C3U5.A09(this.A02, "Task is not yet complete");
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    throw new RuntimeException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    public final void A07() {
        synchronized (this.A04) {
            if (this.A02) {
                return;
            }
            this.A02 = true;
            this.A05 = true;
            this.A03.A01(this);
        }
    }

    public final void A08(InterfaceC73609YNz interfaceC73609YNz, Executor executor) {
        this.A03.A00(new XMB(interfaceC73609YNz, executor));
        A01(this);
    }

    public final void A09(YO0 yo0, Executor executor) {
        this.A03.A00(new XOE(yo0, executor));
        A01(this);
    }

    public final void A0A(InterfaceC65424Tjv interfaceC65424Tjv) {
        A0B(interfaceC65424Tjv, AbstractC58437PvG.A00);
    }

    public final void A0B(InterfaceC65424Tjv interfaceC65424Tjv, Executor executor) {
        this.A03.A00(new C58441PvK(interfaceC65424Tjv, executor));
        A01(this);
    }

    public final void A0C(Exception exc) {
        C3U5.A03(exc, "Exception must not be null");
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A01(this);
    }

    public final void A0D(Object obj) {
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A01(this);
    }

    public final boolean A0E() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        return z;
    }

    public final boolean A0F() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A0G(Object obj) {
        synchronized (this.A04) {
            if (this.A02) {
                return false;
            }
            this.A02 = true;
            this.A01 = obj;
            this.A03.A01(this);
            return true;
        }
    }
}
