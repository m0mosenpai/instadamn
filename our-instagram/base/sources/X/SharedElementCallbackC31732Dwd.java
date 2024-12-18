package X;

import android.app.SharedElementCallback;
import java.util.List;

/* renamed from: X.Dwd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedElementCallbackC31732Dwd extends SharedElementCallback {
    public final /* synthetic */ EKa A00;

    public SharedElementCallbackC31732Dwd(EKa eKa) {
        this.A00 = eKa;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        EKa.A03(this.A00);
    }
}
