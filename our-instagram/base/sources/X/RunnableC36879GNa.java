package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GNa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36879GNa implements Runnable {
    public final /* synthetic */ C32544EUu A00;
    public final /* synthetic */ UserSession A01;

    public RunnableC36879GNa(C32544EUu c32544EUu, UserSession userSession) {
        this.A00 = c32544EUu;
        this.A01 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01;
        C32544EUu c32544EUu = this.A00;
        AbstractC59962oe abstractC59962oe = c32544EUu.A07;
        EnumC33445EqI enumC33445EqI = c32544EUu.A0A;
        String str = c32544EUu.A0B;
        CallerContext callerContext = C35786FrO.A00;
        synchronized (C35154Few.A00()) {
        }
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        if (requireActivity instanceof InterfaceC37222GaX) {
            BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) ((InterfaceC37222GaX) requireActivity);
            businessConversionActivity.CnD(null);
            if (AbstractC167007dF.A1Z(businessConversionActivity.A0A)) {
                AbstractC35794FrW.A04(abstractC59962oe, abstractC59962oe, enumC33445EqI, null, C05F.A01, userSession.userId);
                return;
            }
        }
        AbstractC31525Dt9.A05(requireActivity, AbstractC08820cl.A03(AnonymousClass001.A0R("instagram://professional_signup_nux?entry_point=", str)), abstractC59962oe, userSession);
    }
}
