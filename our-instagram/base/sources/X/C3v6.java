package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NavBarCameraDestination;

/* renamed from: X.3v6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3v6 extends C3DB {
    public C108184u4 A00;
    public NavBarCameraDestination A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C108184u4 c108184u4 = this.A00;
        if (c108184u4 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c108184u4;
    }
}
