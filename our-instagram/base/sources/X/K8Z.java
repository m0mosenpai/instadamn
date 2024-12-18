package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K8Z extends AnonymousClass935 {
    public final /* synthetic */ C006802i A00;
    public final /* synthetic */ C36373G2z A01;
    public final /* synthetic */ C6WQ A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8Z(C006802i c006802i, UserSession userSession, C36373G2z c36373G2z, C6WQ c6wq, boolean z) {
        super(userSession);
        this.A02 = c6wq;
        this.A00 = c006802i;
        this.A01 = c36373G2z;
        this.A03 = z;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        StringBuilder A1C;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1199316582);
        this.A02.dismiss();
        if (abstractC115105If instanceof C115115Ig) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Create thread response: status code ");
            Object obj = ((C115115Ig) abstractC115105If).A00;
            A1C.append(((C40791um) obj).mStatusCode);
            A1C.append(", errorMessage ");
            A1C.append(((C40781ul) obj).getErrorMessage());
        } else if (abstractC115105If instanceof C115095Ie) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Create thread ");
            A1C.append(abstractC115105If);
        } else {
            B4Z A00 = B4Z.A00();
            C0f9.A0A(1123902629, A0N);
            throw A00;
        }
        String obj2 = A1C.toString();
        C006802i c006802i = this.A00;
        C36373G2z c36373G2z = this.A01;
        c006802i.markerAnnotate(478229610, "error", obj2);
        c006802i.markerEnd(478229610, (short) 3);
        FUC.A00(c36373G2z.A01, c36373G2z.A02, c36373G2z.A03, c36373G2z.A04, this.A03);
        C0f9.A0A(532513270, A0N);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(450585627);
        C126455ng c126455ng = (C126455ng) obj;
        int A0N = AbstractC167017dG.A0N(c126455ng, -2080766585);
        this.A02.dismiss();
        C006802i c006802i = this.A00;
        C36373G2z c36373G2z = this.A01;
        c006802i.markerEnd(478229610, (short) 2);
        C36881nl A01 = C36881nl.A01(c36373G2z.A01, c36373G2z.A02, c36373G2z.A03, "thread_details");
        String str = c126455ng.A1E;
        C14360o3.A07(str);
        A01.A0B = new C83693oE(str);
        A01.A0s = true;
        A01.A06 = new C36395G3w(c36373G2z, 8);
        A01.A06();
        C0f9.A0A(-1971048799, A0N);
        C0f9.A0A(2104323956, A03);
    }
}
