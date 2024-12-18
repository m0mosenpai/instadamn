package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.FoA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35619FoA implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ViewOnClickListenerC35619FoA(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A05 = str;
        this.A03 = obj2;
        this.A04 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A01;
                Fragment fragment = (Fragment) this.A03;
                String str2 = this.A05;
                Dialog dialog = (Dialog) this.A04;
                C35793FrV.A02(fragment, userSession, C05F.A01, str2);
                if (fragment instanceof DialogInterface.OnCancelListener) {
                    ((DialogInterface.OnCancelListener) fragment).onCancel(dialog);
                }
                C35793FrV.A03(userSession, str2, "connect_existing_page", "connect_existing_page_button");
                dialog.dismiss();
                return;
            case 1:
                int A05 = C0f9.A05(1198106611);
                String str3 = this.A05;
                if (str3 != null) {
                    C36422G4x c36422G4x = (C36422G4x) this.A04;
                    C28484Chc c28484Chc = (C28484Chc) this.A03;
                    User user = (User) this.A01;
                    C7W9 c7w9 = (C7W9) this.A02;
                    UserSession userSession2 = c36422G4x.A02;
                    AbstractC25228BEl.A1G(c36422G4x.A00, AbstractC31364DqT.A02().A01(userSession2, AbstractC31402Dr6.A03(userSession2, str3, "direct_thread_ugc_ai", c36422G4x.A01.getModuleName())), userSession2, ModalActivity.class, "profile");
                    if (user != null) {
                        str = user.A03.Aae();
                    } else {
                        str = null;
                    }
                    C25531Mh A00 = C28484Chc.A00(c28484Chc);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_creator_button_clicked", str));
                        A00.Cht();
                    }
                    C7W9.A00(c7w9, new C50157MDk(c7w9, 17));
                }
                C0f9.A0C(299315828, A05);
                return;
            default:
                UserSession userSession3 = (UserSession) this.A01;
                User user2 = (User) this.A02;
                String str4 = this.A05;
                Fragment fragment2 = (Fragment) this.A03;
                C36881nl A01 = C36881nl.A01((Activity) this.A04, (InterfaceC11380iw) fragment2, userSession3, str4);
                A01.A0B = new C122145g6(AbstractC31175DnJ.A0g(user2));
                A01.A0n = true;
                A01.A01 = fragment2;
                A01.A06();
                return;
        }
    }
}
