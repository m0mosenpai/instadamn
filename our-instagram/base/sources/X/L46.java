package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class L46 {
    public final ViewGroup A00;
    public final TextView A01;
    public final LithoView A02;
    public final ComposerAutoCompleteTextView A03;
    public final View A04;
    public final ViewStub A05;

    public L46(View view) {
        ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.direct_composer_style_view_stub);
        this.A05 = viewStub;
        this.A02 = (LithoView) AbstractC166987dD.A0c(view, R.id.above_composer_views);
        View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.layout_broadcast_channels_replies_composer_bar);
        this.A04 = A0E;
        this.A00 = AbstractC31173DnH.A0F(A0E, R.id.row_thread_composer_textarea_container);
        this.A03 = (ComposerAutoCompleteTextView) A0E.requireViewById(R.id.row_thread_composer_edittext);
        TextView A0T = AbstractC166997dE.A0T(A0E, R.id.row_thread_composer_button_send);
        this.A01 = A0T;
        A0T.setAlpha(0.3f);
    }
}
