package X;

import com.google.android.gms.auth.api.credentials.Credential;

/* loaded from: classes10.dex */
public final class TGT implements InterfaceC37174GZl {
    public final Credential A00;

    @Override // X.InterfaceC37174GZl
    public final android.net.Uri Bht() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC37174GZl
    public final String getPassword() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC37174GZl
    public final String getUsername() {
        String str = this.A00.A01;
        C14360o3.A07(str);
        return str;
    }

    public TGT(Credential credential) {
        this.A00 = credential;
    }
}
