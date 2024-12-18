package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.Sqd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63631Sqd implements InterfaceC018507f {
    public final /* synthetic */ SignInHubActivity A00;

    @Override // X.InterfaceC018507f
    public final AbstractC019307n D8C(Bundle bundle, int i) {
        SignInHubActivity signInHubActivity = this.A00;
        java.util.Set set = AbstractC1335861e.A00;
        synchronized (set) {
        }
        return new C58777Q8k(signInHubActivity, set);
    }

    @Override // X.InterfaceC018507f
    public final /* bridge */ /* synthetic */ void DPn(AbstractC019307n abstractC019307n, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
