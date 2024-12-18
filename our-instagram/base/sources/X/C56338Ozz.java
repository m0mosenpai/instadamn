package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ozz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56338Ozz implements InterfaceC58167PqX {
    public final /* synthetic */ C50724MaP A00;

    @Override // X.InterfaceC58167PqX
    public final void CqL() {
    }

    @Override // X.InterfaceC58167PqX
    public final void DAm() {
    }

    @Override // X.InterfaceC58167PqX
    public final void Dly(C49519LuY c49519LuY) {
        C14360o3.A0B(c49519LuY, 0);
        C50724MaP.A01(this.A00).A08(c49519LuY, false);
    }

    public C56338Ozz(C50724MaP c50724MaP) {
        this.A00 = c50724MaP;
    }

    @Override // X.InterfaceC58167PqX
    public final void Dua() {
        C51172MjG c51172MjG = this.A00.A0M;
        if (c51172MjG == null) {
            C14360o3.A0F("audioListAdapter");
            throw C00O.createAndThrow();
        }
        OKn oKn = c51172MjG.A00;
        if (oKn != null) {
            int indexOf = c51172MjG.A06.indexOf(oKn) + 1;
            c51172MjG.A00 = null;
            c51172MjG.notifyItemChanged(indexOf);
        }
    }

    @Override // X.InterfaceC58167PqX
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        C50725MaQ A01 = C50724MaP.A01(this.A00);
        C57171PZp.A03(audioOverlayTrack, A01, AbstractC141776au.A00(A01), 36);
    }
}
