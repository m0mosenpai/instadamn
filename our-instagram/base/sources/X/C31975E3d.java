package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E3d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31975E3d extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsButton A05;
    public final View A06;

    public C31975E3d(View view) {
        super(view);
        this.A06 = view;
        this.A00 = view;
        this.A02 = AbstractC31176DnK.A0D(view, R.id.icon_imageview);
        this.A04 = AbstractC167007dF.A0N(view, R.id.contact_sync_title);
        this.A03 = AbstractC167007dF.A0N(view, R.id.contact_sync_subtitle);
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.contact_sync_action_button);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.dismiss_button);
    }
}
