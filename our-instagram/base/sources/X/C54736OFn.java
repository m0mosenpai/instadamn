package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.OFn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54736OFn {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final Button A05;
    public final RecyclerView A06;
    public final RecyclerView A07;
    public final IgSimpleImageView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final AnonymousClass834 A0D;
    public final AnonymousClass834 A0E;
    public final AnonymousClass834 A0F;
    public final IgSegmentedTabLayout A0G;

    public C54736OFn(View view) {
        View A0S = AbstractC166997dE.A0S(view, R.id.media_drafts_header);
        this.A02 = A0S;
        this.A0C = AbstractC25231BEo.A0d(A0S, R.id.media_drafts_title);
        this.A0B = AbstractC25231BEo.A0d(A0S, R.id.media_drafts_subtitle);
        this.A0D = new AnonymousClass834(AbstractC166997dE.A0S(A0S, R.id.media_drafts_back_button));
        this.A0F = new AnonymousClass834(AbstractC166997dE.A0S(A0S, R.id.media_drafts_multiselect_button));
        this.A0E = new AnonymousClass834(AbstractC166997dE.A0S(A0S, R.id.media_drafts_info_button));
        this.A09 = AbstractC25231BEo.A0d(view, R.id.draft_instructions);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.empty_drafts);
        this.A03 = A0C;
        this.A08 = AbstractC31176DnK.A0T(A0C, R.id.empty_drafts_icon);
        this.A0A = AbstractC25231BEo.A0d(A0C, R.id.empty_drafts_description);
        this.A00 = AbstractC166997dE.A0S(view, R.id.discard_drafts_container);
        this.A01 = AbstractC166997dE.A0S(view, R.id.discard_drafts_divider);
        this.A05 = (Button) AbstractC166997dE.A0R(view, R.id.discard_drafts);
        this.A0G = (IgSegmentedTabLayout) AbstractC166997dE.A0R(view, R.id.draft_tab_view);
        this.A06 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.draft_recycler_view);
        this.A07 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.schedule_recycler_view);
        this.A04 = AbstractC31176DnK.A0C(view, R.id.megaphone_view);
    }
}
