package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final /* synthetic */ class GQI implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FOO A02;
    public final /* synthetic */ C36005Fv3 A03;

    public /* synthetic */ GQI(Context context, UserSession userSession, FOO foo, C36005Fv3 c36005Fv3) {
        this.A02 = foo;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c36005Fv3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FOO foo = this.A02;
        Context context = this.A00;
        C36005Fv3 c36005Fv3 = this.A03;
        TextView textView = foo.A05;
        textView.setText(FV9.A00(context, c36005Fv3.A06, textView, c36005Fv3.A0B, foo.A02.getWidth(), c36005Fv3.A0D.size()));
        textView.setVisibility(0);
    }
}
