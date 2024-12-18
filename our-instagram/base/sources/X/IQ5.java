package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IQ5 {
    public static final void A00(Activity activity, Context context, UserSession userSession, String str) {
        boolean z;
        InterfaceC1118152j interfaceC1118152j;
        Boolean valueOf;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            HE0 he0 = (HE0) AbstractC001800i.A0J(HE0.A08.A00(context, userSession, A0h, false));
            if (he0 != null && (interfaceC1118152j = he0.A00) != null && (valueOf = Boolean.valueOf(interfaceC1118152j.CcL())) != null) {
                z = valueOf.booleanValue();
            } else {
                z = false;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36323741013388865L);
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A00, A00.A32, C23031Ai.A8c, 327) && C18U.A06(c06090Tz, userSession, 36323019458620266L) && (!z || !A06)) {
                C38927HBz.A03.A00(activity, context, userSession, str, false);
                return;
            }
            C38935HCi A002 = AbstractC40573Hyt.A00(userSession, str, false);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            AbstractC25225BEi.A1Q(A0y, false);
            AbstractC25226BEj.A1M(context, A0y, 2131957395);
            if (A06) {
                A0y.A0g = context.getString(2131955397);
                A0y.A1J = true;
                A0y.A0K = new ViewOnClickListenerC41979IjA(activity, context, userSession, str, 0);
            }
            AbstractC31173DnH.A0w(activity, A002, A0y);
        }
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C07X c07x, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num) {
        Integer num2 = C05F.A1I;
        if (num != num2) {
            if (c38321qM.A5x()) {
                num2 = C05F.A0C;
            } else if (c38321qM.Cff()) {
                num2 = C05F.A0N;
            } else {
                num2 = C05F.A02;
            }
        }
        C121275eQ A00 = AbstractC50633MWu.A00(context, userSession, c38321qM, AbstractC43591JPw.A00(1340));
        A00.A00 = new C45688KJz(context, fragmentActivity, abstractC10360h2, c07x, interfaceC11380iw, userSession, c38321qM, AbstractC31174DnI.A0i(context), num2);
        C1GJ.A00(fragmentActivity, abstractC018607g, A00);
    }
}
