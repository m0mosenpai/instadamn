package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class GPQ implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public GPQ(IgSimpleImageView igSimpleImageView, Runnable runnable, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = runnable;
        this.A02 = interfaceC16820sZ;
        this.A00 = igSimpleImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.run();
        this.A02.invoke();
        IgSimpleImageView igSimpleImageView = this.A00;
        igSimpleImageView.setTranslationY(0.0f);
        igSimpleImageView.setTranslationX(0.0f);
        igSimpleImageView.setScaleY(1.0f);
        igSimpleImageView.setScaleX(1.0f);
        igSimpleImageView.setVisibility(8);
    }
}
