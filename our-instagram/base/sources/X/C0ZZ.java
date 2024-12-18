package X;

import com.facebook.mobileconfig.MobileConfigCanaryChangeListener;
import com.facebook.mobileconfig.MobileConfigCrashReportUtils;

/* renamed from: X.0ZZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZZ implements C0OO {
    public static C0ZZ A02;
    public String A00 = "";
    public final C0LW A01;
    public static final Object A04 = new Object();
    public static final Object A03 = new Object();

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0M;
    }

    @Override // X.C0OO
    public final void start() {
        synchronized (A04) {
            if (A02 != null) {
                return;
            }
            A02 = this;
            A00();
            try {
                MobileConfigCrashReportUtils.getInstance().setUpdateListener(new MobileConfigCanaryChangeListener() { // from class: X.00G
                    @Override // com.facebook.mobileconfig.MobileConfigCanaryChangeListener
                    public final void onConfigChanged() {
                        C0ZZ.this.A00();
                    }
                });
            } catch (UnsatisfiedLinkError e) {
                C0PC.A00().DEh("MobileConfigDetector", e, null);
                C0K8.A0I("MobileConfigDetector", "Unable to add the MobileConfigCanaryChangeListener, Failed to create MobileConfigCrashReportUtils instance.", e);
            }
        }
    }

    public C0ZZ(C0LW c0lw) {
        this.A01 = c0lw;
    }

    public final void A00() {
        try {
            String serializedCanaryData = MobileConfigCrashReportUtils.getInstance().getSerializedCanaryData();
            synchronized (A03) {
                if (!"[]".equals(serializedCanaryData) && !serializedCanaryData.equals(this.A00)) {
                    this.A00 = serializedCanaryData;
                    C024209q c024209q = new C024209q(null);
                    c024209q.A03(C0LK.A7G, serializedCanaryData);
                    C0LW c0lw = this.A01;
                    c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, this);
                    c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
                }
            }
        } catch (Throwable th) {
            C0K8.A0H("MobileConfigDetector", "Mobile config canary retrieval failed.", th);
            C0PC.A00().DEh("MCCanaryFetch", th, null);
        }
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
