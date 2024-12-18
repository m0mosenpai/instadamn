package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G8m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36514G8m implements InterfaceC58152PqH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36514G8m(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
        UserSession userSession = this.A01;
        C31368DqX.A01(AbstractC25225BEi.A0r(fragmentActivity, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A00(userSession, "deleted_media", this.A02));
    }
}
