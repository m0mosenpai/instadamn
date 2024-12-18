package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.3DA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DA extends C3DB {
    public InterfaceC74673Xb A00;
    public List A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        InterfaceC74673Xb interfaceC74673Xb = this.A00;
        if (interfaceC74673Xb == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return interfaceC74673Xb;
    }
}
