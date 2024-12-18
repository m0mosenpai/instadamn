package X;

import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class OUI {
    public final View A00;
    public final View A01;
    public final ScrollView A02;
    public final RecyclerView A03;
    public final IgdsButton A04;
    public final IgAutoCompleteTextView A05;

    public OUI(View view) {
        this.A02 = (ScrollView) AbstractC166997dE.A0R(view, R.id.scroll_view);
        this.A03 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.media_preview_recycler_view);
        this.A05 = (IgAutoCompleteTextView) AbstractC166997dE.A0R(view, R.id.caption_text_view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.content_overlay);
        this.A01 = AbstractC166997dE.A0S(view, R.id.followers_share_content_rows_disabled_overlay);
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.save_draft_footer_button);
    }

    public static IgAutoCompleteTextView A00(FollowersShareFragment followersShareFragment) {
        return followersShareFragment.A0S().A05;
    }
}
