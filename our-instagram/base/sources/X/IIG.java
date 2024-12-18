package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* loaded from: classes7.dex */
public final class IIG {
    public final Context A00;
    public final IgProgressImageView A01;
    public final MediaFrameLayout A02;
    public final SlideInAndOutIconView A03;

    public IIG(View view) {
        this.A00 = AbstractC166997dE.A0L(view);
        this.A02 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.video_container);
        this.A01 = (IgProgressImageView) AbstractC166987dD.A0c(view, R.id.thumbnail);
        View findViewById = view.findViewById(R.id.audio_icon);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) findViewById;
        slideInAndOutIconView.setIconColor(-1);
        slideInAndOutIconView.setIconScale(0.5f);
        C14360o3.A07(findViewById);
        this.A03 = slideInAndOutIconView;
    }
}
