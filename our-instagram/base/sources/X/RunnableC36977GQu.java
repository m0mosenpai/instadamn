package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36977GQu implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public RunnableC36977GQu(Activity activity, View view, View view2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = userSession;
        this.A01 = view2;
        this.A05 = str;
        this.A03 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        UserSession userSession = this.A04;
        int i = 2131960709;
        if (C18U.A06(C06090Tz.A05, userSession, 36316813232050861L)) {
            i = 2131960710;
        }
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(i));
        A0f.A01();
        View view = this.A01;
        A0f.A04(view, 0, AbstractC167017dG.A0E(view.getContext()), true);
        A0f.A07(C5SV.A07);
        A0f.A0A = true;
        A0f.A00 = 10000;
        A0f.A04 = new EfK(view, this.A03, userSession, this.A05);
        A0f.A00().A07(userSession);
    }
}
