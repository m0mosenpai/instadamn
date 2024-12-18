package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class ETD extends C1P1 {
    public final /* synthetic */ C33511iD A00;
    public final /* synthetic */ C33491iB A01;
    public final /* synthetic */ DirectThreadKey A02;

    public ETD(C33511iD c33511iD, C33491iB c33491iB, DirectThreadKey directThreadKey) {
        this.A00 = c33511iD;
        this.A02 = directThreadKey;
        this.A01 = c33491iB;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 867115000);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A00.A00;
        AbstractC35088Fcz.A01(userSession, C05F.A05, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0h(abstractC115105If), AbstractC35089Fd0.A00(userSession, this.A01));
        C0f9.A0A(-804036621, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(50358887);
        int A0N = AbstractC167017dG.A0N(obj, -1382587808);
        super.onSuccess(obj);
        UserSession userSession = this.A00.A00;
        Integer A0Y = AbstractC31179DnN.A0Y(this.A02);
        AbstractC35088Fcz.A01(userSession, C05F.A04, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0k(A0Y), AbstractC35089Fd0.A00(userSession, this.A01));
        C0f9.A0A(187173665, A0N);
        C0f9.A0A(1862591022, A03);
    }
}
