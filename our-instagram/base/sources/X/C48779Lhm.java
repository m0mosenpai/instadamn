package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lhm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48779Lhm implements MRR {
    public final /* synthetic */ L2J A00;

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        return null;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
    }

    @Override // X.MRR
    public final void Cvn() {
    }

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void DQH() {
    }

    @Override // X.MRR
    public final void DUW(JIN jin) {
    }

    @Override // X.MRR
    public final void Dp9(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker, String str) {
    }

    @Override // X.MRR
    public final void DwN(String str) {
    }

    @Override // X.MRR
    public final void DwO(String str) {
    }

    @Override // X.MRR
    public final void Ekm() {
    }

    public C48779Lhm(L2J l2j) {
        this.A00 = l2j;
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        DirectAnimatedMedia directAnimatedMedia;
        GifUrlImpl gifUrlImpl;
        String str2;
        if (c45026JwH != null && (directAnimatedMedia = c45026JwH.A00) != null && (gifUrlImpl = directAnimatedMedia.A02) != null && (str2 = gifUrlImpl.A08) != null) {
            L2J l2j = this.A00;
            C121275eQ A03 = AbstractC50633MWu.A03(l2j.A00, l2j.A02, new OUQ(str2, "reels_green_screen_gif_background", true, false, false));
            C43922JbX.A01(A03, l2j, 0);
            C1GJ.A04(A03, -5);
        }
    }

    @Override // X.MRR
    public final void Dvf() {
        AbstractC167017dG.A0y(this.A00.A00, C3DN.A00);
    }
}
