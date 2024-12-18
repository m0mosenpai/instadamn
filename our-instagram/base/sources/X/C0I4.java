package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashMap;

/* renamed from: X.0I4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0I4 implements C0IK {
    public static long A01 = -1;
    public static long A02 = -1;
    public static long A03 = -1;
    public static long A04 = -1;
    public static final HashMap A05 = new HashMap();
    public final LightweightQuickPerformanceLogger A00;

    @Override // X.C0IK
    public final void DRO(C0IG c0ig) {
        Integer num;
        Integer num2;
        Exception exc;
        Integer num3;
        Integer num4;
        int i;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        String str;
        String str2;
        int i2;
        int i3;
        String str3;
        if (c0ig instanceof C04170Kj) {
            num = c0ig.A01;
            num2 = C05F.A00;
            str2 = ((C04170Kj) c0ig).A00;
        } else if (c0ig instanceof C0KQ) {
            num = c0ig.A01;
            num2 = C05F.A00;
            str2 = ((C0KQ) c0ig).A00;
        } else if (c0ig instanceof C0KN) {
            num = c0ig.A01;
            num2 = C05F.A00;
            str2 = ((C0KN) c0ig).A00;
        } else {
            if (c0ig instanceof C0KA) {
                A02++;
                return;
            }
            if (c0ig instanceof C03920Jh) {
                num = c0ig.A01;
                num2 = C05F.A0Y;
            } else {
                if (c0ig instanceof C0KM) {
                    exc = ((C0KM) c0ig).A00;
                    num3 = c0ig.A01;
                    num4 = C05F.A0Y;
                } else if (c0ig instanceof C0J5) {
                    num = c0ig.A01;
                    num2 = C05F.A01;
                } else if (c0ig instanceof C0JH) {
                    exc = ((C0JH) c0ig).A00;
                    num3 = c0ig.A01;
                    num4 = C05F.A01;
                } else if (c0ig instanceof C0IJ) {
                    num = c0ig.A01;
                    num2 = C05F.A0C;
                } else if (c0ig instanceof C03750Iq) {
                    exc = ((C03750Iq) c0ig).A00;
                    num3 = c0ig.A01;
                    num4 = C05F.A0C;
                } else if (c0ig instanceof C03890Je) {
                    exc = ((C03890Je) c0ig).A00;
                    num3 = c0ig.A01;
                    num4 = C05F.A0N;
                } else {
                    if (!(c0ig instanceof C0JP)) {
                        return;
                    }
                    num = c0ig.A01;
                    num2 = C05F.A0N;
                }
                if (num3 != null) {
                    i = num3.intValue();
                } else {
                    i = 0;
                }
                int intValue = num4.intValue();
                String str4 = "unknown";
                if (intValue != 4) {
                    if (intValue != 1) {
                        lightweightQuickPerformanceLogger = this.A00;
                        String message = exc.getMessage();
                        if (intValue != 2) {
                            if (message != null) {
                                str4 = message;
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(21368205, i, "reset_exception", str4);
                            str = "reset_fail";
                        } else {
                            if (message != null) {
                                str4 = message;
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(21368205, i, "stop_exception", str4);
                            str = "stop_fail";
                        }
                    } else {
                        lightweightQuickPerformanceLogger = this.A00;
                        String message2 = exc.getMessage();
                        if (message2 != null) {
                            str4 = message2;
                        }
                        lightweightQuickPerformanceLogger.markerAnnotate(21368205, i, "start_exception", str4);
                        str = "start_fail";
                    }
                    lightweightQuickPerformanceLogger.markerPoint(21368205, i, str);
                    return;
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A00;
                String message3 = exc.getMessage();
                if (message3 != null) {
                    str4 = message3;
                }
                lightweightQuickPerformanceLogger2.markerAnnotate(21368205, i, "release_exception", str4);
                lightweightQuickPerformanceLogger2.markerEnd(21368205, i, (short) 3);
                A01++;
                return;
            }
            str2 = null;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int intValue2 = num2.intValue();
        if (intValue2 != 0) {
            if (intValue2 != 4) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = this.A00;
                if (intValue2 != 1) {
                    if (intValue2 != 2) {
                        str3 = "reset_codec";
                    } else {
                        str3 = "stop_codec";
                    }
                } else {
                    str3 = "start_codec";
                }
                lightweightQuickPerformanceLogger3.markerPoint(21368205, i2, str3);
                return;
            }
            this.A00.markerEnd(21368205, i2, (short) 2);
            A04++;
            String name = Thread.currentThread().getName();
            C14360o3.A07(name);
            HashMap hashMap = A05;
            if (((Number) hashMap.get(name)) == null) {
                return;
            }
            hashMap.put(name, Integer.valueOf(r0.intValue() - 1));
            Number number = (Number) hashMap.get(name);
            if (number == null || number.intValue() != 0) {
                return;
            }
            hashMap.remove(name);
            return;
        }
        A03++;
        String name2 = Thread.currentThread().getName();
        C14360o3.A07(name2);
        HashMap hashMap2 = A05;
        Number number2 = (Number) hashMap2.get(name2);
        if (number2 != null) {
            i3 = number2.intValue();
        } else {
            i3 = 0;
        }
        hashMap2.put(name2, Integer.valueOf(i3 + 1));
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger4 = this.A00;
        lightweightQuickPerformanceLogger4.markerStart(21368205, i2);
        lightweightQuickPerformanceLogger4.markerAnnotate(21368205, i2, "codec_name", str2);
    }

    public C0I4(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A00 = lightweightQuickPerformanceLogger;
        if (A03 < 0) {
            A03 = 0L;
            A02 = 0L;
            A04 = 0L;
            A01 = 0L;
        }
    }
}
