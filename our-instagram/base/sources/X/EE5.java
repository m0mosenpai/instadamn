package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EE5 extends AnonymousClass935 {
    public final /* synthetic */ AnonymousClass935 A00;
    public final /* synthetic */ C35511lX A01;
    public final /* synthetic */ C35491lV A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE5(AnonymousClass935 anonymousClass935, UserSession userSession, C35511lX c35511lX, C35491lV c35491lV) {
        super(userSession);
        this.A01 = c35511lX;
        this.A02 = c35491lV;
        this.A00 = anonymousClass935;
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1623136593);
        this.A00.onFail(abstractC115105If);
        ((C006802i) AbstractC166987dD.A17(this.A01.A01)).markerEnd(834877734, (short) 3);
        C0f9.A0A(-1395652363, A0N);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1353828501);
        super.onStart();
        InterfaceC09390do interfaceC09390do = this.A01.A01;
        ((C006802i) AbstractC166987dD.A17(interfaceC09390do)).markerStart(834877734);
        ((C006802i) AbstractC166987dD.A17(interfaceC09390do)).markerAnnotate(834877734, UserFlowLoggerImpl.SOURCE_ANNOTATION, "typing_indicator_thread_level_toggle");
        ((C006802i) AbstractC166987dD.A17(interfaceC09390do)).markerAnnotate(834877734, MSV.A00(105), this.A02.A01);
        C0f9.A0A(1795034662, A03);
    }

    @Override // X.AnonymousClass935, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(159715493);
        int A0N = AbstractC167017dG.A0N(obj, 566930498);
        this.A00.onSuccess(obj);
        ((C006802i) AbstractC166987dD.A17(this.A01.A01)).markerEnd(834877734, (short) 2);
        C0f9.A0A(462313562, A0N);
        C0f9.A0A(427641417, A03);
    }
}
