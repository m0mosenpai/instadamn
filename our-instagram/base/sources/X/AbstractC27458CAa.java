package X;

import android.graphics.RenderEffect;

/* renamed from: X.CAa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27458CAa {
    public RenderEffect A00;

    public abstract RenderEffect A01();

    public final RenderEffect A00() {
        RenderEffect renderEffect = this.A00;
        if (renderEffect == null) {
            RenderEffect A01 = A01();
            this.A00 = A01;
            return A01;
        }
        return renderEffect;
    }
}
