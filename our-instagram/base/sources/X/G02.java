package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G02 implements InterfaceC13050lr {
    public final Context A01;
    public final UserSession A02;
    public final FJ2 A03;
    public final List A04 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
        this.A04.clear();
        this.A00.clear();
        if (z) {
            FJ2 fj2 = this.A03;
            fj2.A00.A04(fj2.A01);
        }
    }

    public G02(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new FJ2(AnonymousClass001.A0R("direct_story_recipients_", userSession.userId));
    }
}
