package X;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public final class T56 implements C61j {
    public final GoogleSignInAccount A00;
    public final Status A01;

    public T56(GoogleSignInAccount googleSignInAccount, Status status) {
        this.A00 = googleSignInAccount;
        this.A01 = status;
    }

    @Override // X.C61j
    public final Status C0F() {
        return this.A01;
    }
}
