package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.Lfn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48660Lfn implements MQX {
    public final /* synthetic */ KCW A00;

    @Override // X.MQX
    public final void CyZ(AvatarCoinFlipConfig avatarCoinFlipConfig, String str) {
        C14360o3.A0B(avatarCoinFlipConfig, 0);
        KCW.A03(avatarCoinFlipConfig, this.A00);
    }

    @Override // X.MQX
    public final void Cyh(C148286ly c148286ly, C45058Jwn c45058Jwn) {
        MRR mrr = this.A00.A02;
        if (mrr != null) {
            mrr.Cyi(c148286ly, null, null);
        }
    }

    public C48660Lfn(KCW kcw) {
        this.A00 = kcw;
    }

    @Override // X.MQX
    public final void Dvf() {
        MRR mrr = this.A00.A02;
        if (mrr != null) {
            mrr.Dvf();
        }
    }
}
