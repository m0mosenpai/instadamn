package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Gw4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38483Gw4 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38483Gw4(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.merchant_avatar);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.title);
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.subtitle);
        this.A00 = A0Q;
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.accept_button);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.decline_button);
        AbstractC010103p.A0B(A0Q, new UEF(0));
        AbstractC25227BEk.A11(A0Q);
        A0Q.setLongClickable(false);
    }
}
