package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GGL implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167027dH.A12(context, userSession, fragmentActivity);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("entrypoint", "search");
        AbstractC31176DnK.A0d(fragmentActivity, A0b, userSession, ModalActivity.class, "quiet_mode_settings").A0C(context);
    }
}
