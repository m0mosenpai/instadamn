package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.JuV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44917JuV extends C3QL {
    public final Path A00;

    @Override // X.C3QL
    public final void A00(Canvas canvas, Paint paint) {
        C14360o3.A0B(paint, 1);
        canvas.drawPath(this.A00, paint);
    }

    public C44917JuV(Path path) {
        this.A00 = path;
    }
}
