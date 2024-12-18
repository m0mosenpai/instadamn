package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FLI {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AbstractC33235ElU A02;

    public FLI(UserSession userSession, AbstractC33235ElU abstractC33235ElU) {
        this.A02 = abstractC33235ElU;
        this.A01 = userSession;
        this.A00 = abstractC33235ElU.requireActivity();
    }
}
