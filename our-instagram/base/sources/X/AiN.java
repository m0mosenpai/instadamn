package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class AiN implements InterfaceC25217BDq {
    public final /* synthetic */ C185948Mo A00;

    public AiN(C185948Mo c185948Mo) {
        this.A00 = c185948Mo;
    }

    @Override // X.InterfaceC25217BDq
    public final void DHN(String str) {
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        AtomicLong atomicLong = A00.A0F;
        atomicLong.set(A00.A0K.A06(CancelReason.USER_CANCELLED, str, 838607486, atomicLong.get()));
        AbstractC166987dD.A0u(userSession).A04(c185948Mo.A0w, AnonymousClass001.A0R("first frame: ", str));
    }

    @Override // X.InterfaceC25217BDq
    public final void DHO(String str, String str2, Throwable th) {
        String str3;
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        if (th.getMessage() != null) {
            str3 = th.getMessage();
        } else {
            str3 = "error";
        }
        C14360o3.A0B(str3, 0);
        C24Q c24q = A00.A0K;
        AtomicLong atomicLong = A00.A0F;
        c24q.A09(atomicLong.get(), MSV.A00(248), str);
        atomicLong.set(c24q.A07(str3, "", 838607486, atomicLong.get()));
        AbstractC166987dD.A0u(userSession).A07(c185948Mo.A0w, String.format(null, "first frame failed: %s", th.getMessage()), str2, str);
    }

    @Override // X.InterfaceC25217BDq
    public final void DhC(Throwable th, String str) {
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        C24Q c24q = A00.A0K;
        AtomicLong atomicLong = A00.A0F;
        long j = atomicLong.get();
        String A002 = AbstractC111324zv.A00(3293);
        c24q.A0C(A002, j);
        long j2 = atomicLong.get();
        String message = th.getMessage();
        if (message == null) {
            message = "error";
        }
        c24q.A09(j2, A002, message);
        long j3 = atomicLong.get();
        String A003 = MSV.A00(248);
        c24q.A09(j3, A003, str);
        long j4 = atomicLong.get();
        String A004 = C0JY.A00(th);
        C14360o3.A07(A004);
        c24q.A09(j4, "stack_trace", C00Q.A03(A004, 1000));
        C447724h A0u = AbstractC166987dD.A0u(userSession);
        C5JK c5jk = c185948Mo.A0w;
        C14360o3.A0B(c5jk, 0);
        if (A0u.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q2 = A0u.A04;
            c24q2.A09(A0u.A01, A003, str);
            long j5 = A0u.A01;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "empty";
            }
            c24q2.A09(j5, "error_details", message2);
            long j6 = A0u.A01;
            String A005 = C0JY.A00(th);
            C14360o3.A07(A005);
            c24q2.A09(j6, "stack_trace", C00Q.A03(A005, 1000));
            A0u.A01 = c24q2.A05("first_frame_retry", 585185740, A0u.A01, A0u.A03);
        }
    }

    @Override // X.InterfaceC25217BDq
    public final void DyQ() {
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        C5JK c5jk = c185948Mo.A0w;
        String str = c185948Mo.A05.A02;
        C22P c22p = c185948Mo.A0Y;
        AbstractC167017dG.A1O(c5jk, c22p);
        C183348Bh.A01(c22p, A00, c5jk, str, "init_vvp", "4");
        AbstractC166987dD.A0u(userSession).A05(c5jk, "vvp_created");
    }

    @Override // X.InterfaceC25217BDq
    public final void DyR() {
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        C5JK c5jk = c185948Mo.A0w;
        String str = c185948Mo.A05.A02;
        C22P c22p = c185948Mo.A0Y;
        AbstractC167017dG.A1O(c5jk, c22p);
        C183348Bh.A01(c22p, A00, c5jk, str, "init_vvp_mdm", "3");
        AbstractC166987dD.A0u(userSession).A05(c5jk, "vvp_media_decoder_manager_created");
    }

    @Override // X.InterfaceC25217BDq
    public final void DyS() {
        C185948Mo c185948Mo = this.A00;
        AbstractC166987dD.A0u(c185948Mo.A0c).A05(c185948Mo.A0w, "vvp_state_preparing");
    }

    @Override // X.InterfaceC25217BDq
    public final void DyT() {
        C185948Mo c185948Mo = this.A00;
        AbstractC166987dD.A0u(c185948Mo.A0c).A05(c185948Mo.A0w, "vvp_state_ready");
    }

    @Override // X.InterfaceC25217BDq
    public final void onFirstFrameRendered() {
        C11T.A02(new RunnableC24334Aqd(this));
        C185948Mo c185948Mo = this.A00;
        UserSession userSession = c185948Mo.A0c;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        AtomicLong atomicLong = A00.A0F;
        atomicLong.set(A00.A0K.A02(838607486, atomicLong.get()));
        C447724h A0u = AbstractC166987dD.A0u(userSession);
        C5JK c5jk = c185948Mo.A0w;
        C14360o3.A0B(c5jk, 0);
        if (A0u.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            A0u.A01 = A0u.A04.A02(585185740, A0u.A01);
        }
    }
}
