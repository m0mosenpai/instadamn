package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75473aE implements InterfaceC13000lm, InterfaceC75483aF {
    public Boolean A00;
    public Boolean A01;
    public String A02;
    public final UserSession A03;

    public C75473aE(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        C75503aH A00 = AbstractC75493aG.A00(userSession);
        A00.A00.add(new WeakReference(this));
    }

    @Override // X.InterfaceC75483aF
    public final Map B3w() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.A01;
        if (bool != null) {
            hashMap.put("last_audio_was_unavailable", String.valueOf(bool.booleanValue()));
        }
        String str = this.A02;
        if (str != null) {
            hashMap.put("last_audio_unavailable_reason", str);
        }
        Boolean bool2 = this.A00;
        if (bool2 != null) {
            hashMap.put("last_audio_allowed_music_editing", String.valueOf(bool2.booleanValue()));
        }
        return hashMap;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC75493aG.A00(this.A03).A00(this);
    }
}
