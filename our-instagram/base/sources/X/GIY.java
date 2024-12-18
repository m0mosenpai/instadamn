package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GIY implements C47P {
    public static final Map A03 = AbstractC166987dD.A1I();
    public final ImmutableList A00;
    public final User A01;
    public final String A02;

    @Override // X.C47P
    public final Reel BlO(UserSession userSession) {
        return null;
    }

    @Override // X.C47P
    public final String C9e() {
        return null;
    }

    @Override // X.C47P
    public final String CEI() {
        return null;
    }

    @Override // X.C47P
    public final String getAlgorithm() {
        return "";
    }

    @Override // X.C17D
    public final String getId() {
        return this.A01.getId();
    }

    public GIY(User user) {
        this.A01 = user;
        String A0e = AbstractC31171DnF.A0e(user);
        this.A02 = A0e == null ? "" : A0e;
        this.A00 = user.A08();
    }

    @Override // X.C47P
    public final String ByJ() {
        return this.A02;
    }

    @Override // X.C47P
    public final User CDj() {
        return this.A01;
    }

    @Override // X.C47P
    public final ImmutableList getSocialContextFacepileUsers() {
        return this.A00;
    }
}
