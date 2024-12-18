package X;

import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* loaded from: classes9.dex */
public final class NGU extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MainFeedLocalDataSource A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGU(MainFeedLocalDataSource mainFeedLocalDataSource, int i) {
        super(117128848, i, false, false);
        this.A00 = i;
        this.A01 = mainFeedLocalDataSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PZF.A02(this.A01, AbstractC24771Iv.A02(117128848, this.A00), 11);
    }
}
