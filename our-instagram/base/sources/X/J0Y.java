package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes7.dex */
public final class J0Y implements InterfaceC1119153d {
    public final /* synthetic */ C143536ds A00;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public J0Y(C143536ds c143536ds) {
        this.A00 = c143536ds;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C143536ds c143536ds = this.A00;
        C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
        if (c145726hV != null) {
            c145726hV.A00();
        }
        C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
        if (c146016hy != null) {
            InterfaceC1118853a interfaceC1118853a = c146016hy.A04;
            C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
            if (c41551w4 != null) {
                C145826hf c145826hf = c146016hy.A03;
                Reel reel = c41551w4.A0H;
                C41181vS AuU = interfaceC1118853a.AuU();
                if (AuU != null) {
                    c145826hf.A06(reel, AuU, "DISMISS_SHEET");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
