package X;

import com.facebook.msys.mci.DataTask;
import java.util.Map;

/* loaded from: classes11.dex */
public final class USD extends AbstractRunnableC94874Os {
    public final /* synthetic */ C126435ne A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USD(C126435ne c126435ne) {
        super("StreamingUploadDataTask_ask_for_data");
        this.A00 = c126435ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C126435ne c126435ne = this.A00;
        Map map = c126435ne.A07.A03;
        DataTask dataTask = c126435ne.A02;
        if (map.containsKey(dataTask.mTaskIdentifier)) {
            c126435ne.A03.canHandleStreamingUploadUpdate(dataTask.mTaskIdentifier);
        }
    }
}
