package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OdQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55162OdQ {
    public static final C55162OdQ A00 = new Object();

    public static final ViewGroup A00(Activity activity, ViewGroup viewGroup, C80673iw c80673iw, UserSession userSession, InterfaceC59152nG interfaceC59152nG, InterfaceC145396gy interfaceC145396gy) {
        ViewGroup viewGroup2;
        boolean A1b = AbstractC25233BEq.A1b(activity, viewGroup, interfaceC145396gy);
        C14360o3.A0B(userSession, 5);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (!C18U.A06(C06090Tz.A05, userSession, 36323255682083951L)) {
            View inflate = A0P.inflate(R.layout.layout_iglive_archive_reel_item, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            C14360o3.A0A(A0P);
            View A002 = C50802Vb.A00(A0P, new ViewGroup.LayoutParams(-1, -1), viewGroup, R.layout.layout_iglive_archive_reel_item, 0, false, A1b);
            C14360o3.A0C(A002, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A002;
        }
        C138246Of c138246Of = new C138246Of(viewGroup2, userSession, interfaceC145396gy);
        c138246Of.BRC().setCornerRadius(0);
        if (interfaceC59152nG != null) {
            c138246Of.A00().setPostProcessor(interfaceC59152nG);
        }
        if (c80673iw != null) {
            c138246Of.A00().setProgressiveImageConfig(c80673iw);
        }
        AbstractC166987dD.A0d(c138246Of.A0F).setLayerType(A1b ? 1 : 0, null);
        viewGroup2.setTag(c138246Of);
        return viewGroup2;
    }

    public static final void A02(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, C138246Of c138246Of, int i, int i2) {
        AbstractC167007dF.A1E(c138246Of, 1, c41181vS);
        C14360o3.A0B(c3g2, 6);
        A01(AbstractC31171DnF.A0D("reel_animator"), userSession, c41181vS, c41551w4, c3g2, new C141596ac(true), c138246Of, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (r5 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC11380iw r14, com.instagram.common.session.UserSession r15, X.C41181vS r16, X.C41551w4 r17, X.C3G2 r18, X.C141596ac r19, X.C138246Of r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55162OdQ.A01(X.0iw, com.instagram.common.session.UserSession, X.1vS, X.1w4, X.3G2, X.6ac, X.6Of, int, int):void");
    }
}
