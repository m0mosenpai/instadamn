package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.UyS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67793UyS extends C3DB {
    public XFE A00;
    public E8G A01;
    public Integer A02;
    public Integer A03;
    public List A04;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        XFE xfe = this.A00;
        if (xfe == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return xfe;
    }
}
