package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class T1Y implements InterfaceC65499TlN {
    public final FbnsServiceDelegate A00;

    @Override // X.InterfaceC65499TlN
    public final void AQA(Context context, Bundle bundle) {
        C0K8.A0C("AppsStatisticsFetcher", "not implemented for AppsStatisticsFetcher");
        throw AbstractC166987dD.A12("not implemented for AppsStatisticsFetcher");
    }

    public T1Y(FbnsServiceDelegate fbnsServiceDelegate) {
        this.A00 = fbnsServiceDelegate;
    }

    @Override // X.InterfaceC65499TlN
    public final Bundle AQ4(Context context, Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        ArrayList<String> A1E = AbstractC166987dD.A1E();
        ArrayList<String> A1E2 = AbstractC166987dD.A1E();
        C3V2.A01(context, A1E, A1E2);
        A0b.putStringArrayList("valid_compatible_apps", A1E);
        A0b.putStringArrayList("enabled_compatible_apps", A1E2);
        ArrayList<String> A1E3 = AbstractC166987dD.A1E();
        this.A00.A0d(A1E3);
        A0b.putStringArrayList("registered_apps", A1E3);
        return A0b;
    }
}
