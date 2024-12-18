package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.CKi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27715CKi {
    public static final void A00(Activity activity, Nj6 nj6, UserSession userSession, C38321qM c38321qM) {
        AbstractC167027dH.A13(userSession, c38321qM, nj6);
        if (C18U.A06(C06090Tz.A05, userSession, 36328989463166893L)) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString(MSV.A00(932), c38321qM.getId());
            A0b.putSerializable(MSV.A00(933), nj6);
            C6XJ.A03(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(3816)).A0C(activity);
        }
    }
}
