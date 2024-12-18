package X;

import android.R;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BK4 implements InterfaceC30988Djn {
    public final Context A00;
    public final C675432t A01;
    public final UserSession A02;
    public final C57112jm A03;
    public final InterfaceC60442pS A04;
    public final C1M1 A05;
    public final BK5 A06;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A03.A04(view);
    }

    public BK4(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A00 = context;
        this.A03 = c57112jm;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = c1m1;
        C675432t c675432t = new C675432t(userSession, interfaceC60442pS, c1m1);
        this.A01 = c675432t;
        this.A06 = new BK5(c675432t, context.getResources().getInteger(R.integer.config_mediumAnimTime));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.2uS, java.lang.Object] */
    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36313424501934051L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36313424501868514L);
        boolean z = true;
        boolean z2 = !A062;
        if (!A06 && !z2) {
            z = false;
        }
        C08 c08 = new C08(this.A01, userSession, this.A04, AbstractC63462uT.A00(userSession), new Object());
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0R("clips_viewer_comment_preview_key_prefix", c120985dq.getId()));
        A00.A00(c08);
        if (z) {
            A00.A00(this.A06);
        }
        AbstractC25227BEk.A10(view, A00, this.A03);
    }
}
