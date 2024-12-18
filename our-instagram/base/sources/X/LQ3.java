package X;

import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.polls.PollMessageOptionView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class LQ3 implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public LQ3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        LYZ lyz;
        C38321qM c38321qM;
        String str;
        Editable text;
        switch (this.A00) {
            case 0:
                if (!z || (c38321qM = (lyz = (LYZ) this.A01).A03) == null) {
                    return;
                }
                C57382kD c57382kD = lyz.A0I;
                if (!c57382kD.A00() || !c57382kD.A03(c38321qM, false)) {
                    return;
                }
                L8I l8i = lyz.A02;
                if (l8i == null) {
                    str = "viewHolder";
                    break;
                } else {
                    l8i.A0D.postDelayed(new M35(lyz, c38321qM), 500L);
                    return;
                }
            case 1:
                C45499KCo c45499KCo = (C45499KCo) this.A01;
                MSU msu = c45499KCo.A0C;
                if (msu == null || !((C49639LwW) msu).A02.equals("stickers") || !z || !c45499KCo.A0J) {
                    return;
                }
                UserSession userSession = c45499KCo.A05;
                C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
                if (C18U.A06(A0j, userSession, 36317706585773551L)) {
                    return;
                }
                UserSession userSession2 = c45499KCo.A05;
                C14360o3.A0B(userSession2, 0);
                if (!C18U.A06(A0j, userSession2, 36317706584331754L)) {
                    return;
                }
                IgdsInlineSearchBox igdsInlineSearchBox = c45499KCo.A0A;
                igdsInlineSearchBox.getClass();
                igdsInlineSearchBox.setHints(c45499KCo.A09.A00(true));
                return;
            case 2:
            case 6:
            default:
                if (z) {
                    AbstractC166987dD.A1Y(this.A01);
                    return;
                }
                return;
            case 3:
                C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.base.IgEditText");
                TextView textView = (TextView) view;
                boolean z2 = true;
                PollMessageOptionView pollMessageOptionView = (PollMessageOptionView) this.A01;
                if (!z) {
                    InterfaceC50478MQg interfaceC50478MQg = pollMessageOptionView.A01;
                    if (interfaceC50478MQg != null) {
                        if (textView.length() != 0) {
                            z2 = false;
                        }
                        interfaceC50478MQg.DHh(pollMessageOptionView, z2);
                    }
                    PollMessageOptionView.A00(pollMessageOptionView, false);
                    return;
                }
                IgEditText igEditText = pollMessageOptionView.A00;
                if (igEditText == null) {
                    str = "editText";
                    break;
                } else {
                    if (igEditText.length() == 0) {
                        z2 = false;
                    }
                    PollMessageOptionView.A00(pollMessageOptionView, z2);
                    AbstractC13880nE.A0R(textView);
                    return;
                }
            case 4:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                boolean A0U = DirectVisualMessageViewerController.A0U(directVisualMessageViewerController);
                if (z) {
                    if (A0U) {
                        DirectVisualMessageViewerController.A0B(directVisualMessageViewerController);
                    } else {
                        C150956qv.A09(new View[]{directVisualMessageViewerController.backgroundDimmer}, true);
                    }
                    directVisualMessageViewerController.A0W("tapped");
                    return;
                }
                if (A0U) {
                    DirectVisualMessageViewerController.A0C(directVisualMessageViewerController);
                } else {
                    C150956qv.A08(new View[]{directVisualMessageViewerController.backgroundDimmer}, true);
                }
                directVisualMessageViewerController.A0X("resume");
                return;
            case 5:
                if (!z) {
                    return;
                }
                C14360o3.A0A(view);
                AbstractC13880nE.A0R(view);
                AbstractC43592JPx.A1J(((C44723Jr6) this.A01).A00);
                return;
            case 7:
                if (!z) {
                    return;
                }
                C45511KDa c45511KDa = (C45511KDa) this.A01;
                boolean z3 = false;
                IgTextView igTextView = c45511KDa.A03;
                if (igTextView != null) {
                    igTextView.getHeight();
                }
                AbstractC167017dG.A03(c45511KDa.requireContext());
                IgLinearLayout igLinearLayout = c45511KDa.A02;
                if (igLinearLayout != null) {
                    igLinearLayout.setPadding(0, 0, 0, 0);
                }
                L9S l9s = c45511KDa.A06;
                if (l9s == null) {
                    str = "recsFromFriendsLogger";
                    break;
                } else {
                    String str2 = c45511KDa.A0C;
                    if (str2 == null) {
                        str = "targetUserId";
                        break;
                    } else {
                        Long A0j2 = AbstractC166997dE.A0j(str2);
                        String A00 = C45511KDa.A00(c45511KDa.A0K);
                        IgEditText igEditText2 = c45511KDa.A01;
                        if (igEditText2 == null || (text = igEditText2.getText()) == null || text.length() == 0) {
                            z3 = true;
                        }
                        l9s.A02(A0j2, "search", A00, !z3);
                        if (c45511KDa.A0H) {
                            return;
                        }
                        AbstractC70663Fe abstractC70663Fe = c45511KDa.getRecyclerView().A0D;
                        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        c45511KDa.A0B = Integer.valueOf(((LinearLayoutManager) abstractC70663Fe).A1d());
                        return;
                    }
                }
                break;
            case 8:
                ELQ elq = (ELQ) this.A01;
                if (!z) {
                    return;
                }
                C448124l c448124l = AnonymousClass229.A01(elq.A01).A09;
                C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                if (!AbstractC25226BEj.A1Z(A08)) {
                    return;
                }
                A08.A0s("IG_CAMERA_BLACKLIST_TAP_SEARCH");
                A08.A0q("BLACKLIST_TAP_SEARCH");
                C448124l.A00(A08, c448124l);
                A08.A0W(2);
                AbstractC167007dF.A13(A08);
                C22M c22m = c448124l.A04;
                int i = 2;
                if (c22m.A01 != 2) {
                    i = 1;
                }
                A08.A0V(i);
                A08.A0Q(MSV.A00(45), AbstractC167007dF.A0d());
                A08.A0M(c448124l.A0I(), "capture_type");
                A08.A0b(c22m.A09);
                A08.A0c(c22m.A0A);
                A08.A0U();
                AbstractC167017dG.A1D(A08);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
