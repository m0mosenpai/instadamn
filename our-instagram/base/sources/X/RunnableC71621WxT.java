package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.WxT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71621WxT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ V2P A01;
    public final /* synthetic */ ViewOnKeyListenerC98854c5 A02;
    public final /* synthetic */ UJ1 A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ C4QW A05;

    public RunnableC71621WxT(V2P v2p, ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5, UJ1 uj1, InterfaceC11380iw interfaceC11380iw, C4QW c4qw, int i) {
        this.A02 = viewOnKeyListenerC98854c5;
        this.A01 = v2p;
        this.A03 = uj1;
        this.A05 = c4qw;
        this.A04 = interfaceC11380iw;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.VBj, X.4S7] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = this.A02;
        V2P v2p = this.A01;
        UJ1 uj1 = this.A03;
        C24341Hd A00 = AbstractC24321Hb.A00(viewOnKeyListenerC98854c5.A08);
        boolean z = viewOnKeyListenerC98854c5.A04;
        Boolean bool = A00.A01;
        if (bool != null) {
            z = bool.booleanValue();
        }
        ?? c4s7 = new C4S7((Object) null, 0);
        c4s7.A00 = v2p;
        c4s7.A01 = uj1;
        c4s7.A00 = z;
        viewOnKeyListenerC98854c5.A01 = c4s7;
        if (viewOnKeyListenerC98854c5.A04 && v2p.A02) {
            ViewOnKeyListenerC98854c5.A00(viewOnKeyListenerC98854c5);
        }
        C68105VBj c68105VBj = viewOnKeyListenerC98854c5.A01;
        if (c68105VBj != null) {
            C4QW c4qw = this.A05;
            InterfaceC11380iw interfaceC11380iw = this.A04;
            int i = this.A00;
            C75363a3 c75363a3 = v2p.A01;
            MediaFrameLayout mediaFrameLayout = c68105VBj.A01.A02;
            float f = 0.0f;
            if (v2p.A02) {
                f = 1.0f;
            }
            String moduleName = interfaceC11380iw.getModuleName();
            C14360o3.A0B(moduleName, 6);
            c4qw.E5v(new C4SC(mediaFrameLayout, new C4QP(false, false, false, false), c75363a3, c68105VBj, null, moduleName, f, -1, i, true));
        }
    }
}
