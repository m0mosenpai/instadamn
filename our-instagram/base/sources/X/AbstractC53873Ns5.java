package X;

import android.os.Looper;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ns5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53873Ns5 {
    public static final void A00(C1NJ c1nj, ImageUrl imageUrl, String str) {
        C14360o3.A0B(imageUrl, 0);
        if (AbstractC25225BEi.A1a(Looper.getMainLooper(), Looper.myLooper())) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, str);
            A0J.A02(c1nj);
            A0J.A0F = true;
            A0J.A0G = true;
            A0J.A00().E7X();
            return;
        }
        throw AbstractC166987dD.A14("Can't fetch the image on UI thread.");
    }
}
