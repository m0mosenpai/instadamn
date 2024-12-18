package X;

/* renamed from: X.2RX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RX {
    public final C0f6 A00;

    public final void A00(String str, Throwable th, String... strArr) {
        C0f5 AEp = this.A00.AEp(str, 21373413);
        AEp.ERI(th);
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length || i == length - 1) {
                break;
            }
            AEp.ABW(strArr[i], strArr[i + 1]);
            i += 2;
        }
        AEp.report();
    }

    public final void A01(String str, String... strArr) {
        C0f5 AEp = this.A00.AEp(str, 21373413);
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length || i == length - 1) {
                break;
            }
            AEp.ABW(strArr[i], strArr[i + 1]);
            i += 2;
        }
        AEp.report();
    }

    public C2RX(C0f6 c0f6) {
        this.A00 = c0f6;
    }
}
