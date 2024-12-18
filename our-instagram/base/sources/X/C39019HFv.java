package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

/* renamed from: X.HFv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39019HFv extends C1P1 {
    public final /* synthetic */ C98944cE A00;
    public final /* synthetic */ C1LD A01;

    public C39019HFv(C98944cE c98944cE, C1LD c1ld) {
        this.A01 = c1ld;
        this.A00 = c98944cE;
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-906764007);
        super.onStart();
        C226218q.A01(AbstractC12960li.A00).A0H();
        C0f9.A0A(-429687991, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl;
        int A03 = C0f9.A03(-625789543);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, 1431024362);
        C226218q.A01(AbstractC12960li.A00).A0I();
        C1LD c1ld = this.A01;
        UserSession userSession = c1ld.A03;
        if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36325794008216956L) && (reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) anonymousClass435.A01) != null) {
            C98944cE c98944cE = this.A00;
            C3NO F7f = I57.A00(reelsTrayQueryResponseImpl).F7f();
            C1DS.A00(userSession);
            C1LD.A02(c98944cE, F7f, c1ld, -1, anonymousClass435.CR4());
        }
        C0f9.A0A(-786544813, A0N);
        C0f9.A0A(-1989209851, A03);
    }
}
