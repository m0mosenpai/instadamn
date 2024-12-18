package X;

import android.widget.FrameLayout;
import com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit;

/* loaded from: classes9.dex */
public final class PPO implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BKBloksAvatarEditorSparkAvatarPreviewRenderUnit A01;

    public PPO(FrameLayout frameLayout, BKBloksAvatarEditorSparkAvatarPreviewRenderUnit bKBloksAvatarEditorSparkAvatarPreviewRenderUnit) {
        this.A01 = bKBloksAvatarEditorSparkAvatarPreviewRenderUnit;
        this.A00 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BKBloksAvatarEditorSparkAvatarPreviewRenderUnit bKBloksAvatarEditorSparkAvatarPreviewRenderUnit = this.A01;
        FrameLayout frameLayout = this.A00;
        frameLayout.isAttachedToWindow();
        if (!frameLayout.isAttachedToWindow()) {
            bKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0P(frameLayout);
        }
    }
}
