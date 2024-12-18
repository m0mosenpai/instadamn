package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class M19 implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;

    public M19(IgSimpleImageView igSimpleImageView) {
        this.A00 = igSimpleImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(8);
    }
}
