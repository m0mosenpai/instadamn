package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.Lfm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48659Lfm implements MQX {
    public final /* synthetic */ M8T A00;

    @Override // X.MQX
    public final void Cyh(C148286ly c148286ly, C45058Jwn c45058Jwn) {
        MRR mrr;
        C47326Kvb c47326Kvb = ((C45499KCo) this.A00.A01).A07;
        if (c47326Kvb != null && (mrr = c47326Kvb.A00.A02) != null) {
            mrr.Cyi(c148286ly, null, null);
        }
    }

    @Override // X.MQX
    public final void Dvf() {
    }

    public C48659Lfm(M8T m8t) {
        this.A00 = m8t;
    }

    @Override // X.MQX
    public final void CyZ(AvatarCoinFlipConfig avatarCoinFlipConfig, String str) {
        C47326Kvb c47326Kvb = ((C45499KCo) this.A00.A01).A07;
        if (c47326Kvb != null) {
            C14360o3.A0B(avatarCoinFlipConfig, 0);
            KCW.A03(avatarCoinFlipConfig, c47326Kvb.A00);
        }
    }
}
