package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8uF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200728uF extends C3DB {
    public C201018ui A00;
    public C201028uj A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C201028uj c201028uj = this.A01;
        if (c201028uj == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c201028uj;
    }
}
