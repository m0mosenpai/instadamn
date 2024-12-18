package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class II4 {
    public WeakReference A00;
    public final Context A01;
    public final Fragment A02;
    public final UserSession A03;

    public II4(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = fragment;
        this.A01 = fragment.getContext();
        this.A03 = userSession;
    }
}
