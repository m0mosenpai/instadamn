package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class PP9 implements Runnable {
    public final /* synthetic */ C25370BKn A00;

    public PP9(C25370BKn c25370BKn) {
        this.A00 = c25370BKn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgImageView igImageView = this.A00.A02;
        if (igImageView != null) {
            AbstractC166997dE.A1L(igImageView, true);
        }
    }
}
