package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository;

/* renamed from: X.JmL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44515JmL extends AbstractC52922bZ {
    public String A00;
    public final UserSession A01;
    public final Integer A02;
    public final C05A A03;

    public final void A00() {
        if (this.A02.intValue() == 0) {
            String str = this.A00;
            if (str != null && str.length() != 0) {
                this.A03.Egh(new KAB(str));
                return;
            } else {
                C50120MBu.A01(this, ImmersiveAvatarConfigRepository.IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT, AbstractC141776au.A00(this), 11);
                return;
            }
        }
        throw B4Z.A00();
    }

    public /* synthetic */ C44515JmL(UserSession userSession, Integer num) {
        AbstractC167017dG.A1P(userSession, num);
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = "";
        this.A03 = C10E.A00(KAD.A00);
    }
}
