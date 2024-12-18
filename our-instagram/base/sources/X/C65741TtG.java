package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.TtG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65741TtG extends AbstractC65924TwV {
    public User A00;
    public boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65741TtG(User user) {
        super(0);
        int i;
        C14360o3.A0B(user, 1);
        this.A00 = user;
        Integer BrD = user.A03.BrD();
        if (BrD != null) {
            i = BrD.intValue();
        } else {
            i = -1;
        }
        super.A00 = i;
    }

    public final User A06() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if ((obj instanceof C65741TtG) && C14360o3.A0K(A06(), ((C65741TtG) obj).A06())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return A06().hashCode();
    }

    public C65741TtG() {
        super(0);
    }
}
