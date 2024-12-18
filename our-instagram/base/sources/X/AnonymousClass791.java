package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.791, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass791 implements InterfaceC65702y7 {
    public int A00;
    public C7B0 A01;
    public boolean A02;
    public boolean A03;
    public final C162247Oj A04;
    public final Matrix A05;
    public final LayerDrawable A06;
    public final C09530e4 A07;
    public final InterfaceC16660sJ A08;

    public AnonymousClass791(final Shape shape, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 4);
        this.A08 = interfaceC16660sJ;
        final WeakReference weakReference = new WeakReference(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape, weakReference) { // from class: X.792
            public final WeakReference A00;

            @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                C14360o3.A0B(rect, 0);
                super.onBoundsChange(rect);
                AnonymousClass791 anonymousClass791 = (AnonymousClass791) this.A00.get();
                if (anonymousClass791 != null) {
                    AnonymousClass791.A00(anonymousClass791);
                }
            }

            {
                this.A00 = weakReference;
            }
        };
        shapeDrawable.getPaint().setAlpha(0);
        final WeakReference weakReference2 = new WeakReference(this);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(shape, weakReference2) { // from class: X.792
            public final WeakReference A00;

            @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                C14360o3.A0B(rect, 0);
                super.onBoundsChange(rect);
                AnonymousClass791 anonymousClass791 = (AnonymousClass791) this.A00.get();
                if (anonymousClass791 != null) {
                    AnonymousClass791.A00(anonymousClass791);
                }
            }

            {
                this.A00 = weakReference2;
            }
        };
        shapeDrawable2.getPaint().setAlpha(0);
        final WeakReference weakReference3 = new WeakReference(this);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(shape, weakReference3) { // from class: X.792
            public final WeakReference A00;

            @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                C14360o3.A0B(rect, 0);
                super.onBoundsChange(rect);
                AnonymousClass791 anonymousClass791 = (AnonymousClass791) this.A00.get();
                if (anonymousClass791 != null) {
                    AnonymousClass791.A00(anonymousClass791);
                }
            }

            {
                this.A00 = weakReference3;
            }
        };
        shapeDrawable3.getPaint().setAlpha(0);
        ArrayList A1N = AbstractC16960so.A1N(shapeDrawable2, shapeDrawable);
        A1N.add(shapeDrawable3);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) A1N.toArray(new Drawable[0]));
        C162247Oj c162247Oj = new C162247Oj(shapeDrawable, shapeDrawable2, shapeDrawable3, shape, null, new WeakReference(layerDrawable));
        C162247Oj.A06.put(layerDrawable, c162247Oj);
        C09530e4 c09530e4 = new C09530e4(layerDrawable, c162247Oj);
        this.A07 = c09530e4;
        this.A06 = (LayerDrawable) c09530e4.A00;
        this.A04 = (C162247Oj) c09530e4.A01;
        this.A05 = new Matrix();
        this.A02 = true;
        this.A03 = true;
    }

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        Bitmap bitmap2;
        C14360o3.A0B(igImageView, 0);
        C14360o3.A0B(bitmap, 1);
        C7B0 c7b0 = this.A01;
        if (c7b0 != null) {
            bitmap2 = c7b0.E51(bitmap);
        } else {
            bitmap2 = bitmap;
        }
        C162247Oj c162247Oj = this.A04;
        ShapeDrawable shapeDrawable = c162247Oj.A01;
        shapeDrawable.setIntrinsicWidth(bitmap.getWidth());
        shapeDrawable.setIntrinsicHeight(bitmap.getHeight());
        ShapeDrawable shapeDrawable2 = c162247Oj.A00;
        shapeDrawable2.setIntrinsicWidth(bitmap.getWidth());
        shapeDrawable2.setIntrinsicHeight(bitmap.getHeight());
        boolean z = this.A03;
        Shape shape = shapeDrawable.getShape();
        C14360o3.A0B(shape, 1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setShader(bitmapShader);
        paint.setAlpha(255);
        if (z && (shape instanceof AbstractC148416mB)) {
            C162817Qs c162817Qs = (C162817Qs) ((AbstractC148416mB) shape);
            c162817Qs.A00 = 0.0f;
            c162817Qs.A03 = true;
        }
        shapeDrawable.setShaderFactory(null);
        shapeDrawable.setShape(shape);
        bitmapShader.setLocalMatrix(this.A05);
        shapeDrawable.setAlpha(255);
        c162247Oj.A02.setAlpha(0);
        if (this.A03) {
            shapeDrawable2.setAlpha(0);
        }
        A00(this);
        igImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        igImageView.setImageDrawable((Drawable) this.A08.invoke(this.A06));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void A00(AnonymousClass791 anonymousClass791) {
        Matrix matrix;
        float width;
        float height;
        ShapeDrawable shapeDrawable = anonymousClass791.A04.A01;
        Rect bounds = shapeDrawable.getBounds();
        C14360o3.A07(bounds);
        Shader shader = shapeDrawable.getPaint().getShader();
        int intrinsicWidth = shapeDrawable.getIntrinsicWidth();
        int intrinsicHeight = shapeDrawable.getIntrinsicHeight();
        if (!bounds.isEmpty() && intrinsicWidth >= 1 && intrinsicHeight >= 1 && shader != null) {
            float f = 0.0f;
            if (anonymousClass791.A02) {
                if (bounds.height() * intrinsicWidth > bounds.width() * intrinsicHeight) {
                    width = bounds.height() / intrinsicHeight;
                    f = (bounds.width() - (intrinsicWidth * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = bounds.width() / intrinsicWidth;
                    height = (bounds.height() - (intrinsicHeight * width)) * 0.5f;
                }
                matrix = anonymousClass791.A05;
                matrix.setScale(width, width);
                matrix.postTranslate(f, height);
            } else {
                float f2 = -1.0f;
                switch (anonymousClass791.A00) {
                    case 2:
                        break;
                    case 3:
                        f = 180.0f;
                        f2 = 1.0f;
                        break;
                    case 4:
                        f = 180.0f;
                        break;
                    case 5:
                        f = 90.0f;
                        break;
                    case 6:
                        f = 90.0f;
                        f2 = 1.0f;
                        break;
                    case 7:
                        f = -90.0f;
                        break;
                    case 8:
                        f = -90.0f;
                        f2 = 1.0f;
                        break;
                    default:
                        f2 = 1.0f;
                        break;
                }
                float f3 = intrinsicWidth / 2.0f;
                float f4 = intrinsicHeight / 2.0f;
                matrix = anonymousClass791.A05;
                matrix.setRotate(f, f3, f4);
                matrix.postScale(f2, 1.0f, f3, f4);
            }
            shader.setLocalMatrix(matrix);
        }
    }
}
