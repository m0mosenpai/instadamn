package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Ozx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56336Ozx implements InterfaceC58146PqB {
    public final /* synthetic */ C50724MaP A00;
    public final /* synthetic */ InterfaceC09390do A01;

    @Override // X.InterfaceC58146PqB
    public final void CyE(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.InterfaceC58146PqB
    public final void Dqe(JIN jin) {
        C14360o3.A0B(jin, 0);
        ((L92) this.A01.getValue()).A00(jin);
    }

    public C56336Ozx(C50724MaP c50724MaP, InterfaceC09390do interfaceC09390do) {
        this.A01 = interfaceC09390do;
        this.A00 = c50724MaP;
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
        ((L92) this.A01.getValue()).A01(this.A00.A0W);
    }
}
