package X;

import android.os.SystemClock;
import com.facebook.exoplayer.formatevaluator.ABRPersonalizer;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.2BN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BN implements C2BL {
    public final C2B4 A00;
    public final C2BU A01;
    public final AbrContextAwareConfiguration A02;
    public final C2BO A03;
    public final C2BO A04;
    public final C2BO A05;
    public final C2BO A06;
    public final C2BO A07;
    public final C2BO A08;
    public final C2BO A09;
    public final C2BH A0A;
    public final AnonymousClass267 A0B;

    public static double A00(long j, double d) {
        return (Math.round(d * r4) * 1.0d) / ((int) Math.pow(10.0d, j));
    }

    @Override // X.C2BL
    public final boolean CW0() {
        return false;
    }

    @Override // X.C2BL
    public final boolean Ejr() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2BT, java.lang.Object] */
    public C2BN(C2B4 c2b4, AbrContextAwareConfiguration abrContextAwareConfiguration, C2BH c2bh) {
        C2BT c2bt;
        this.A0A = c2bh;
        this.A02 = abrContextAwareConfiguration;
        this.A00 = c2b4;
        AnonymousClass267 anonymousClass267 = abrContextAwareConfiguration.abrSetting.A0P;
        anonymousClass267 = anonymousClass267 == null ? new AnonymousClass267() : anonymousClass267;
        this.A0B = anonymousClass267;
        this.A08 = C2BO.A00(anonymousClass267.A0H);
        this.A04 = C2BO.A00(this.A0B.A0D);
        this.A05 = C2BO.A00(this.A0B.A0E);
        this.A06 = C2BO.A00(this.A0B.A0F);
        this.A03 = C2BO.A00("0,1,1.3; 100,2,1");
        this.A07 = C2BO.A00(this.A0B.A0G);
        this.A09 = C2BO.A00(this.A0B.A0I);
        if (abrContextAwareConfiguration.abrSetting.A0S) {
            c2bt = abrContextAwareConfiguration.getSidneeDeviceAwareAbrManagerConfig();
        } else {
            ?? obj = new Object();
            obj.A02 = 0;
            obj.A04 = 0;
            obj.A00 = 0;
            obj.A03 = 0;
            obj.A01 = 0;
            obj.A07 = false;
            obj.A05 = false;
            obj.A06 = false;
            c2bt = obj;
        }
        this.A01 = new C2BU(c2bt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.4Is, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.4Is] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.4Is] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.4Iz, java.lang.Object] */
    @Override // X.C2BL
    public final C4Iz AT7(C93644Ip c93644Ip, C4BV c4bv, C4B6 c4b6, Map map, C4B6[] c4b6Arr, int i, int i2) {
        double d;
        double d2;
        double max;
        long j;
        int i3;
        double d3;
        double A02;
        double A00;
        String str;
        C2BO c2bo;
        double A022;
        double A002;
        C93664Iu c93664Iu;
        String str2;
        int systemicRiskOtherBitrate;
        C2BH c2bh = this.A0A;
        c2bh.A7q(EnumC92204Ba.A0W);
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A02;
        synchronized (abrContextAwareConfiguration.playbackPreferences) {
        }
        long j2 = c93644Ip.A03 - (c93644Ip.A02 / 1000);
        if (j2 <= 0) {
            j2 = this.A0B.A05;
        }
        long j3 = c93644Ip.A01 / 1000;
        if (j3 < 0) {
            j3 = 0;
        } else if (j3 > j2) {
            j3 = j2;
        }
        AnonymousClass267 anonymousClass267 = this.A0B;
        long j4 = anonymousClass267.A07;
        if (j4 >= 0) {
            j2 = Math.min(j2, j4 + j3);
        }
        long max2 = Math.max(j2 - j3, 0L);
        double A003 = A00(3L, j2 / 1000.0d);
        double A004 = A00(3L, max2 / 1000.0d);
        PriorityQueue priorityQueue = new PriorityQueue(c4b6Arr.length, C93654Iq.A00);
        for (C4B6 c4b62 : c4b6Arr) {
            if (c4b62.A05 <= i || i <= 0) {
                boolean A023 = C4BW.A02(c4b62);
                double systemicRiskFactor = abrContextAwareConfiguration.getSystemicRiskFactor(A023, c93644Ip.A04);
                int i4 = c4b62.A05;
                double d4 = i4;
                double d5 = d4 * systemicRiskFactor;
                if (A023) {
                    max = abrContextAwareConfiguration.getSystemicRiskBitrateBoostFactor(true);
                    if (!abrContextAwareConfiguration.getSystemicRiskEnableDynamicOtherBitrate(true) || (systemicRiskOtherBitrate = c93644Ip.A00) <= 0) {
                        systemicRiskOtherBitrate = abrContextAwareConfiguration.getSystemicRiskOtherBitrate(true);
                    }
                    d = systemicRiskOtherBitrate;
                } else {
                    double min = Math.min(A003, A004 + (anonymousClass267.A04 / 1000.0d));
                    d = 0.0d;
                    if (A003 > 0.0d) {
                        d2 = min / A003;
                    } else {
                        d2 = 1.0d;
                    }
                    max = Math.max(d2, anonymousClass267.A01);
                }
                C4Ir c4Ir = new C4Ir(d4, Math.round((d5 * max) + d), systemicRiskFactor);
                double d6 = c4Ir.A00;
                long round = Math.round(d6 * anonymousClass267.A02);
                if (d6 <= 0.0d) {
                    j = -1;
                    i3 = -1;
                    A00 = this.A08.A01();
                } else {
                    ?? r10 = 0;
                    long j5 = anonymousClass267.A08;
                    while (true) {
                        if (j5 >= anonymousClass267.A09) {
                            r10 = C4BW.A00(this.A00, abrContextAwareConfiguration.playbackPreferences.A00(), (int) j5, round);
                            if (r10.A01 > 0 && r10.A01 >= d6) {
                                break;
                            }
                            j5--;
                            r10 = r10;
                        } else if (r10 == 0) {
                            r10 = new Object();
                            r10.A02 = -1L;
                            r10.A01 = -1L;
                            r10.A00 = -1;
                        }
                    }
                    long j6 = r10.A02;
                    j = r10.A01;
                    i3 = r10.A00;
                    long j7 = (long) d6;
                    long j8 = i4;
                    String str3 = c4b62.A0N.A07;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c2bh.A8f(str3, i3, j6, j, j7, j8);
                    if (j < 0) {
                        A02 = this.A08.A01();
                    } else {
                        double d7 = j;
                        if (d7 < d6) {
                            d3 = (-(d6 - d7)) / d6;
                        } else {
                            long j9 = anonymousClass267.A09;
                            d3 = ((i3 - j9) * 1.0d) / (anonymousClass267.A08 - j9);
                        }
                        A02 = this.A08.A02(d3);
                    }
                    A00 = A00(anonymousClass267.A0C, A02);
                }
                C4It c4It = new C4It(c4Ir, A00, i3, j);
                if (C4BW.A02(c4b62)) {
                    C4B5 c4b5 = c4b62.A0N;
                    double d8 = 0.0d;
                    if (c4b5 != null && (str2 = c4b5.A03) != null) {
                        try {
                            d8 = Double.parseDouble(str2);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    c93664Iu = new C93664Iu("", A00(anonymousClass267.A0A, this.A03.A02(d8)), -1.0d, -1.0d);
                } else {
                    double A005 = MosScoreCalculation.A00(c4b62, i2, abrContextAwareConfiguration.abrSetting.A0a);
                    double A01 = MosScoreCalculation.A01(c4b62.A0N.A08, i2);
                    if (A01 > 0.0d && A005 > 0.0d && abrContextAwareConfiguration.abrSetting.A0T) {
                        A002 = A00(anonymousClass267.A0A, this.A07.A02((0.54d * A01) + (0.0046d * A01 * A005)));
                        str = A01 <= ((double) anonymousClass267.A03) ? "bad" : "good";
                    } else {
                        str = "good";
                        if (A01 <= anonymousClass267.A03 && A01 > 0.0d) {
                            c2bo = this.A04;
                            str = "bad";
                        } else if (abrContextAwareConfiguration.enableWifiBasedRewardSidnee()) {
                            c2bo = this.A09;
                        } else if (A01 <= anonymousClass267.A06) {
                            c2bo = this.A05;
                        } else {
                            c2bo = this.A06;
                            str = "great";
                        }
                        if (abrContextAwareConfiguration.abrSetting.A0S) {
                            C2BT c2bt = this.A01.A00;
                            int i5 = 0;
                            if (c2bt.A07 && C46642Cc.A0E.get() >= 3) {
                                i5 = c2bt.A04;
                            }
                            int i6 = 0;
                            if (c2bt.A05) {
                                int intValue = ((Number) C46642Cc.A07.invoke()).intValue();
                                boolean booleanValue = ((Boolean) C46642Cc.A09.invoke()).booleanValue();
                                if (intValue > 0 && intValue < c2bt.A01 && !booleanValue) {
                                    i6 = c2bt.A00;
                                }
                            }
                            int i7 = i5 + i6;
                            int i8 = 0;
                            if (c2bt.A06) {
                                Object obj = C46642Cc.A0G.get();
                                Object obj2 = C46642Cc.A0F.get();
                                EnumC46652Cd enumC46652Cd = EnumC46652Cd.RED;
                                if (obj == enumC46652Cd || obj2 == enumC46652Cd) {
                                    i8 = c2bt.A03;
                                }
                            }
                            double min2 = (Math.min(i7 + i8, c2bt.A02) + 100.0d) / 100.0d;
                            List list = c2bo.A00;
                            int A1L = AbstractC16960so.A1L(list, new C65075Td4(Double.valueOf(A005), 16), list.size());
                            if (A1L < 0 && (-A1L) - 1 != 0) {
                                if (A1L == list.size()) {
                                    A1L = list.size() - 1;
                                } else {
                                    C2BP c2bp = (C2BP) list.get(A1L - 1);
                                    C2BP c2bp2 = (C2BP) list.get(A1L);
                                    double d9 = c2bp.A01;
                                    double d10 = (A005 - d9) / (c2bp2.A01 - d9);
                                    if (c2bp.A03) {
                                        double d11 = c2bp.A02;
                                        A022 = d11 + ((c2bp2.A02 - d11) * StrictMath.pow(d10, c2bp.A00 * min2));
                                    } else {
                                        double d12 = c2bp2.A02;
                                        A022 = d12 - ((d12 - c2bp.A02) * StrictMath.pow(1.0d - d10, c2bp.A00 * min2));
                                    }
                                }
                            }
                            A022 = ((C2BP) list.get(A1L)).A02;
                        } else {
                            A022 = c2bo.A02(A005);
                        }
                        A002 = A00(anonymousClass267.A0A, A022);
                    }
                    c93664Iu = new C93664Iu(str, A002, A005, A01);
                }
                double d13 = c4It.A00;
                double A006 = A00(anonymousClass267.A0B, d13 / c93664Iu.A01);
                synchronized (ABRPersonalizer.class) {
                    C93674Iw c93674Iw = C93674Iw.A01;
                    SystemClock.elapsedRealtime();
                    synchronized (c93674Iw) {
                    }
                }
                double d14 = anonymousClass267.A00;
                C93694Iy c93694Iy = new C93694Iy(c93664Iu, c4It, c4b62, A006, d14, d13 > d14);
                if (!c93694Iy.A05) {
                    priorityQueue.add(c93694Iy);
                }
            }
        }
        C93694Iy c93694Iy2 = (C93694Iy) priorityQueue.poll();
        if (c93694Iy2 == null) {
            c2bh.A7q(EnumC92204Ba.A0S);
            C4B6 c4b63 = null;
            for (C4B6 c4b64 : c4b6Arr) {
                if (c4b63 == null || c4b64.A05 < c4b63.A05) {
                    c4b63 = c4b64;
                }
            }
            if (c4b63 != null) {
                return new C4Iz(c4b63);
            }
            throw new IllegalArgumentException("No formats provided");
        }
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat.setMaximumFractionDigits(2);
        EnumC96564Vr enumC96564Vr = EnumC96564Vr.ENCODING_RISK;
        C4It c4It2 = c93694Iy2.A03;
        C4Ir c4Ir2 = c4It2.A03;
        c2bh.A7r(enumC96564Vr, numberFormat.format(c4Ir2.A01));
        c2bh.A7r(EnumC96564Vr.RATIONAL_GAMBLER_MAX_RISK, numberFormat.format(c93694Iy2.A01));
        c2bh.A7r(EnumC96564Vr.RISK_REWARD_RATIO, numberFormat.format(c93694Iy2.A00));
        c2bh.A7r(EnumC96564Vr.MULTIPLIER, numberFormat.format(c4Ir2.A02));
        c2bh.A7r(EnumC96564Vr.VIRTUAL_BUFFER, numberFormat.format(c4Ir2.A00));
        c2bh.A7r(EnumC96564Vr.RATIONAL_GAMBLER_RISK, numberFormat.format(c4It2.A00));
        EnumC96564Vr enumC96564Vr2 = EnumC96564Vr.RATIONAL_GAMBLER_REWARD;
        C93664Iu c93664Iu2 = c93694Iy2.A02;
        c2bh.A7r(enumC96564Vr2, numberFormat.format(c93664Iu2.A01));
        c2bh.A7r(EnumC96564Vr.UPLOAD_QUALITY_CLASS, c93664Iu2.A03);
        c2bh.A7r(EnumC96564Vr.PERSONALIZED_ABR_LEVEL, "n");
        C4B6 c4b65 = c93694Iy2.A04;
        long j10 = c4It2.A02;
        ?? obj3 = new Object();
        obj3.A01 = c4b65;
        obj3.A00 = j10;
        return obj3;
    }
}
