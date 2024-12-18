package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class KKv extends IgImageView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final L62 A04;
    public final UserSession A05;
    public final AtomicBoolean A06;

    public KKv(UserSession userSession, Context context) {
        super(context, null);
        this.A05 = userSession;
        this.A04 = new L62(context);
        setImageResource(R.drawable.instagram_wave_pano_outline_24);
        this.A06 = AbstractC166997dE.A17();
    }
}
