package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Im0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42152Im0 implements InterfaceC30988Djn {
    public final C57112jm A00;
    public final C42383Ipk A01;
    public final HK4 A02;
    public final HK1 A03;
    public final List A04;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A04(view);
    }

    public C42152Im0(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, String str, List list) {
        this.A00 = c57112jm;
        this.A04 = list;
        this.A03 = new HK1(context, userSession, interfaceC60442pS, str, list);
        this.A02 = new HK4(userSession, interfaceC60442pS, str);
        this.A01 = new C42383Ipk(context, userSession, interfaceC60442pS, c1m1);
    }

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0R("overlay_ads_cta_", c120985dq.getId()));
        A00.A00(this.A03);
        A00.A00(this.A02);
        A00.A00(this.A01);
        this.A00.A05(view, A00.A01());
    }
}
