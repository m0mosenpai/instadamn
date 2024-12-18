package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fbc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35005Fbc {
    public C189478aR A00;
    public final Activity A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C34508FIu A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2pq, androidx.fragment.app.Fragment, X.Eka] */
    public final void A01(DirectThreadKey directThreadKey, Integer num) {
        C14360o3.A0B(num, 1);
        ?? abstractC60672pq = new AbstractC60672pq();
        abstractC60672pq.A00 = this;
        abstractC60672pq.A01 = directThreadKey;
        abstractC60672pq.A02 = num;
        C189448aO A0y = AbstractC25225BEi.A0y(this.A04);
        AbstractC25226BEj.A1M(this.A02, A0y, 2131959694);
        this.A00 = A0y.A00().A02(this.A01, abstractC60672pq);
    }

    public static final void A00(C35005Fbc c35005Fbc, DirectThreadKey directThreadKey, Integer num, long j) {
        C34508FIu c34508FIu = c35005Fbc.A05;
        C31230DoD c31230DoD = new C31230DoD(directThreadKey, num, j);
        C25621Ms A0c = AbstractC167017dG.A0c(c34508FIu.A00);
        A0c.A0B("direct_v2/set_thread_reminder/");
        A0c.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((DirectThreadKey) c31230DoD.A03).A00);
        A0c.A0E("notification_time", c31230DoD.A01);
        C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
        C31456Ds0.A00(A0Q, c31230DoD, c34508FIu, 23);
        C1GJ.A03(A0Q);
    }

    public C35005Fbc(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = context;
        this.A01 = activity;
        this.A05 = new C34508FIu(userSession, this);
    }
}
