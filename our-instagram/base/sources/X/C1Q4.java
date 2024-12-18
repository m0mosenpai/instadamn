package X;

import android.text.TextUtils;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1Q4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q4 implements C0f5 {
    public static final Random A04 = new Random();
    public InterfaceC08830cm A00;
    public final EventBuilder A01;
    public final int A02;
    public final boolean A03;

    @Override // X.C0f5
    public final C0f5 ABU(String str, int i) {
        this.A01.annotate(str, i);
        return this;
    }

    @Override // X.C0f5
    public final C0f5 ABV(String str, long j) {
        this.A01.annotate(str, j);
        return this;
    }

    @Override // X.C0f5
    public final C0f5 ABW(String str, String str2) {
        this.A01.annotate(str, str2);
        return this;
    }

    @Override // X.C0f5
    public final C0f5 ABX(String str, boolean z) {
        this.A01.annotate(str, z);
        return this;
    }

    @Override // X.C0f5
    public final C0f5 ABY(String str, String[] strArr) {
        this.A01.annotate(str, strArr);
        return this;
    }

    @Override // X.C0f5
    public final C0f5 ERI(Throwable th) {
        EventBuilder eventBuilder = this.A01;
        if (eventBuilder.isSampled() && !this.A03) {
            eventBuilder.annotate("UI_UE_KEY_CAUSE_STACKTRACE", C0LA.A00(android.util.Log.getStackTraceString(th), this.A02));
        }
        return this;
    }

    @Override // X.C0f5
    public final boolean isSampled() {
        return this.A01.isSampled();
    }

    @Override // X.C0f5
    public final void report() {
        if (this.A00 != null) {
            Executor executor = CA8.A00;
            if (executor == null) {
                executor = Executors.newFixedThreadPool(3);
                CA8.A00 = executor;
            }
            executor.execute(new Runnable() { // from class: X.PLB
                @Override // java.lang.Runnable
                public final void run() {
                    C1Q4 c1q4 = C1Q4.this;
                    InterfaceC08830cm interfaceC08830cm = c1q4.A00;
                    if (interfaceC08830cm != null) {
                        EventBuilder eventBuilder = c1q4.A01;
                        eventBuilder.annotate(AbstractC111324zv.A00(5217), (String) interfaceC08830cm.get());
                        eventBuilder.report();
                        return;
                    }
                    throw AbstractC166987dD.A14("mReportSourceRefProvider is null");
                }
            });
            return;
        }
        this.A01.report();
    }

    public C1Q4(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String str2;
        EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, i3 == 0 ? A04.nextInt() : i3, str);
        this.A01 = markEventBuilder;
        this.A03 = z;
        this.A02 = i2;
        if (markEventBuilder.isSampled()) {
            if (!z && !z2) {
                this.A01.annotate("UI_UE_KEY_CALLSITE_STACKTRACE", C0LA.A00(C0LA.A01(new Throwable()), i2));
            }
            this.A01.annotate("UI_UE_KEY_END_POINT", C0L6.A00());
            this.A01.annotate("UI_UE_KEY_CATEGORY", str);
            this.A01.setActionId((short) 11289);
            HashMap A02 = C0LB.A02();
            if (EndToEnd.A04()) {
                str2 = "mobilelab";
            } else {
                str2 = (String) A02.get("fb.report_source");
            }
            if (!TextUtils.isEmpty(str2)) {
                EventBuilder eventBuilder = this.A01;
                eventBuilder.annotate("report_source", str2);
                String A01 = C0LB.A01(A02);
                if (A01 != null) {
                    eventBuilder.annotate("report_source_ref", A01);
                } else {
                    this.A00 = new InterfaceC08830cm() { // from class: X.B1z
                        @Override // X.InterfaceC08830cm
                        public final Object get() {
                            return "{\"REPORT_SOURCE_REF\":\"Unknown directory for this data.\"}";
                        }
                    };
                }
            }
        }
    }
}
