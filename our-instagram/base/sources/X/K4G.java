package X;

import com.facebook.msys.mca.Mailbox;

/* loaded from: classes8.dex */
public final class K4G extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4G(Mailbox mailbox) {
        super("scheduleTaskProcessingIfNeeded");
        this.A00 = mailbox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.scheduleTaskProcessingIfNeededNative();
    }
}
