package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IPb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41286IPb {
    public static final void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, boolean z) {
        C54842OMn c54842OMn = new C54842OMn(userSession);
        if (z) {
            c54842OMn.A01(activity, new ViewOnClickListenerC41960Iir(interfaceC16620sF, userSession, str, 0), AbstractC166997dE.A0p(activity, 2131968678), R.drawable.instagram_eye_off_pano_outline_24);
        }
        c54842OMn.A00(activity, new ViewOnClickListenerC41995IjQ(activity, interfaceC11380iw, userSession, interfaceC16660sJ, str, 1), AbstractC166997dE.A0p(activity, 2131972368), R.drawable.instagram_report_pano_outline_24);
        new OJT(c54842OMn).A00(activity);
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        Integer num;
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C3YS.A00(userSession).A03(A0h, z, A1Y);
            C37891Glm A00 = AbstractC37876GlW.A00(userSession);
            if (z) {
                num = C05F.A00;
            } else {
                num = C05F.A0N;
            }
            A00.A00(A0h, num);
            InterfaceC99334d2 C6Y = A0h.A0C.C6Y();
            if (C6Y != null) {
                C72858XpE AKk = C6Y.AKk();
                AKk.A0L = Boolean.valueOf(z);
                A0h.A0C.Efb(AKk.A00());
                A0h.AEH(userSession);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(1559));
    }
}
