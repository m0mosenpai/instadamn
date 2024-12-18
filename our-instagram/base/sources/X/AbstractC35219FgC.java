package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: X.FgC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35219FgC {
    public static final void A03(Context context, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, UserSession userSession, String str, long j) {
        DialogInterfaceOnClickListenerC35352FiT dialogInterfaceOnClickListenerC35352FiT;
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC167027dH.A13(context, abstractC12990ll, str);
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        boolean equals = str.equals("ig_ts_entry_point_direct_header");
        int i = R.drawable.ig_illustrations_qp_clock;
        if (equals) {
            i = R.drawable.ig_illustrations_qp_moon_refresh;
        }
        AbstractC31173DnH.A15(context, A0H, i);
        A0H.A05 = context.getResources().getString(2131968993);
        String A0r = AbstractC166997dE.A0r(context.getResources(), AbstractC35189Ffh.A01(AbstractC166997dE.A0M(context), (int) (j / 60), C18U.A06(C06090Tz.A05, userSession, 36313712264546513L), false), 2131968990);
        C14360o3.A07(A0r);
        A0H.A0r(A0r);
        A0H.A0J(new DialogInterfaceOnClickListenerC35446Fk3(str, userSession, 19), 2131968992);
        if (equals) {
            dialogInterfaceOnClickListenerC35352FiT = new DialogInterfaceOnClickListenerC35352FiT(context, fragmentActivity, userSession, str, 9);
        } else {
            dialogInterfaceOnClickListenerC35352FiT = new DialogInterfaceOnClickListenerC35352FiT(fragmentActivity, abstractC12990ll, userSession, str, 10);
        }
        AbstractC31176DnK.A16(dialogInterfaceOnClickListenerC35352FiT, A0H, 2131968991);
        AbstractC31178DnM.A1O(userSession, A01(str), C05F.A0I, AbstractC31174DnI.A07(userSession));
    }

    public static final boolean A04(UserSession userSession) {
        long j;
        if (C18U.A06(C06090Tz.A05, userSession, 36313712264546513L)) {
            j = 1;
        } else {
            j = 60;
        }
        long A00 = new C29W(userSession).A00();
        return A00 >= 0 && A02(userSession).contains(String.valueOf(A00 / j));
    }

    public static final EnumC33408Epf A01(String str) {
        Object obj;
        Iterator<E> it = EnumC33408Epf.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((EnumC33408Epf) obj).name(), AbstractC166997dE.A10(Locale.ROOT, str))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (EnumC33408Epf) obj;
    }

    public static final C189478aR A00(Context context, UserSession userSession, C1VE c1ve, FI9 fi9) {
        boolean A1a = AbstractC167017dG.A1a(userSession, context);
        C1VE.A00(c1ve);
        C36729GGy c36729GGy = new C36729GGy(2, context, userSession, fi9);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        int i = 2131957478;
        if (A04(userSession)) {
            i = 2131957470;
        }
        AbstractC25226BEj.A1M(context, A0y, i);
        A0y.A0v = A1a;
        A0y.A0U = c36729GGy;
        if (A04(userSession)) {
            A0y.A0g = context.getString(2131957468);
        } else {
            A0y.A0g = context.getString(2131957476);
            A0y.A0h = context.getString(2131957477);
            A0y.A0w = A1a;
        }
        return A0y.A00();
    }

    public static final ArrayList A02(UserSession userSession) {
        Iterable iterable;
        List A0h = AbstractC31175DnJ.A0h(C18U.A04(AbstractC166997dE.A0U(userSession), userSession, 36876662218162293L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (!A0h.isEmpty()) {
            ListIterator listIterator = A0h.listIterator(A0h.size());
            while (listIterator.hasPrevious()) {
                if (AbstractC31176DnK.A02(listIterator) != 0) {
                    iterable = AbstractC31177DnL.A0k(A0h, listIterator);
                    break;
                }
            }
        }
        iterable = C16930sl.A00;
        return AbstractC166987dD.A1F(AbstractC001800i.A0a(iterable));
    }
}
