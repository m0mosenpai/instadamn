package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.R;

/* renamed from: X.Gsd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38294Gsd extends ShapeDrawable {
    public int A00;
    public final boolean A01;
    public final Context A02;

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int A0H;
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(canvas.getClipBounds());
        boolean z = this.A01;
        if (!z) {
            canvas.drawColor(this.A02.getColor(R.color.bright_foreground_disabled_material_dark));
        }
        Context context = this.A02;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (!z) {
            A0H = R.color.black_15_transparent;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_photo_border);
        }
        paint.setColor(context.getColor(A0H));
        try {
            paint.setStrokeWidth(context.getResources().getDimensionPixelSize(this.A00));
        } catch (Resources.NotFoundException e) {
            C0w9.A01(EnumC12410kj.A09, "SoldoutSlashDrawable", AnonymousClass001.A0R("Failed to find dimension resource: ", e.getMessage()));
        }
        canvas.drawLine(r3.left, r3.bottom, r3.right, r3.top, paint);
    }

    public C38294Gsd(Context context) {
        this.A00 = R.dimen.abc_control_corner_material;
        this.A02 = context;
        this.A01 = false;
    }

    public C38294Gsd(Context context, boolean z) {
        this.A00 = R.dimen.abc_control_corner_material;
        this.A02 = context;
        this.A01 = z;
    }
}
