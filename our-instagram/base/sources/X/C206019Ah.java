package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206019Ah {
    public static final C206019Ah A00 = new Object();

    public static final C177967vV A00(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        return new C177967vV(new PorterDuffColorFilter(igImageView.getContext().getColor(R.color.action_bar_semi_transparent_white), PorterDuff.Mode.SRC_ATOP), igImageView);
    }

    public static final void A02(C206279Bk c206279Bk, C177967vV c177967vV) {
        C14360o3.A0B(c177967vV, 0);
        c177967vV.A06 = false;
        if (c206279Bk.A03 == C05F.A00) {
            IgImageView igImageView = c177967vV.A07;
            igImageView.setBackgroundColor(igImageView.getContext().getColor(R.color.baseline_neutral_80));
        }
        View.OnLayoutChangeListener onLayoutChangeListener = c177967vV.A02;
        if (onLayoutChangeListener != null) {
            c177967vV.A07.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        c177967vV.A07.setImageResource(R.color.fds_transparent);
    }

    public final void A03(final Bitmap bitmap, final C206279Bk c206279Bk, final C177967vV c177967vV, final InterfaceC16820sZ interfaceC16820sZ, final int i) {
        C14360o3.A0B(c177967vV, 0);
        c177967vV.A06 = true;
        if (c206279Bk.A03 == C05F.A00) {
            IgImageView igImageView = c177967vV.A07;
            igImageView.setBackgroundColor(igImageView.getContext().getColor(R.color.baseline_neutral_80));
        }
        View.OnLayoutChangeListener onLayoutChangeListener = c177967vV.A02;
        if (onLayoutChangeListener != null) {
            c177967vV.A07.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        final IgImageView igImageView2 = c177967vV.A07;
        if (!igImageView2.getParent().isLayoutRequested() && igImageView2.getWidth() > 0 && igImageView2.getHeight() > 0) {
            A01(bitmap, c206279Bk, c177967vV, interfaceC16820sZ, i, igImageView2.getWidth(), igImageView2.getHeight());
            return;
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: X.9MD
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                IgImageView igImageView3 = igImageView2;
                igImageView3.removeOnLayoutChangeListener(this);
                C177967vV c177967vV2 = c177967vV;
                c177967vV2.A02 = null;
                Bitmap bitmap2 = bitmap;
                int i10 = i;
                C206019Ah.A01(bitmap2, c206279Bk, c177967vV2, interfaceC16820sZ, i10, igImageView3.getWidth(), igImageView3.getHeight());
            }
        };
        igImageView2.addOnLayoutChangeListener(onLayoutChangeListener2);
        c177967vV.A02 = onLayoutChangeListener2;
    }

    public static final void A01(Bitmap bitmap, C206279Bk c206279Bk, C177967vV c177967vV, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        Matrix matrix;
        IgImageView igImageView = c177967vV.A07;
        int intValue = ((Number) c206279Bk.A04).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                matrix = AbstractC188868Yc.A03(i, bitmap.getWidth(), bitmap.getHeight(), i2, i3);
            } else {
                throw new RuntimeException();
            }
        } else {
            float f = i;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f2 = i2;
            float f3 = f2 / width;
            float f4 = i3;
            float f5 = f4 / height;
            if (f3 < f5) {
                f3 = f5;
            }
            float f6 = width * f3;
            float f7 = f3 * height;
            float f8 = (f2 - f6) / 2.0f;
            float f9 = (f4 - f7) / 2.0f;
            RectF rectF2 = new RectF(f8, f9, f6 + f8, f7 + f9);
            matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.postRotate(f, f2 / 2.0f, f4 / 2.0f);
        }
        igImageView.setImageMatrix(matrix);
        igImageView.setImageBitmap(bitmap);
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
