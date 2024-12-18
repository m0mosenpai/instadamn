package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.EVp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32565EVp extends AbstractC61132qb {
    public final Activity A00;

    public C32565EVp(Activity activity) {
        C14360o3.A0B(activity, 1);
        this.A00 = activity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        C14360o3.A07(application);
        return new C31788Dy7(application);
    }
}
