package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IntegrityInterstitialType;

/* renamed from: X.UyT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67794UyT extends C3DB {
    public XFI A00;
    public IntegrityInterstitialType A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        XFI xfi = this.A00;
        if (xfi == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return xfi;
    }
}
