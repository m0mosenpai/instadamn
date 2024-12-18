package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41991IjM implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ C1XK A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC41991IjM(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1XK c1xk, String str) {
        this.A03 = c1xk;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = interfaceC60442pS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1807110480);
        A1C(this.A00, this.A01, this.A04, this.A02.getModuleName(), "tags", null, null, null);
        C0f9.A0C(-41096846, A05);
    }
}
