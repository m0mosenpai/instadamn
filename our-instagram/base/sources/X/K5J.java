package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class K5J extends AbstractC44444JlB {
    public WeakReference A00;

    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof MO2) {
            this.A00 = AbstractC25225BEi.A16(context);
        }
    }

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        if (str2 != null) {
            A0b.putString("challenge_id", str2);
        }
        if (str3 != null) {
            A0b.putString("challenge_use_case", str3);
        }
        if (str4 != null) {
            A0b.putString("av_session_id", str4);
        }
        if (str5 != null) {
            A0b.putString("flow_id", str5);
        }
        if (str6 != null) {
            A0b.putString("product_surface", str6);
        }
        setArguments(A0b);
    }
}
