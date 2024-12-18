package X;

/* renamed from: X.4DA, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4DA {
    public boolean A00 = true;
    public final C4D5 A01;

    public C4DA(C4D5 c4d5) {
        this.A01 = c4d5;
    }

    public void A02(String str) {
        int i;
        byte b;
        C14360o3.A0B(str, 0);
        C4D4 c4d4 = (C4D4) this.A01;
        int length = str.length();
        C4D4.A00(c4d4, c4d4.A00, length + 2);
        char[] cArr = c4d4.A01;
        int i2 = c4d4.A00;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (true) {
            if (i5 < i4) {
                char c = cArr[i5];
                byte[] bArr = AbstractC902640l.A00;
                if (c < ']' && bArr[c] != 0) {
                    for (int i6 = i5 - i3; i6 < length; i6++) {
                        C4D4.A00(c4d4, i5, 2);
                        char charAt = str.charAt(i6);
                        if (charAt < ']' && (b = bArr[charAt]) != 0) {
                            if (b == 1) {
                                String str2 = AbstractC902640l.A01[charAt];
                                C14360o3.A0A(str2);
                                int length2 = str2.length();
                                C4D4.A00(c4d4, i5, length2);
                                str2.getChars(0, length2, c4d4.A01, i5);
                                i5 += length2;
                            } else {
                                char[] cArr2 = c4d4.A01;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                            }
                            c4d4.A00 = i5;
                        } else {
                            c4d4.A01[i5] = charAt;
                            i5++;
                        }
                    }
                    C4D4.A00(c4d4, i5, 1);
                    i = i5 + 1;
                    c4d4.A01[i5] = '\"';
                } else {
                    i5++;
                }
            } else {
                i = i4 + 1;
                cArr[i4] = '\"';
                break;
            }
        }
        c4d4.A00 = i;
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        this.A01.FEJ(str);
    }

    public final void A00() {
        if (this instanceof C4DD) {
            C4DD c4dd = (C4DD) this;
            ((C4DA) c4dd).A00 = false;
            c4dd.A03("\n");
            int i = c4dd.A00;
            for (int i2 = 0; i2 < i; i2++) {
                c4dd.A03(c4dd.A01.A00.A02);
            }
            return;
        }
        this.A00 = false;
    }

    public final void A01(char c) {
        C4D4 c4d4 = (C4D4) this.A01;
        C4D4.A00(c4d4, c4d4.A00, 1);
        char[] cArr = c4d4.A01;
        int i = c4d4.A00;
        c4d4.A00 = i + 1;
        cArr[i] = c;
    }
}
