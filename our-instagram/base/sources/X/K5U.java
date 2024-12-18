package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class K5U extends AbstractC60562R7d {
    public WeakReference A00;

    @Override // X.AbstractC60562R7d, X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof MPV) {
            this.A00 = AbstractC25225BEi.A16(context);
        }
    }

    public final boolean A00() {
        if (!(this instanceof K5T)) {
            K5S k5s = (K5S) this;
            if (k5s.A0Y) {
                C44427JkQ c44427JkQ = k5s.A0T;
                if (c44427JkQ != null) {
                    c44427JkQ.A00();
                    k5s.A0T = null;
                }
                k5s.A0Y = false;
                return true;
            }
            return false;
        }
        return false;
    }
}
