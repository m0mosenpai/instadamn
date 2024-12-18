package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class M0K implements Runnable {
    public final /* synthetic */ IgImageView A00;

    public M0K(IgImageView igImageView) {
        this.A00 = igImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.performHapticFeedback(0);
    }
}
