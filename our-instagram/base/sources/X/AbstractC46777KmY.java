package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KmY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46777KmY {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        KDK kdk = new KDK();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("arg_prompt_id", str);
        A0b.putString("arg_note_id", str2);
        kdk.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1R = true;
        A0y.A1K = false;
        A0y.A0U = kdk.A0M;
        AbstractC31173DnH.A0w(fragmentActivity, kdk, A0y);
    }
}
