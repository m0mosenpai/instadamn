package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Aea, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23701Aea implements C3Se {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ View A02;

    public C23701Aea(Resources resources, View view, float f) {
        this.A01 = resources;
        this.A02 = view;
        this.A00 = f;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        Resources resources = this.A01;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int A0B = AbstractC166997dE.A0B(resources);
        View view = this.A02;
        gradientDrawable.setStroke(A0B, view.getContext().getColor(R.color.igds_photo_border));
        gradientDrawable.setCornerRadius(this.A00);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, gradientDrawable});
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        view.setBackground(layerDrawable);
    }
}
