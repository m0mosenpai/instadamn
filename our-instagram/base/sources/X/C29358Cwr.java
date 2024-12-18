package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Map;

/* renamed from: X.Cwr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29358Cwr implements C51R {
    public final int A00;
    public final Object A01;

    public C29358Cwr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C51R
    public final void DqI(Map map) {
        Reel reel;
        if (this.A00 != 0) {
            ReelDashboardFragment.A0F((ReelDashboardFragment) this.A01);
            return;
        }
        C25877Bcc c25877Bcc = (C25877Bcc) this.A01;
        if (map != null) {
            reel = (Reel) map.get(c25877Bcc.A0B);
        } else {
            reel = null;
        }
        C25877Bcc.A02(c25877Bcc, reel);
    }

    @Override // X.C51R
    public final void onFailure() {
        if (this.A00 == 0) {
            C25877Bcc c25877Bcc = (C25877Bcc) this.A01;
            C25877Bcc.A02(c25877Bcc, C25877Bcc.A00(c25877Bcc));
        }
    }
}
