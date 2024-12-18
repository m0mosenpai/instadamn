package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ecv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32853Ecv extends AbstractC35044FcH {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final User A04;
    public final Context A05;

    public C32853Ecv(Activity activity, Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C2EY c2ey, User user) {
        super(c2ey, user, "direct_message", R.drawable.instagram_app_messenger_pano_outline_24, 2131960445);
        this.A04 = user;
        this.A02 = userSession;
        this.A05 = context;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = interfaceC60442pS;
    }
}
