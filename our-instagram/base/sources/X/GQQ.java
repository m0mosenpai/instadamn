package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQQ implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C31197Dng A01;
    public final /* synthetic */ BaseFragmentActivity A02;
    public final /* synthetic */ UserSession A03;

    public GQQ(Bundle bundle, C31197Dng c31197Dng, BaseFragmentActivity baseFragmentActivity, UserSession userSession) {
        this.A01 = c31197Dng;
        this.A02 = baseFragmentActivity;
        this.A03 = userSession;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35277FhC.A0J(this.A02, this.A00, this.A03, false);
    }
}
