package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public abstract class JWX {
    public static final C1OG A00(Context context, UserSession userSession, ImageUrl imageUrl, C83403nh c83403nh, C38321qM c38321qM, String str, int i) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(context, 5);
        if (c83403nh.A0Z(userSession, Integer.valueOf(i)).booleanValue() && c83403nh.A0Y().booleanValue()) {
            C43711JUw c43711JUw = new C43711JUw(context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
            float A0m = c38321qM.A0m();
            int i2 = c43711JUw.A00;
            int i3 = (int) (A0m * i2);
            C69580Vrj c69580Vrj = C69580Vrj.A03;
            if (c69580Vrj == null) {
                c69580Vrj = new C69580Vrj(userSession);
                C69580Vrj.A03 = c69580Vrj;
            }
            imageUrl = c69580Vrj.A00(imageUrl, i3, i2);
        }
        C1OG A0J = C25821No.A00().A0J(imageUrl, str);
        A0J.A0I = true;
        A0J.A05 = userSession;
        A0J.A0K = c38321qM.Cff();
        c38321qM.A18();
        return A0J;
    }
}
