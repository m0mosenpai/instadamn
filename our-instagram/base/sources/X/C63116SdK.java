package X;

/* renamed from: X.SdK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63116SdK {
    public static final C64531TIl A00 = C64531TIl.A02("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] A03 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] A02 = new String[64];
    public static final String[] A01 = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = A01;
            if (i2 >= 256) {
                break;
            }
            strArr[i2] = AbstractC58321PtD.A0x("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = A02;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (char c = 0; c < 1; c = 1) {
            int i3 = iArr[c];
            strArr2[i3 | 8] = AnonymousClass001.A0R(strArr2[i3], "|PADDED");
        }
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        do {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            int i7 = i6 | i5;
            strArr2[i7] = AnonymousClass001.A0T(strArr2[i6], strArr2[i5], '|');
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(strArr2[i6]);
            A1C.append('|');
            strArr2[i7 | 8] = MSZ.A0u(strArr2[i5], "|PADDED", A1C);
            i4++;
        } while (i4 < 3);
        do {
            if (strArr2[i] == null) {
                strArr2[i] = A01[i];
            }
            i++;
        } while (i < 64);
    }

    public static String A00(byte b, byte b2, int i, int i2, boolean z) {
        String A0x;
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = A03;
        if (b < 10) {
            A0x = strArr[b];
        } else {
            A0x = AbstractC58321PtD.A0x("0x%02x", new Object[]{Byte.valueOf(b)});
        }
        if (b2 == 0) {
            str = "";
        } else {
            if (b != 2 && b != 3) {
                if (b != 4 && b != 6) {
                    if (b != 7 && b != 8) {
                        String[] strArr2 = A02;
                        if (b2 >= 64) {
                            strArr2 = A01;
                        }
                        str = strArr2[b2];
                        if (b == 5) {
                            if ((b2 & 4) != 0) {
                                str2 = "HEADERS";
                                str3 = "PUSH_PROMISE";
                                str = str.replace(str2, str3);
                            }
                        } else if (b == 0 && (b2 & 32) != 0) {
                            str2 = "PRIORITY";
                            str3 = "COMPRESSED";
                            str = str.replace(str2, str3);
                        }
                    }
                } else if (b2 == 1) {
                    str = "ACK";
                }
            }
            str = A01[b2];
        }
        if (z) {
            str4 = "<<";
        } else {
            str4 = ">>";
        }
        return AbstractC58321PtD.A0x("%s 0x%08x %5d %-13s %s", new Object[]{str4, Integer.valueOf(i), Integer.valueOf(i2), A0x, str});
    }
}
