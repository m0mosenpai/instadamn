package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NH2 extends AbstractC18280vF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ P6F A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NH2(P6F p6f, long j) {
        super("store_reels_swipe_signal", 691807841, 5, false, false);
        this.A01 = p6f;
        this.A00 = j;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        P6F p6f = this.A01;
        List list = p6f.A03;
        if (list.size() == p6f.A00) {
            list.remove(0);
        }
        long j = this.A00;
        list.add(Long.valueOf(j));
        ((C3SZ) p6f.A04.getValue()).FEK("reels_swipe_history", j, p6f.A02 * 86400000);
    }
}
