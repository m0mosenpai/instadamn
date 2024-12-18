package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2II, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2II {
    public static final long A00(long j, long j2) {
        return TimeUnit.MILLISECONDS.toDays(new Date(j).getTime() - new Date(j2).getTime());
    }
}
