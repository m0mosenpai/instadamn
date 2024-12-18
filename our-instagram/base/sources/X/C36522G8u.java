package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.G8u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36522G8u implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C36522G8u(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A03;
                String str = this.A04;
                UserSession userSession = (UserSession) this.A02;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity == null || userSession == null) {
                    return;
                }
                C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, "poke");
                ImageUrl imageUrl = PendingRecipient.A0g;
                A01.A0B = new C122145g6(AbstractC166987dD.A1J(new PendingRecipient(AbstractC25225BEi.A0t(""), str, "")));
                A01.A06();
                return;
            case 1:
                ((C14510oO) this.A02).A00 = true;
                UserSession userSession2 = (UserSession) this.A03;
                FVL.A00(C35816Frs.A00, new C31463Ds7(userSession2, 8), userSession2, C16930sl.A00, true);
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                String str2 = this.A04;
                InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
                AbstractC31180DnO.A1G(EnumC33496ErV.SYSTEM_UNDO_TOAST, A00);
                AbstractC31171DnF.A1D(A00, c35121FeO.A01);
                if (str2 != null) {
                    A00.AAP("target_user_id", str2);
                }
                A00.Cht();
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (1 - this.A00 == 0) {
            C14510oO c14510oO = (C14510oO) this.A02;
            if (c14510oO.A00) {
                c14510oO.A00 = false;
                return;
            }
            C35121FeO c35121FeO = (C35121FeO) this.A01;
            String str = this.A04;
            InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
            AbstractC31180DnO.A1H(EnumC33496ErV.SYSTEM_UNDO_TOAST, A00);
            AbstractC31171DnF.A1D(A00, c35121FeO.A01);
            if (str != null) {
                A00.AAP("target_user_id", str);
            }
            A00.Cht();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (1 - this.A00 == 0) {
            C35121FeO c35121FeO = (C35121FeO) this.A01;
            String str = this.A04;
            InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
            AbstractC31178DnM.A12(EnumC33496ErV.SYSTEM_UNDO_TOAST, A00);
            AbstractC31171DnF.A1D(A00, c35121FeO.A01);
            if (str != null) {
                A00.AAP("target_user_id", str);
            }
            A00.Cht();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
