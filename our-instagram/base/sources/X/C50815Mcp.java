package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mcp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50815Mcp extends AppCompatSeekBar {
    public static final int A00(Context context, int i) {
        return AbstractC166987dD.A0B(i, AbstractC167007dF.A0K(context).densityDpi / 160.0f);
    }

    public final void A02(C54575O9c c54575O9c, int i) {
        List list;
        setSplitTrack(false);
        Context context = getContext();
        setThumb(context.getDrawable(R.drawable.parametric_slider_thumb));
        c54575O9c.A00 = getThumb();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55499Oks(i, 0, this, c54575O9c));
        C53641Nnm c53641Nnm = c54575O9c.A02;
        if (c53641Nnm != null && (list = c53641Nnm.A04) != null) {
            A03(list);
        }
        C53641Nnm c53641Nnm2 = c54575O9c.A02;
        if (c53641Nnm2 != null) {
            int i2 = c53641Nnm2.A01;
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable thumb = getThumb();
                C14360o3.A0C(thumb, AbstractC111324zv.A00(28));
                A01(context, (LayerDrawable) thumb, i2);
            }
        }
    }

    public final void A03(List list) {
        setBackground(null);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A1E, Color.parseColor(AnonymousClass001.A0D(AbstractC166987dD.A1B(it), '#')));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, AbstractC001800i.A0x(A1E));
        gradientDrawable.setCornerRadius(100.0f);
        setProgressDrawable(gradientDrawable);
        setThumbOffset(A00(AbstractC166997dE.A0L(this), 10));
    }

    private final void A01(Context context, LayerDrawable layerDrawable, int i) {
        if (layerDrawable.getNumberOfLayers() < 2) {
            C0K8.A0C("ParametricSlider", "Thumb drawable must have at least 2 layers, if the drawable has changed, please update this section that applies thumb border width to thumb drawable");
            return;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        String A00 = AbstractC111324zv.A00(27);
        C14360o3.A0C(drawable, A00);
        Drawable drawable2 = layerDrawable.getDrawable(1);
        C14360o3.A0C(drawable2, A00);
        ((GradientDrawable) drawable).setThickness(A00(context, i));
        ((GradientDrawable) drawable2).setThickness(AbstractC166987dD.A0B(i - 0.2f, AbstractC167007dF.A0K(context).densityDpi / 160.0f));
    }
}
