package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42003IjY implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ C1XK A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public ViewOnClickListenerC42003IjY(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1XK c1xk, String str, String str2) {
        this.A03 = c1xk;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = interfaceC60442pS;
        this.A04 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1704033153);
        A1C(this.A00, this.A01, this.A05, this.A02.getModuleName(), "tags", null, this.A04, null);
        C0f9.A0C(-501867707, A05);
    }
}
