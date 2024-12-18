package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.feed.ui.text.LinkTextView;

/* loaded from: classes6.dex */
public final class FON {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final LinkTextView A09;

    public FON(View view) {
        this.A01 = view;
        this.A09 = (LinkTextView) view.requireViewById(R.id.row_profile_header_textview_biography);
        this.A02 = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_biography_translation_link);
        this.A00 = view.requireViewById(R.id.biography_translation_spinner);
        this.A03 = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_fullname);
        this.A06 = AbstractC31177DnL.A0V(view, R.id.row_profile_header_business_category_stub);
        this.A07 = AbstractC31177DnL.A0V(view, R.id.profile_chats_links_view);
        this.A05 = AbstractC31177DnL.A0V(view, R.id.row_profile_header_textview_business_address_stub);
        this.A04 = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_context);
        this.A08 = AbstractC31177DnL.A0V(view, R.id.row_profile_header_restrict_indicator_stub);
    }
}
