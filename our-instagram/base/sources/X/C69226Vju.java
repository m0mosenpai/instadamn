package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Vju, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69226Vju {
    public final TextView A00;
    public final TextView A01;
    public final UI4 A02;
    public final IgdsButton A03;

    public C69226Vju(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.inform_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.inform_body);
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.inform_action);
        this.A02 = new UI4(view);
    }
}
