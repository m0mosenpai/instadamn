package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9Y implements InterfaceC65531Tm1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC65531Tm1
    public final void D6d(boolean z, String str) {
        String str2 = str;
        switch (this.A00) {
            case 0:
                if (!z) {
                    boolean A0K = C14360o3.A0K(str, "The save prompt is disabled for the current app. To restore, remove this app from the \"Never save\" list in the Smart Lock for Passwords settings for all accounts on this device.");
                    C32972Efd c32972Efd = (C32972Efd) this.A03;
                    if (A0K) {
                        C07270a1 c07270a1 = c32972Efd.A01;
                        C14360o3.A0B(c07270a1, 0);
                        C83753oK.A01(c07270a1, "login_smartlock_save_impression_not_allowed", "login_smart_lock", "smartlock", null);
                    } else {
                        C07270a1 c07270a12 = c32972Efd.A01;
                        C14360o3.A0B(c07270a12, 0);
                        Integer num = C05F.A01;
                        if (str == null) {
                            str2 = "Unknown failure, failure_reason null";
                        }
                        C83753oK.A00(c07270a12, num, "login_smartlock_save_failed", "login_smart_lock", "smartlock", null, str2, null);
                    }
                }
                ((C32972Efd) this.A03).A05((UserSession) this.A02, (User) this.A01);
                return;
            case 1:
                ELC elc = ((Efi) this.A01).A05;
                User user = (User) this.A02;
                DialogInterfaceOnDismissListenerC35460FkH dialogInterfaceOnDismissListenerC35460FkH = new DialogInterfaceOnDismissListenerC35460FkH(0, this.A03, this, user);
                FragmentActivity activity = elc.getActivity();
                if (activity == null) {
                    return;
                }
                C0fJ.A00(FBH.A00(activity, dialogInterfaceOnDismissListenerC35460FkH, elc, elc.A05, C05F.A1F, user.getUsername(), user.getId()));
                return;
            default:
                C32975Efg.A01((UserSession) this.A03, (C32975Efg) this.A01, (User) this.A02);
                return;
        }
    }

    public G9Y(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65531Tm1
    public final void DgW(InterfaceC37130GXr interfaceC37130GXr) {
        InterfaceC65457TkT g9u;
        switch (this.A00) {
            case 0:
                g9u = new G9U(0, this.A03, this.A02, this.A01);
                break;
            case 1:
                g9u = new G9U(1, this.A02, this.A03, this);
                break;
            default:
                g9u = new G9T(this, 2);
                break;
        }
        interfaceC37130GXr.EKA(g9u);
    }
}
