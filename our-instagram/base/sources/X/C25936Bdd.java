package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bdd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25936Bdd extends C3OO {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C25936Bdd(View view) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) AbstractC166987dD.A0c(view, R.id.draft_entrypoint_container);
        this.A00 = viewGroup;
        this.A02 = AbstractC25230BEn.A0Q(viewGroup, R.id.number_of_drafts);
        this.A01 = AbstractC25230BEn.A0Q(viewGroup, R.id.disclaimer);
        this.A03 = (IgImageView) AbstractC166987dD.A0c(viewGroup, R.id.draft_preview_image);
    }
}
