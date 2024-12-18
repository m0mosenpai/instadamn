package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class V6I extends AbstractRunnableC14200nk {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ ArrayList A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6I(BanyanCoordinator banyanCoordinator, ArrayList arrayList) {
        super(623, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BanyanCoordinator banyanCoordinator = this.A00;
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = banyanCoordinator.A07.A06;
        }
        banyanCoordinator.A02 = arrayList;
        banyanCoordinator.A00 = 0;
        BanyanCoordinator.A04(banyanCoordinator);
    }
}
