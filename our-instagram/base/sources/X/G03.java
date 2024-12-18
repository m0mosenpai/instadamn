package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G03 implements InterfaceC13050lr {
    public Context A00;
    public String A01;
    public final UserSession A05;
    public final FJ2 A06;
    public boolean A04 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public final List A07 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
        if (z) {
            FJ2 fj2 = this.A06;
            fj2.A00.A04(fj2.A01);
        }
    }

    public G03(Context context, UserSession userSession) {
        this.A00 = context;
        this.A05 = userSession;
        this.A06 = new FJ2(AnonymousClass001.A0R("direct_share_sheet_recipients_", userSession.userId));
    }
}
