package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Gri, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38239Gri implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C38241Grk A05;
    public final /* synthetic */ C38240Grj A06;
    public final /* synthetic */ C37524Gfg A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public RunnableC38239Gri(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, C38241Grk c38241Grk, C38240Grj c38240Grj, C37524Gfg c37524Gfg, String str, List list, int i, boolean z) {
        this.A09 = list;
        this.A04 = user;
        this.A06 = c38240Grj;
        this.A05 = c38241Grk;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = activity;
        this.A0A = z;
        this.A00 = i;
        this.A07 = c37524Gfg;
        this.A08 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A09;
        User user = this.A04;
        C38240Grj c38240Grj = this.A06;
        C38241Grk c38241Grk = this.A05;
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Activity activity = this.A01;
        boolean z = this.A0A;
        C38238Grh.A01(activity, interfaceC11380iw, userSession, user, c38241Grk, c38240Grj, this.A07, this.A08, list, this.A00, z);
    }
}
