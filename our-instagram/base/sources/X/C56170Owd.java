package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.Map;

/* renamed from: X.Owd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56170Owd implements InterfaceC65702y7 {
    public final UserSession A00;

    public C56170Owd(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        String url;
        Integer num;
        AbstractC167017dG.A1N(igImageView, bitmap);
        ImageUrl imageUrl = igImageView.A0C;
        if (imageUrl != null && (url = imageUrl.getUrl()) != null) {
            Map map = AbstractC41555Ia4.A00;
            if (!map.containsKey(url) || map.get(url) == null) {
                Matrix matrix = AbstractC14570oV.A00;
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                map.put(url, AbstractC14570oV.A00(bitmap, num).A00((int) (0.7f * 255.0f)));
            }
            Object obj = map.get(url);
            if (obj != null) {
                AbstractC14570oV.A02(GradientDrawable.Orientation.BL_TR, igImageView, (BackgroundGradientColors) obj);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
