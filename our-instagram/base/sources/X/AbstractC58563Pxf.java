package X;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.Pxf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58563Pxf {
    public static final Pattern A00 = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    public static final Pattern A01 = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static String A00(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring("android-keystore://".length());
        }
        throw AbstractC58319PtB.A0j("key URI must start with %s", new Object[]{"android-keystore://"});
    }

    public static void A01(int sizeInBytes) {
        if (sizeInBytes != 16 && sizeInBytes != 32) {
            throw AbstractC58319PtB.A10("invalid key size %d; only 128-bit and 256-bit AES keys are supported", AbstractC25228BEl.A1Y(sizeInBytes * 8));
        }
    }
}
