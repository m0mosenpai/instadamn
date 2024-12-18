package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* loaded from: classes7.dex */
public final class HJX extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1OP A01;
    public final /* synthetic */ C3NO A02;
    public final /* synthetic */ C1LD A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJX(C1OP c1op, C3NO c3no, C1LD c1ld, int i, boolean z) {
        super(399, 1, false, true);
        this.A03 = c1ld;
        this.A01 = c1op;
        this.A02 = c3no;
        this.A04 = z;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A03.A03;
        ReelStore A04 = C1OU.A04(userSession);
        C1OP c1op = this.A01;
        C3NO c3no = this.A02;
        List A01 = AbstractC73333Qj.A01(userSession, c3no);
        List A00 = AbstractC73333Qj.A00(userSession, c3no);
        A04.A0Z(c3no.A04, c1op, AbstractC166987dD.A10(userSession), A01, A00, this.A00, this.A04, AbstractC73333Qj.A02(c3no));
    }
}
