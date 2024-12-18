package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.76e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1577076e extends AbstractC1576876c {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final CircularImageView A08;
    public final IgImageView A09;
    public final IgImageView A0A;
    public final IgImageView A0B;
    public final RoundedCornerImageView A0C;

    public C1577076e(View view) {
        super((IgImageView) view.requireViewById(R.id.audio_playback_button));
        this.A04 = (TextView) view.requireViewById(R.id.caption_title);
        this.A01 = (TextView) view.requireViewById(R.id.caption_attribution);
        this.A02 = (TextView) view.requireViewById(R.id.caption_body);
        this.A03 = (TextView) view.requireViewById(R.id.caption_subtitle);
        this.A07 = (CircularImageView) view.requireViewById(R.id.favicon_circular);
        this.A0C = (RoundedCornerImageView) view.requireViewById(R.id.favicon_rounded);
        this.A0A = (IgImageView) view.requireViewById(R.id.favicon_asset);
        this.A09 = (IgImageView) view.requireViewById(R.id.accessory_header_image);
        this.A0B = (IgImageView) view.requireViewById(R.id.caption_subtitle_decoration);
        this.A00 = view.requireViewById(R.id.quoted_post_container);
        this.A08 = (CircularImageView) view.requireViewById(R.id.quoted_favicon_circular);
        this.A06 = (TextView) view.requireViewById(R.id.quoted_title);
        this.A05 = (TextView) view.requireViewById(R.id.quoted_caption_body);
    }
}
