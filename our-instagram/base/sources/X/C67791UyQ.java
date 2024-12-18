package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.UyQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67791UyQ extends C3DB {
    public XFP A00;
    public Boolean A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        XFP xfp = this.A00;
        if (xfp == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return xfp;
    }
}
