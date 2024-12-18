package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class K5L extends AbstractC44444JlB {
    public WeakReference A00 = AbstractC25225BEi.A16(null);

    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof InterfaceC50383MMl) {
            this.A00 = AbstractC25225BEi.A16(context);
        }
    }
}
