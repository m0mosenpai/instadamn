package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class E37 extends C3OO {
    public final CircularImageView A00;
    public final View A01;
    public final LinearLayout.LayoutParams A02;
    public final InterfaceC11380iw A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E37(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = interfaceC11380iw;
        this.A01 = AbstractC166987dD.A0c(view, R.id.image_container);
        CircularImageView circularImageView = (CircularImageView) AbstractC166987dD.A0c(view, R.id.circular_image);
        this.A00 = circularImageView;
        this.A02 = (LinearLayout.LayoutParams) circularImageView.getLayoutParams();
    }
}
