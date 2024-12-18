package X;

import android.app.Application;

/* renamed from: X.8hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C193578hc extends AbstractC52922bZ {
    public final Application A00;

    public C193578hc(Application application) {
        C14360o3.A0B(application, 1);
        this.A00 = application;
    }

    public final Application A0D() {
        Application application = this.A00;
        C14360o3.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
