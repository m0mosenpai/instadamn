package com.facebook.primitive.canvas.model;

import X.C14360o3;
import X.C50662Um;
import X.InterfaceC30927Die;
import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class CanvasInverseTransform implements InterfaceC30927Die {
    public static final CanvasInverseTransform A00 = new Object();

    @Override // X.InterfaceC30927Die
    public final void ACD(Matrix matrix) {
        C14360o3.A0B(matrix, 0);
        if (!matrix.invert(matrix)) {
            C50662Um.A03("com.facebook.primitive.canvas.model.CanvasInverseTransform", "The matrix supplied cannot be inverted");
        }
    }
}
