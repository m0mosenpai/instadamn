package X;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;

/* renamed from: X.Sl6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63466Sl6 implements OutcomeReceiver {
    public final /* synthetic */ SH5 A00;
    public final /* synthetic */ InterfaceC65463Tkf A01;
    public final /* synthetic */ C63597Sq4 A02;

    public C63466Sl6(SH5 sh5, InterfaceC65463Tkf interfaceC65463Tkf, C63597Sq4 c63597Sq4) {
        this.A01 = interfaceC65463Tkf;
        this.A00 = sh5;
        this.A02 = c63597Sq4;
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        C14360o3.A0B(createCredentialException, 0);
        this.A01.DEG(C63597Sq4.A01(createCredentialException));
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        Object sa8;
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
        C14360o3.A0B(createCredentialResponse, 0);
        InterfaceC65463Tkf interfaceC65463Tkf = this.A01;
        String str = this.A00.A03;
        Bundle data = createCredentialResponse.getData();
        C14360o3.A07(data);
        try {
            if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                sa8 = new SA8(data);
            } else if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                    C14360o3.A0A(string);
                    sa8 = new Q6K(string, data);
                } catch (Exception unused) {
                    throw new Exception();
                }
            } else {
                throw new Exception();
            }
        } catch (C61246Rjj unused2) {
            sa8 = new SA8(data);
            if (str.length() <= 0) {
                throw AbstractC166987dD.A12("type should not be empty");
            }
        }
        interfaceC65463Tkf.onResult(sa8);
    }
}
