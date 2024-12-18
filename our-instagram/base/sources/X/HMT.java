package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.model.MusicSearchPlaylist;

/* loaded from: classes7.dex */
public final class HMT extends AbstractC38513GwY {
    public final JGI A00;
    public final Resources A01;
    public final View A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMT(View view, JGI jgi) {
        super(view);
        C14360o3.A0B(jgi, 2);
        this.A02 = view;
        this.A00 = jgi;
        this.A03 = AbstractC167007dF.A0T(view, R.id.playlist_art);
        this.A01 = AbstractC37302Gc3.A05(this);
    }

    public final void A03(MusicSearchPlaylist musicSearchPlaylist) {
        C14360o3.A0B(musicSearchPlaylist, 0);
        IgImageView igImageView = this.A03;
        Context A03 = AbstractC37301Gc2.A03(this);
        Resources resources = this.A01;
        igImageView.setImageDrawable(new BOM(A03, null, resources.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxlarge), AbstractC166997dE.A08(resources), 0, 0, 0, 1, false));
        AbstractC38055Goi.A00(igImageView, musicSearchPlaylist.A00().BEx(), null);
        ViewOnClickListenerC42034Ik3.A00(this.A02, 29, musicSearchPlaylist, this);
    }
}
