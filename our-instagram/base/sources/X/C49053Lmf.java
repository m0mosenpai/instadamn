package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Lmf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49053Lmf implements InterfaceC50467MPv {
    public final /* synthetic */ IgImageView A00;
    public final /* synthetic */ C158677Ad A01;
    public final /* synthetic */ C158697Af A02;

    @Override // X.InterfaceC50467MPv
    public final void D6W(String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A02.A00 = null;
        IgImageView igImageView = this.A00;
        igImageView.setUrl(new ExtendedImageUrl(str, igImageView.getWidth(), igImageView.getHeight()), this.A01.A01);
    }

    @Override // X.InterfaceC50467MPv
    public final void onError(String str) {
    }

    public C49053Lmf(IgImageView igImageView, C158677Ad c158677Ad, C158697Af c158697Af) {
        this.A02 = c158697Af;
        this.A00 = igImageView;
        this.A01 = c158677Ad;
    }
}
