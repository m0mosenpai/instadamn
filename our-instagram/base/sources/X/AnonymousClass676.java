package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.676, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass676 extends C2JS implements C2JT {
    public final User A0E(C1DV c1dv) {
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A01(new C1DY(c1dv, (java.util.Set) new HashSet(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "full_name"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31670Dva.A01(30, 8, 84)), new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94754Oe, "birthday_today_visibility_for_viewer")});
    }

    public AnonymousClass676(int i) {
        super(i);
    }

    public AnonymousClass676() {
        super(-1791809412);
    }
}
