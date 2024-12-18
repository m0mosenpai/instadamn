package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mm5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51344Mm5 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;

    public C51344Mm5(View view) {
        super(view);
        this.A03 = (CircularImageView) view.findViewById(R.id.profile_picture);
        this.A02 = AbstractC166987dD.A0e(view, R.id.username);
        this.A01 = AbstractC166987dD.A0e(view, R.id.subtext);
        this.A05 = AbstractC31172DnG.A0a(view, R.id.verified_icon);
        this.A04 = AbstractC31172DnG.A0a(view, R.id.badge_tier_icon);
        this.A00 = AbstractC166987dD.A0e(view, R.id.badge_count);
    }
}
