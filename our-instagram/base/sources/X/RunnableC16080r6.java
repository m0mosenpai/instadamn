package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.common.util.TriState;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC16080r6 implements Runnable, C0XX {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public TriState A0D;
    public C0X7 A0E;
    public C0XG A0F;
    public InterfaceC07540aT A0G;
    public InterfaceC07540aT A0H;
    public C19200x2 A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public short A0M;
    public short A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public C0XF A0V;
    public final C0X4 A0X;
    public int A00 = 0;
    public final ArrayList A0Y = new ArrayList();
    public final C0Wv A0W = new C0Wv();
    public long A0C = -1;

    public final void A01(C0XJ c0xj, InterfaceC07540aT interfaceC07540aT, String str, TimeUnit timeUnit, int i, long j) {
        ASo().A00(c0xj, interfaceC07540aT, str, timeUnit, i, j);
        this.A08 = j + this.A09;
    }

    @Override // X.C0XX
    public final String CCg() {
        return null;
    }

    public static RunnableC16080r6 A00(AwakeTimeSinceBootClock awakeTimeSinceBootClock, TimeUnit timeUnit, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        RunnableC16080r6 runnableC16080r6 = new RunnableC16080r6(awakeTimeSinceBootClock);
        runnableC16080r6.A03 = i;
        runnableC16080r6.A02 = i2;
        runnableC16080r6.A09 = timeUnit.toNanos(j);
        runnableC16080r6.A0U = z;
        runnableC16080r6.A05 = i3;
        runnableC16080r6.A01 = i4;
        runnableC16080r6.A0R = z2;
        runnableC16080r6.A06 = 0L;
        runnableC16080r6.A08 = timeUnit.toNanos(j);
        return runnableC16080r6;
    }

    public final void A02(String str, double d) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            C0Wv.A01(c0Wv, d);
            C0Wv.A00(c0Wv, (byte) 6);
        }
    }

    public final void A03(String str, long j) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            C0Wv.A02(c0Wv, j);
            C0Wv.A00(c0Wv, (byte) 3);
        }
    }

    public final void A04(String str, double[] dArr) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(Arrays.copyOf(dArr, dArr.length));
            C0Wv.A00(c0Wv, (byte) 7);
        }
    }

    public final void A05(String str, int[] iArr) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(Arrays.copyOf(iArr, iArr.length));
            C0Wv.A00(c0Wv, (byte) 5);
        }
    }

    public final void A06(String str, long[] jArr) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(Arrays.copyOf(jArr, jArr.length));
            C0Wv.A00(c0Wv, (byte) 10);
        }
    }

    public final void A07(String str, String[] strArr) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(Arrays.copyOf(strArr, strArr.length));
            C0Wv.A00(c0Wv, (byte) 4);
        }
    }

    public final void A08(String str, boolean[] zArr) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(Arrays.copyOf(zArr, zArr.length));
            C0Wv.A00(c0Wv, (byte) 9);
        }
    }

    @Override // X.C0XX
    public final void ABZ(String str, String str2) {
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            c0Wv.A08 = null;
            c0Wv.A07 = null;
            c0Wv.A05.add(str);
            c0Wv.A06.add(str2);
            C0Wv.A00(c0Wv, (byte) 1);
        }
    }

    @Override // X.C0XX
    public final C0X7 ASo() {
        C0X7 c0x7 = this.A0E;
        if (c0x7 == null) {
            C0X7 c0x72 = new C0X7();
            this.A0E = c0x72;
            return c0x72;
        }
        return c0x7;
    }

    @Override // X.C0XX
    public final short AYZ() {
        return this.A0M;
    }

    @Override // X.C0XX
    public final String Ac1(String str) {
        return this.A0W.A03(str);
    }

    @Override // X.C0XX
    public final C0Wv Ac2() {
        return this.A0W;
    }

    @Override // X.C0XX
    public final int Azm() {
        return (int) TimeUnit.NANOSECONDS.toMillis(this.A06);
    }

    @Override // X.C0XX
    public final long Azo() {
        return this.A06;
    }

    @Override // X.C0XX
    public final int B2k() {
        return this.A00;
    }

    @Override // X.C0XX
    public final List B3f() {
        return this.A0W.A04();
    }

    @Override // X.C0XX
    public final int B6x() {
        return this.A01;
    }

    @Override // X.C0XX
    public final boolean BAn() {
        return this.A0D.asBoolean(false);
    }

    @Override // X.C0XX
    public final int BIb() {
        return this.A02;
    }

    @Override // X.C0XX
    public final short BLD() {
        return this.A0N;
    }

    @Override // X.C0XX
    public final String BLJ() {
        String str;
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            str = (String) c0Wv.A05.get(r1.size() - 1);
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x001c. Please report as an issue. */
    @Override // X.C0XX
    public final String BLK() {
        String A02;
        C0Wv c0Wv = this.A0W;
        synchronized (c0Wv) {
            int i = c0Wv.A03;
            boolean z = true;
            int i2 = i - 1;
            if (i2 >= 0) {
                if (i2 != c0Wv.A01 || (A02 = c0Wv.A04) == null) {
                    c0Wv.A01 = i2;
                    try {
                        byte b = c0Wv.A09[i - 1];
                        switch (b) {
                            case 1:
                                ArrayList arrayList = c0Wv.A06;
                                A02 = (String) arrayList.get(arrayList.size() - 1);
                                c0Wv.A04 = A02;
                                break;
                            case 2:
                                A02 = Integer.toString((int) c0Wv.A0B[c0Wv.A02 - 1]);
                                c0Wv.A04 = A02;
                                break;
                            case 3:
                                A02 = Long.toString(c0Wv.A0B[c0Wv.A02 - 1]);
                                c0Wv.A04 = A02;
                                break;
                            case 4:
                                ArrayList arrayList2 = c0Wv.A06;
                                A02 = C0Wu.A03((String[]) arrayList2.get(arrayList2.size() - 1));
                                c0Wv.A04 = A02;
                                break;
                            case 5:
                                ArrayList arrayList3 = c0Wv.A06;
                                A02 = C0Wu.A01((int[]) arrayList3.get(arrayList3.size() - 1));
                                c0Wv.A04 = A02;
                                break;
                            case 6:
                                A02 = Double.toString(c0Wv.A0A[c0Wv.A00 - 1]);
                                c0Wv.A04 = A02;
                                break;
                            case 7:
                                ArrayList arrayList4 = c0Wv.A06;
                                A02 = C0Wu.A00((double[]) arrayList4.get(arrayList4.size() - 1));
                                c0Wv.A04 = A02;
                                break;
                            case 8:
                                if (c0Wv.A0B[c0Wv.A02 - 1] == 0) {
                                    z = false;
                                }
                                A02 = Boolean.toString(z);
                                c0Wv.A04 = A02;
                                break;
                            case 9:
                                ArrayList arrayList5 = c0Wv.A06;
                                A02 = C0Wu.A04((boolean[]) arrayList5.get(arrayList5.size() - 1));
                                c0Wv.A04 = A02;
                                break;
                            case 10:
                                ArrayList arrayList6 = c0Wv.A06;
                                A02 = C0Wu.A02((long[]) arrayList6.get(arrayList6.size() - 1));
                                c0Wv.A04 = A02;
                                break;
                            default:
                                throw new UnsupportedOperationException(AnonymousClass001.A0c("Type ", " is not supported yet", b));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                throw new IndexOutOfBoundsException("Attempting to get last annotation value from empty list");
            }
        }
        return A02;
    }

    @Override // X.C0XX
    public final long BLl() {
        return TimeUnit.NANOSECONDS.toMillis(this.A08);
    }

    @Override // X.C0XX
    public final long BLm() {
        return this.A08;
    }

    @Override // X.C0XX
    public final int BN3() {
        return this.A00;
    }

    @Override // X.C0XX
    public final int BPg() {
        if ((this.A01 & 2) <= 0) {
            return 1;
        }
        return 2;
    }

    @Override // X.C0XX
    public final C0XF BTP() {
        C0XF c0xf = this.A0V;
        if (c0xf == null) {
            C0XF c0xf2 = new C0XF();
            this.A0V = c0xf2;
            return c0xf2;
        }
        return c0xf;
    }

    @Override // X.C0XX
    public final short BUj() {
        return (short) (this.A03 >> 16);
    }

    @Override // X.C0XX
    public final long BUq() {
        return TimeUnit.NANOSECONDS.toMillis(this.A09);
    }

    @Override // X.C0XX
    public final long BUr() {
        return this.A09;
    }

    @Override // X.C0XX
    public final C0XG BdP() {
        return this.A0F;
    }

    @Override // X.C0XX
    public final C0X7 BeC() {
        return this.A0E;
    }

    @Override // X.C0XX
    public final int Boo() {
        return this.A04;
    }

    @Override // X.C0XX
    public final long BqA() {
        return this.A0A;
    }

    @Override // X.C0XX
    public final String C3l() {
        return this.A0L;
    }

    @Override // X.C0XX
    public final List C53() {
        return this.A0Y;
    }

    @Override // X.C0XX
    public final String C54() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.A0Y;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (size > 1) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            size--;
        }
        return sb.toString();
    }

    @Override // X.C0XX
    public final long C8d() {
        return this.A0B;
    }

    @Override // X.C0XX
    public final long CBE() {
        return this.A0C;
    }

    @Override // X.C0XX
    public final int CCe() {
        return this.A05;
    }

    @Override // X.C0XX
    public final boolean CKj() {
        if (this.A07 == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C0XX
    public final boolean CPs() {
        return this.A0P;
    }

    @Override // X.C0XX
    public final boolean CRG() {
        if ((this.A01 & 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0XX
    public final boolean CVh() {
        TriState triState = this.A0D;
        if (triState != null && triState.isSet()) {
            return true;
        }
        return false;
    }

    @Override // X.C0XX
    public final boolean CYk(long j) {
        if ((j & this.A07) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C0XX
    public final boolean CYl(int i) {
        if ((this.A07 & (1 << (i - 1))) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0XX
    public final boolean CYo() {
        return this.A0Q;
    }

    @Override // X.C0XX
    public final boolean Ceg() {
        return this.A0T;
    }

    @Override // X.C0XX
    public final boolean CfK() {
        return this.A0U;
    }

    @Override // X.C0XX
    public final int getMarkerId() {
        return this.A03;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x02bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0x9] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0x9] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Double] */
    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        String str;
        StringBuilder sb;
        Object c0x9;
        int valueOf;
        C19200x2 c19200x2 = this.A0I;
        if (c19200x2 != null) {
            C19210x3 c19210x3 = C19200x2.A01;
            C19260xA c19260xA = null;
            try {
                "perf".getClass();
                C19280xC A01 = C19280xC.A01("perf", null);
                A01.A00 = this.A0B;
                C19260xA c19260xA2 = A01.A06;
                C14360o3.A07(c19260xA2);
                c19210x3.A07("marker_id", c19260xA2, getMarkerId());
                c19210x3.A07("instance_id", c19260xA2, CCe());
                c19210x3.A07("sample_rate", c19260xA2, (int) BqA());
                c19210x3.A07("sample_source", c19260xA2, (int) ((BqA() >> 48) & 255));
                c19210x3.A01(c19260xA2, BUq(), "time_since_boot_ms");
                c19210x3.A01(c19260xA2, Azo(), "duration_ns");
                c19210x3.A07("action_id", c19260xA2, AYZ());
                c19210x3.A07("marker_type", c19260xA2, BPg());
                String CCg = CCg();
                if (CCg != null) {
                    c19210x3.A08("unique_marker_id_debug_only", c19260xA2, CCg);
                }
                if (CRG() && CVh()) {
                    c19210x3.A02(c19260xA2, "app_started_in_bg", BAn());
                }
                c19210x3.A08("method", c19260xA2, C2VV.A00((int) ((BqA() >> 32) & 255), CYo(), CPs()));
                int BN3 = BN3();
                if (BN3 != 0) {
                    c19210x3.A07("da_level", c19260xA2, BN3);
                }
                String C3l = C3l();
                if (C3l != null) {
                    c19210x3.A08("da_type", c19260xA2, C3l);
                }
                C0Wv Ac2 = Ac2();
                synchronized (Ac2) {
                    List A04 = Ac2.A04();
                    List list = Ac2.A07;
                    List list2 = list;
                    if (list == null) {
                        int i = Ac2.A03;
                        if (i == 0) {
                            list2 = Collections.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList(i);
                            for (int i2 = 0; i2 < i; i2++) {
                                arrayList.add(Integer.valueOf(Ac2.A09[i2]));
                            }
                            Ac2.A07 = arrayList;
                            list2 = arrayList;
                        }
                    }
                    pair = new Pair(A04, list2);
                }
                List list3 = (List) pair.first;
                List list4 = (List) pair.second;
                int size = list3.size() - 1;
                C19260xA c19260xA3 = null;
                C19260xA c19260xA4 = null;
                C19260xA c19260xA5 = null;
                C19260xA c19260xA6 = null;
                C19260xA c19260xA7 = null;
                C19260xA c19260xA8 = null;
                C19260xA c19260xA9 = null;
                C19260xA c19260xA10 = null;
                for (int i3 = 0; i3 < size; i3 += 2) {
                    String str2 = (String) list3.get(i3);
                    String str3 = (String) list3.get(i3 + 1);
                    switch (((Integer) list4.get(i3 / 2)).intValue()) {
                        case 1:
                            if (c19260xA3 == null) {
                                c19260xA3 = c19210x3.A00(c19260xA2, "annotations");
                            }
                            c19210x3.A08(str2, c19260xA3, str3);
                            break;
                        case 2:
                        case 3:
                            if (c19260xA4 == null) {
                                c19260xA4 = c19210x3.A00(c19260xA2, "annotations_int");
                            }
                            c19210x3.A01(c19260xA4, Long.parseLong(str3), str2);
                            break;
                        case 4:
                            if (c19260xA5 == null) {
                                c19260xA5 = c19210x3.A00(c19260xA2, "annotations_string_array");
                            }
                            c19210x3.A06(c19260xA5, str2, C0XU.A00(str3));
                            break;
                        case 5:
                        case 10:
                            if (c19260xA6 == null) {
                                c19260xA6 = c19210x3.A00(c19260xA2, "annotations_int_array");
                            }
                            c19210x3.A05(c19260xA6, str2, C0XU.A00(str3));
                            break;
                        case 6:
                            if (c19260xA7 == null) {
                                c19260xA7 = c19210x3.A00(c19260xA2, "annotations_double");
                            }
                            double parseDouble = Double.parseDouble(str3);
                            C14360o3.A0B(str2, 1);
                            C19260xA.A00(c19260xA7, Double.valueOf(parseDouble), str2);
                            break;
                        case 7:
                            if (c19260xA8 == null) {
                                c19260xA8 = c19210x3.A00(c19260xA2, "annotations_double_array");
                            }
                            c19210x3.A04(c19260xA8, str2, C0XU.A00(str3));
                            break;
                        case 8:
                            if (c19260xA9 == null) {
                                c19260xA9 = c19210x3.A00(c19260xA2, "annotations_bool");
                            }
                            c19210x3.A02(c19260xA9, str2, Boolean.parseBoolean(str3));
                            break;
                        case 9:
                            if (c19260xA10 == null) {
                                c19260xA10 = c19210x3.A00(c19260xA2, "annotations_bool_array");
                            }
                            c19210x3.A03(c19260xA10, str2, C0XU.A00(str3));
                            break;
                    }
                }
                String C54 = C54();
                if (!C54.isEmpty()) {
                    c19210x3.A08("trace_tags", c19260xA2, C54);
                }
                short AYZ = AYZ();
                if (AYZ == 3) {
                    str = "client_fail";
                } else if (AYZ == 4) {
                    str = "client_cancel";
                } else {
                    str = "client_tti";
                }
                c19210x3.A08("marker", c19260xA2, str);
                long CBE = CBE();
                if (CBE != -1) {
                    c19210x3.A01(c19260xA2, CBE, "ttl_ms");
                }
                String str4 = C0XU.A00;
                if (str4 != null) {
                    c19210x3.A08("scenario", c19260xA2, str4);
                }
                if (Ceg()) {
                    c19210x3.A02(c19260xA2, "tracked_for_loss", true);
                }
                if (Boo() != 0) {
                    sb = new StringBuilder();
                    sb.append("markerStart called multiple times without end or cancel");
                } else {
                    sb = null;
                }
                C0X7 BeC = BeC();
                if (BeC != null) {
                    C0x9 c0x92 = new C0x9();
                    C02630Am c02630Am = null;
                    HashMap hashMap = new HashMap();
                    for (int i4 = 0; i4 < BeC.A01; i4++) {
                        long millis = TimeUnit.NANOSECONDS.toMillis(BeC.A03[i4]);
                        int i5 = BeC.A02[i4];
                        String str5 = BeC.A06[i4];
                        C0XJ c0xj = BeC.A04[i4];
                        if (i5 <= 7) {
                            Integer num = (Integer) hashMap.get(str5);
                            int i6 = 1;
                            if (num == null) {
                                valueOf = 1;
                            } else {
                                i6 = num.intValue() + 1;
                                valueOf = Integer.valueOf(i6);
                            }
                            hashMap.put(str5, valueOf);
                            if (i6 <= 1000) {
                                int i7 = 0;
                                C19260xA c19260xA11 = new C19260xA();
                                c0x92.A00.add(c19260xA11);
                                c19210x3.A01(c19260xA11, millis, "timeSinceStart");
                                c19210x3.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c19260xA11, str5);
                                if (c0xj != null) {
                                    C19260xA A00 = c19210x3.A00(c19260xA11, "data");
                                    if (c02630Am == null) {
                                        c02630Am = new C02630Am(c19210x3);
                                    }
                                    c02630Am.A00 = A00;
                                    int i8 = 0;
                                    while (i8 < c0xj.A00) {
                                        String[] strArr = c0xj.A02;
                                        String str6 = strArr[i7];
                                        String str7 = strArr[i7 + 1];
                                        int i9 = c0xj.A01[i8];
                                        if (str7 != null) {
                                            switch (i9) {
                                                case 1:
                                                    try {
                                                        c02630Am.A02.A08(str6, C02630Am.A00(c02630Am, i9), str7);
                                                        break;
                                                    } catch (NumberFormatException e) {
                                                        android.util.Log.w("QPL", "Failed to parse int annotation", e);
                                                        break;
                                                    }
                                                case 2:
                                                    c02630Am.A02.A07(str6, C02630Am.A00(c02630Am, i9), Integer.parseInt(str7));
                                                    break;
                                                case 3:
                                                    c02630Am.A02.A01(C02630Am.A00(c02630Am, i9), Long.parseLong(str7), str6);
                                                    break;
                                                case 4:
                                                    c02630Am.A02.A06(C02630Am.A00(c02630Am, i9), str6, str7.split(",,,"));
                                                    break;
                                                case 5:
                                                case 10:
                                                    c02630Am.A02.A05(C02630Am.A00(c02630Am, i9), str6, str7.split(",,,"));
                                                    break;
                                                case 6:
                                                    Object A002 = C02630Am.A00(c02630Am, i9);
                                                    double parseDouble2 = Double.parseDouble(str7);
                                                    C19260xA c19260xA12 = (C19260xA) A002;
                                                    C14360o3.A0B(c19260xA12, 0);
                                                    C14360o3.A0B(str6, 1);
                                                    C19260xA.A00(c19260xA12, Double.valueOf(parseDouble2), str6);
                                                    break;
                                                case 7:
                                                    c02630Am.A02.A04(C02630Am.A00(c02630Am, i9), str6, str7.split(",,,"));
                                                    break;
                                                case 8:
                                                    c02630Am.A02.A02(C02630Am.A00(c02630Am, i9), str6, Boolean.parseBoolean(str7));
                                                    break;
                                                case 9:
                                                    c02630Am.A02.A03(C02630Am.A00(c02630Am, i9), str6, str7.split(",,,"));
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(AnonymousClass001.A0O("Unsupported type: ", i9));
                                                    break;
                                            }
                                        }
                                        i8++;
                                        i7 += 2;
                                    }
                                    c02630Am.A00 = null;
                                    c02630Am.A01.clear();
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    C19260xA.A00(c19260xA2, c0x92, "points");
                }
                if (sb != null) {
                    c19210x3.A08("error", c19260xA2, sb.toString());
                }
                if (CKj()) {
                    C0XF BTP = BTP();
                    ArrayList arrayList2 = BTP.A00;
                    if (!arrayList2.isEmpty()) {
                        C19260xA A003 = c19210x3.A00(c19260xA2, "metadata");
                        C0XF.A00(BTP);
                        ArrayList arrayList3 = BTP.A01;
                        int size2 = arrayList3.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size2; i11++) {
                            String str8 = (String) arrayList3.get(i11);
                            if (str8 != null) {
                                c19260xA = c19210x3.A00(A003, str8);
                            } else {
                                int i12 = i10 + 1;
                                String str9 = (String) arrayList2.get(i10);
                                i10 = i12 + 1;
                                Object obj = arrayList2.get(i12);
                                if (obj instanceof String) {
                                    c19210x3.A08(str9, c19260xA, (String) obj);
                                } else if (obj instanceof Integer) {
                                    c19210x3.A07(str9, c19260xA, ((Integer) obj).intValue());
                                } else if (obj instanceof Long) {
                                    c19210x3.A01(c19260xA, ((Long) obj).longValue(), str9);
                                } else {
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        C14360o3.A0B(c19260xA, 0);
                                        C14360o3.A0B(str9, 1);
                                        c0x9 = Double.valueOf(doubleValue);
                                    } else if (obj instanceof Boolean) {
                                        c19210x3.A02(c19260xA, str9, ((Boolean) obj).booleanValue());
                                    } else if (obj instanceof String[]) {
                                        c19210x3.A06(c19260xA, str9, (String[]) obj);
                                    } else if (obj instanceof int[]) {
                                        int[] iArr = (int[]) obj;
                                        C14360o3.A0B(c19260xA, 0);
                                        C14360o3.A0B(str9, 1);
                                        C14360o3.A0B(iArr, 2);
                                        c0x9 = new C0x9();
                                        for (int i13 : iArr) {
                                            c0x9.A01(i13);
                                        }
                                    } else if (obj instanceof long[]) {
                                        long[] jArr = (long[]) obj;
                                        C14360o3.A0B(c19260xA, 0);
                                        C14360o3.A0B(str9, 1);
                                        C14360o3.A0B(jArr, 2);
                                        c0x9 = new C0x9();
                                        for (long j : jArr) {
                                            c0x9.A02(j);
                                        }
                                    }
                                    C19260xA.A00(c19260xA, c0x9, str9);
                                }
                            }
                        }
                    }
                }
                if (getMarkerId() != 196678) {
                    c19200x2.A00.EHW(A01);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public RunnableC16080r6(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A0X = new C0X4(awakeTimeSinceBootClock);
    }
}
