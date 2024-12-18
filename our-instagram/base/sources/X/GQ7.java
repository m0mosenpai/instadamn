package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQ7 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;

    public GQ7(Activity activity, View view, UserSession userSession, Integer num) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = num;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        C03O.A00(view, new RunnableC36965GQi(this.A00, view, view, this.A02, this.A03));
    }
}
