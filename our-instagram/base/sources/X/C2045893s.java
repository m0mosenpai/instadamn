package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.93s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045893s extends AbstractC72023La {
    public E7Y A02;
    public C38756H4w A03;
    public InterfaceC128135qh A04;
    public User A05;
    public long A01 = -1;
    public long A00 = -1;

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A01 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        InterfaceC128135qh interfaceC128135qh = this.A04;
        if (interfaceC128135qh == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return interfaceC128135qh;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
