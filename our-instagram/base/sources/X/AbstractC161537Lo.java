package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161537Lo {
    public static final C3DN A00(Activity activity) {
        C14360o3.A0B(activity, 1);
        C3DN A00 = C3DN.A00.A00(activity);
        if (A00 == null) {
            C18950wb.A01.AEp("null bottomsheet navigator from activity", 20132006);
            return null;
        }
        return A00;
    }

    public static final C3DN A01(Context context, UserSession userSession) {
        Activity activity;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            return A00(activity);
        }
        C18950wb c18950wb = C18950wb.A01;
        c18950wb.AEp("context is not activity", 20132006);
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null) {
            return A01;
        }
        c18950wb.AEp("null bottomsheet navigator from context", 20132006);
        return null;
    }

    public static final void A02(AbstractC59962oe abstractC59962oe, InterfaceC25195BCs interfaceC25195BCs) {
        C3DN A01;
        InterfaceC50436MOq interfaceC50436MOq;
        C14360o3.A0B(interfaceC25195BCs, 0);
        L5H Acd = interfaceC25195BCs.Acd();
        Activity activity = Acd.A00;
        UserSession userSession = Acd.A02;
        if (activity != null) {
            A01 = A00(activity);
        } else {
            A01 = A01(Acd.A01, userSession);
        }
        if (A01 != null) {
            if (abstractC59962oe == null && (abstractC59962oe = interfaceC25195BCs.AMG(A01)) == null) {
                return;
            }
            if (Acd.A0B) {
                Acd.A05.A1D();
            }
            if (Acd.A0A) {
                Acd.A05.A1C();
            }
            C7IK c7ik = Acd.A04;
            if (c7ik != null && (abstractC59962oe instanceof InterfaceC50436MOq) && (interfaceC50436MOq = (InterfaceC50436MOq) abstractC59962oe) != null) {
                interfaceC50436MOq.ADq(c7ik);
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36325828367300005L)) {
                ((C3DP) A01).A0W = true;
            }
            C7F2 c7f2 = Acd.A06;
            boolean z = Acd.A09;
            String str = Acd.A08;
            C163997Vo c163997Vo = Acd.A03;
            C9FJ c9fj = new C9FJ(33, interfaceC25195BCs, abstractC59962oe, A01);
            C14360o3.A0B(c7f2, 2);
            C14360o3.A0B(c163997Vo, 5);
            if (z && C14360o3.A0K(str, "follow_button")) {
                c163997Vo.A02();
                ((C3DP) A01).A0H = new GHA(abstractC59962oe, c163997Vo, c7f2, A01);
                A01.A0B();
                return;
            }
            c9fj.invoke();
        }
    }
}
