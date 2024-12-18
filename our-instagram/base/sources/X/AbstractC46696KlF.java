package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KlF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46696KlF {
    public static void A00(Context context, UserSession userSession, Boolean bool) {
        if (bool.booleanValue()) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A00, A00.A48, C23031Ai.A8c, 478)) {
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                AbstractC43592JPx.A1D(context, A0I, R.drawable.ig_illustrations_illo_photo_dump_refresh);
                A0I.A05 = context.getString(2131968451);
                A0I.A0r(context.getString(2131968450));
                A0I.A0Z(null, EnumC193348hE.A03, context.getString(2131968948), true);
                DialogInterfaceOnDismissListenerC48025LMu.A00(A0I, userSession, 4);
                AbstractC166987dD.A1W(A0I);
                return;
            }
            AbstractC23021Ah.A00(userSession).A1W(true);
        }
    }
}
