package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FOQ {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final C57012jc A09;
    public final C57012jc A0A;

    public FOQ(View view) {
        View requireViewById = view.requireViewById(R.id.follow_sheet_close_friends_row);
        this.A00 = requireViewById;
        this.A05 = AbstractC166987dD.A0e(requireViewById, R.id.profile_follow_relationship_row_title);
        this.A03 = AbstractC31173DnH.A0I(requireViewById, R.id.profile_follow_relationship_row_icon);
        View requireViewById2 = view.requireViewById(R.id.follow_sheet_feed_favorites_row);
        this.A01 = requireViewById2;
        this.A06 = AbstractC166997dE.A0T(requireViewById2, R.id.profile_follow_relationship_row_title);
        this.A04 = AbstractC31173DnH.A0I(requireViewById2, R.id.profile_follow_relationship_row_icon);
        View requireViewById3 = view.requireViewById(R.id.follow_sheet_mute_row);
        this.A02 = requireViewById3;
        this.A07 = AbstractC166987dD.A0e(requireViewById3, R.id.profile_follow_relationship_row_title);
        this.A09 = AbstractC31177DnL.A0V(requireViewById3, R.id.profile_follow_relationship_row_subtext_stub);
        this.A0A = AbstractC31177DnL.A0V(view, R.id.follow_sheet_restrict_stub);
        this.A08 = AbstractC166997dE.A0T(view, R.id.follow_sheet_unfollow_row);
    }
}
