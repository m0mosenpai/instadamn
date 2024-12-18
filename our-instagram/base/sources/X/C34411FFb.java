package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.FFb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34411FFb {
    public final IgdsBanner A00;

    public C34411FFb(Context context, GZA gza, String str) {
        boolean A1V = AbstractC167007dF.A1V(str);
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_cake_pano_outline_24);
        AbstractC31172DnG.A1U(igdsBanner, AbstractC167007dF.A0f(context, str, 2131963929), false);
        AbstractC31174DnI.A1Q(gza, igdsBanner, 2131963928, A1V);
        this.A00 = igdsBanner;
    }
}
