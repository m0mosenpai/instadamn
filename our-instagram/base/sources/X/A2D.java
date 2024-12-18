package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public abstract class A2D {
    public static final void A00(Activity activity, C22P c22p, UserSession userSession, C217859kI c217859kI) {
        AbstractC167017dG.A1P(userSession, c217859kI);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(965), c217859kI.A00());
        A0b.putSerializable(AbstractC43591JPw.A00(27), c22p);
        C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5169)).A0C(activity);
    }
}
