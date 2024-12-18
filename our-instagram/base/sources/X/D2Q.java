package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class D2Q implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FoaUserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public D2Q(Context context, FoaUserSession foaUserSession, String str, String str2) {
        this.A00 = context;
        this.A01 = foaUserSession;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        FoaUserSession foaUserSession = this.A01;
        AbstractC68608VXj.A00(context, AbstractC25236BEt.A0T(), CNB.A00, foaUserSession, new C27906CRr(foaUserSession, this.A02, this.A03));
    }
}
