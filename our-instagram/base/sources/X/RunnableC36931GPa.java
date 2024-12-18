package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.GPa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36931GPa implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public RunnableC36931GPa(Bundle bundle, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35277FhC c35277FhC = C35277FhC.A1m;
        if (c35277FhC == null) {
            c35277FhC = new C35277FhC();
            C35277FhC.A1m = c35277FhC;
        }
        c35277FhC.A0K(this.A00, this.A02, this.A01);
    }
}
