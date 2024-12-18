package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.6st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152086st extends AbstractC33563Esb {
    public final AvatarCoinFlipConfig A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C152086st(AvatarCoinFlipConfig avatarCoinFlipConfig, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        this.A01 = str;
        this.A00 = avatarCoinFlipConfig;
        this.A02 = str2;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152086st) {
                C152086st c152086st = (C152086st) obj;
                if (!C14360o3.A0K(this.A01, c152086st.A01) || !C14360o3.A0K(this.A00, c152086st.A00) || !C14360o3.A0K(this.A02, c152086st.A02) || this.A03 != c152086st.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (avatarCoinFlipConfig == null) {
            hashCode = 0;
        } else {
            hashCode = avatarCoinFlipConfig.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode3 + i;
    }
}
