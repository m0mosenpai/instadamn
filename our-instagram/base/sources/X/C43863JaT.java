package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JaT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43863JaT extends AbstractC66422zJ {
    public final C206279Bk A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;

    public C43863JaT(C206279Bk c206279Bk, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(c206279Bk, 1);
        this.A00 = c206279Bk;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        C177967vV A00 = C206019Ah.A00(AbstractC37302Gc3.A0K(constraintLayout, R.id.gallery_picker_grid_item_background));
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44739JrM(constraintLayout, new C44297Jho((GalleryPickerMediaOverlayView) AbstractC166987dD.A0c(constraintLayout, R.id.gallery_picker_item_overlay)), A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        Bitmap bitmap;
        String str2;
        C48308LZh c48308LZh = (C48308LZh) interfaceC66482zP;
        C44739JrM c44739JrM = (C44739JrM) c3oo;
        AbstractC167017dG.A1N(c48308LZh, c44739JrM);
        C47533Kz0 c47533Kz0 = new C47533Kz0(this, c48308LZh);
        C206279Bk c206279Bk = this.A00;
        C14360o3.A0B(c206279Bk, 2);
        GalleryItem galleryItem = c48308LZh.A01;
        C195858lV c195858lV = c44739JrM.A02;
        String str3 = null;
        if (c195858lV != null) {
            str = c195858lV.A02;
        } else {
            str = null;
        }
        C195858lV c195858lV2 = galleryItem.A05;
        if (c195858lV2 != null) {
            str3 = c195858lV2.A02;
        }
        boolean z = !C14360o3.A0K(str, str3);
        if (c195858lV2 != null) {
            c44739JrM.A02 = c195858lV2;
        }
        ConstraintLayout constraintLayout = c44739JrM.A03;
        ViewOnClickListenerC48068LPt.A00(constraintLayout, c44739JrM, c47533Kz0, c48308LZh, 3);
        constraintLayout.setOnLongClickListener(new LQE(0, c47533Kz0, c44739JrM));
        C9BB c9bb = c48308LZh.A00;
        if (c195858lV2 != null) {
            LFL lfl = LFL.A00;
            C177967vV c177967vV = c44739JrM.A05;
            C44297Jho c44297Jho = c44739JrM.A04;
            if (c195858lV2.A03) {
                bitmap = c44739JrM.A00;
                if (bitmap == null) {
                    bitmap = BitmapFactory.decodeResource(c44297Jho.A00.getResources(), R.drawable.filled_grid_album_icon);
                    if (bitmap != null) {
                        c44739JrM.A00 = bitmap;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            } else {
                bitmap = null;
            }
            if (c195858lV2.A04) {
                int i = c195858lV2.A00;
                if (i > 0) {
                    str2 = AbstractC189358aC.A01(i);
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            lfl.A00(bitmap, constraintLayout, c9bb, c206279Bk, galleryItem, c44297Jho, c177967vV, str2, z, false);
            ImageUrl imageUrl = c195858lV2.A01;
            if (imageUrl != null) {
                C23597Acr c23597Acr = new C23597Acr(4, c206279Bk, c44739JrM);
                c44739JrM.A01 = c23597Acr;
                C1OG A0J = C25821No.A00().A0J(imageUrl, null);
                A0J.A0I = false;
                A0J.A02(c23597Acr);
                A0J.A01();
            }
            c44297Jho.A00.invalidate();
            constraintLayout.invalidate();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48308LZh.class;
    }
}
