package X;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;

/* loaded from: classes5.dex */
public abstract class CBS {
    public static final void A00(RenderNode renderNode, AbstractC27458CAa abstractC27458CAa) {
        RenderEffect renderEffect;
        if (abstractC27458CAa != null) {
            renderEffect = abstractC27458CAa.A00();
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }
}
