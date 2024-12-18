package X;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public abstract class O19 {
    public static final SimpleDateFormat A00;
    public static final LinkedHashMap A01;
    public static final C13920nI A02 = C13920nI.A00;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        A00 = simpleDateFormat;
        A01 = AbstractC166987dD.A1I();
    }
}
