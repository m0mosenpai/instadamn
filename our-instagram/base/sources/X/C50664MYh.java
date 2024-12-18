package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MYh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50664MYh extends AbstractC52922bZ implements InterfaceC150336ph {
    public int A00;
    public int A01;
    public final InterfaceC678133v A02;
    public final C0UO A03;
    public final C0UO A04;
    public final C0UO A05;
    public final UserSession A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;

    public C50664MYh(UserSession userSession, InterfaceC678133v interfaceC678133v) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A02 = interfaceC678133v;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A09 = A0z;
        this.A05 = AbstractC208910l.A02(A0z);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53153Nf8.A05);
        this.A08 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC25227BEk.A0l());
        this.A07 = A1H2;
        this.A03 = AbstractC208910l.A02(A1H2);
    }

    public final void A02(JIN jin) {
        A03(true);
        this.A02.ESz(jin.BVb(), this, null, 0, -1, -1, false, false);
        this.A09.Egh(jin);
        A00();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
    }

    private final void A00() {
        Integer num;
        EnumC53153Nf8 enumC53153Nf8;
        JIN jin = (JIN) this.A05.getValue();
        if (jin != null) {
            num = this.A02.CAJ(jin.BVb());
        } else {
            num = C05F.A00;
        }
        C05A c05a = this.A08;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (this.A02.isPlaying()) {
                    enumC53153Nf8 = EnumC53153Nf8.A03;
                } else {
                    enumC53153Nf8 = EnumC53153Nf8.A02;
                }
            } else {
                enumC53153Nf8 = EnumC53153Nf8.A04;
            }
        } else {
            enumC53153Nf8 = EnumC53153Nf8.A05;
        }
        c05a.Egh(enumC53153Nf8);
    }

    public final Integer A01(JIN jin) {
        JIN jin2 = (JIN) this.A05.getValue();
        if (jin2 != null && C14360o3.A0K(jin.getId(), jin2.getId())) {
            return this.A02.CAJ(jin2.BVb());
        }
        return C05F.A00;
    }

    public final void A03(boolean z) {
        this.A07.Egh(AbstractC25227BEk.A0l());
        this.A09.Egh(null);
        this.A08.Egh(EnumC53153Nf8.A05);
        this.A02.EJa(z);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        float f = (i - this.A01) / this.A00;
        if (f >= 1.0f) {
            if (C18U.A06(C06090Tz.A05, this.A06, 36330174874403556L)) {
                InterfaceC678133v interfaceC678133v = this.A02;
                interfaceC678133v.pause();
                interfaceC678133v.seekTo(this.A01);
                return;
            }
            A03(false);
            return;
        }
        this.A07.Egh(Float.valueOf(f));
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        JIN jin = (JIN) this.A05.getValue();
        if (jin != null) {
            int A00 = AbstractC40750I4e.A00(i, 30000, jin.BE6());
            this.A01 = A00;
            this.A00 = Math.min(30000, i - A00);
            InterfaceC678133v interfaceC678133v = this.A02;
            interfaceC678133v.seekTo(A00);
            interfaceC678133v.E4S();
        }
        A00();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
        C24U c24u = AnonymousClass229.A01(this.A06).A03;
        c24u.A04 = c24u.A0E.A02(17645025, c24u.A04);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        A00();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        A00();
    }
}
