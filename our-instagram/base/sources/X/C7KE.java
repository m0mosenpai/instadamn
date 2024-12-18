package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.7KE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KE extends AbstractC60592pi implements InterfaceC63982vJ {
    public ReelViewerConfig A00;
    public AbstractC149546o6 A01;
    public AbstractC140596Xn A02;
    public C140626Xq A03;
    public final Activity A04;
    public final Handler A05;
    public final UserSession A06;
    public final C7KD A07;
    public final C3G2 A08;
    public final C82013lN A09;

    public final void A00(C47777L8c c47777L8c, C1NB c1nb, InterfaceC42241xE interfaceC42241xE, String str, String str2, boolean z, boolean z2) {
        String str3;
        C140626Xq c140626Xq = this.A03;
        if (c140626Xq != null && c140626Xq.A07) {
            return;
        }
        UserSession userSession = this.A06;
        ReelStore A04 = C1OU.A04(userSession);
        String str4 = userSession.userId;
        User CDj = c1nb.CDj();
        if (CDj != null) {
            str3 = CDj.getId();
        } else {
            str3 = null;
        }
        Reel A0K = A04.A0K(c1nb, str2, C14360o3.A0K(str4, str3));
        Activity activity = this.A04;
        C82013lN c82013lN = this.A09;
        if (c82013lN != null) {
            C140626Xq A03 = C1OU.A03(activity, userSession, A0K, new C49572LvR(c47777L8c, this, A0K, interfaceC42241xE), c82013lN, "", -1);
            A03.A04 = str;
            A03.A06 = z;
            A03.A0A = z2;
            A03.A04();
            this.A03 = A03;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        this.A02 = null;
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A02 = null;
        AbstractC149546o6 abstractC149546o6 = this.A01;
        if (abstractC149546o6 != null) {
            abstractC149546o6.A01 = null;
            abstractC149546o6.A00 = null;
            this.A01 = null;
        }
    }

    public C7KE(Activity activity, UserSession userSession, C7KD c7kd, C3G2 c3g2) {
        this.A06 = userSession;
        this.A04 = activity;
        this.A07 = c7kd;
        this.A08 = c3g2;
        C1OU c1ou = C1OU.$redex_init_class;
        this.A09 = AbstractC82003lM.A00(userSession);
        this.A05 = new Handler(Looper.getMainLooper());
        this.A00 = ReelViewerConfig.A00();
    }
}
