package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SiO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63365SiO {
    public final String[] A00;

    public static SNS A00(C63365SiO c63365SiO) {
        SNS sns = new SNS();
        Collections.addAll(sns.A00, c63365SiO.A00);
        return sns;
    }

    public static void A02(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw AbstractC166987dD.A12(AbstractC58321PtD.A0x("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                return;
            }
            throw AbstractC166987dD.A12("name is empty");
        }
        throw AbstractC166987dD.A15("name == null");
    }

    public static void A03(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != '\t') {
                        throw AbstractC166987dD.A12(AbstractC58321PtD.A0x("Unexpected char %#04x at %d in %s value: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str2, str}));
                    }
                } else {
                    if (charAt >= 127) {
                        throw AbstractC166987dD.A12(AbstractC58321PtD.A0x("Unexpected char %#04x at %d in %s value: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str2, str}));
                    }
                }
            }
            return;
        }
        throw AbstractC166987dD.A15(AnonymousClass001.A0g("value for name ", str2, " == null"));
    }

    public final String A04(String str) {
        String[] strArr = this.A00;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C63365SiO) && Arrays.equals(((C63365SiO) obj).A00, this.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C63365SiO(SNS sns) {
        List list = sns.A00;
        this.A00 = AbstractC31173DnH.A1b(list, list.size());
    }

    public static C63365SiO A01(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        int i = 0;
        while (true) {
            int length = strArr2.length;
            if (i < length) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                    i++;
                } else {
                    throw AbstractC166987dD.A12("Headers cannot be null");
                }
            } else {
                for (int i2 = 0; i2 < length; i2 += 2) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    A02(str2);
                    A03(str3, str2);
                }
                return new C63365SiO(strArr2);
            }
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        String[] strArr = this.A00;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            A1C.append(strArr[i2]);
            A1C.append(": ");
            A1C.append(strArr[i2 + 1]);
            A1C.append("\n");
        }
        return A1C.toString();
    }

    public C63365SiO(String[] strArr) {
        this.A00 = strArr;
    }
}
