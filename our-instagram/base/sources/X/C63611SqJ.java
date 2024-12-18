package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;

/* renamed from: X.SqJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63611SqJ implements C07W {
    public final WeakReference A00;

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((C58772Q8e) weakReference.get()).A04 = null;
        }
    }

    public C63611SqJ(C58772Q8e c58772Q8e) {
        this.A00 = AbstractC25225BEi.A16(c58772Q8e);
    }
}
