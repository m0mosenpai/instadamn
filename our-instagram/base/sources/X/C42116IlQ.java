package X;

import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

/* renamed from: X.IlQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42116IlQ implements C2JL {
    public final /* synthetic */ C1P1 A00;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A00.onFail(new C115095Ie(th));
    }

    public C42116IlQ(C1P1 c1p1) {
        this.A00 = c1p1;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        C14360o3.A0B(anonymousClass436, 0);
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) anonymousClass436.Bos();
        if (reelsTrayQueryResponseImpl != null) {
            this.A00.onSuccess(I57.A00(reelsTrayQueryResponseImpl));
        }
    }
}
