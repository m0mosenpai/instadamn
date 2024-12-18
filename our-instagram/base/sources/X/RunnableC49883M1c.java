package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.M1c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49883M1c implements Runnable {
    public final /* synthetic */ C160587Hs A00;

    public RunnableC49883M1c(C160587Hs c160587Hs) {
        this.A00 = c160587Hs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgImageView igImageView = this.A00.A02;
        if (igImageView != null) {
            igImageView.setRenderEffect(null);
        }
    }
}
