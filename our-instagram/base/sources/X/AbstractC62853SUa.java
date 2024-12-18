package X;

/* renamed from: X.SUa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62853SUa {
    public static final InterfaceC16820sZ A00 = C64979Tb4.A00;
    public static final C62176S0x A01 = AbstractC58570Pxo.A04;

    public static final String A00() {
        String A19;
        StringBuilder A1C = AbstractC166987dD.A1C();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        C14360o3.A07(stackTrace);
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            int i3 = i2 + 1;
            if (i2 > 4) {
                if (i2 > 5) {
                    A1C.append('\n');
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append('|');
                    A19 = AbstractC167017dG.A0n(stackTraceElement, AbstractC002300n.A0c(" ", 12), A1C2);
                } else {
                    A19 = AbstractC166987dD.A19(stackTraceElement);
                }
                A1C.append(A19);
            }
            i++;
            i2 = i3;
        }
        return AbstractC166987dD.A19(A1C);
    }
}
