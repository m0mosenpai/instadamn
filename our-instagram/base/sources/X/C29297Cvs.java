package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cvs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29297Cvs implements InterfaceC85403rV {
    public final C38321qM A00;
    public final InterfaceC16660sJ A01;
    public final boolean A02;

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(str, view, clickableSpan);
        this.A01.invoke(new Object());
        if (this.A02) {
            new C85393rU(userSession, this.A00, false).D4A(clickableSpan, view, userSession, str);
        }
    }

    public C29297Cvs(C38321qM c38321qM, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = c38321qM;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
    }
}
