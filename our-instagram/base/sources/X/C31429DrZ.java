package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.common.AvatarInfo;

/* renamed from: X.DrZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31429DrZ {
    public boolean A00;
    public AvatarCoinFlipConfig A01;
    public boolean A02;
    public final C006802i A03;
    public final String A04 = AbstractC167017dG.A0j();

    public final void A02(AvatarCoinFlipConfig avatarCoinFlipConfig, String str, boolean z) {
        this.A01 = avatarCoinFlipConfig;
        if (!this.A00) {
            C006802i c006802i = this.A03;
            c006802i.markerStart(129898941);
            c006802i.markerAnnotate(129898941, "surface", "COIN_FLIP");
            c006802i.markerAnnotate(129898941, "avatar_session_id", this.A04);
            c006802i.markerAnnotate(129898941, "is_auto_swivel", z);
            c006802i.markerAnnotate(129898941, "coin_flip_surface", str);
            this.A00 = true;
        }
        if (this.A02) {
            A01();
        }
    }

    public final void A00() {
        if (this.A00) {
            AvatarCoinFlipConfig avatarCoinFlipConfig = this.A01;
            if (avatarCoinFlipConfig != null) {
                this.A03.markerAnnotate(129898941, "sticker_pack_id", avatarCoinFlipConfig.A07);
            }
            this.A03.markerEnd(129898941, (short) 4);
            this.A00 = false;
        }
    }

    public final void A01() {
        String str;
        String str2;
        String str3;
        String str4;
        AvatarInfo avatarInfo;
        AvatarInfo avatarInfo2;
        AvatarInfo avatarInfo3;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        if (this.A00) {
            C006802i c006802i = this.A03;
            AvatarCoinFlipConfig avatarCoinFlipConfig = this.A01;
            String str5 = null;
            if (avatarCoinFlipConfig != null) {
                str = avatarCoinFlipConfig.A07;
            } else {
                str = null;
            }
            c006802i.markerAnnotate(129898941, "sticker_pack_id", str);
            AvatarCoinFlipConfig avatarCoinFlipConfig2 = this.A01;
            if (avatarCoinFlipConfig2 != null && (avatarCoinFlipBackgroundOptionResponse = avatarCoinFlipConfig2.A04) != null) {
                str2 = avatarCoinFlipBackgroundOptionResponse.A02;
            } else {
                str2 = null;
            }
            c006802i.markerAnnotate(129898941, "background_id", str2);
            AvatarCoinFlipConfig avatarCoinFlipConfig3 = this.A01;
            if (avatarCoinFlipConfig3 != null && (avatarInfo3 = avatarCoinFlipConfig3.A01) != null) {
                str3 = avatarInfo3.A01;
            } else {
                str3 = null;
            }
            c006802i.markerAnnotate(129898941, "avatar_revision_id", str3);
            AvatarCoinFlipConfig avatarCoinFlipConfig4 = this.A01;
            if (avatarCoinFlipConfig4 != null && (avatarInfo2 = avatarCoinFlipConfig4.A01) != null) {
                str4 = avatarInfo2.A02;
            } else {
                str4 = null;
            }
            c006802i.markerAnnotate(129898941, "avatar_style_id", str4);
            AvatarCoinFlipConfig avatarCoinFlipConfig5 = this.A01;
            if (avatarCoinFlipConfig5 != null && (avatarInfo = avatarCoinFlipConfig5.A01) != null) {
                str5 = avatarInfo.A00;
            }
            c006802i.markerAnnotate(129898941, "avatar_id", str5);
            c006802i.markerEnd(129898941, (short) 2);
            this.A00 = false;
        }
        this.A02 = true;
    }

    public C31429DrZ(C006802i c006802i) {
        this.A03 = c006802i;
    }
}
