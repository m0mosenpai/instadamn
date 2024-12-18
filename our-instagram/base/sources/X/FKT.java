package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class FKT {
    public final Context A00;
    public final IgdsBanner A01;
    public final UserSession A02;

    public FKT(Context context, UserSession userSession, GZA gza) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_channels_broadcast_pano_outline_24);
        AbstractC31172DnG.A1U(igdsBanner, AbstractC166997dE.A0p(this.A00, 2131963935), false);
        AbstractC31174DnI.A1Q(gza, igdsBanner, 2131963934, true);
        this.A01 = igdsBanner;
    }
}
