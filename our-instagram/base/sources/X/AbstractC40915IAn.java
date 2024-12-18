package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IAn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40915IAn {
    public static final void A00(Activity activity, MVS mvs, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        String str2;
        String A01;
        long j;
        BQL bql;
        Long l;
        Long A0j;
        boolean A1Y = AbstractC25229BEm.A1Y(mvs);
        UserSession userSession = mvs.A03;
        C37522Gfe c37522Gfe = mvs.A01;
        if (c37522Gfe != null) {
            C38321qM c38321qM = mvs.A00;
            if (c38321qM != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "instagram_clips_viewer_cta_impression");
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1O(A0f, c37522Gfe.getModuleName());
                    String A38 = c38321qM.A38();
                    if (A38 != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC37303Gc4.A0c(A0f, A1Y ? 1 : 0, j);
                    if (z) {
                        bql = BQL.A1O;
                    } else {
                        bql = BQL.A1P;
                    }
                    AbstractC37300Gc1.A0e(bql, A0f);
                    AbstractC25225BEi.A1M(EnumC120795dP.A0q, A0f);
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    if (A14 != null) {
                        l = AbstractC25231BEo.A0k(A14);
                    } else {
                        l = null;
                    }
                    AbstractC37300Gc1.A0k(A0f, l);
                    A0f.Cht();
                }
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                int i = 2131955334;
                if (z) {
                    i = 2131955330;
                }
                A0H.A0A(i);
                int i2 = 2131955333;
                if (z) {
                    i2 = 2131955331;
                }
                if (str.length() == 0) {
                    A01 = AbstractC25227BEk.A0u(activity, 2131972091);
                } else {
                    A01 = AbstractC75373a4.A01(str);
                }
                AbstractC31177DnL.A0v(activity, A0H, A01, i2);
                int i3 = 2131955332;
                if (z) {
                    i3 = 2131955328;
                }
                A0H.A0M(DialogInterfaceOnClickListenerC41836Ifq.A00(interfaceC16820sZ, 35), i3);
                AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC41799IfF(2, mvs, z), A0H, 2131955318);
                return;
            }
            str2 = "media";
        } else {
            str2 = "analyticsModule";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
