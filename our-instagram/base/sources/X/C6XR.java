package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6XR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XR implements InterfaceC28041Xi {
    public UserSession A00;

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String id = ((Reel) obj).getId();
        C14360o3.A0B(id, 0);
        if (id.equals("story_interstitial_roll_call")) {
            return true;
        }
        return !r3.A16(this.A00);
    }
}
