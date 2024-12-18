package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public final class ARx implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public ARx(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1985266587);
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        C6XJ.A02(activity, AbstractC166987dD.A0b(), userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5174)).A0C(activity);
        C0f9.A0C(1047829222, A05);
    }
}
