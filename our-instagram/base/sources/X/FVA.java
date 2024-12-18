package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FVA {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36312694357230808L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r9, androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, X.GZ5 r12, java.lang.String r13) {
        /*
            r4 = 1
            r6 = r9
            X.8hC r2 = X.AbstractC31171DnF.A0I(r9)
            r2.A05 = r13
            r2.A0s(r4)
            r2.A0t(r4)
            r0 = 3
            r8 = r12
            X.DialogInterfaceOnCancelListenerC35300FhZ.A00(r2, r12, r0)
            r7 = r11
            com.instagram.api.schemas.BizUserInboxState r1 = X.AbstractC31179DnN.A0E(r11)
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.A04
            if (r1 != r0) goto L2a
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36312694357230808(0x810234000004d8, double:3.027632358771992E-306)
            boolean r0 = X.C18U.A06(r3, r11, r0)
            r9 = 1
            if (r0 != 0) goto L2b
        L2a:
            r9 = 0
        L2b:
            X.2Dr r0 = X.C47032Dr.A00
            java.lang.String r1 = X.JUR.A00(r6, r11, r0)
            r0 = 10
            X.FkA r0 = X.DialogInterfaceOnClickListenerC35453FkA.A00(r12, r0)
            r2.A0e(r0, r1)
            X.2Dk r0 = X.C46962Dk.A00
            java.lang.String r0 = X.JUR.A00(r6, r11, r0)
            X.FiZ r3 = new X.FiZ
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A0b(r3, r0)
            X.AbstractC166987dD.A1W(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVA.A00(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.GZ5, java.lang.String):void");
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, AbstractC46972Dl abstractC46972Dl, GZ5 gz5) {
        Integer num;
        String str;
        boolean A1Y = AbstractC25229BEm.A1Y(fragmentActivity);
        if (abstractC46972Dl.A01 == EnumC46982Dm.A05) {
            num = C05F.A0C;
        } else {
            num = C05F.A0N;
        }
        EI2 ei2 = new EI2();
        Bundle A0b = AbstractC166987dD.A0b();
        if (2 - num.intValue() != 0) {
            str = "accept_request";
        } else {
            str = "move_thread";
        }
        AbstractC31171DnF.A13(A0b, str);
        ei2.setArguments(A0b);
        ei2.A02 = abstractC46972Dl;
        ei2.A03 = new C50268MHx(2, fragmentActivity, gz5);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A04("MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        A00.A03(C31650DvG.A00(gz5, 40), C36079FwF.class, "MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        List A0E = ((C2DU) C2JD.A00(userSession)).A0C.A0E();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0E) {
            if (obj instanceof C2E6) {
                A1E.add(obj);
            }
        }
        boolean A1Q = AbstractC167007dF.A1Q(A1E.size(), 5);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(fragmentActivity, A0y, 2131964417);
        C189458aP c189458aP = new C189458aP(null, null, "", A1Y ? 1 : 0, A1Y ? 1 : 0);
        c189458aP.A02 = R.drawable.plus_24;
        c189458aP.A05 = new ViewOnClickListenerC35609Fo0(2, fragmentActivity, userSession, num, A1Q);
        A0y.A07(c189458aP.A00());
        AbstractC31173DnH.A0w(fragmentActivity, ei2, A0y);
    }
}
