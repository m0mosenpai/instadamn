package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154706xL implements InterfaceC13000lm, InterfaceC75483aF {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public final UserSession A05;

    public C154706xL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A02 = null;
        this.A03 = null;
        C75503aH A00 = AbstractC75493aG.A00(userSession);
        A00.A00.add(new WeakReference(this));
    }

    @Override // X.InterfaceC75483aF
    public final Map B3w() {
        HashMap hashMap = new HashMap();
        Integer num = this.A01;
        if (num != null) {
            hashMap.put("client_following_count", String.valueOf(num.intValue()));
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            hashMap.put("client_follower_count", String.valueOf(num2.intValue()));
        }
        String str = this.A04;
        if (str != null) {
            hashMap.put("visited_profile_id", str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            hashMap.put("attempted_username", str2);
        }
        String str3 = this.A03;
        if (str3 != null) {
            hashMap.put("follow_error", str3);
        }
        return hashMap;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC75493aG.A00(this.A05).A00(this);
    }
}
