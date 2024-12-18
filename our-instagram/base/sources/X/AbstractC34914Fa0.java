package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34914Fa0 {
    public static final InterfaceC11380iw A00 = AbstractC31171DnF.A0D("quiet_mode");

    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        String A01;
        String A012;
        boolean A1b = AbstractC25233BEq.A1b(fragmentActivity, context, userSession);
        C69436VnL A03 = new C71603Jf(userSession).A03(0L);
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        AbstractC31173DnH.A15(context, A0H, R.drawable.ig_illustrations_qp_moon_refresh);
        AbstractC31172DnG.A1C(context, A0H, 2131971420);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        if (str.equals(AbstractC111324zv.A00(2247))) {
            A01 = AbstractC35218FgB.A01(context, c71603Jf.A01(), A1b);
            A012 = AbstractC35218FgB.A01(context, c71603Jf.A00(), A1b);
        } else {
            C06090Tz c06090Tz = C06090Tz.A05;
            A01 = AbstractC35218FgB.A01(context, C18U.A01(c06090Tz, userSession, 36597454984186702L), false);
            A012 = AbstractC35218FgB.A01(context, C18U.A01(c06090Tz, userSession, 36597454984055629L), false);
        }
        String A0t = AbstractC31174DnI.A0t(context, A01, A012, 2131971411);
        C14360o3.A07(A0t);
        A0H.A0r(A0t);
        A0H.A0R(new DialogInterfaceOnClickListenerC35352FiT(fragmentActivity, A03, userSession, str, 8), EnumC193348hE.A04, 2131961561);
        AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC35451Fk8(A03, userSession, str, 12), A0H, 2131968948);
        InterfaceC11380iw interfaceC11380iw = A00;
        C14360o3.A0B(interfaceC11380iw, A1b ? 1 : 0);
        C65761Ttc.A00(AbstractC12220kQ.A01(interfaceC11380iw, userSession), A03, "ig_quiet_mode_upsell_unified_dialog_shown", str);
    }
}
