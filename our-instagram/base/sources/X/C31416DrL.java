package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.DrL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31416DrL extends C03E implements InterfaceC16590sC {
    public C31416DrL(Object obj) {
        super(5, obj, C31411DrG.class, "openLikesList", "openLikesList(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Lcom/instagram/feed/media/Media;ILandroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        C38321qM c38321qM = (C38321qM) obj3;
        int A0H = AbstractC166987dD.A0H(obj4);
        View view = (View) obj5;
        boolean A1b = AbstractC25233BEq.A1b(c120985dq, c37644Ghd, c38321qM);
        C31411DrG c31411DrG = (C31411DrG) this.receiver;
        Boolean valueOf = Boolean.valueOf(A1b);
        C09530e4 A1L = AbstractC166987dD.A1L(AbstractC111324zv.A00(85), valueOf);
        C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(162), valueOf);
        C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC111324zv.A00(706), false);
        C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(705), false);
        C09530e4 A1L5 = AbstractC166987dD.A1L("LikesListFragment.MEDIA_ID", c38321qM.getId());
        UserSession userSession = c31411DrG.A00;
        Bundle A00 = AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token));
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            int i = c75113Zb.A03;
            if (Integer.valueOf(i) != null) {
                A00.putInt(AbstractC111324zv.A00(86), i);
            }
        }
        if (c120985dq.CdW()) {
            AbstractC151266rU.A02(A00, userSession, c120985dq.A06());
        }
        Fragment CsT = c31411DrG.A01.A00.CsT(A00, userSession);
        String A0p = AbstractC166997dE.A0p(AbstractC25225BEi.A0F(userSession), A0H);
        IN9 in9 = c31411DrG.A02;
        in9.A00(view, CsT, A0p, false);
        if ((CsT instanceof ENZ) && BO2.A01(userSession, c38321qM)) {
            C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
            c189458aP.A02 = R.drawable.instagram_info_outline_16;
            c189458aP.A01(AbstractC166997dE.A0p(AbstractC25225BEi.A0F(userSession), 2131969690));
            c189458aP.A0A = A1b;
            c189458aP.A05 = new ViewOnClickListenerC35585Fnc(c38321qM, c31411DrG, A0p, 9);
            C189468aQ A002 = c189458aP.A00();
            C189478aR c189478aR = in9.A03;
            if (c189478aR != null) {
                c189478aR.A0K(A002, A1b);
            }
        }
        return C0eB.A00;
    }
}
