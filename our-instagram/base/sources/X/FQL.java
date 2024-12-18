package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;

/* loaded from: classes6.dex */
public final class FQL {
    public RectF A00;
    public RectF A01;
    public RectF A02;
    public final Activity A03;
    public final UserSession A04;
    public final Product A05;

    public final void A00() {
        Activity activity = this.A03;
        ImageInfo imageInfo = this.A05.A07;
        imageInfo.getClass();
        AbstractC70197WGf.A05(activity, AbstractC40161tk.A01(activity, imageInfo), new G0F(this, 4), C50472Tr.A01(), AbstractC31173DnH.A02(activity), false);
    }

    public FQL(Activity activity, UserSession userSession, Product product) {
        this.A04 = userSession;
        this.A03 = activity;
        this.A05 = product;
    }
}
