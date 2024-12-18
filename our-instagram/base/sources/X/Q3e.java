package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes10.dex */
public final class Q3e extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        C14360o3.A0B(obj, 1);
        this.A00.A02.remove(obj);
    }

    public Q3e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}
