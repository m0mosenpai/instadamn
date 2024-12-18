package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.KYo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46023KYo extends AbstractC49521Lua {
    public final int A00;
    public final Object A01;

    public C46023KYo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        C8Z9 c8z9;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C50724MaP c50724MaP = (C50724MaP) obj;
            InterfaceC678133v interfaceC678133v = c50724MaP.A0R;
            if (interfaceC678133v != null) {
                interfaceC678133v.seekTo(0);
            }
            InterfaceC678133v interfaceC678133v2 = c50724MaP.A0R;
            if (interfaceC678133v2 != null) {
                interfaceC678133v2.pause();
            }
            c8z9 = c50724MaP.A0H;
        } else {
            AlbumEditFragment albumEditFragment = (AlbumEditFragment) obj;
            InterfaceC678133v interfaceC678133v3 = albumEditFragment.A0P;
            if (interfaceC678133v3 != null) {
                interfaceC678133v3.seekTo(0);
            }
            InterfaceC678133v interfaceC678133v4 = albumEditFragment.A0P;
            if (interfaceC678133v4 != null) {
                interfaceC678133v4.pause();
            }
            c8z9 = albumEditFragment.A0I;
        }
        if (c8z9 != null) {
            c8z9.A03(C8G5.A04);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
    }
}
