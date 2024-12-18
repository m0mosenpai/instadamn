package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Gw9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38488Gw9 extends C3OO {
    public final IgImageView A00;
    public final IgdsButton A01;
    public final IgdsButton A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public C38488Gw9(View view) {
        super(view);
        this.A00 = AbstractC37302Gc3.A0K(view, R.id.image);
        this.A02 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.no_media_availability_button);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.yes_media_availability_button);
        this.A01 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.no_product_appropriateness_button);
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.yes_product_appropriateness_button);
    }
}
