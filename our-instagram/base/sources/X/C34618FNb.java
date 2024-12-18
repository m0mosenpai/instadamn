package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.R;

/* renamed from: X.FNb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34618FNb {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final View A04;
    public final CardView A05;

    public C34618FNb(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = view;
        CardView cardView = (CardView) AbstractC166997dE.A0R(view, R.id.card_view);
        this.A05 = cardView;
        this.A03 = AbstractC167007dF.A0N(view, R.id.link_title);
        this.A02 = AbstractC167007dF.A0N(view, R.id.link_sub_title);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.link_icon);
        this.A00 = AbstractC31176DnK.A0D(view, R.id.chevron_icon);
        cardView.setCardElevation(0.0f);
    }
}
