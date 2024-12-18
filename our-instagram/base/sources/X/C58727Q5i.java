package X;

import android.content.ComponentName;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* renamed from: X.Q5i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58727Q5i extends AbstractServiceConnectionC63432SkB {
    public final /* synthetic */ AuthorizationRequest A00;
    public final /* synthetic */ THA A01;

    public C58727Q5i(AuthorizationRequest authorizationRequest, THA tha) {
        this.A01 = tha;
        this.A00 = authorizationRequest;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        THA tha = this.A01;
        tha.A02 = null;
        tha.A01 = null;
    }
}
