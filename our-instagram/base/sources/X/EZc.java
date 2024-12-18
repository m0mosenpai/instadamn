package X;

import android.content.res.Configuration;

/* loaded from: classes6.dex */
public final class EZc extends AbstractRunnableC14200nk {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ C2US A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.smartUpdateSync(this.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZc(C2US c2us, Configuration configuration) {
        super(160366289);
        this.A01 = c2us;
        this.A00 = configuration;
    }
}
