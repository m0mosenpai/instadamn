package X;

import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Ozw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56335Ozw implements InterfaceC58146PqB {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ InterfaceC09390do A01;

    @Override // X.InterfaceC58146PqB
    public final void CyE(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.InterfaceC58146PqB
    public final void Dqe(JIN jin) {
        C14360o3.A0B(jin, 0);
        ((L92) this.A01.getValue()).A00(jin);
    }

    public C56335Ozw(AlbumEditFragment albumEditFragment, InterfaceC09390do interfaceC09390do) {
        this.A01 = interfaceC09390do;
        this.A00 = albumEditFragment;
    }

    @Override // X.InterfaceC58146PqB
    public final void CyD(AudioOverlayTrack audioOverlayTrack) {
        JIN jin;
        L92 l92 = (L92) this.A01.getValue();
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            jin = AbstractC37963Gn5.A00(musicAssetModel);
        } else {
            jin = null;
        }
        l92.A00(jin);
    }

    @Override // X.InterfaceC58146PqB
    public final void E2O() {
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD;
        C9KJ c9kj;
        C9KW c9kw;
        AlbumEditFragment albumEditFragment = this.A00;
        C52254NAu c52254NAu = albumEditFragment.A0D;
        if (c52254NAu != null && (textureViewSurfaceTextureListenerC56204OxD = c52254NAu.A0B) != null && (c9kj = textureViewSurfaceTextureListenerC56204OxD.A01) != null && (c9kw = c9kj.A08) != null) {
            c9kw.A09();
        }
        ((L92) this.A01.getValue()).A01(albumEditFragment.A0R);
    }
}
