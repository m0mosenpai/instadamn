package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Vis, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69163Vis {
    public final float A00;
    public final Path A01;
    public final RectF A02;

    public C69163Vis(float f) {
        Path path;
        this.A00 = f;
        if (f > 0.0f) {
            path = new Path();
        } else {
            path = null;
        }
        this.A01 = path;
        this.A02 = new RectF();
    }
}
