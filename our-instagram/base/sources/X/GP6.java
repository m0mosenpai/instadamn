package X;

import android.R;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.CoinFlipAvatarImageView;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;

/* loaded from: classes6.dex */
public final class GP6 implements Runnable {
    public final /* synthetic */ AvatarCoinFlipSticker A00;
    public final /* synthetic */ AvatarCoinFlipSticker A01;
    public final /* synthetic */ EKa A02;

    public GP6(AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, EKa eKa) {
        this.A02 = eKa;
        this.A00 = avatarCoinFlipSticker;
        this.A01 = avatarCoinFlipSticker2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoinFlipAvatarImageView coinFlipAvatarImageView;
        EKa eKa = this.A02;
        if (eKa.isAdded()) {
            AbstractC167007dF.A0x(eKa.A06);
            ProfileCoinFlipView profileCoinFlipView = eKa.A02;
            if (profileCoinFlipView != null) {
                coinFlipAvatarImageView = ((AbstractC1569172v) profileCoinFlipView).A01;
            } else {
                coinFlipAvatarImageView = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(coinFlipAvatarImageView, (Property<CoinFlipAvatarImageView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setDuration(AbstractC166997dE.A0N(eKa).getInteger(R.integer.config_shortAnimTime));
            ofFloat.start();
            EKa.A01(this.A00, this.A01, eKa);
        }
    }
}
