package X;

import android.os.ConditionVariable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0BC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BC {
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicLong A03 = new AtomicLong(-1);
}
