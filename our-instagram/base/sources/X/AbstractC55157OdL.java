package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OdL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55157OdL {
    public static final void A00(Context context) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131968112);
        A0I.A0r(AnonymousClass001.A0g(context.getString(2131968111), "\n\n", context.getString(2131968107)));
        AbstractC31176DnK.A16(null, A0I, 2131968110);
    }

    public static final void A01(Context context) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131968114);
        A0I.A09(2131968113);
        AbstractC31176DnK.A16(null, A0I, 2131968110);
    }

    public static final void A02(Context context) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131968117);
        A0I.A09(2131968116);
        AbstractC31176DnK.A16(null, A0I, 2131968110);
    }

    public static final void A03(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131968109);
        A0I.A0r(AnonymousClass001.A0g(context.getString(2131968108), "\n\n", context.getString(2131968107)));
        A0I.A0K(new DialogInterfaceOnClickListenerC28537CiV(interfaceC16820sZ, 10), 2131968115);
        AbstractC31176DnK.A16(null, A0I, 2131968106);
    }

    public static final boolean A04(UserSession userSession) {
        Boolean CZF = AbstractC31174DnI.A0m(userSession).CZF();
        if (CZF != null && CZF.booleanValue()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317401642570878L) && C18U.A06(c06090Tz, userSession, 36321580644574840L)) {
                return true;
            }
        }
        return false;
    }
}
