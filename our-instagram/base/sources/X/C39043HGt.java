package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.HGt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39043HGt extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final boolean A0N(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        AbstractC167007dF.A1D(c102884kP, 0, c102884kP2);
        if (AbstractC13670mt.A0G(c102884kP.A0F(), c102884kP2.A0F()) || c102884kP.A0U(false) != c102884kP2.A0U(false) || AbstractC13670mt.A0G(c102884kP.A0H(), c102884kP2.A0H()) || c102884kP.A02(45, 0.0f) != c102884kP2.A02(45, 0.0f) || c102884kP.A02(44, 0.0f) != c102884kP2.A02(44, 0.0f)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new SimpleVideoLayout(context, null, 0);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) view;
        C14360o3.A0B(simpleVideoLayout, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C39443HbV c39443HbV = (C39443HbV) A06;
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        c39443HbV.A00 = C4QS.A00(simpleVideoLayout.getContext(), userSession, null, c39443HbV, "bloks_video_component_binder");
        boolean z = false;
        boolean A0U = c102884kP.A0U(false);
        Integer num = C05F.A00;
        String str = "";
        String A0F = c102884kP.A0F();
        if (A0F != null) {
            str = A0F;
        }
        String A0H = c102884kP.A0H();
        Integer valueOf = Integer.valueOf(A0U ? 1 : 0);
        String A0H2 = c102884kP.A0H();
        if (A0H2 == null || A0H2.length() == 0) {
            z = true;
        }
        C75363a3 c75363a3 = new C75363a3(null, null, null, null, null, num, valueOf, str, null, null, A0H, null, null, null, null, null, null, null, null, -1, -1, -1L, false, false, false, false, false, false, !z, false);
        C4AD c4ad = new C4AD(c75363a3, "bloks_video_component_binder");
        simpleVideoLayout.setTag(c4ad);
        c4ad.A03 = AbstractC25225BEi.A16(new J21(c39443HbV, c102884kP, simpleVideoLayout, c75363a3, c4ad));
        C4AG.A00(userSession).A01(c4ad);
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        AbstractC167027dH.A12(view, c6fg, c102884kP);
        view.setTag(null);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C4QW c4qw = ((C39443HbV) A06).A00;
        if (c4qw != null) {
            c4qw.EE4("view_unbound");
        }
    }

    public C39043HGt(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
