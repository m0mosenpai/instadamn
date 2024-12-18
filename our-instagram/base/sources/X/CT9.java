package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes5.dex */
public final class CT9 {
    public View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ViewStub A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;

    public CT9(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A08 = AbstractC25231BEo.A0d(view, R.id.add_channels_prompt);
        this.A04 = (ViewStub) AbstractC166997dE.A0R(view, R.id.add_channels_badge_stub);
        this.A03 = (ViewGroup) AbstractC166997dE.A0R(view, R.id.tagged_channel_container);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.tagged_channel_title);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.tagged_channel_subtitle);
        this.A05 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.add_channels_chevron);
        this.A01 = AbstractC166997dE.A0S(view, R.id.remove_tagged_channel_button);
    }
}
