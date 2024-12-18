package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;

/* renamed from: X.Sl5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63465Sl5 implements OutcomeReceiver {
    public final /* synthetic */ InterfaceC65463Tkf A00;
    public final /* synthetic */ C63597Sq4 A01;

    public C63465Sl5(InterfaceC65463Tkf interfaceC65463Tkf, C63597Sq4 c63597Sq4) {
        this.A00 = interfaceC65463Tkf;
        this.A01 = c63597Sq4;
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        C14360o3.A0B(getCredentialException, 0);
        this.A00.DEG(C63597Sq4.A02(getCredentialException));
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        C14360o3.A0B(getCredentialResponse, 0);
        this.A00.onResult(C63597Sq4.A00(getCredentialResponse));
    }
}
