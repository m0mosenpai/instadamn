package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EE6 extends AnonymousClass935 {
    public final /* synthetic */ C006802i A00;
    public final /* synthetic */ C36373G2z A01;
    public final /* synthetic */ C6WQ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE6(C006802i c006802i, UserSession userSession, C36373G2z c36373G2z, C6WQ c6wq, InterfaceC16660sJ interfaceC16660sJ) {
        super(userSession);
        this.A02 = c6wq;
        this.A00 = c006802i;
        this.A01 = c36373G2z;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        StringBuilder A1C;
        int A03 = C0f9.A03(-777965491);
        C14360o3.A0B(abstractC115105If, 0);
        if (abstractC115105If instanceof C115115Ig) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Eligibility check response: status code ");
            Object obj = ((C115115Ig) abstractC115105If).A00;
            A1C.append(((InterfaceC40801un) obj).getStatusCode());
            A1C.append(AbstractC43591JPw.A00(507));
            A1C.append(((InterfaceC40821up) obj).getErrorMessage());
        } else if (abstractC115105If instanceof C115095Ie) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Eligibility check ");
            A1C.append(abstractC115105If);
        } else {
            B4Z A00 = B4Z.A00();
            C0f9.A0A(-795756364, A03);
            throw A00;
        }
        String obj2 = A1C.toString();
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(478229610, "error", obj2);
        c006802i.markerEnd(478229610, (short) 3);
        AbstractC25227BEk.A1Q(this.A03, false);
        C0f9.A0A(185820523, A03);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1572990799);
        C0fJ.A00(this.A02);
        C0f9.A0A(-911095053, A03);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1238636834);
        EBQ ebq = (EBQ) obj;
        int A0N = AbstractC167017dG.A0N(ebq, -1179502632);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(478229610, "eligible", ebq.A00);
        if (!ebq.A00) {
            c006802i.markerEnd(478229610, (short) 2);
        }
        AbstractC25227BEk.A1Q(this.A03, ebq.A00);
        C0f9.A0A(-526014699, A0N);
        C0f9.A0A(-1443593226, A03);
    }
}
