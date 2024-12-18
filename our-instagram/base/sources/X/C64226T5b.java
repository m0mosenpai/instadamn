package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: X.T5b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64226T5b implements C64A {
    public final /* synthetic */ BaseGmsClient A00;

    public C64226T5b(BaseGmsClient baseGmsClient) {
        this.A00 = baseGmsClient;
    }

    @Override // X.C64A
    public final void Dff(ConnectionResult connectionResult) {
        if (connectionResult.A01 == 0) {
            BaseGmsClient baseGmsClient = this.A00;
            baseGmsClient.BmV(null, ((AbstractC1340563o) baseGmsClient).A01);
        } else {
            AnonymousClass641 anonymousClass641 = this.A00.A0I;
            if (anonymousClass641 == null) {
                return;
            }
            ((AnonymousClass640) anonymousClass641).A00.D7D(connectionResult);
        }
    }
}
