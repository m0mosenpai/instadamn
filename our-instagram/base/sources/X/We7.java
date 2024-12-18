package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class We7 implements XA6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ W6I A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public We7(FragmentActivity fragmentActivity, W6I w6i, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = w6i;
    }

    @Override // X.XA6
    public final void onComplete() {
        AbstractC70398WUa.A00(this.A00, this.A02, this.A03, this.A01.A00());
    }
}
