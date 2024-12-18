package X;

import android.graphics.Camera;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: X.Vie, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69149Vie {
    public final Camera A00;
    public final Paint.FontMetrics A01;
    public final TextPaint A02;

    public C69149Vie(TextPaint textPaint) {
        this.A02 = textPaint;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        C14360o3.A07(fontMetrics);
        this.A01 = fontMetrics;
        Camera camera = new Camera();
        this.A00 = camera;
        camera.setLocation(0.0f, 0.0f, 8.0f);
    }
}
