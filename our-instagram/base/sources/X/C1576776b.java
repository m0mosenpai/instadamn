package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.76b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576776b extends AbstractC1576876c {
    public L7B A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;

    public C1576776b(View view) {
        super((IgImageView) view.requireViewById(R.id.audio_playback_button));
        this.A03 = (CircularImageView) view.requireViewById(R.id.avatar);
        this.A02 = (TextView) view.requireViewById(R.id.title);
        this.A01 = (TextView) view.requireViewById(R.id.subtitle);
        this.A04 = (IgImageView) view.requireViewById(R.id.header_icons);
    }
}
