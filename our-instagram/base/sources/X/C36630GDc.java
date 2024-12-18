package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36630GDc implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (AbstractC31270Dos.A00(userSession)) {
            String A00 = AbstractC111324zv.A00(3044);
            if (uri.getQueryParameter(A00) == null) {
                C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, userSession);
                A0P.A0D(new C33232ElR());
                A0P.A04();
            }
            KCJ A02 = C28531Zo.A04.A02.A02(uri.getQueryParameter("entrypoint"), uri.getQueryParameter(A00));
            C140966Yy A0P2 = AbstractC31173DnH.A0P(this.A00, userSession);
            C14360o3.A0A(A02);
            A0P2.A0D(A02);
            A0P2.A04();
        }
    }

    public C36630GDc(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
