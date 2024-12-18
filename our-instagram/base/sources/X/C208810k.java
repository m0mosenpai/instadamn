package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.10k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C208810k implements EventBuilder {
    public static final ThreadLocal A03 = new ThreadLocal();
    public C0X2 A00;
    public RunnableC16080r6 A01;
    public C006802i A02;

    @Override // com.facebook.quicklog.EventBuilder
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final void report() {
        if (this.A01 != null) {
            C006802i c006802i = this.A02;
            c006802i.getClass();
            RunnableC16080r6 runnableC16080r6 = this.A01;
            C0X2 c0x2 = this.A00;
            if (c006802i.A0o != null && c0x2 != null) {
                c0x2.A0H = c006802i.currentMonotonicTimestampNanos();
            }
            if (c006802i.A0l.CY1(runnableC16080r6.A03)) {
                c006802i.A0A.A0D(c006802i.A0M(), runnableC16080r6.A03);
            } else {
                c006802i.A0M().A02(c0x2, runnableC16080r6);
                c006802i.A0m(runnableC16080r6, true);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A04(c0x2);
                }
            }
        }
        this.A01 = null;
        this.A02 = null;
        A03.set(this);
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setActionId(short s) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A0M = s;
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setLevel(int i) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A00 = i;
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double d) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A02(str, d);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int i) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A0W.A05(str, i);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long j) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A03(str, j);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String str2) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.ABZ(str, str2);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean z) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A0W.A06(str, z);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double[] dArr) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A04(str, dArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int[] iArr) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A05(str, iArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long[] jArr) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A06(str, jArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String[] strArr) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A07(str, strArr);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean[] zArr) {
        RunnableC16080r6 runnableC16080r6 = this.A01;
        runnableC16080r6.getClass();
        runnableC16080r6.A08(str, zArr);
        return this;
    }
}
