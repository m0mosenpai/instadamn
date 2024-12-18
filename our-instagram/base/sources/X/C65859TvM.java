package X;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: X.TvM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C65859TvM {
    public static final int[] A02 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Bitmap A00;
    public final ProgressBar A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.drawable.LayerDrawable] */
    public final Drawable A01(Drawable drawable, boolean z) {
        ?? shapeDrawable;
        boolean z2;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301) {
                    z2 = false;
                    if (id != 16908303) {
                        drawableArr[i] = A01(drawable2, z2);
                    }
                }
                z2 = true;
                drawableArr[i] = A01(drawable2, z2);
            }
            shapeDrawable = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                shapeDrawable.setId(i2, layerDrawable.getId(i2));
                shapeDrawable.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                shapeDrawable.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                shapeDrawable.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                shapeDrawable.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                shapeDrawable.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                shapeDrawable.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                shapeDrawable.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                shapeDrawable.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                shapeDrawable.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.A00 == null) {
                this.A00 = bitmap;
            }
            shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
        } else {
            return drawable;
        }
        return shapeDrawable;
    }

    public void A02(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.A01;
        C53122bu A00 = C53122bu.A00(progressBar.getContext(), attributeSet, A02, i, 0);
        Drawable A03 = A00.A03(0);
        if (A03 != null) {
            if (A03 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) A03;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable A01 = A01(animationDrawable.getFrame(i2), true);
                    A01.setLevel(10000);
                    animationDrawable2.addFrame(A01, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                A03 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(A03);
        }
        Drawable A032 = A00.A03(1);
        if (A032 != null) {
            progressBar.setProgressDrawable(A01(A032, false));
        }
        A00.A02.recycle();
    }

    public C65859TvM(ProgressBar progressBar) {
        this.A01 = progressBar;
    }
}
