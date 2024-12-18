package X;

import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* loaded from: classes8.dex */
public final class JZP extends AbstractC49521Lua {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public JZP(InterfaceC678133v interfaceC678133v, C37962Gn4 c37962Gn4) {
        this.A00 = 1;
        this.A03 = c37962Gn4;
        this.A01 = interfaceC678133v;
        this.A02 = c37962Gn4.A08;
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        if (this.A00 == 0) {
            C47956LGs c47956LGs = (C47956LGs) this.A03;
            C45068Jwx c45068Jwx = (C45068Jwx) this.A02;
            InterfaceC678133v interfaceC678133v = c47956LGs.A00;
            if (interfaceC678133v != null) {
                interfaceC678133v.pause();
                interfaceC678133v.seekTo(c45068Jwx.A01);
            }
            CircularProgressImageView circularProgressImageView = c47956LGs.A06;
            if (circularProgressImageView != null) {
                circularProgressImageView.setAngle(0.0f);
                circularProgressImageView.setImageDrawable(c47956LGs.A03);
            }
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        float f;
        C8G6 c8g6;
        switch (this.A00) {
            case 0:
                C45068Jwx c45068Jwx = (C45068Jwx) this.A02;
                int i2 = c45068Jwx.A01;
                int i3 = i - i2;
                int i4 = c45068Jwx.A00;
                float f2 = (i3 / i4) * 360.0f;
                C47956LGs c47956LGs = (C47956LGs) this.A03;
                CircularProgressImageView circularProgressImageView = c47956LGs.A06;
                if (circularProgressImageView != null) {
                    circularProgressImageView.setAngle(f2);
                }
                if (i3 >= i4) {
                    InterfaceC678133v interfaceC678133v = c47956LGs.A00;
                    if (interfaceC678133v != null) {
                        interfaceC678133v.pause();
                        interfaceC678133v.seekTo(i2);
                    }
                    if (circularProgressImageView != null) {
                        circularProgressImageView.setAngle(0.0f);
                        circularProgressImageView.setImageDrawable(c47956LGs.A03);
                    }
                }
                AbstractC210529Sr abstractC210529Sr = (AbstractC210529Sr) this.A01;
                if (abstractC210529Sr == null) {
                    return;
                }
                abstractC210529Sr.EUp(i3, i);
                return;
            case 1:
                C37962Gn4 c37962Gn4 = (C37962Gn4) this.A03;
                f = (i - c37962Gn4.A01) / c37962Gn4.A00;
                if (f >= 1.0f) {
                    InterfaceC678133v interfaceC678133v2 = (InterfaceC678133v) this.A01;
                    if (!interfaceC678133v2.isPlaying()) {
                        return;
                    }
                    interfaceC678133v2.pause();
                    return;
                }
                c8g6 = (C8G6) this.A02;
                c8g6.A01(C8G5.A05);
                break;
            default:
                C43812JYz c43812JYz = (C43812JYz) this.A03;
                f = (i - c43812JYz.A01) / c43812JYz.A00;
                if (f >= 1.0f) {
                    c43812JYz.A02.EJa(false);
                    return;
                } else {
                    c8g6 = (C8G6) this.A01;
                    if (c8g6 == null) {
                        return;
                    }
                }
                break;
        }
        c8g6.A00(f);
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        C47956LGs c47956LGs;
        CircularProgressImageView circularProgressImageView;
        if (this.A00 == 0 && (circularProgressImageView = (c47956LGs = (C47956LGs) this.A03).A06) != null) {
            circularProgressImageView.setImageDrawable(c47956LGs.A02);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        if (2 - this.A00 == 0) {
            C43812JYz c43812JYz = (C43812JYz) this.A03;
            int A00 = AbstractC40750I4e.A00(i, 30000, ((JIN) this.A02).BE6());
            c43812JYz.A01 = A00;
            int i2 = i - A00;
            int i3 = 30000;
            if (30000 > i2) {
                i3 = i2;
            }
            c43812JYz.A00 = i3;
            InterfaceC678133v interfaceC678133v = c43812JYz.A02;
            interfaceC678133v.seekTo(A00);
            interfaceC678133v.E4S();
            C8G6 c8g6 = (C8G6) this.A01;
            if (c8g6 != null) {
                c8g6.A01(C8G5.A05);
            }
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        switch (this.A00) {
            case 0:
                C47956LGs c47956LGs = (C47956LGs) this.A03;
                CircularProgressImageView circularProgressImageView = c47956LGs.A06;
                if (circularProgressImageView == null) {
                    return;
                }
                circularProgressImageView.setImageDrawable(c47956LGs.A03);
                return;
            case 1:
                ((C8G6) this.A02).A01(C8G5.A04);
                return;
            default:
                ((C43812JYz) this.A03).A02.AHi();
                C8G6 c8g6 = (C8G6) this.A01;
                if (c8g6 != null) {
                    c8g6.A01(C8G5.A04);
                    c8g6.A00(0.0f);
                    return;
                }
                return;
        }
    }

    public JZP(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
