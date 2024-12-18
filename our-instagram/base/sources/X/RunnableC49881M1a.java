package X;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.M1a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49881M1a implements Runnable {
    public final /* synthetic */ C160587Hs A00;

    public RunnableC49881M1a(C160587Hs c160587Hs) {
        this.A00 = c160587Hs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgImageView igImageView = this.A00.A02;
        if (igImageView != null) {
            igImageView.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP));
        }
    }
}
