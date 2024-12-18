package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.3rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85393rU implements InterfaceC85403rV {
    public final C25671My A00;
    public final C38321qM A01;
    public final boolean A02;

    public C85393rU(UserSession userSession, C38321qM c38321qM, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = c38321qM;
        this.A02 = z;
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(view, 2);
        C14360o3.A0B(clickableSpan, 3);
        C38321qM c38321qM = this.A01;
        if (c38321qM != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            this.A00.E4s(new C72393Mm(clickableSpan, view, c38321qM, lowerCase, this.A02));
        }
    }
}
