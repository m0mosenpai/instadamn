package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.6rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151116rE extends AbstractC33562Esa {
    public final AvatarCoinFlipConfig A00;
    public final String A01 = "";
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C151116rE) {
                C151116rE c151116rE = (C151116rE) obj;
                if (!C14360o3.A0K(this.A01, c151116rE.A01) || !C14360o3.A0K(this.A00, c151116rE.A00) || !C14360o3.A0K(this.A02, c151116rE.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        return ((hashCode + (avatarCoinFlipConfig == null ? 0 : avatarCoinFlipConfig.hashCode())) * 31) + this.A02.hashCode();
    }

    public C151116rE(AvatarCoinFlipConfig avatarCoinFlipConfig, String str) {
        this.A00 = avatarCoinFlipConfig;
        this.A02 = str;
    }
}
