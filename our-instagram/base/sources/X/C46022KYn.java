package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.KYn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46022KYn extends AbstractC49521Lua {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C46022KYn(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        if (this.A00 != 0) {
            C55059OaE.A00((AudioOverlayTrack) this.A02, (C55059OaE) this.A03);
        } else {
            InterfaceC678133v interfaceC678133v = ((KDQ) this.A03).A0N;
            if (interfaceC678133v == null) {
                return;
            }
            interfaceC678133v.EJa(false);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        int i2;
        InterfaceC678133v interfaceC678133v;
        int i3 = this.A00;
        int i4 = i - this.A01;
        if (i3 != 0) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) this.A02;
            if (i4 >= audioOverlayTrack.A02) {
                C55059OaE.A00(audioOverlayTrack, (C55059OaE) this.A03);
                return;
            }
            return;
        }
        MusicInfo musicInfo = (MusicInfo) this.A02;
        Integer BaR = musicInfo.BVa().BaR();
        if (BaR != null) {
            i2 = BaR.intValue();
        } else {
            i2 = 30000;
        }
        if (i4 >= i2 && (interfaceC678133v = ((KDQ) this.A03).A0N) != null) {
            interfaceC678133v.EJa(false);
        }
        AbstractC210529Sr abstractC210529Sr = ((KDQ) this.A03).A0O;
        if (abstractC210529Sr == null) {
            return;
        }
        abstractC210529Sr.EUp(i - AbstractC25227BEk.A06(musicInfo.BVa().Adg(), 0), i);
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        if (1 - this.A00 == 0) {
            AbstractC25227BEk.A1A(((C55059OaE) this.A03).A00, true);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        if (1 - this.A00 == 0) {
            AbstractC25227BEk.A1A(((C55059OaE) this.A03).A00, false);
        }
    }
}
