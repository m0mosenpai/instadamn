package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Gw8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38487Gw8 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final RoundedCornerFrameLayout A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38487Gw8(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.image_container);
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.avatar);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.image);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.primary_text);
        this.A00 = AbstractC166987dD.A0c(view, R.id.remove_button);
    }
}
