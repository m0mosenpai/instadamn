package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import java.util.List;

/* renamed from: X.7dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167347dn extends C3DB {
    public InterfaceC168317fQ A00;
    public NudgeType A01;
    public NudgeVisualType A02;
    public List A03;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        InterfaceC168317fQ interfaceC168317fQ = this.A00;
        if (interfaceC168317fQ == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return interfaceC168317fQ;
    }
}
