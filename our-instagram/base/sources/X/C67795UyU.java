package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.UyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67795UyU extends C3DB {
    public UP6 A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        UP6 up6 = this.A00;
        if (up6 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return up6;
    }
}
