package X;

/* renamed from: X.0f0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0f0 {
    public final StringBuilder A00;

    public final void A00(int i) {
        StringBuilder sb = this.A00;
        sb.append('|');
        sb.append(i);
    }

    public final void A02(String str) {
        this.A00.append('|');
        A01(str);
    }

    public final void A03(String[] strArr, int i) {
        StringBuilder sb = this.A00;
        sb.append('|');
        for (int i2 = 1; i2 < i; i2 += 2) {
            String str = strArr[i2 - 1];
            String str2 = strArr[i2];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i2 < i - 1) {
                sb.append(';');
            }
        }
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C0f0(char c) {
        StringBuilder sb = new StringBuilder(1024);
        this.A00 = sb;
        sb.append(c);
    }

    public final void A01(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            StringBuilder sb = this.A00;
            char charAt = str.charAt(i);
            if (charAt == 0 || charAt == '\r' || charAt == ';' || charAt == '|' || charAt == '\t' || charAt == '\n') {
                charAt = ' ';
            }
            sb.append(charAt);
        }
    }
}
