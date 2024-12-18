package X;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.08K, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C08K {
    public static final byte[] A00 = {112, 114, 111, 0};
    public static final byte[] A01 = {112, 114, 109, 0};

    public static String A00(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C08P.A02;
        String str3 = ":";
        String str4 = ":";
        if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C08P.A03)) {
            str3 = "!";
        }
        if (str.length() > 0) {
            if (!str2.equals("classes.dex")) {
                if (!str2.contains("!") && !str2.contains(str4)) {
                    if (str2.endsWith(".apk")) {
                        return str2;
                    }
                    if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C08P.A03)) {
                        str4 = "!";
                    }
                    return AnonymousClass001.A0g(str, str4, str2);
                }
            } else {
                return str;
            }
        }
        if ("!".equals(str3)) {
            return str2.replace(str4, "!");
        }
        if (!str4.equals(str3)) {
            return str2;
        }
        return str2.replace("!", str4);
    }

    public static void A02(AnonymousClass086 anonymousClass086, OutputStream outputStream) {
        int i = anonymousClass086.A04;
        byte[] bArr = new byte[((((i * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry entry : anonymousClass086.A08.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) ((1 << (intValue % 8)) | bArr[i2]);
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + i;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        outputStream.write(bArr);
    }

    public static void A03(AnonymousClass086 anonymousClass086, OutputStream outputStream) {
        int i = 0;
        for (Map.Entry entry : anonymousClass086.A08.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if ((((Number) entry.getValue()).intValue() & 1) != 0) {
                AnonymousClass087.A01(outputStream, 2, intValue - i);
                AnonymousClass087.A01(outputStream, 2, 0L);
                i = intValue;
            }
        }
    }

    public static void A04(AnonymousClass086 anonymousClass086, OutputStream outputStream, String str) {
        Charset charset = StandardCharsets.UTF_8;
        AnonymousClass087.A01(outputStream, 2, str.getBytes(charset).length);
        AnonymousClass087.A01(outputStream, 2, anonymousClass086.A00);
        AnonymousClass087.A01(outputStream, 4, anonymousClass086.A03);
        AnonymousClass087.A01(outputStream, 4, anonymousClass086.A05);
        AnonymousClass087.A01(outputStream, 4, anonymousClass086.A04);
        outputStream.write(str.getBytes(charset));
    }

    public static void A01(AnonymousClass086 anonymousClass086, OutputStream outputStream) {
        A03(anonymousClass086, outputStream);
        int i = 0;
        for (int i2 : anonymousClass086.A02) {
            Integer valueOf = Integer.valueOf(i2);
            AnonymousClass087.A01(outputStream, 2, r0 - i);
            i = valueOf.intValue();
        }
        A02(anonymousClass086, outputStream);
    }
}
