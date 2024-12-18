package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G7P implements GZ7 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C22P A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C6WQ A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Activity activity = this.A00;
        Context context = this.A01;
        UserSession userSession = this.A04;
        Fragment fragment = this.A02;
        String str = this.A07;
        String str2 = this.A08;
        C28422CgU.A00(activity, context, fragment, this.A03, userSession, c38321qM, this.A06, str, str2);
        if (this.A09) {
            this.A05.dismiss();
        }
    }

    public G7P(Activity activity, Context context, Fragment fragment, C22P c22p, UserSession userSession, C6WQ c6wq, User user, String str, String str2, boolean z) {
        this.A00 = activity;
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = fragment;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = user;
        this.A03 = c22p;
        this.A09 = z;
        this.A05 = c6wq;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        if (this.A09) {
            this.A05.dismiss();
        }
        C9GR.A0B(this.A01, AbstractC111324zv.A00(4456));
    }
}
