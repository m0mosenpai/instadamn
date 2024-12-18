package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.FIe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34492FIe {
    public final IgdsBanner A00;
    public final GZA A01;

    public C34492FIe(Context context, GZA gza) {
        this.A01 = gza;
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_link_pano_outline_24);
        AbstractC31172DnG.A1B(context, igdsBanner, AbstractC53242c7.A0D(context));
        igdsBanner.setAction(context.getString(2131964657));
        AbstractC31172DnG.A1U(igdsBanner, context.getString(2131964658), false);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = gza;
        this.A00 = igdsBanner;
    }
}
