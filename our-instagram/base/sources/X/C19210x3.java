package X;

/* renamed from: X.0x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19210x3 {
    public final /* bridge */ /* synthetic */ C19260xA A00(Object obj, String str) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C19260xA c19260xA2 = new C19260xA();
        C19260xA.A00(c19260xA, c19260xA2, str);
        return c19260xA2;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, long j, String str) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C19260xA.A00(c19260xA, Long.valueOf(j), str);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, String str, boolean z) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C19260xA.A00(c19260xA, Boolean.valueOf(z), str);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, String str, String[] strArr) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(strArr, 2);
        C0x9 c0x9 = new C0x9();
        int length = strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = Boolean.parseBoolean(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            c0x9.A05(zArr[i2]);
        }
        C19260xA.A00(c19260xA, c0x9, str);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, String str, String[] strArr) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(strArr, 2);
        C0x9 c0x9 = new C0x9();
        int length = strArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            c0x9.A00(dArr[i2]);
        }
        C19260xA.A00(c19260xA, c0x9, str);
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj, String str, String[] strArr) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(strArr, 2);
        C0x9 c0x9 = new C0x9();
        int length = strArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Long.parseLong(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            c0x9.A02(jArr[i2]);
        }
        C19260xA.A00(c19260xA, c0x9, str);
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, String str, String[] strArr) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(strArr, 2);
        C0x9 c0x9 = new C0x9();
        for (String str2 : strArr) {
            c0x9.A04(str2);
        }
        C19260xA.A00(c19260xA, c0x9, str);
    }

    public final /* bridge */ /* synthetic */ void A07(String str, Object obj, int i) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C19260xA.A00(c19260xA, Integer.valueOf(i), str);
    }

    public final /* bridge */ /* synthetic */ void A08(String str, Object obj, String str2) {
        C19260xA c19260xA = (C19260xA) obj;
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(str, 1);
        C19260xA.A00(c19260xA, str2, str);
    }
}
