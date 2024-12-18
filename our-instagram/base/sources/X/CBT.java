package X;

import android.graphics.RenderEffect;
import android.view.View;

/* loaded from: classes5.dex */
public abstract class CBT {
    public static final void A00(View view, AbstractC27458CAa abstractC27458CAa) {
        RenderEffect renderEffect;
        if (abstractC27458CAa != null) {
            renderEffect = abstractC27458CAa.A00();
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }
}
