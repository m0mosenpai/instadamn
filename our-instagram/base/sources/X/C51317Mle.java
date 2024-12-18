package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Mle, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51317Mle extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsCheckBox A03;

    public C51317Mle(View view) {
        super(view);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.series_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.series_description);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.series_video_count);
        this.A03 = (IgdsCheckBox) AbstractC166987dD.A0c(view, R.id.series_checkbox);
    }
}
