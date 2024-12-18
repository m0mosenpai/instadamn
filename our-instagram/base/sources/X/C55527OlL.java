package X;

import android.widget.RadioGroup;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OlL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55527OlL implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ C52115N4n A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;

    public C55527OlL(C52115N4n c52115N4n, User user, String str) {
        this.A01 = user;
        this.A00 = c52115N4n;
        this.A02 = str;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        IGLiveNotificationPreference iGLiveNotificationPreference = (IGLiveNotificationPreference) C52115N4n.A01.get(i);
        User user = this.A01;
        user.A03.EYR(iGLiveNotificationPreference);
        C52115N4n c52115N4n = this.A00;
        InterfaceC09390do interfaceC09390do = c52115N4n.A00;
        user.A0c(AbstractC166987dD.A0o(interfaceC09390do));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0A(iGLiveNotificationPreference);
        C1571673v.A06(c52115N4n, A0r, C1571673v.A01(user.B7L()), AbstractC54055NvF.A00(iGLiveNotificationPreference), user.getId(), this.A02);
        C4M5.A00().A02(user.A09(), AbstractC166987dD.A0r(interfaceC09390do), user.getId());
    }
}
