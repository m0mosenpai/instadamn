package X;

import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.Oya, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56265Oya implements BDN {
    public final /* synthetic */ C52135N5j A00;

    @Override // X.BDN
    public final void DE2() {
    }

    public C56265Oya(C52135N5j c52135N5j) {
        this.A00 = c52135N5j;
    }

    @Override // X.BDN
    public final void DaT() {
        String str;
        C52135N5j c52135N5j = this.A00;
        if (c52135N5j.A06 != null) {
            LoadingSpinnerView loadingSpinnerView = c52135N5j.A0K;
            if (loadingSpinnerView == null) {
                str = "spinner";
            } else {
                loadingSpinnerView.setLoadingStatus(MY0.A03);
                MSY.A0x(c52135N5j.A06);
                IgImageView igImageView = c52135N5j.A0A;
                if (igImageView == null) {
                    str = "loadingThumbnailImageView";
                } else {
                    igImageView.setVisibility(8);
                    ViewGroup viewGroup = c52135N5j.A08;
                    if (viewGroup == null) {
                        str = "clipsReviewContainer";
                    } else {
                        viewGroup.postOnAnimation(c52135N5j.A0U);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("TextureView should always exist while showing");
    }

    @Override // X.BDN
    public final void onCompletion() {
        C52135N5j c52135N5j = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.seekTo(c52135N5j.A01);
            InterfaceC58267PsB interfaceC58267PsB2 = c52135N5j.A0E;
            if (interfaceC58267PsB2 != null) {
                interfaceC58267PsB2.start();
            }
        }
    }
}
