package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class KME extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C50992Vv A01;
    public final /* synthetic */ HashMap A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KME(Context context, C50992Vv c50992Vv, HashMap hashMap) {
        super(1822781839, 2, false, false);
        this.A02 = hashMap;
        this.A00 = context;
        this.A01 = c50992Vv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50802Vb.A05(this.A00, this.A01, this.A02);
    }
}
