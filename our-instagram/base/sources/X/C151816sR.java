package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C151816sR extends C03E implements InterfaceC16820sZ {
    public C151816sR(Object obj) {
        super(0, obj, C53K.class, "onCustomizationEntrypointClicked", "onCustomizationEntrypointClicked()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserDetailFragment userDetailFragment = (UserDetailFragment) this.receiver;
        if (userDetailFragment.A0B != null) {
            C70F c70f = (C70F) userDetailFragment.A0x.A0W.getValue();
            AvatarCoinFlipConfig avatarCoinFlipConfig = userDetailFragment.A0B;
            AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig.A05;
            c70f.A03(avatarCoinFlipConfig.A04, null, avatarCoinFlipSticker.A03, avatarCoinFlipConfig.A06.A03, avatarCoinFlipConfig.A07, avatarCoinFlipSticker.A00, avatarCoinFlipConfig.A03, avatarCoinFlipConfig.A02);
        }
        return C0eB.A00;
    }
}
