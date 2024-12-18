package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.AeU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23695AeU implements C3Se {
    public final ImageView A00;

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        ImageView imageView = this.A00;
        Context context = imageView.getContext();
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setStyle(Paint.Style.FILL_AND_STROKE);
        AbstractC166987dD.A1N(context, A0R, R.color.design_dark_default_color_on_background);
        A0R.setStrokeWidth(0.0f);
        OvalShape ovalShape = new OvalShape();
        boolean z = C1NC.A02;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        AbstractC166997dE.A1D(A0R, PorterDuff.Mode.SRC_OUT);
        ovalShape.resize(width, height);
        ovalShape.draw(canvas, A0R);
        imageView.setImageBitmap(createBitmap);
    }

    public C23695AeU(ImageView imageView) {
        this.A00 = imageView;
    }
}
