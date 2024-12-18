package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;

/* renamed from: X.Ggq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37595Ggq implements InterfaceC31028DkR {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final ClipsViewerSource A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC1119153d A05;
    public final InterfaceC43589JPu A06;
    public final ILW A07;
    public final C37716Gir A08;
    public final IG5 A09;
    public final C37560GgG A0A;
    public final String A0B;
    public final C37594Ggp A0C;

    @Override // X.InterfaceC31028DkR
    public final void Cx4(C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb, String str, float f, float f2, int i, boolean z, boolean z2) {
        BQL bql;
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        C14360o3.A0B(c120985dq, 0);
        this.A0C.A00(c120985dq, c37644Ghd, null, c2Fb, null, null, null, null, f, f2, z, z2, false);
        AbstractC59962oe abstractC59962oe = this.A01;
        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K = ((C59952od) abstractC59962oe).A0K();
        if (A0K != null) {
            UserSession userSession = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            Long l2 = null;
            new C37616GhB(userSession, interfaceC60442pS).A04(A0K, EnumC71343Hv.A05, null, c120985dq, null, false, false);
            AbstractC37301Gc2.A07(userSession).A07(A0K, EnumC71343Hv.A06, new String[0], 0);
            if (c2Fb == C2Fb.A13) {
                bql = BQL.A07;
            } else {
                bql = BQL.A05;
            }
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                InterfaceC43589JPu interfaceC43589JPu = this.A06;
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
                if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                    l = AbstractC166997dE.A0j(attributionAppId);
                } else {
                    l = null;
                }
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    l2 = AbstractC25231BEo.A0k(A2E);
                }
                AbstractC37670Gi3.A08(EnumC120795dP.A02, bql, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), i, j);
            }
        }
    }

    @Override // X.InterfaceC31028DkR
    public final void Cx5(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        throw C00O.createAndThrow();
    }

    public static final void A00(C120985dq c120985dq, C37595Ggq c37595Ggq, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC59962oe abstractC59962oe = c37595Ggq.A01;
        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K = ((C59952od) abstractC59962oe).A0K();
        if (A0K != null) {
            UserSession userSession = c37595Ggq.A03;
            InterfaceC60442pS interfaceC60442pS = c37595Ggq.A04;
            Long l2 = null;
            new C37616GhB(userSession, interfaceC60442pS).A04(A0K, EnumC71343Hv.A05, null, c120985dq, null, false, false);
            AbstractC37301Gc2.A07(userSession).A07(A0K, EnumC71343Hv.A06, new String[0], 0);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                InterfaceC43589JPu interfaceC43589JPu = c37595Ggq.A06;
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
                if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                    l = AbstractC166997dE.A0j(attributionAppId);
                } else {
                    l = null;
                }
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    l2 = AbstractC25231BEo.A0k(A2E);
                }
                AbstractC37670Gi3.A08(EnumC120795dP.A02, BQL.A0L, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), i, j);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.IE2] */
    public final void A01(C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, int i, boolean z) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A03;
        long j = i;
        boolean z2 = !this.A0A.A0c(c120985dq);
        String CGJ = this.A06.CGJ();
        String str = this.A09.A00;
        String str2 = this.A0B;
        ClipsViewerSource clipsViewerSource = this.A02;
        ViewOnClickListenerC42028Ijx viewOnClickListenerC42028Ijx = new ViewOnClickListenerC42028Ijx(i, 9, c120985dq, this);
        InterfaceC1119153d interfaceC1119153d = this.A05;
        C43071J2l c43071J2l = new C43071J2l(c120985dq, c37644Ghd, c38321qM, this, i);
        AbstractC167007dF.A1I(CGJ, 5, clipsViewerSource);
        C14360o3.A0B(interfaceC1119153d, 10);
        ?? obj = new Object();
        C28493Chl c28493Chl = C28493Chl.A00;
        String id = c38321qM.getId();
        if (id != null) {
            RecipeSheetParams recipeSheetParams = new RecipeSheetParams(id, CGJ, str, str2, clipsViewerSource.ordinal(), 0, j, z2, false);
            C26868BtV c26868BtV = new C26868BtV();
            Bundle A05 = AbstractC31178DnM.A05(userSession);
            A05.putParcelable("arg_extra_params", recipeSheetParams);
            c26868BtV.setArguments(A05);
            c26868BtV.A03 = c43071J2l;
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0d = fragmentActivity.getText(2131971565);
            A0y.A06 = fragmentActivity.getColor(AbstractC53242c7.A0D(fragmentActivity));
            A0y.A1G = !c38321qM.CdW();
            A0y.A03 = c28493Chl.A06(fragmentActivity, userSession, c38321qM, false);
            A0y.A0y = true;
            A0y.A0x = false;
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A0T = c26868BtV;
            A0y.A0U = interfaceC1119153d;
            if (z) {
                C13400mQ c13400mQ = new C13400mQ(AbstractC167007dF.A0J(), new Wi1(3, viewOnClickListenerC42028Ijx, obj), 300L);
                C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                c189458aP.A02 = R.drawable.instagram_camera_outline_44;
                c189458aP.A05 = new ViewOnClickListenerC37847Gl1(c13400mQ, 19);
                A0y.A07(c189458aP.A00());
            }
            C189478aR A02 = A0y.A00().A02(fragmentActivity, c26868BtV);
            c26868BtV.A02 = A02;
            obj.A00 = A02;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C37595Ggq(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, ClipsViewerSource clipsViewerSource, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, ILW ilw, C37594Ggp c37594Ggp, C37716Gir c37716Gir, IG5 ig5, C37560GgG c37560GgG, String str) {
        AbstractC167017dG.A1R(interfaceC60442pS, userSession);
        C14360o3.A0B(c37560GgG, 6);
        AbstractC25233BEq.A0y(7, c37716Gir, interfaceC43589JPu, ig5);
        C14360o3.A0B(ilw, 11);
        this.A00 = fragmentActivity;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A0B = str;
        this.A0A = c37560GgG;
        this.A08 = c37716Gir;
        this.A06 = interfaceC43589JPu;
        this.A09 = ig5;
        this.A0C = c37594Ggp;
        this.A07 = ilw;
        this.A02 = clipsViewerSource;
        this.A05 = new C43010J0a(this, 4);
    }
}
