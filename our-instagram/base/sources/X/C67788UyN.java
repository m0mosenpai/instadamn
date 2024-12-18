package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.UyN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67788UyN extends C3DB {
    public UP1 A00;
    public List A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        UP1 up1 = this.A00;
        if (up1 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return up1;
    }
}
