package X;

import android.view.View;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.GOe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36909GOe implements Runnable {
    public final /* synthetic */ AvatarCoinFlipConfig A00;
    public final /* synthetic */ C151696sF A01;

    public RunnableC36909GOe(AvatarCoinFlipConfig avatarCoinFlipConfig, C151696sF c151696sF) {
        this.A01 = c151696sF;
        this.A00 = avatarCoinFlipConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31429DrZ A00;
        View view;
        C151696sF c151696sF = this.A01;
        InterfaceC56392iX interfaceC56392iX = c151696sF.A0A;
        if (interfaceC56392iX != null && (view = interfaceC56392iX.getView()) != null) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            view.setAlpha(0.0f);
        }
        View view2 = c151696sF.A05;
        view2.getLayoutParams().width = view2.getWidth();
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (avatarCoinFlipConfig != null && (A00 = AbstractC31428DrY.A00(c151696sF.A09)) != null) {
            A00.A02(avatarCoinFlipConfig, "edit_profile", true);
        }
        C151706sG c151706sG = c151696sF.A0B;
        if (c151706sG != null) {
            c151706sG.A00(true, new GSw(c151696sF, 37));
        }
    }
}
