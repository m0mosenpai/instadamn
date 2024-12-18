package X;

/* loaded from: classes11.dex */
public final class USH extends AbstractRunnableC94874Os {
    public final /* synthetic */ C126435ne A00;
    public final /* synthetic */ C1334960t A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USH(C126435ne c126435ne, C1334960t c1334960t) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A00 = c126435ne;
        this.A01 = c1334960t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C126435ne c126435ne = this.A00;
        c126435ne.A03.canHandleStreamingUploadUpdate(c126435ne.A02.mTaskIdentifier);
    }
}
