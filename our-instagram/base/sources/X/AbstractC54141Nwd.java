package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;

/* renamed from: X.Nwd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54141Nwd {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G4 c3g4, C3G4 c3g42, InterfaceC144586fe interfaceC144586fe, InterfaceC57981PnR interfaceC57981PnR, C51333Mlu c51333Mlu, int i) {
        boolean A1b = AbstractC25233BEq.A1b(interfaceC144586fe, userSession, c51333Mlu);
        AbstractC167017dG.A1U(interfaceC11380iw, interfaceC57981PnR);
        c51333Mlu.itemView.setClipToOutline(A1b);
        c51333Mlu.A00.setVisibility(0);
        InterfaceC09390do interfaceC09390do = c51333Mlu.A01;
        AbstractC43593JPy.A1W(interfaceC09390do, 0);
        ((RecyclerReelAvatarView) interfaceC09390do.getValue()).A00(interfaceC11380iw, userSession, c3g4, c3g42, null, i, false, false, false, false);
        InterfaceC09390do interfaceC09390do2 = c51333Mlu.A04;
        TextView A0D = MSW.A0D(interfaceC09390do2);
        interfaceC09390do2.getValue();
        A0D.setText(AbstractC73983Tk.A00(userSession, c3g4));
        C41181vS A09 = c3g4.A03.A09(userSession);
        if (A09 != null) {
            InterfaceC09390do interfaceC09390do3 = c51333Mlu.A03;
            MSW.A0D(interfaceC09390do3).setText(C23831Eq.A09(AbstractC25228BEl.A0M(AbstractC166987dD.A0d(interfaceC09390do3)), A09.A03() + AbstractC166987dD.A0L(AbstractC73343Qk.A00)));
            ImageUrl A06 = A09.A06();
            if (A06 != null) {
                ((IgImageView) AbstractC166987dD.A17(c51333Mlu.A02)).setUrl(A06, interfaceC11380iw);
            }
            interfaceC57981PnR.E0Q(AbstractC31171DnF.A06(c51333Mlu), c3g4);
            InterfaceC09390do interfaceC09390do4 = c51333Mlu.A02;
            View A0L = AbstractC167007dF.A0L(interfaceC09390do4);
            String A0p = AbstractC166997dE.A0p(AbstractC167007dF.A0L(interfaceC09390do4).getContext(), 2131972612);
            C14360o3.A0B(A0L, 2);
            A0L.setOnTouchListener(new ViewOnTouchListenerC55489Oki(A0L, userSession, interfaceC144586fe, A0p));
        }
    }
}
