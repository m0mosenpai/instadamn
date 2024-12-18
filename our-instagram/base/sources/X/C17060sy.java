package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.0sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17060sy {
    public static final C08730cb A01 = new Object();
    public User A00;

    public final User A00() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw C00O.createAndThrow();
    }
}
