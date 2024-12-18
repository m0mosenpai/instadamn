package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class EUG extends C1P1 {
    public final /* synthetic */ C32286EJy A00;

    public EUG(C32286EJy c32286EJy) {
        this.A00 = c32286EJy;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -364729447);
        Context context = this.A00.getContext();
        if (context != null) {
            AbstractC35254Fgn.A02(context, abstractC115105If);
        }
        C0f9.A0A(1468762751, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1229188253);
        AbstractC31176DnK.A0y(this.A00.getActivity(), C56352iT.A0t);
        C0f9.A0A(766816840, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2050382774);
        AbstractC31176DnK.A0z(this.A00.getActivity(), C56352iT.A0t);
        C0f9.A0A(1378479404, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(520475149);
        EDW edw = (EDW) obj;
        int A0N = AbstractC167017dG.A0N(edw, -2127602261);
        C32286EJy c32286EJy = this.A00;
        c32286EJy.requireView().post(new RunnableC36913GOi(edw, c32286EJy));
        C0f9.A0A(-996615574, A0N);
        C0f9.A0A(771709819, A03);
    }
}
