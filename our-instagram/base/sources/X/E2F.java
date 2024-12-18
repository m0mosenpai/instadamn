package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class E2F extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2F(View view, Context context) {
        super(view);
        C14360o3.A0B(view, 1);
        View A0S = AbstractC166997dE.A0S(view, R.id.shortcut_container);
        this.A00 = A0S;
        this.A02 = AbstractC167007dF.A0T(view, R.id.icon_image);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.shortcut_right_text_view);
        Drawable drawable = context.getDrawable(R.drawable.direct_shortcut_button_background);
        C14360o3.A0C(drawable, AbstractC111324zv.A00(2771));
        StateListDrawable stateListDrawable = (StateListDrawable) drawable;
        int A05 = C1QI.A05(context, C1QI.A0E());
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable stateDrawable = stateListDrawable.getStateDrawable(0);
            C14360o3.A0C(stateDrawable, AbstractC111324zv.A00(28));
            Drawable findDrawableByLayerId = ((LayerDrawable) stateDrawable).findDrawableByLayerId(R.id.shortcut_selected_state);
            C14360o3.A0C(findDrawableByLayerId, AbstractC111324zv.A00(27));
            ((GradientDrawable) findDrawableByLayerId).setColor(context.getColor(A05));
            A0S.setBackground(stateListDrawable);
        }
    }
}
