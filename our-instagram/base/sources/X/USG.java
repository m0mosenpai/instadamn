package X;

import com.facebook.msys.mci.DataTask;

/* loaded from: classes11.dex */
public final class USG extends AbstractRunnableC94874Os {
    public final /* synthetic */ AbstractC115105If A00;
    public final /* synthetic */ C126585nu A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USG(AbstractC115105If abstractC115105If, C126585nu c126585nu) {
        super("performDataTaskStreaming");
        this.A01 = c126585nu;
        this.A00 = abstractC115105If;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C126585nu c126585nu = this.A01;
        DataTask dataTask = c126585nu.A00;
        String str = dataTask.mTaskCategory;
        String str2 = dataTask.mTaskIdentifier;
        Object A00 = this.A00.A00();
        A00.getClass();
        C126415nc c126415nc = (C126415nc) A00;
        c126585nu.A01.onDataTaskNewStreamingDataCallback(str, str2, c126415nc.A00, c126415nc.A02);
    }
}
