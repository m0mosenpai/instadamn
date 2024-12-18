package X;

import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ozy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56337Ozy implements InterfaceC58167PqX {
    public final /* synthetic */ AlbumEditFragment A00;

    @Override // X.InterfaceC58167PqX
    public final void Dly(C49519LuY c49519LuY) {
        C14360o3.A0B(c49519LuY, 0);
        C05A c05a = AlbumEditFragment.A03(this.A00).A0J;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C50627MWo(c49519LuY, C05F.A0N)));
    }

    public C56337Ozy(AlbumEditFragment albumEditFragment) {
        this.A00 = albumEditFragment;
    }

    @Override // X.InterfaceC58167PqX
    public final void CqL() {
        AlbumEditFragment.A0G(this.A00, true, false);
    }

    @Override // X.InterfaceC58167PqX
    public final void DAm() {
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD;
        C9KJ c9kj;
        C9KW c9kw;
        C52254NAu c52254NAu = this.A00.A0D;
        if (c52254NAu != null && (textureViewSurfaceTextureListenerC56204OxD = c52254NAu.A0B) != null && (c9kj = textureViewSurfaceTextureListenerC56204OxD.A01) != null && (c9kw = c9kj.A08) != null) {
            c9kw.A0A();
        }
    }

    @Override // X.InterfaceC58167PqX
    public final void Dua() {
        AlbumEditFragment albumEditFragment = this.A00;
        C51172MjG c51172MjG = albumEditFragment.A0L;
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
        AlbumEditFragment.A0G(albumEditFragment, false, false);
    }

    @Override // X.InterfaceC58167PqX
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        C50723MaO A03 = AlbumEditFragment.A03(this.A00);
        C57171PZp.A03(audioOverlayTrack, A03, AbstractC141776au.A00(A03), 21);
    }
}
