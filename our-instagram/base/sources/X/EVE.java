package X;

import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class EVE extends AbstractC60592pi {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC59992oh A02;

    public EVE(Fragment fragment, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh) {
        this.A02 = interfaceC59992oh;
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        ImageUrl imageUrl;
        if (i == 17 && i2 == 1797) {
            if (intent != null && (imageUrl = (ImageUrl) intent.getParcelableExtra(AbstractC111324zv.A00(4885))) != null) {
                boolean z = true;
                if (!intent.getBooleanExtra("is_ab_test", false)) {
                    z = false;
                }
                new Handler().postDelayed(new GQ4(this.A00, this.A01, imageUrl, z), 500L);
            } else {
                throw AbstractC166987dD.A14("result data could not be null when payment guidance enabled");
            }
        }
        this.A02.unregisterLifecycleListener(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A02.unregisterLifecycleListener(this);
    }
}
