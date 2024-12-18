package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class OFX {
    public final View A00;
    public final View A01;
    public final ViewStub A02;
    public final ScrollView A03;
    public final TextView A04;
    public final TextView A05;
    public final RecyclerView A06;
    public final OD1 A07;
    public final OF9 A08;
    public final AbstractC54965OSv A09;
    public final IgAutoCompleteTextView A0A;
    public final boolean A0B;

    public OFX(View view, UserSession userSession, String str) {
        AbstractC54965OSv c52483NKb;
        C56302iJ c56302iJ;
        AbstractC167017dG.A1R(userSession, str);
        this.A00 = AbstractC166997dE.A0S(view, R.id.content_overlay);
        this.A02 = AbstractC167007dF.A0M(view, R.id.warning_nudge);
        this.A0A = (IgAutoCompleteTextView) AbstractC166997dE.A0R(view, R.id.caption_input_text_view);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324681611227522L);
        this.A0B = A06;
        if (A06) {
            c52483NKb = new C52482NKa(view, userSession);
        } else {
            c52483NKb = new C52483NKb(view, userSession, str);
        }
        IgAutoCompleteTextView igAutoCompleteTextView = this.A0A;
        ViewGroup.LayoutParams layoutParams = igAutoCompleteTextView.getLayoutParams();
        if ((layoutParams instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams) != null) {
            c56302iJ.A0t = this.A0B ? R.id.auto_play_clips_preview : R.id.cover_photo_preview;
            igAutoCompleteTextView.setLayoutParams(c56302iJ);
        }
        AbstractC166997dE.A0S(view, this.A0B ? R.id.cover_photo_preview : R.id.auto_play_clips_preview).setVisibility(8);
        this.A09 = c52483NKb;
        this.A08 = new OF9(view);
        this.A07 = new OD1(AbstractC166997dE.A0S(view, R.id.caption_suggestion_container));
        this.A03 = (ScrollView) AbstractC166997dE.A0R(view, R.id.scroll_view);
        this.A06 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.caption_add_on_recyclerview);
        this.A04 = AbstractC167007dF.A0N(view, R.id.poll_preview_text);
        this.A05 = AbstractC167007dF.A0N(view, R.id.prompt_footnote_text);
        this.A01 = AbstractC166987dD.A0c(view, R.id.followers_share_content_rows_disabled_overlay);
    }
}
