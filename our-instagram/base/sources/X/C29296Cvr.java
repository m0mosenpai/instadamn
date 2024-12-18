package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cvr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29296Cvr implements InterfaceC85403rV {
    public final /* synthetic */ C38321qM A00;

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(str, view, clickableSpan);
        new C85393rU(userSession, this.A00, false).D4A(clickableSpan, view, userSession, str);
    }

    public C29296Cvr(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }
}
