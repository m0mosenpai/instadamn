package X;

import com.facebook.msys.mci.Execution;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.V6c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68010V6c extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1335060u A00;
    public final /* synthetic */ C126435ne A01;
    public final /* synthetic */ byte[] A02;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C126435ne c126435ne = this.A01;
            byte[] bArr = this.A02;
            int length = bArr.length;
            long j = c126435ne.A00 + length;
            c126435ne.A00 = j;
            if (j <= 104857600) {
                c126435ne.A05.A01(bArr, false);
                Execution.executeAsync(new USI(c126435ne, length), null, 3);
                if (c126435ne.A00 < c126435ne.A01.longValue()) {
                    Execution.executeAsync(new USD(c126435ne), null, 3);
                    return;
                }
                return;
            }
            throw new IOException("Maximum upload size exceeded");
        } catch (IOException e) {
            C0K8.A0K(AbstractC111324zv.A00(3650), "Failed to update streaming DataTask.", e);
            throw new RejectedExecutionException("Failed to update streaming DataTask.", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68010V6c(C1335060u c1335060u, C126435ne c126435ne, byte[] bArr) {
        super(1338936892, 3, true, false);
        this.A00 = c1335060u;
        this.A01 = c126435ne;
        this.A02 = bArr;
    }
}
