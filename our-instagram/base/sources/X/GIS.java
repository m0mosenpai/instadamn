package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIS implements GZU {
    public Reel A00;
    public EnumC33369Ep2 A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C1GL A05;
    public final C34709FQu A06;
    public final InterfaceC37189Ga0 A07;
    public final InterfaceC09390do A08;

    public GIS(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, C34709FQu c34709FQu, InterfaceC37189Ga0 interfaceC37189Ga0) {
        C14360o3.A0B(userSession, 2);
        this.A02 = fragment;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = c1gl;
        this.A06 = c34709FQu;
        this.A07 = interfaceC37189Ga0;
        this.A08 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7R(this, 26));
    }

    public final void A01(C38266GsB c38266GsB) {
        C14360o3.A0B(c38266GsB, 0);
        Fragment fragment = this.A02;
        if (fragment.getContext() != null) {
            User user = c38266GsB.A0L;
            if (user != null) {
                this.A06.A01(user);
                boolean CQf = user.CQf();
                C28261Yl c28261Yl = C28261Yl.A00;
                Context context = fragment.getContext();
                if (context != null) {
                    c28261Yl.A00(context, null, this.A04, user, new C36761GIk(c38266GsB, this, CQf), this.A03.getModuleName(), null, user.getUsername());
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r12.A02 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.EIR, androidx.fragment.app.Fragment, X.2oe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C38266GsB r12) {
        /*
            r11 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            androidx.fragment.app.Fragment r0 = r11.A02
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto Laa
            com.instagram.user.model.User r4 = r12.A0L
            if (r4 == 0) goto Lab
            X.FQu r0 = r11.A06
            X.0wW r1 = r0.A00
            java.lang.String r0 = "reel_viewer_dashboard_overflow_click"
            X.0Ai r2 = X.AbstractC31179DnN.A08(r1, r4, r0)
            int r0 = r4.BJ8()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "entity_user_type"
            r2.AAP(r0, r1)
            r2.Cht()
            java.lang.Integer r10 = r12.A0M
            java.lang.Integer r9 = X.C05F.A0Y
            if (r10 != r9) goto L35
            X.3qg r0 = r12.A02
            r6 = 1
            if (r0 != 0) goto L36
        L35:
            r6 = 0
        L36:
            com.instagram.common.session.UserSession r5 = r11.A04
            X.6oT r8 = new X.6oT
            r8.<init>(r5)
            X.3qg r7 = r12.A02
            r2 = 0
            if (r7 == 0) goto L6f
            X.1vS r0 = r12.A0K
            if (r0 == 0) goto L6f
            X.1qM r1 = r0.A0b
            if (r1 == 0) goto L6f
            if (r10 != r9) goto L6f
            boolean r0 = r8.A00()
            if (r0 == 0) goto L6f
            X.1rF r0 = r1.A0C
            java.util.List r0 = r0.C1L()
            if (r0 == 0) goto L6f
            java.util.Map r1 = X.AbstractC50567MTy.A01(r0)
            java.lang.String r0 = r7.A0G
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L6f
            int r0 = r0.intValue()
            if (r0 <= 0) goto L6f
            r2 = 1
        L6f:
            java.lang.String r9 = r4.getId()
            X.FK3 r8 = new X.FK3
            r8.<init>(r12, r11)
            X.EIR r7 = new X.EIR
            r7.<init>()
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "ReelDashboardActionsFragment.VIEWER_USER_ID"
            r1.putString(r0, r9)
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENTS_ACTION"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENT_LIKES_ACTION"
            r1.putBoolean(r0, r2)
            r7.setArguments(r1)
            r7.A04 = r8
            r7.A01 = r12
            X.8aO r2 = X.AbstractC25225BEi.A0y(r5)
            r1 = 4
            X.GGy r0 = new X.GGy
            r0.<init>(r1, r4, r11, r12)
            r2.A0U = r0
            X.8aR r0 = r2.A00()
            r0.A03(r3, r7)
        Laa:
            return
        Lab:
            java.lang.String r0 = "Viewer User must not be null"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIS.A02(X.GsB):void");
    }

    public final void A04(User user) {
        InterfaceC02590Ai A0f;
        int i;
        C14360o3.A0B(user, 0);
        C34709FQu c34709FQu = this.A06;
        boolean A1t = user.A1t();
        C18920wW c18920wW = c34709FQu.A00;
        if (A1t) {
            A0f = AbstractC166987dD.A0f(c18920wW, "unhide_story_button_tapped");
            i = 387;
        } else {
            A0f = AbstractC166987dD.A0f(c18920wW, "hide_story_button_tapped");
            i = 168;
        }
        C25531Mh A09 = AbstractC31180DnO.A09(A0f, user, i);
        AbstractC31180DnO.A1K(A09);
        A09.A0R("entity_user_type", String.valueOf(user.BJ8()));
        A09.Cht();
        FR7 fr7 = (FR7) this.A08.getValue();
        Reel reel = this.A00;
        if (reel != null) {
            fr7.A01(this, user, "dashboard", false, reel.A0d());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
        InterfaceC02590Ai A0f;
        int i;
        C14360o3.A0B(user, 0);
        C18920wW c18920wW = this.A06.A00;
        if (z) {
            A0f = AbstractC166987dD.A0f(c18920wW, "hide_story_dialog_confirmed");
            i = 169;
        } else {
            A0f = AbstractC166987dD.A0f(c18920wW, "unhide_story_dialog_confirmed");
            i = 388;
        }
        C25531Mh A09 = AbstractC31180DnO.A09(A0f, user, i);
        AbstractC31180DnO.A1K(A09);
        A09.A0R("entity_user_type", String.valueOf(user.BJ8()));
        A09.Cht();
    }

    public static final void A00(C38266GsB c38266GsB, GIS gis) {
        User user = c38266GsB.A0L;
        if (user != null) {
            C32540EUq c32540EUq = new C32540EUq(17, user, c38266GsB, gis);
            C1GL c1gl = gis.A05;
            UserSession userSession = gis.A04;
            String id = user.getId();
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0B("media/unmark_as_spam_viewer/");
            AbstractC31176DnK.A1P(A0N, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
            AbstractC31175DnJ.A1L(A0N, c32540EUq, c1gl);
        }
    }

    public final void A03(User user) {
        AbstractC35105Fe7.A00(this.A02.requireContext(), this.A03, this.A04, AbstractC166997dE.A0j(user.getId()), "ig_reel_dashboard");
    }

    public final void A05(String str) {
        UserSession userSession = this.A04;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, str, AbstractC111324zv.A00(2965), this.A03.getModuleName());
        Fragment fragment = this.A02;
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        FragmentActivity activity = fragment.getActivity();
        if (C06P.A01(abstractC10360h2) && activity != null) {
            C31368DqX.A02(AbstractC31175DnJ.A0C(fragment, userSession), userSession, AbstractC31364DqT.A02(), A01);
        }
    }

    @Override // X.GZU
    public final void Dda() {
        this.A07.CtN();
    }
}
