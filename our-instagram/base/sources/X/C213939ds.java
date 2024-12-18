package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.9ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213939ds extends C2JS implements C2JT {
    public final User A0E(C1DV c1dv) {
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A01(new C1DY(c1dv, (java.util.Set) AbstractC166987dD.A1H(), false), (ImmutablePandoUserDict) reinterpret(ImmutablePandoUserDict.class));
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "pk"), AbstractC166987dD.A0i(c94754Oe, AbstractC50532MSl.A01(247, 8, 59)), "profile_pic_url");
    }

    public C213939ds(int i) {
        super(i);
    }

    public C213939ds() {
        super(632736148);
    }
}
