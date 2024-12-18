package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* renamed from: X.LXr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48268LXr implements MPY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LJ8 A01;
    public final /* synthetic */ C49808LzF A02;

    public C48268LXr(Context context, LJ8 lj8, C49808LzF c49808LzF) {
        this.A01 = lj8;
        this.A00 = context;
        this.A02 = c49808LzF;
    }

    @Override // X.MPY
    public final void AUp(C60925Rbf c60925Rbf) {
        LJ8 lj8 = this.A01;
        lj8.A01 = "unknown";
        lj8.A07 = false;
        lj8.A02(this.A00, "AEv2 - prefetch failure");
        if (!lj8.A06) {
            QuickPerformanceLogger quickPerformanceLogger = lj8.A0A.A00;
            quickPerformanceLogger.markerPoint(231933580, "editor_native_prefetch_end");
            quickPerformanceLogger.markerEnd(231933580, (short) 3);
        }
    }

    @Override // X.MPY
    public final void EpI() {
        String A0R;
        LJ8 lj8 = this.A01;
        lj8.A01 = "warm";
        lj8.A07 = false;
        Context context = this.A00;
        double A00 = C36J.A00(C36G.A09, C84303pN.A01.A00(this.A02.A00));
        if (Double.isInfinite(A00)) {
            A0R = String.valueOf(A00);
        } else {
            ThreadLocal threadLocal = AbstractC47187KtM.A00[1];
            Object obj = threadLocal.get();
            Object obj2 = obj;
            if (obj == null) {
                DecimalFormat decimalFormat = new DecimalFormat("0");
                decimalFormat.setMinimumFractionDigits(1);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat);
                obj2 = decimalFormat;
            }
            String format = ((NumberFormat) obj2).format(A00);
            C14360o3.A07(format);
            A0R = AnonymousClass001.A0R(format, "s");
        }
        lj8.A02(context, AnonymousClass001.A0R("AEv2 - prefetch success ", A0R));
        if (!lj8.A06) {
            QuickPerformanceLogger quickPerformanceLogger = lj8.A0A.A00;
            quickPerformanceLogger.markerPoint(231933580, "editor_native_prefetch_end");
            quickPerformanceLogger.markerEnd(231933580, (short) 2);
        }
    }
}
