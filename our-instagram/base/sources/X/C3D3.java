package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.3D3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3D3 extends C1I7 implements C3D4 {
    public boolean A00;
    public String A01;
    public final QuickPerformanceLogger A02;
    public final String A03;

    public C3D3(QuickPerformanceLogger quickPerformanceLogger, String str) {
        C14360o3.A0B(str, 2);
        this.A02 = quickPerformanceLogger;
        this.A03 = str;
        this.A01 = "idle";
    }

    public static final void A00(C3D3 c3d3, String str, int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger = c3d3.A02;
        quickPerformanceLogger.markerAnnotate(i, "view_type", str);
        quickPerformanceLogger.markerAnnotate(i, "view_type_id", i2);
        quickPerformanceLogger.markerAnnotate(i, "analytics_module", c3d3.A03);
        quickPerformanceLogger.markerAnnotate(i, "scroll_state", c3d3.A01);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        String str;
        int A03 = C0f9.A03(1392575315);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "invalid";
                } else {
                    str = "setting";
                }
            } else {
                str = "dragging";
            }
        } else {
            str = "idle";
        }
        this.A01 = str;
        C0f9.A0A(739433416, A03);
    }
}
