package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ETs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32516ETs extends C1P1 {
    public final /* synthetic */ C33511iD A00;
    public final /* synthetic */ C33491iB A01;
    public final /* synthetic */ DirectThreadKey A02;

    public C32516ETs(C33511iD c33511iD, C33491iB c33491iB, DirectThreadKey directThreadKey) {
        this.A00 = c33511iD;
        this.A02 = directThreadKey;
        this.A01 = c33491iB;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1666175697);
        UserSession userSession = this.A00.A00;
        AbstractC35088Fcz.A01(userSession, C05F.A15, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0h(abstractC115105If), AbstractC35089Fd0.A00(userSession, this.A01));
        C0f9.A0A(-1977294753, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(247951617);
        UserSession userSession = this.A00.A00;
        Integer A0Y = AbstractC31179DnN.A0Y(this.A02);
        AbstractC35088Fcz.A01(userSession, C05F.A0j, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0k(A0Y), AbstractC35089Fd0.A00(userSession, this.A01));
        C0f9.A0A(-522286220, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(424708723);
        int A032 = C0f9.A03(906734964);
        UserSession userSession = this.A00.A00;
        Integer A0Y = AbstractC31179DnN.A0Y(this.A02);
        AbstractC35088Fcz.A01(userSession, C05F.A0u, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0k(A0Y), AbstractC35089Fd0.A00(userSession, this.A01));
        C0f9.A0A(551132424, A032);
        C0f9.A0A(1594921853, A03);
    }
}
