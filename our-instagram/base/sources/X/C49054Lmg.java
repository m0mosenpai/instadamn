package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Lmg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49054Lmg implements InterfaceC50467MPv {
    public final /* synthetic */ ConstrainedImageView A00;
    public final /* synthetic */ C49130Lo9 A01;
    public final /* synthetic */ C49148LoR A02;

    @Override // X.InterfaceC50467MPv
    public final void D6W(String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A02.A00 = null;
        ConstrainedImageView constrainedImageView = this.A00;
        constrainedImageView.setUrl(new ExtendedImageUrl(str, constrainedImageView.getWidth(), constrainedImageView.getHeight()), this.A01.A00);
    }

    public C49054Lmg(ConstrainedImageView constrainedImageView, C49130Lo9 c49130Lo9, C49148LoR c49148LoR) {
        this.A02 = c49148LoR;
        this.A00 = constrainedImageView;
        this.A01 = c49130Lo9;
    }

    @Override // X.InterfaceC50467MPv
    public final void onError(String str) {
        C0w9.A03("StickerReactionContentDefinition", "Error while fetching avatar sticker from Instamadillo media store");
    }
}
