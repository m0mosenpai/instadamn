package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gvq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38469Gvq extends C3OO {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38469Gvq(ViewGroup viewGroup, Integer num) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A03 = AbstractC37302Gc3.A0K(viewGroup, R.id.merchant_avatar);
        this.A01 = AbstractC25230BEn.A0Q(viewGroup, R.id.merchant_username);
        this.A02 = AbstractC25230BEn.A0Q(viewGroup, R.id.subtitle);
        this.A00 = (ImageView) AbstractC166987dD.A0c(viewGroup, R.id.chevron);
        AbstractC13880nE.A0W(viewGroup, AbstractC166997dE.A04(viewGroup.getContext(), num == C05F.A00 ? R.dimen.add_to_story_dual_destination_share_sheet_story_row_height : R.dimen.action_button_min_width));
    }
}
