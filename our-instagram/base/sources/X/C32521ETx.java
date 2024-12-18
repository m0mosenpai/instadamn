package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ETx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32521ETx extends C1P1 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C33511iD A01;
    public final /* synthetic */ C33491iB A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ String A04;

    public C32521ETx(InterfaceC37261GbE interfaceC37261GbE, C33511iD c33511iD, C33491iB c33491iB, DirectThreadKey directThreadKey, String str) {
        this.A01 = c33511iD;
        this.A03 = directThreadKey;
        this.A02 = c33491iB;
        this.A04 = str;
        this.A00 = interfaceC37261GbE;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 2018803586);
        UserSession userSession = this.A01.A00;
        AbstractC35088Fcz.A01(userSession, C05F.A02, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0h(abstractC115105If), AbstractC35089Fd0.A00(userSession, this.A02));
        C0f9.A0A(2011128309, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-364328851);
        UserSession userSession = this.A01.A00;
        Integer A0Y = AbstractC31179DnN.A0Y(this.A03);
        AbstractC35088Fcz.A01(userSession, C05F.A1F, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0k(A0Y), AbstractC35089Fd0.A00(userSession, this.A02));
        C0f9.A0A(-137725457, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(568321036);
        C126455ng c126455ng = (C126455ng) obj;
        int A0N = AbstractC167017dG.A0N(c126455ng, -1790364395);
        C33511iD c33511iD = this.A01;
        UserSession userSession = c33511iD.A00;
        DirectThreadKey directThreadKey = this.A03;
        Integer A0Y = AbstractC31179DnN.A0Y(directThreadKey);
        C33491iB c33491iB = this.A02;
        AbstractC35088Fcz.A01(userSession, C05F.A1I, "direct_send_collection_share_message_mutation_processor", AbstractC31180DnO.A0k(A0Y), AbstractC35089Fd0.A00(userSession, c33491iB));
        DirectThreadKey directThreadKey2 = new DirectThreadKey(c126455ng.A1E, directThreadKey.A02);
        C1GJ.A03(C33511iD.A01(c33511iD, c33491iB, directThreadKey2, this.A04));
        C1GJ.A03(C33511iD.A00(this.A00, c33511iD, c33491iB, directThreadKey2));
        C0f9.A0A(701114978, A0N);
        C0f9.A0A(-1381939597, A03);
    }
}
