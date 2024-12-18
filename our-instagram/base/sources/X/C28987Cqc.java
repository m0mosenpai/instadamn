package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Cqc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28987Cqc implements InterfaceC51522Ya {
    public static final C28987Cqc A00 = new C28987Cqc();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.suggested_entity_card);
        C14360o3.A0C(A0C, AbstractC111324zv.A00(StringTreeSet.MAX_SYMBOL_COUNT));
        View A0R = AbstractC166997dE.A0R(A0C, R.id.suggested_entity_card_container);
        CircularImageView circularImageView = (CircularImageView) AbstractC166997dE.A0R(A0C, R.id.suggested_entity_card_image);
        A0C.setTag(new C27928CSn(A0R, AbstractC166997dE.A0S(A0C, R.id.dismiss_button), AbstractC167007dF.A0N(A0C, R.id.suggested_entity_card_name), AbstractC167007dF.A0N(A0C, R.id.suggested_entity_card_context), circularImageView, (FollowButton) AbstractC166997dE.A0S(A0C, R.id.suggested_user_card_follow_button)));
        Object tag = A0C.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.coalesced.followchaining.SuggestedEntityUserCardComponent.Holder");
        ((C27928CSn) tag).A05.setVisibility(0);
        return A0C;
    }
}
