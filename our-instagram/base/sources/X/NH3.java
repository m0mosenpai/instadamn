package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NH3 extends AbstractC18280vF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ P6G A01;
    public final /* synthetic */ Integer A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NH3(P6G p6g, Integer num, long j) {
        super("store_reels_swipe_signal", 691807841, 5, false, false);
        this.A02 = num;
        this.A01 = p6g;
        this.A00 = j;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        List list;
        String str;
        Integer num = this.A02;
        Integer num2 = C05F.A00;
        P6G p6g = this.A01;
        if (num == num2) {
            list = p6g.A02;
        } else {
            list = p6g.A03;
        }
        if (list.size() == p6g.A00) {
            list.remove(0);
        }
        long j = this.A00;
        list.add(Long.valueOf(j));
        C3SZ c3sz = (C3SZ) p6g.A04.getValue();
        if (num.intValue() != 0) {
            str = "profile_reel_swipes";
        } else {
            str = "iab_reel_swipes";
        }
        c3sz.FEK(str, j, p6g.A01 * 86400000);
    }
}
