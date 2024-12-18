package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes5.dex */
public final class D2D implements Runnable {
    public final /* synthetic */ InterfaceC74963Ym A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C26823Bsl A02;

    public D2D(InterfaceC74963Ym interfaceC74963Ym, FragmentActivity fragmentActivity, C26823Bsl c26823Bsl) {
        this.A02 = c26823Bsl;
        this.A01 = fragmentActivity;
        this.A00 = interfaceC74963Ym;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26823Bsl c26823Bsl = this.A02;
        C189478aR A00 = AbstractC25231BEo.A0g(c26823Bsl.A0B).A00();
        FragmentActivity fragmentActivity = this.A01;
        C26723Br4 c26723Br4 = new C26723Br4();
        c26723Br4.A00 = new C57252Pba(8, this.A00, c26823Bsl);
        A00.A02(fragmentActivity, c26723Br4);
    }
}
