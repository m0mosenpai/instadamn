package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class PNT implements Runnable {
    public final /* synthetic */ C51354MmF A00;

    public PNT(C51354MmF c51354MmF) {
        this.A00 = c51354MmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51354MmF c51354MmF = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        IgImageView igImageView = c51354MmF.A09;
        AMo.A06(igImageView, igImageView.getWidth());
        AMo.A06(c51354MmF.A02, igImageView.getWidth());
        c51354MmF.A00 = true;
    }
}
