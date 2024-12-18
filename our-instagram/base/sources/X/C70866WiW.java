package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WiW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70866WiW implements XCW {
    public int A00 = 0;
    public User A01 = null;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0N;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("bounds_padding_for_underline", this.A00);
            if (this.A01 != null) {
                A0S.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user = this.A01;
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(A0S, user);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
