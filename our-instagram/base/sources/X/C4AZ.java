package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4AZ, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4AZ {
    NONE,
    HIGH,
    LOW,
    URGENT;

    public static final List A00;

    static {
        C4AZ c4az = NONE;
        C4AZ c4az2 = HIGH;
        C4AZ c4az3 = LOW;
        A00 = Collections.unmodifiableList(Arrays.asList(URGENT, c4az2, c4az3, c4az));
    }
}
