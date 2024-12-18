package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class E32 extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E32(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A03 = AbstractC31176DnK.A0U(viewGroup, R.id.avatar_image_view);
        this.A02 = AbstractC31178DnM.A0C(viewGroup);
        this.A00 = AbstractC166997dE.A0S(viewGroup, R.id.login_button);
        this.A01 = AbstractC166997dE.A0S(viewGroup, R.id.option_button);
    }
}
