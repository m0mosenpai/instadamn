package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* loaded from: classes8.dex */
public final class L47 {
    public C7IM A00;
    public final Context A01;
    public final View A02;
    public final FragmentActivity A03;
    public final AnonymousClass988 A04;
    public final DirectThreadThemeInfo A05;

    public L47(Context context, View view, FragmentActivity fragmentActivity, UserSession userSession, DirectThreadThemeInfo directThreadThemeInfo) {
        C14360o3.A0B(userSession, 1);
        this.A03 = fragmentActivity;
        this.A01 = context;
        this.A05 = directThreadThemeInfo;
        this.A02 = view;
        AnonymousClass988 A0a = AbstractC43594JPz.A0a(userSession, AnonymousClass988.A1Z);
        this.A04 = A0a;
        C7IM A06 = AbstractC86593tX.A06(context, A0a);
        if (directThreadThemeInfo != null && C18U.A06(C06090Tz.A05, userSession, 36319377329364299L)) {
            A06 = C7ID.A00.A01(context, A0a, directThreadThemeInfo, C05F.A00);
            C14360o3.A0A(A06);
        }
        this.A00 = A06;
    }
}
