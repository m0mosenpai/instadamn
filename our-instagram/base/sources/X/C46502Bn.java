package X;

import java.util.Locale;
import java.util.Random;

/* renamed from: X.2Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46502Bn {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A00() {
        Locale locale = Locale.ROOT;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while (sb.length() < 3) {
            float nextFloat = random.nextFloat();
            sb.append(C46492Bm.A0A.charAt((int) (nextFloat * r1.length())));
        }
        return String.format(locale, "%X:%s", valueOf, sb.toString());
    }
}
