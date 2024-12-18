package X;

import android.app.Activity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lho, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48781Lho implements MRR {
    public final Activity A00;
    public final InterfaceC16620sF A01;

    @Override // X.MRR
    public final void Cvn() {
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
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

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        return null;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        DirectAnimatedMedia directAnimatedMedia;
        if (c45026JwH != null && (directAnimatedMedia = c45026JwH.A00) != null) {
            String str2 = directAnimatedMedia.A05;
            GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
            if (gifUrlImpl != null) {
                this.A01.invoke(str2, gifUrlImpl);
            }
        }
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    @Override // X.MRR
    public final void Dvf() {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    public C48781Lho(Activity activity, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = activity;
        this.A01 = interfaceC16620sF;
    }
}
