package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hy6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40524Hy6 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        ClipsViewerSource clipsViewerSource;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        if (C14360o3.A0K(A00, "live_shopping_netego")) {
            clipsViewerSource = ClipsViewerSource.A1j;
        } else {
            clipsViewerSource = ClipsViewerSource.A0D;
        }
        C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, A0S);
        c116875Qr.A1D = str;
        AbstractC41751IeQ.A01(A04, c116875Qr, A0S, false);
        return null;
    }
}
