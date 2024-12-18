package X;

import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

/* loaded from: classes7.dex */
public final class HGB extends C1P1 {
    public final /* synthetic */ C1P1 A00;

    public HGB(C1P1 c1p1) {
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1290594790);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) abstractC115105If.A00();
        if (anonymousClass435 != null && (reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) anonymousClass435.A01) != null) {
            C1P1 c1p1 = this.A00;
            C3LZ A00 = I57.A00(reelsTrayQueryResponseImpl);
            c1p1.onFailInBackground(new C115115Ig(A00));
            onFinish();
            c1p1.onFail(new C115115Ig(A00));
        }
        C0f9.A0A(1653523122, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1982149838);
        super.onFinish();
        C0f9.A0A(-2044550310, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-56830991);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, -1950152553);
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) anonymousClass435.A01;
        if (reelsTrayQueryResponseImpl != null) {
            C1P1 c1p1 = this.A00;
            C3LZ A00 = I57.A00(reelsTrayQueryResponseImpl);
            c1p1.onSuccessInBackground(A00);
            onFinish();
            c1p1.onSuccess(A00);
        }
        C0f9.A0A(-600971679, A0N);
        C0f9.A0A(344084892, A03);
    }
}
