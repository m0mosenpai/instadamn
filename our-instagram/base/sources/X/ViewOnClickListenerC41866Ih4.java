package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ih4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41866Ih4 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41866Ih4(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-361122847);
        AnonymousClass308 anonymousClass308 = this.A00;
        InterfaceC60442pS interfaceC60442pS = anonymousClass308.A0X;
        UserSession userSession = anonymousClass308.A0T;
        int i = anonymousClass308.A01;
        C1M1 c1m1 = anonymousClass308.A0a;
        if (c1m1 != null) {
            str = c1m1.getSessionId();
        } else {
            str = null;
        }
        AbstractC37670Gi3.A0h(userSession, interfaceC60442pS, "creator_unpick", "long_press_drop_down_menu", str, i);
        Fragment fragment = anonymousClass308.A0R;
        C38321qM A07 = anonymousClass308.A07();
        AbstractC167007dF.A1K(userSession, fragment);
        C37759GjY.A01(fragment, null, userSession, A07, false);
        C0f9.A0C(-2000535436, A05);
    }
}
