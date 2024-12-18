package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.Lfo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48661Lfo implements MQX {
    public final /* synthetic */ C159737El A00;
    public final /* synthetic */ C3DN A01;

    @Override // X.MQX
    public final void CyZ(AvatarCoinFlipConfig avatarCoinFlipConfig, String str) {
    }

    @Override // X.MQX
    public final void Cyh(C148286ly c148286ly, C45058Jwn c45058Jwn) {
        C159737El c159737El = this.A00;
        EnumC46186KcO enumC46186KcO = EnumC46186KcO.A03;
        C159737El.A0Q(null, enumC46186KcO, c159737El, null);
        c159737El.A1i.A05(c148286ly, enumC46186KcO, null);
        this.A01.A0B();
    }

    public C48661Lfo(C159737El c159737El, C3DN c3dn) {
        this.A00 = c159737El;
        this.A01 = c3dn;
    }

    @Override // X.MQX
    public final void Dvf() {
        C159737El c159737El = this.A00;
        c159737El.A1T.post(new Runnable() { // from class: X.M1V
            @Override // java.lang.Runnable
            public final void run() {
                C48661Lfo.this.A00.A1D();
            }
        });
        c159737El.A1i.A01();
    }
}
