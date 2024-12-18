package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.G8v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36523G8v implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    public C36523G8v(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C84433pm c84433pm;
        switch (this.A00) {
            case 0:
                C31340Dq5 c31340Dq5 = (C31340Dq5) this.A04;
                UserSession userSession = c31340Dq5.A03;
                InterfaceC11380iw interfaceC11380iw = c31340Dq5.A02;
                C162337Ov.A0S(interfaceC11380iw, userSession, "send_toast_view_button_click", AbstractC31171DnF.A0g(this.A03), ((C84923qg) this.A01).A0G, null);
                C36881nl A01 = C36881nl.A01(c31340Dq5.A00, interfaceC11380iw, userSession, "private_reply_message");
                A01.A0B(AbstractC166987dD.A1J(this.A02));
                A01.A06();
                return;
            case 1:
                C41759Iea.A03((JI9) this.A02, (InterfaceC106354qp) this.A03, (C38621GyO) this.A01);
                return;
            case 2:
                Fragment fragment = (Fragment) this.A02;
                FragmentActivity activity = fragment.getActivity();
                if (fragment.isAdded() && activity != null) {
                    C18920wW c18920wW = (C18920wW) this.A03;
                    User user = (User) this.A01;
                    C75R.A0F(c18920wW, "click", "block_toast_upsell_learn_more_button", user.getId());
                    UserSession userSession2 = (UserSession) this.A04;
                    C32345EMr A00 = C35188Ffg.A00(userSession2, user, EnumC33371Ep4.A0B, new GJH(fragment, 2), null, false);
                    if (A00 == null) {
                        return;
                    }
                    AbstractC31178DnM.A0l(activity, A00, userSession2, null);
                    return;
                }
                C0w9.A03("restrict_error", "Restrict button was clicked before fragment attached to activity");
                return;
            default:
                C38321qM c38321qM = (C38321qM) this.A02;
                C37675GiC c37675GiC = (C37675GiC) this.A04;
                InterfaceC84443pn AoG = c38321qM.A0C.AoG();
                if (AoG != null) {
                    CUQ AKL = AoG.AKL();
                    AKL.A03 = c37675GiC.A06.getString(2131966904);
                    c84433pm = AKL.A00();
                } else {
                    c84433pm = null;
                }
                c38321qM.A0C.ERY(c84433pm);
                C37675GiC.A08((MediaControlEventSourceEnum) this.A01, c38321qM, (C75113Zb) this.A03, c37675GiC);
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (2 - this.A00 == 0) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x((UserSession) this.A04);
            AbstractC167007dF.A18(A0x, "restrict_block_upsell_snackbar_shown_count", AbstractC31172DnG.A01(A0x, "restrict_block_upsell_snackbar_shown_count") + 1);
            C75R.A0F((C18920wW) this.A03, "impression", "block_toast_upsell", AbstractC31171DnF.A0g(this.A01));
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
