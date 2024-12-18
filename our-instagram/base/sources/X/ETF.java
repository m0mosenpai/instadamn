package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETF extends C1P1 {
    public User A00;
    public Throwable A01;
    public final AbstractC12990ll A02;

    public ETF(AbstractC12990ll abstractC12990ll) {
        this.A02 = abstractC12990ll;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-291074964);
        this.A01 = abstractC115105If.A01();
        C0f9.A0A(-2133985259, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-3671906);
        EC7 ec7 = (EC7) obj;
        int A032 = C0f9.A03(719646149);
        AbstractC25651Mw.A00(this.A02).E4s(new C36094FwU(ec7.A00));
        this.A00 = ec7.A00;
        C0f9.A0A(-285580168, A032);
        C0f9.A0A(-399945647, A03);
    }
}
