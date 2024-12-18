package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class P3O implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ InterfaceC60442pS A05;
    public final /* synthetic */ C75113Zb A06;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3O(Context context, android.net.Uri uri, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        this.A00 = context;
        this.A02 = abstractC10360h2;
        this.A04 = c38321qM;
        this.A06 = c75113Zb;
        this.A05 = interfaceC60442pS;
        this.A03 = userSession;
        this.A01 = uri;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        Context A0O = AbstractC166987dD.A0O(this.A00);
        AbstractC10360h2 abstractC10360h2 = this.A02;
        C38321qM c38321qM = this.A04;
        C75113Zb c75113Zb = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A03;
        android.net.Uri uri = this.A01;
        List A04 = abstractC10360h2.A0U.A04();
        C14360o3.A07(A04);
        Fragment fragment = (Fragment) AbstractC001800i.A0O(A04, 0);
        if (fragment instanceof C1GL) {
            AbstractC31510Dsu.A0P(A0O, uri, fragment, userSession, c38321qM, interfaceC60442pS, c75113Zb, null, "clips_download_finished_toast");
        }
    }
}
