package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.AKf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23121AKf {
    public static final void A01(Activity activity, HE0 he0, UserSession userSession, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1N(activity, userSession);
        C14360o3.A0B(c38321qM, 3);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        String str = he0.A04;
        c2jm.A04(AbstractC43591JPw.A00(74), str);
        PandoGraphQLRequest A00 = LTD.A00(c2jm, c2jm2, AbstractC167007dF.A1W(str));
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0A(A00);
        A01.ATV(new C48147LSw(2, activity, userSession, interfaceC16820sZ), new C42100IlA(he0, userSession, c38321qM, interfaceC16820sZ, 0), A00);
    }

    public static final void A02(Resources resources, View view, float f) {
        C3PR c3pr;
        C14360o3.A0B(view, 0);
        Drawable A00 = AbstractC56412ia.A00(resources, R.drawable.cutout_sticker_merchandising_assets_checkerboard_grid);
        if ((A00 instanceof C3PR) && (c3pr = (C3PR) A00) != null) {
            c3pr.A01(new C23701Aea(resources, view, f));
        }
    }

    public static final String A00(C5RM c5rm) {
        Drawable drawable;
        C74P c74p;
        C194808jg c194808jg;
        Drawable drawable2 = c5rm.A0A;
        if ((drawable2 instanceof C194808jg) && (c194808jg = (C194808jg) drawable2) != null) {
            drawable = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
        } else {
            drawable = null;
        }
        if (!(drawable instanceof C8OT) || (c74p = (C74P) drawable) == null) {
            return null;
        }
        return c74p.A0k;
    }

    public static final boolean A03(AbstractC12990ll abstractC12990ll) {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        int A02 = c19700xy.A01(context).A02();
        if (A02 <= 0) {
            Context context2 = AbstractC12290kX.A00;
            C14360o3.A07(context2);
            C17280tP A01 = c19700xy.A01(context2);
            A02 = (int) C18U.A01(C06090Tz.A05, abstractC12990ll, 36601509436461300L);
            A01.A0B(A02);
        }
        return AbstractC167007dF.A1Q(A02, 40);
    }
}
