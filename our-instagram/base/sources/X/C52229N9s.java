package X;

import android.content.Context;
import com.instagram.model.reels.Reel;

/* renamed from: X.N9s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52229N9s extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C6WQ A02;
    public final /* synthetic */ C148566mR A03;

    public C52229N9s(Context context, Reel reel, C6WQ c6wq, C148566mR c148566mR) {
        this.A03 = c148566mR;
        this.A01 = reel;
        this.A00 = context;
        this.A02 = c6wq;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(291856648);
        C11T.A03(new PPF(this));
        C0f9.A0A(1511759213, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-932955222);
        C11T.A03(new PPG(this));
        C0f9.A0A(-1594366195, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1994936828);
        int A032 = C0f9.A03(-589447580);
        C11T.A03(new PS0((EBB) obj, this));
        C0f9.A0A(-1671796133, A032);
        C0f9.A0A(-548267019, A03);
    }
}
