package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public abstract class S44 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Context context = C6BQ.A09(c6fq).A00;
        if (AbstractC23451Ch.A07(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            C14360o3.A0A(c6fw);
            AbstractC63326Sha.A01(context, c6fq, c6fw);
            return null;
        }
        FragmentActivity activity = C6BQ.A01(c6fq).getActivity();
        if (activity == null) {
            C14360o3.A0A(c6fw);
            AbstractC63326Sha.A04(c6fq, c6fw, AbstractC166987dD.A1E());
            return null;
        }
        AbstractC43592JPx.A1C(activity, new C64483TFt(0, activity, context, c6fw, c6fq), AbstractC63088ScB.A00(context));
        return null;
    }
}
