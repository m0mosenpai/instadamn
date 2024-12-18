package X;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Rs0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61686Rs0 {
    public static ExecutorServiceC64807TUv A00(InterfaceC65608Tnx interfaceC65608Tnx, String str, ThreadFactory threadFactory, int i, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            return new ExecutorServiceC64807TUv(new ThreadPoolExecutor(i, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new TVE(interfaceC65608Tnx, str, threadFactory, z)));
        }
        throw AbstractC167007dF.A0c("Name must be non-null and non-empty, but given: ", str);
    }
}
