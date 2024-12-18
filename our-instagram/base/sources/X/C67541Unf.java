package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.Unf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67541Unf extends C2JS implements C2JT {
    public final User A0E(C1DV c1dv) {
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A01(new C1DY(c1dv, (java.util.Set) new HashSet(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC58319PtB.A0U(new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "full_name"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31187DnW.A01()), new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
    }

    public C67541Unf(int i) {
        super(i);
    }

    public C67541Unf() {
        super(-508424204);
    }
}
