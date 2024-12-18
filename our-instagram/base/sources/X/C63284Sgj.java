package X;

import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Sgj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63284Sgj {
    public static void A00(C88023wA c88023wA, C0N0 c0n0, byte[] bArr, int i) {
        Integer num;
        byte b;
        short s = 0;
        Arrays.fill(bArr, i, bArr.length, (byte) 0);
        List<SJ7> list = c88023wA.A0A;
        if (list != null) {
            long A01 = c88023wA.A01();
            for (SJ7 sj7 : list) {
                long j = ((C88033wB) c88023wA).A02;
                long j2 = sj7.A02;
                if (j2 - j < A01) {
                    int i2 = i + 2 + (s * 133);
                    A01(bArr, i2, (int) r0);
                    A01(bArr, i2 + 4, sj7.A01 - j2);
                    int i3 = i2 + 8;
                    if (sj7.A06) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A01;
                    }
                    if (1 - num.intValue() != 0) {
                        b = 1;
                    } else {
                        b = 2;
                    }
                    bArr[i3] = b;
                    String str = sj7.A04;
                    if (str == null) {
                        str = "";
                    }
                    C0Mo.A06(bArr, i2 + 9, c0n0.A02(str));
                    StackTraceElement[] stackTraceElementArr = sj7.A07;
                    if (stackTraceElementArr != null) {
                        int length = stackTraceElementArr.length;
                        byte b2 = 24;
                        if (length < 24) {
                            b2 = (byte) length;
                        }
                        bArr[i2 + 11] = b2;
                        for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                            C0Mo.A06(bArr, i2 + 12 + (b3 * 2), c0n0.A02(sj7.A07[b3].toString()));
                        }
                    }
                    SN2 sn2 = sj7.A03;
                    if (sn2 != null) {
                        int i4 = i2 + 12 + 48;
                        try {
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            sn2.A00(A0q);
                            String[] strArr = InterfaceC02710Av.A01;
                            int i5 = 0;
                            int i6 = 0;
                            do {
                                String str2 = strArr[i5];
                                if (!A0q.optString(str2).equals("")) {
                                    C0Mo.A06(bArr, i4 + i6, c0n0.A02(A0q.getString(str2)));
                                }
                                i6 += 2;
                                i5++;
                            } while (i5 < 4);
                            String[] strArr2 = InterfaceC02710Av.A00;
                            int i7 = 0;
                            do {
                                String str3 = strArr2[i7];
                                if (A0q.optLong(str3) != 0) {
                                    C0Mo.A04(A0q.getLong(str3), bArr, i4 + i6);
                                }
                                i6 += 8;
                                i7++;
                            } while (i7 < 4);
                            JSONArray optJSONArray = A0q.optJSONArray("render_thread_native_stack_trace");
                            if (optJSONArray != null) {
                                byte b4 = 16;
                                if (optJSONArray.length() < 16) {
                                    b4 = (byte) optJSONArray.length();
                                }
                                bArr[i4 + 40] = b4;
                                for (byte b5 = 0; b5 < b4; b5 = (byte) (b5 + 1)) {
                                    C0Mo.A06(bArr, i4 + 41 + (b5 * 2), c0n0.A02(optJSONArray.get(b5).toString()));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    s = (short) (s + 1);
                    if (s >= 5) {
                        break;
                    }
                }
            }
            C0Mo.A06(bArr, i, s);
        }
    }

    public final Integer A03(C88023wA c88023wA, C0N0 c0n0, byte[] bArr, long j) {
        String str;
        byte b;
        String str2;
        String str3;
        long j2;
        Handler handler;
        A01(bArr, 0, ((C88033wB) c88023wA).A02 - j);
        if (!((C88033wB) c88023wA).A0A) {
            Class cls = ((C88033wB) c88023wA).A09;
            String str4 = null;
            if (cls != null) {
                str2 = cls.getName();
            } else {
                str2 = null;
            }
            Class cls2 = ((C88033wB) c88023wA).A07;
            if (cls2 != null) {
                str3 = cls2.getName();
            } else {
                str3 = null;
            }
            Class cls3 = ((C88033wB) c88023wA).A08;
            if (cls3 != null) {
                str4 = cls3.getName();
            }
            short[] sArr = c88023wA.A0E;
            String[] strArr = {str2, str3, str4};
            synchronized (c0n0) {
                boolean z = false;
                for (int i = 0; i < 3; i++) {
                    String str5 = strArr[i];
                    sArr[i] = 0;
                    if (str5 != null) {
                        Properties properties = c0n0.A04;
                        String property = properties.getProperty(str5);
                        if (property == null) {
                            short s = (short) (c0n0.A00 + 1);
                            c0n0.A00 = s;
                            sArr[i] = s;
                            properties.setProperty(str5, Short.toString(s));
                            z = true;
                        } else {
                            sArr[i] = Short.parseShort(property);
                        }
                    }
                }
                if (z && (handler = c0n0.A03) != null) {
                    handler.post(new RunnableC04810Mz(c0n0));
                }
            }
            C0Mo.A06(bArr, 4, sArr[0]);
            C0Mo.A06(bArr, 6, sArr[1]);
            C0Mo.A03(((C88033wB) c88023wA).A00, bArr, 8);
            C0Mo.A06(bArr, 12, sArr[2]);
            long j3 = ((C88033wB) c88023wA).A06;
            if (j3 > 0) {
                j2 = ((C88033wB) c88023wA).A02 - j3;
            } else {
                j2 = -1;
            }
            if (j2 > 0) {
                C0Mo.A06(bArr, 14, (short) j2);
            } else {
                bArr[14] = 0;
                bArr[15] = 0;
            }
        } else {
            if (c88023wA.A07 == C05F.A01) {
                str = "nativePollOnce:bg";
            } else {
                str = "nativePollOnce";
            }
            C0Mo.A06(bArr, 4, c0n0.A02(str));
            Arrays.fill(bArr, 6, 16, (byte) 0);
        }
        C0Mo.A04(((C88033wB) c88023wA).A03, bArr, 16);
        switch (c88023wA.A07.intValue()) {
            case 0:
                b = 0;
                break;
            case 1:
                b = 2;
                break;
            default:
                b = 1;
                break;
        }
        bArr[24] = b;
        if (AbstractC167007dF.A1M((((C88033wB) c88023wA).A05 > (-1L) ? 1 : (((C88033wB) c88023wA).A05 == (-1L) ? 0 : -1)))) {
            if (A02(c88023wA, c0n0, bArr, 25)) {
                return C05F.A0j;
            }
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public static void A01(byte[] bArr, int i, long j) {
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        C0Mo.A03((int) j, bArr, i);
    }

    public static final boolean A02(C88023wA c88023wA, C0N0 c0n0, byte[] bArr, int i) {
        byte b;
        A01(bArr, i, c88023wA.A01());
        A01(bArr, i + 4, c88023wA.A00());
        int i2 = i + 8;
        switch (c88023wA.A06.intValue()) {
            case 0:
                b = 0;
                break;
            case 1:
                b = 2;
                break;
            default:
                b = 1;
                break;
        }
        bArr[i2] = b;
        List list = c88023wA.A0A;
        if (list != null && !list.isEmpty()) {
            A00(c88023wA, c0n0, bArr, i + 9);
            return true;
        }
        return false;
    }
}
