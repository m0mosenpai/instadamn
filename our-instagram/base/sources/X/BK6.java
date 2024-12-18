package X;

import android.R;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BK6 implements InterfaceC30988Djn {
    public final C675432t A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final InterfaceC60442pS A03;
    public final BK7 A04;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A02.A04(view);
    }

    public BK6(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A02 = c57112jm;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        C675432t c675432t = new C675432t(userSession, interfaceC60442pS, c1m1);
        this.A00 = c675432t;
        this.A04 = new BK7(c675432t, context.getResources().getInteger(R.integer.config_mediumAnimTime));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.2uS, java.lang.Object] */
    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        C675432t c675432t = this.A00;
        ?? obj = new Object();
        InterfaceC60442pS interfaceC60442pS = this.A03;
        UserSession userSession = this.A01;
        C09 c09 = new C09(c675432t, userSession, interfaceC60442pS, AbstractC63462uT.A00(userSession), obj);
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0R("clips_viewer_inline_comment_key_prefix", c120985dq.getId()));
        A00.A00(c09);
        A00.A00(this.A04);
        AbstractC25227BEk.A10(view, A00, this.A02);
    }
}
