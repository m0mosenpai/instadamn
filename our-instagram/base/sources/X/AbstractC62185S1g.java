package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.S1g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62185S1g {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final SLG A00(String str) {
        TimeUnit timeUnit;
        long millis;
        long j;
        long j2;
        TimeUnit timeUnit2;
        long j3;
        long j4;
        switch (str.hashCode()) {
            case -1965127950:
                if (str.equals("APP_START_CREDENTIAL")) {
                    timeUnit = TimeUnit.MINUTES;
                    C2FP.A0D();
                    millis = timeUnit.toMillis(43200L);
                    C2FP.A0D();
                    j = 44640;
                    return new SLG(millis, timeUnit.toMillis(j));
                }
                return new SLG(0L, 0L);
            case -1718308886:
                if (str.equals("PRODUCT_SDK_DEFAULT_COMPONENT")) {
                    timeUnit = TimeUnit.MINUTES;
                    C2FP.A0D();
                    j2 = 20160;
                    millis = timeUnit.toMillis(j2);
                    C2FP.A0D();
                    j = 0;
                    return new SLG(millis, timeUnit.toMillis(j));
                }
                return new SLG(0L, 0L);
            case -1407726477:
                if (str.equals("PERSISTENT_UP_TO_5_MINS")) {
                    timeUnit2 = TimeUnit.MINUTES;
                    j3 = 5;
                    j4 = timeUnit2.toMillis(j3);
                    return new SLG(TimeUnit.DAYS.toMillis(7L), j4);
                }
                return new SLG(0L, 0L);
            case -756353034:
                if (str.equals("PERSISTENT_UP_TO_DATE")) {
                    j4 = 0;
                    return new SLG(TimeUnit.DAYS.toMillis(7L), j4);
                }
                return new SLG(0L, 0L);
            case -134728948:
                if (str.equals("PRODUCT_SDK_CREDENTIAL")) {
                    timeUnit = TimeUnit.MINUTES;
                    C2FP.A0D();
                    j2 = 43200;
                    millis = timeUnit.toMillis(j2);
                    C2FP.A0D();
                    j = 0;
                    return new SLG(millis, timeUnit.toMillis(j));
                }
                return new SLG(0L, 0L);
            case 1821777447:
                if (str.equals("HIGHLY_PERSISTENT")) {
                    timeUnit2 = TimeUnit.DAYS;
                    j3 = 1;
                    j4 = timeUnit2.toMillis(j3);
                    return new SLG(TimeUnit.DAYS.toMillis(7L), j4);
                }
                return new SLG(0L, 0L);
            case 1841909060:
                if (str.equals("APP_START_DEFAULT_COMPONENT")) {
                    timeUnit = TimeUnit.MINUTES;
                    C2FP.A0D();
                    millis = timeUnit.toMillis(20160L);
                    C2FP.A0D();
                    j = 21600;
                    return new SLG(millis, timeUnit.toMillis(j));
                }
                return new SLG(0L, 0L);
            default:
                return new SLG(0L, 0L);
        }
    }
}
