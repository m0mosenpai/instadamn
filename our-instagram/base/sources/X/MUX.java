package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class MUX implements C47P {
    public final User A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.C47P
    public final String ByJ() {
        return this.A04;
    }

    @Override // X.C47P
    public final String C9e() {
        return null;
    }

    @Override // X.C47P
    public final User CDj() {
        return this.A00;
    }

    @Override // X.C47P
    public final String CEI() {
        return this.A05;
    }

    @Override // X.C47P
    public final String getAlgorithm() {
        return this.A02;
    }

    @Override // X.C17D
    public final String getId() {
        return this.A03;
    }

    @Override // X.C47P
    public final ImmutableList getSocialContextFacepileUsers() {
        return this.A01;
    }

    public MUX(ImmutableList immutableList, User user, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A00 = user;
        this.A04 = str2;
        this.A01 = immutableList;
        this.A02 = str3;
        this.A05 = str4;
        if (user.B7L() == FollowStatus.A08 || user.B7L() == FollowStatus.A04) {
            user.A0k(FollowStatus.A06);
        }
        user.A0z(user.B7L() == FollowStatus.A05);
        user.A10(z);
    }

    @Override // X.C47P
    public final Reel BlO(UserSession userSession) {
        return null;
    }
}
