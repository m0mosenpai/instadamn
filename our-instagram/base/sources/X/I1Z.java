package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I1Z {
    public static final void A00(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        int i;
        int i2;
        boolean A5g = c38321qM.A5g();
        InterfaceC84163p3 BPh = c38321qM.A0C.BPh();
        if (BPh != null && BPh.getHasBeenMashedUp()) {
            i = 2131976693;
            i2 = 2131972153;
        } else {
            i = 2131964184;
            i2 = 2131964183;
            if (A5g) {
                i = 2131976693;
                i2 = 2131976692;
            }
        }
        C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
        A0O.A0A(i);
        A0O.A09(i2);
        A0O.A0G(new Og5(1, onDismissListener, userSession, c38321qM, fragment));
        AbstractC31176DnK.A14(new DialogInterfaceOnClickListenerC41789If5(1), A0O);
    }
}
