package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.Lel, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48609Lel implements BDK {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ C37964Gn6 A01;

    public C48609Lel(AlbumEditFragment albumEditFragment, C37964Gn6 c37964Gn6) {
        this.A00 = albumEditFragment;
        this.A01 = c37964Gn6;
    }

    @Override // X.BDK
    public final void DYs() {
        InterfaceC678133v interfaceC678133v = this.A00.A0P;
        if (interfaceC678133v != null) {
            interfaceC678133v.E4S();
        }
    }

    @Override // X.BDK
    public final boolean isPlaying() {
        InterfaceC678133v interfaceC678133v = this.A00.A0P;
        if (interfaceC678133v == null || interfaceC678133v.CAJ(this.A01.BVb()) == C05F.A00 || !interfaceC678133v.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.BDK
    public final void onPause() {
        InterfaceC678133v interfaceC678133v = this.A00.A0P;
        if (interfaceC678133v != null) {
            interfaceC678133v.pause();
        }
    }
}
