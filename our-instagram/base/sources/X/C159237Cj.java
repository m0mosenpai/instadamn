package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159237Cj {
    public static final C159237Cj A00 = new Object();

    public final void A00(Context context, View view, UserSession userSession, C7IK c7ik, C2EE c2ee) {
        View findViewById;
        C14360o3.A0B(view, 4);
        if (c2ee != null && c2ee.C7I() != null && (findViewById = view.findViewById(R.id.nux_banner)) != null) {
            boolean z = true;
            if (!C4GR.A02(c2ee.C7g())) {
                z = false;
            }
            boolean A0g = AbstractC002300n.A0g(c2ee.Asv(), userSession.userId, false);
            if (z && A0g && C18U.A06(C06090Tz.A05, userSession, 36328444002385441L)) {
                findViewById.setVisibility(0);
                View findViewById2 = view.findViewById(R.id.nux_banner);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pills_container);
                viewGroup.removeAllViewsInLayout();
                AbstractC34067F1v.A00(context, viewGroup, userSession, c7ik, c2ee, AbstractC16960so.A1Q(EnumC33318EoD.A0F, EnumC33318EoD.A0G, EnumC33318EoD.A0C, EnumC33318EoD.A06, EnumC33318EoD.A0I, EnumC33318EoD.A0H, EnumC33318EoD.A08));
                ((TextView) view.findViewById(R.id.title)).setText(context.getString(2131974821));
                return;
            }
            findViewById.setVisibility(8);
        }
    }
}
