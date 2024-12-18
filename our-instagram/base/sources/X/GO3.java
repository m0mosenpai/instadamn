package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class GO3 implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ Runnable A01;

    public GO3(IgSimpleImageView igSimpleImageView, Runnable runnable) {
        this.A00 = igSimpleImageView;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.postDelayed(this.A01, 250L);
    }
}
