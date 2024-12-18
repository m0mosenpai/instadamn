package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.G4t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36418G4t implements InterfaceC37161GYy {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C7U0 A03;

    public AbstractC36418G4t(FragmentActivity fragmentActivity, UserSession userSession, C7U0 c7u0, int i) {
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A03 = c7u0;
        this.A00 = i;
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        return C32073E6z.A00(this, 27, R.drawable.instagram_new_story_pano_outline_24, 2131968882);
    }
}
