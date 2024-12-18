package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.GCh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36609GCh implements GYB {
    public final Activity A00;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        this.A00.moveTaskToBack(true);
    }

    public C36609GCh(Activity activity) {
        this.A00 = activity;
    }
}
