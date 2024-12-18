package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p002authapi.zba;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RHD extends AbstractC1340563o {
    public final GoogleSignInOptions A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final boolean E6l() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12451000;
    }

    public RHD(Context context, Looper looper, GoogleSignInOptions googleSignInOptions, C69E c69e, C69G c69g, C1340363l c1340363l) {
        super(context, looper, c69e, c69g, c1340363l, 91);
        SZE sze;
        if (googleSignInOptions != null) {
            sze = new SZE(googleSignInOptions);
        } else {
            sze = new SZE();
        }
        sze.A01 = AbstractC62842STp.A00();
        java.util.Set set = c1340363l.A06;
        if (!set.isEmpty()) {
            for (Object obj : set) {
                java.util.Set set2 = sze.A02;
                set2.add(obj);
                set2.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.A00 = sze.A00();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zbs) {
            return queryLocalInterface;
        }
        zba zbaVar = new zba("com.google.android.gms.auth.api.signin.internal.ISignInService", iBinder);
        C0f9.A0A(-681929767, C0f9.A03(-1295379807));
        return zbaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final Intent BxD() {
        return AbstractC63257SgF.A00(this.A0F, this.A00);
    }
}
