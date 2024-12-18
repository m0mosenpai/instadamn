package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.UyP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67790UyP extends C3DB {
    public XFH A00;
    public Boolean A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        XFH xfh = this.A00;
        if (xfh == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return xfh;
    }
}
