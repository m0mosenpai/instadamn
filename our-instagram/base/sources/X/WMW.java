package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMW implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63752uw A01;
    public final /* synthetic */ User A02;

    public WMW(C63752uw c63752uw, User user, int i) {
        this.A01 = c63752uw;
        this.A00 = i;
        this.A02 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-830639424);
        C63752uw c63752uw = this.A01;
        int i = this.A00;
        User user = this.A02;
        String id = user.getId();
        BIM.A03(c63752uw.A01, c63752uw.A02, id, i);
        c63752uw.A01(user.getId());
        C0f9.A0C(1221995619, A05);
    }
}
