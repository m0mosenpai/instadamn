package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.4mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104254mn extends C3DB {
    public C104394n5 A00;
    public List A01;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C104394n5 c104394n5 = this.A00;
        if (c104394n5 == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c104394n5;
    }
}
