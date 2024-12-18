package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class LSN implements InterfaceC50417MNt {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public LSN(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        EnumC46211Kcn enumC46211Kcn;
        EnumC46211Kcn enumC46211Kcn2;
        String str;
        Integer num;
        LGS lgs;
        Number number;
        short s;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2;
        int i3;
        int i4;
        EnumC46211Kcn enumC46211Kcn3;
        EnumC46211Kcn enumC46211Kcn4;
        short s2;
        Number number2;
        Integer num2;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                LGV lgv = (LGV) obj;
                if (lgv == null) {
                    LID.A01((LID) this.A04, EnumC46211Kcn.A0G, (LK0) this.A03, this.A01);
                    ((C47952LGm) this.A02).A01("MISSING_RESULT");
                    return;
                }
                LK0 lk0 = (LK0) this.A03;
                LID lid = (LID) this.A04;
                lk0.A05(LID.A00(lgv));
                EnumC46211Kcn enumC46211Kcn5 = lgv.A00;
                if (enumC46211Kcn5 == EnumC46211Kcn.A0A) {
                    s = 2;
                    lid.A01.A00.markerEnd(178991798, this.A01, (short) 2);
                    C47952LGm c47952LGm = (C47952LGm) this.A02;
                    lightweightQuickPerformanceLogger = c47952LGm.A01;
                    i = 1021649468;
                    i2 = c47952LGm.A00;
                    lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
                    return;
                }
                L8W l8w = lid.A01;
                int i5 = this.A01;
                if (enumC46211Kcn5 == null || (number2 = enumC46211Kcn5.A00) == null) {
                    number2 = EnumC46211Kcn.A0G.A00;
                }
                Integer valueOf = Integer.valueOf(number2.intValue());
                Number number3 = lgv.A03;
                Long l = null;
                if (number3 != null) {
                    num2 = Integer.valueOf(number3.intValue());
                } else {
                    num2 = null;
                }
                Number number4 = lgv.A02;
                if (number4 != null) {
                    l = Long.valueOf(number4.longValue());
                }
                l8w.A01(valueOf, num2, l, i5);
                if (enumC46211Kcn5 == EnumC46211Kcn.A0E) {
                    C47952LGm c47952LGm2 = (C47952LGm) this.A02;
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = c47952LGm2.A01;
                    int i6 = c47952LGm2.A00;
                    lightweightQuickPerformanceLogger3.markerPoint(1021649468, i6, "network_probe_started");
                    if (AbstractC46549Kio.A00()) {
                        str3 = "network_probe_succeeded";
                    } else {
                        str3 = "network_probe_failed";
                    }
                    lightweightQuickPerformanceLogger3.markerPoint(1021649468, i6, str3);
                    lightweightQuickPerformanceLogger3.markerPoint(1021649468, i6, "network_probe_ended");
                }
                C47952LGm c47952LGm3 = (C47952LGm) this.A02;
                lightweightQuickPerformanceLogger2 = c47952LGm3.A01;
                i3 = 1021649468;
                i4 = c47952LGm3.A00;
                if (enumC46211Kcn5 == null || (str2 = enumC46211Kcn5.A01) == null) {
                    str2 = "MISSING_ERROR_CODE";
                }
                lightweightQuickPerformanceLogger2.markerAnnotate(1021649468, i4, TraceFieldType.ErrorCode, str2);
                if (enumC46211Kcn5 == EnumC46211Kcn.A09 || enumC46211Kcn5 == EnumC46211Kcn.A06 || enumC46211Kcn5 == EnumC46211Kcn.A05) {
                    s2 = 2;
                    lightweightQuickPerformanceLogger2.markerEnd(i3, i4, s2);
                    return;
                }
                s2 = 3;
                lightweightQuickPerformanceLogger2.markerEnd(i3, i4, s2);
                return;
            case 1:
                LGQ lgq = (LGQ) obj;
                LK0 lk02 = (LK0) this.A03;
                if (lgq == null) {
                    Boolean A0a = AbstractC166997dE.A0a();
                    LGQ lgq2 = new LGQ(EnumC46211Kcn.A0G, A0a);
                    Boolean bool = lgq2.A01;
                    if (C14360o3.A0K(bool, A0a) && ((enumC46211Kcn4 = lgq2.A00) == null || enumC46211Kcn4 == EnumC46211Kcn.A0A)) {
                        enumC46211Kcn3 = EnumC46211Kcn.A07;
                    } else {
                        enumC46211Kcn3 = lgq2.A00;
                    }
                    lk02.A05(new LGQ(enumC46211Kcn3, bool));
                    lgs = (LGS) this.A02;
                    str = "MISSING_RESULT";
                } else {
                    LID lid2 = (LID) this.A04;
                    Boolean bool2 = lgq.A01;
                    if (AbstractC166997dE.A1Z(bool2, false) && ((enumC46211Kcn = lgq.A00) == null || enumC46211Kcn == EnumC46211Kcn.A0A)) {
                        enumC46211Kcn2 = EnumC46211Kcn.A07;
                    } else {
                        enumC46211Kcn = lgq.A00;
                        enumC46211Kcn2 = enumC46211Kcn;
                    }
                    lk02.A05(new LGQ(enumC46211Kcn2, bool2));
                    EnumC46211Kcn enumC46211Kcn6 = EnumC46211Kcn.A0A;
                    L8W l8w2 = lid2.A01;
                    if (enumC46211Kcn == enumC46211Kcn6) {
                        int i7 = this.A01;
                        QuickPerformanceLogger quickPerformanceLogger = l8w2.A00;
                        s = 2;
                        quickPerformanceLogger.markerEnd(178986062, i7, (short) 2);
                        LGS lgs2 = (LGS) this.A02;
                        lightweightQuickPerformanceLogger = lgs2.A01;
                        i = 1021652080;
                        i2 = lgs2.A00;
                        lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
                        return;
                    }
                    int i8 = this.A01;
                    str = null;
                    if (enumC46211Kcn != null && (number = enumC46211Kcn.A00) != null) {
                        num = Integer.valueOf(number.intValue());
                    } else {
                        num = null;
                    }
                    QuickPerformanceLogger quickPerformanceLogger2 = l8w2.A00;
                    quickPerformanceLogger2.markerAnnotate(178986062, i8, "errorCode", AbstractC37302Gc3.A02(num));
                    quickPerformanceLogger2.markerEnd(178986062, i8, (short) 3);
                    if (enumC46211Kcn == EnumC46211Kcn.A0E) {
                        LGS lgs3 = (LGS) this.A02;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger4 = lgs3.A01;
                        int i9 = lgs3.A00;
                        lightweightQuickPerformanceLogger4.markerPoint(1021652080, i9, "network_probe_started");
                        if (AbstractC46549Kio.A00()) {
                            lightweightQuickPerformanceLogger4.markerPoint(1021652080, i9, "network_probe_succeeded");
                        } else {
                            lightweightQuickPerformanceLogger4.markerPoint(1021652080, i9, "network_probe_failed");
                        }
                        lightweightQuickPerformanceLogger4.markerPoint(1021652080, i9, "network_probe_ended");
                    }
                    lgs = (LGS) this.A02;
                    if (enumC46211Kcn != null) {
                        str = enumC46211Kcn.A01;
                    }
                }
                lightweightQuickPerformanceLogger2 = lgs.A01;
                i3 = 1021652080;
                i4 = lgs.A00;
                lightweightQuickPerformanceLogger2.markerAnnotate(1021652080, i4, TraceFieldType.ErrorCode, str);
                s2 = 3;
                lightweightQuickPerformanceLogger2.markerEnd(i3, i4, s2);
                return;
            default:
                return;
        }
    }
}
