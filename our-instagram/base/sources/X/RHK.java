package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes10.dex */
public final class RHK extends AbstractC1340563o implements InterfaceC65661Tqr {
    public final Integer A00;
    public final Bundle A01;
    public final C1340363l A02;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // X.InterfaceC65661Tqr
    public final void FF3(zae zaeVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            String A00 = AbstractC111324zv.A00(3474);
            Account account = new Account(A00, "com.google");
            if (A00.equals(account.name)) {
                googleSignInAccount = C63215SfL.A00(this.A0F).A01();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A00;
            C3U5.A02(num);
            zat zatVar = new zat(account, googleSignInAccount, 2, num.intValue());
            zaa zaaVar = (zaa) A03();
            zai zaiVar = new zai(zatVar, 1);
            int A03 = C0f9.A03(2108055427);
            Parcel A002 = zaaVar.A00();
            A002.writeInt(1);
            zaiVar.writeToParcel(A002, 0);
            AbstractC58321PtD.A19(zaeVar, A002);
            zaaVar.A01(A002, 12);
            C0f9.A0A(-1036543505, A03);
        } catch (RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.FF0(new zak(new ConnectionResult(8, null), null, 1));
            } catch (RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final boolean requiresSignIn() {
        return true;
    }

    public RHK(Context context, Bundle bundle, Looper looper, C69E c69e, C69G c69g, C1340363l c1340363l) {
        super(context, looper, c69e, c69g, c1340363l, 44);
        this.A02 = c1340363l;
        this.A01 = bundle;
        this.A00 = c1340363l.A00;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        String str = this.A02.A02;
        if (!this.A0F.getPackageName().equals(str)) {
            this.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.A01;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return queryLocalInterface;
        }
        zaa zaaVar = new zaa("com.google.android.gms.signin.internal.ISignInService", iBinder);
        C0f9.A0A(1700845582, C0f9.A03(-1717546403));
        return zaaVar;
    }
}
