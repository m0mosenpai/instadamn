package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27049BwT extends AbstractC61132qb {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C27049BwT(Activity activity, Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        this.A00 = i;
        this.A01 = activity;
        this.A05 = userSession;
        this.A06 = str;
        this.A02 = context;
        this.A04 = interfaceC11380iw;
        this.A03 = abstractC018607g;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        int i = this.A00;
        Activity activity = (Activity) this.A01;
        if (i != 0) {
            Application application = activity.getApplication();
            C14360o3.A07(application);
            UserSession userSession = (UserSession) this.A05;
            C62832tM A00 = AbstractC62822tL.A00(userSession);
            C14360o3.A07(A00);
            return new C25800BbH(application, A00, new CTC((Context) this.A02, (AbstractC018607g) this.A03, (InterfaceC11380iw) this.A04, userSession), this.A06);
        }
        Application application2 = activity.getApplication();
        C14360o3.A07(application2);
        UserSession userSession2 = (UserSession) this.A05;
        C62832tM A002 = AbstractC62822tL.A00(userSession2);
        C14360o3.A07(A002);
        return new C25799BbG(application2, A002, new C27940CSz((Context) this.A02, (AbstractC018607g) this.A03, (InterfaceC11380iw) this.A04, userSession2), this.A06);
    }
}
