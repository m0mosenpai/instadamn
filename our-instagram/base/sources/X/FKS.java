package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class FKS {
    public IgdsBanner A00;
    public final Context A01;
    public final GZA A02;

    public FKS(Context context, GZA gza) {
        this.A01 = context;
        this.A02 = gza;
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_receipt_pano_outline_24);
        Context context2 = igdsBanner.getContext();
        AbstractC31172DnG.A1B(context2, igdsBanner, AbstractC53242c7.A0D(context2));
        igdsBanner.setAction(context2.getString(2131953015));
        igdsBanner.setDismissible(true);
        AbstractC31172DnG.A1U(igdsBanner, context2.getString(2131953014), false);
        igdsBanner.A00 = gza;
        this.A00 = igdsBanner;
    }
}
