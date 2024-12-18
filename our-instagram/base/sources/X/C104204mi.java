package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.4mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104204mi extends C3DB {
    public C104424n8 A00;
    public List A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C104424n8 c104424n8 = this.A00;
        if (c104424n8 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c104424n8;
    }
}
