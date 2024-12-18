package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.TtT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65754TtT {
    public static final EdgeEffect A02(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static final float A00(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.EdgeEffect] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.EdgeEffect] */
    /* JADX WARN: Type inference failed for: r0v3, types: [float] */
    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        try {
            edgeEffect = edgeEffect.onPullDistance(f, f2);
            return edgeEffect;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
