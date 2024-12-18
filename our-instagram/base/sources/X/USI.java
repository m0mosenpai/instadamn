package X;

import com.facebook.msys.mci.DataTask;
import java.util.Map;

/* loaded from: classes11.dex */
public final class USI extends AbstractRunnableC94874Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C126435ne A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USI(C126435ne c126435ne, int i) {
        super("StreamingUploadDataTask_update");
        this.A01 = c126435ne;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C126435ne c126435ne = this.A01;
        Map map = c126435ne.A07.A03;
        DataTask dataTask = c126435ne.A02;
        if (map.containsKey(dataTask.mTaskIdentifier)) {
            c126435ne.A03.updateDataTaskUploadProgress(dataTask.mTaskIdentifier, this.A00, c126435ne.A00, c126435ne.A01.longValue());
        }
    }
}
