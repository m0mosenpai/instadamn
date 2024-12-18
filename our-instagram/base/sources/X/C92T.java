package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.92T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92T extends C3DB {
    public C124545kG A00;
    public InterfaceC124365js A01;
    public LimitedInteractionsVersions A02;
    public Boolean A03;
    public Integer A04;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        InterfaceC124365js interfaceC124365js = this.A01;
        if (interfaceC124365js == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return interfaceC124365js;
    }
}
