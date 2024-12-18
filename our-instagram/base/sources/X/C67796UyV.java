package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.UyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67796UyV extends C3DB {
    public UP9 A00;
    public C66615UPc A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        UP9 up9 = this.A00;
        if (up9 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return up9;
    }
}
