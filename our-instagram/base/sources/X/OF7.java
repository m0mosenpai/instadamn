package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes9.dex */
public final class OF7 {
    public int A00 = -1;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final IgImageView A06;
    public final IgdsBanner A07;
    public final GradientSpinner A08;

    public OF7(View view) {
        this.A01 = view;
        this.A06 = AbstractC31172DnG.A0Z(view, R.id.ar_effect_icon);
        this.A04 = AbstractC166997dE.A0T(view, R.id.ar_effect_title);
        this.A02 = AbstractC166997dE.A0T(view, R.id.ar_profile_text);
        this.A03 = AbstractC166997dE.A0T(view, R.id.subtitle_text);
        this.A05 = AbstractC31172DnG.A0G(view, R.id.options_recycler_view);
        this.A08 = (GradientSpinner) view.requireViewById(R.id.effect_icon_reel_ring);
        this.A07 = (IgdsBanner) view.requireViewById(R.id.age_restricted_note_banner);
    }
}
