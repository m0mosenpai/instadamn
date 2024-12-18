package X;

/* loaded from: classes8.dex */
public final class LJA {
    public final C006802i A00 = C006802i.A0p;

    public final void A02(String str) {
        if (!A01(this, str)) {
            this.A00.markerStart(724174487, A00(str), false);
        }
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerPoint(724174487, A00(str), str2);
        }
    }

    public final void A05(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerAnnotate(724174487, A00(str), str2, str3);
        }
    }

    public final void A07(String str, short s) {
        C14360o3.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerEnd(724174487, A00(str), s);
        }
    }

    public static final boolean A01(LJA lja, String str) {
        return lja.A00.isMarkerOn(724174487, A00(str));
    }

    public final void A08(String str, Integer[] numArr) {
        C14360o3.A0B(numArr, 2);
        if (A01(this, str)) {
            C006802i c006802i = this.A00;
            int A00 = A00(str);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = numArr[i].intValue();
            }
            c006802i.markerAnnotate(724174487, A00, "thread_fetch_failure_extra_error_codes", iArr);
        }
    }

    public static int A00(String str) {
        return (int) (Long.parseLong(str) & 65535);
    }

    public final void A04(String str, String str2, int i) {
        if (A01(this, str)) {
            this.A00.markerAnnotate(724174487, A00(str), str2, i);
        }
    }

    public final void A06(String str, String str2, boolean z) {
        if (A01(this, str)) {
            this.A00.markerAnnotate(724174487, A00(str), str2, z);
        }
    }
}
