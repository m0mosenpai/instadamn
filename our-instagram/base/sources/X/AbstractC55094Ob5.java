package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ob5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55094Ob5 {
    public final int A01;
    public final QuickPerformanceLogger A03;
    public short A00 = 2;
    public final long A02 = AbstractC50712Us.A01.A09(-3600000, 3600000);

    public static final QuickPerformanceLogger A01(AbstractC55094Ob5 abstractC55094Ob5) {
        if (C1AD.A06(C06090Tz.A05, 18313358298069850L)) {
            return abstractC55094Ob5.A03;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.NnP, java.lang.Object] */
    public static C52028N0a A02(Integer num, String str, boolean z) {
        ?? obj = new Object();
        obj.A03 = z;
        obj.A00 = num;
        obj.A01 = str;
        obj.A02 = "mwa";
        return new C52028N0a(obj);
    }

    public final void A05(String str, String str2) {
        QuickPerformanceLogger A01;
        if (str2 != null && (A01 = A01(this)) != null) {
            A01.markerAnnotate(884869075, this.A01, str, str2);
        }
    }

    public AbstractC55094Ob5(QuickPerformanceLogger quickPerformanceLogger, int i) {
        this.A01 = i;
        this.A03 = quickPerformanceLogger;
    }

    public final void A03() {
        QuickPerformanceLogger A01 = A01(this);
        if (A01 != null) {
            A01.markerStartWithCancelPolicy(884869075, false, this.A01, A01.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
        C52028N0a c52028N0a = (C52028N0a) this;
        c52028N0a.A05("log_id", AbstractC166997dE.A0o());
        c52028N0a.A05("host_app", "instagram");
        C53618NnP c53618NnP = c52028N0a.A00;
        boolean z = c53618NnP.A03;
        QuickPerformanceLogger A012 = A01(c52028N0a);
        if (A012 != null) {
            A012.markerAnnotate(884869075, c52028N0a.A01, "is_outgoing", z);
        }
        c52028N0a.A05("destination_app", c53618NnP.A02);
        c52028N0a.A05("action_string", c53618NnP.A01);
        C52028N0a.A00(c52028N0a, c53618NnP.A00);
    }

    public final void A04(String str) {
        QuickPerformanceLogger A01 = A01(this);
        if (A01 != null) {
            A01.markerPoint(884869075, this.A01, str, A01.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
    }

    public final void A06(short s) {
        QuickPerformanceLogger A01 = A01(this);
        if (A01 != null) {
            A01.markerEnd(884869075, this.A01, s, A01.currentMonotonicTimestamp() + this.A02, TimeUnit.MILLISECONDS);
        }
    }
}
