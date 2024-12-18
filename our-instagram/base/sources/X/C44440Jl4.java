package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Jl4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44440Jl4 extends ConstraintLayout {
    public View A00;
    public IgTextView A01;
    public CircularImageView A02;

    public final void setWithAvatarImage(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str) {
        AbstractC167007dF.A1K(interfaceC11380iw, imageUrl);
        CircularImageView circularImageView = this.A02;
        String str2 = "avatarImageView";
        if (circularImageView != null) {
            circularImageView.setUrl(imageUrl, interfaceC11380iw);
            CircularImageView circularImageView2 = this.A02;
            if (circularImageView2 != null) {
                circularImageView2.setVisibility(0);
                IgTextView igTextView = this.A01;
                if (igTextView == null) {
                    str2 = "metricText";
                } else {
                    igTextView.setText(str);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public final void setMetricOnly(String str) {
        IgTextView igTextView = this.A01;
        if (igTextView == null) {
            C14360o3.A0F("metricText");
            throw C00O.createAndThrow();
        }
        igTextView.setText(str);
    }

    public final void setWithEyeIcon(String str) {
        Drawable drawable = getContext().getDrawable(R.drawable.instagram_eye_outline_18);
        if (drawable != null) {
            AbstractC166997dE.A1F(drawable, -1);
        }
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            igTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            IgTextView igTextView2 = this.A01;
            if (igTextView2 != null) {
                igTextView2.setCompoundDrawablePadding(AbstractC166997dE.A06(getResources()));
                IgTextView igTextView3 = this.A01;
                if (igTextView3 != null) {
                    igTextView3.setText(str);
                    return;
                }
            }
        }
        C14360o3.A0F("metricText");
        throw C00O.createAndThrow();
    }
}
