package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AT6 implements View.OnLongClickListener {
    public final /* synthetic */ C3BA A00;

    public AT6(C3BA c3ba) {
        this.A00 = c3ba;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C3BA c3ba = this.A00;
        C60662pp A00 = C3BA.A00(c3ba);
        if (A00 != null && !EndToEnd.A05()) {
            UserSession userSession = c3ba.A01;
            if (C2TN.A00(userSession)) {
                Context context = A00.getContext();
                if (context != null) {
                    FragmentActivity activity = A00.getActivity();
                    if (activity != null) {
                        AbstractC23111AHa.A00(activity, context, userSession);
                        return true;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return false;
        }
        return false;
    }
}
