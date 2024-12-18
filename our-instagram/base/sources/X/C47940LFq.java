package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.LFq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47940LFq {
    public final /* synthetic */ LGS A00;
    public final /* synthetic */ LK0 A01;

    public C47940LFq(LGS lgs, LK0 lk0) {
        this.A00 = lgs;
        this.A01 = lk0;
    }

    public static void A00(C47940LFq c47940LFq, Integer num, Integer num2, Throwable th) {
        c47940LFq.A01(new C46344KfS(num, num2, th));
    }

    public final void A01(C46344KfS c46344KfS) {
        EnumC46211Kcn enumC46211Kcn;
        LGS lgs = this.A00;
        String message = c46344KfS.getMessage();
        if (message == null) {
            message = "Unknown Vesta registration failure";
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lgs.A01;
        int i = lgs.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "vesta_registration_failed");
        JQ0.A1D(lightweightQuickPerformanceLogger, "vesta_registration_error", message, 1021652080, i);
        LK0 lk0 = this.A01;
        Integer num = c46344KfS.A00;
        if (num == C05F.A0u) {
            Integer num2 = c46344KfS.A01;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 10) {
                            if (intValue == 11) {
                                enumC46211Kcn = EnumC46211Kcn.A09;
                            }
                        } else {
                            enumC46211Kcn = EnumC46211Kcn.A05;
                        }
                    } else {
                        enumC46211Kcn = EnumC46211Kcn.A08;
                    }
                } else {
                    enumC46211Kcn = EnumC46211Kcn.A0B;
                }
            }
            enumC46211Kcn = EnumC46211Kcn.A07;
        } else {
            if (num == C05F.A0Y) {
                enumC46211Kcn = EnumC46211Kcn.A0E;
            }
            enumC46211Kcn = EnumC46211Kcn.A07;
        }
        lk0.A05(new Jt8(enumC46211Kcn));
    }
}
