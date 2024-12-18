package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: X.SgF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63257SgF {
    public static final C62679SLs A00 = new C62679SLs("GoogleSignInCommon", new String[0]);

    public static T56 A01(Intent intent) {
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount == null) {
            if (status == null) {
                status = Status.A06;
            }
            return new T56(null, status);
        }
        return new T56(googleSignInAccount, Status.A08);
    }

    public static Intent A00(Context context, GoogleSignInOptions googleSignInOptions) {
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A0B = AbstractC58320PtC.A0B(context, "com.google.android.gms.auth.GOOGLE_SIGN_IN");
        A0B.setClass(context, SignInHubActivity.class);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(DexStore.CONFIG_FILENAME, signInConfiguration);
        A0B.putExtra(DexStore.CONFIG_FILENAME, A0b);
        return A0B;
    }

    public static void A02(Context context) {
        C62938SYg.A00(context).A01();
        java.util.Set set = AbstractC1335861e.A00;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((AbstractC1335861e) it.next()).A0A();
        }
        C1335961f.A03();
    }
}
