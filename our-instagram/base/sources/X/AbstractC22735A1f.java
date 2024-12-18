package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.A1f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22735A1f {
    public static final void A00(Activity activity, C88Z c88z, UserSession userSession, String str, String str2, String str3) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(2241), c88z.A00);
        A0b.putString("list_id", str);
        A0b.putString(AbstractC111324zv.A00(2672), str2);
        A0b.putString("emoji", str3);
        C6XJ c6xj = new C6XJ(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(5148));
        c6xj.A07();
        c6xj.A0C(activity);
    }
}
