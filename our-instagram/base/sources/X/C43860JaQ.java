package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JaQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43860JaQ extends AbstractC66422zJ {
    public final C206279Bk A00;
    public final C189038Yt A01;
    public final UserSession A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public C43860JaQ(C206279Bk c206279Bk, C189038Yt c189038Yt, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(c206279Bk, 2);
        this.A02 = userSession;
        this.A00 = c206279Bk;
        this.A01 = c189038Yt;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        IgImageView A0K = AbstractC37302Gc3.A0K(constraintLayout, R.id.gallery_picker_grid_item_background);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44738JrL(constraintLayout, new C44297Jho((GalleryPickerMediaOverlayView) AbstractC166987dD.A0c(constraintLayout, R.id.gallery_picker_item_overlay)), C206019Ah.A00(A0K));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        Bitmap bitmap;
        int i;
        C48306LZf c48306LZf = (C48306LZf) interfaceC66482zP;
        C44738JrL c44738JrL = (C44738JrL) c3oo;
        AbstractC167017dG.A1N(c48306LZf, c44738JrL);
        C47532Kyz c47532Kyz = new C47532Kyz(this, c48306LZf);
        C206279Bk c206279Bk = this.A00;
        C189038Yt c189038Yt = this.A01;
        if (c189038Yt != null) {
            UserSession userSession = this.A02;
            AbstractC167007dF.A1G(c206279Bk, 2, userSession);
            ConstraintLayout constraintLayout = c44738JrL.A03;
            GalleryItem galleryItem = c48306LZf.A01;
            Draft draft = galleryItem.A02;
            if (draft != null) {
                Draft draft2 = c44738JrL.A01;
                if (draft2 != null) {
                    str = draft2.A04;
                } else {
                    str = null;
                }
                boolean A0K = C14360o3.A0K(str, draft.A04);
                boolean z = true;
                boolean z2 = !A0K;
                c44738JrL.A01 = draft;
                C0fQ.A00(new ViewOnClickListenerC55425Oja(0, constraintLayout, c44738JrL, galleryItem, userSession, c47532Kyz, c48306LZf), constraintLayout);
                constraintLayout.setOnLongClickListener(new ViewOnLongClickListenerC55479OkY(1, c44738JrL, constraintLayout, c47532Kyz));
                C9BB c9bb = c48306LZf.A00;
                boolean z3 = c48306LZf.A02.A06;
                LFL lfl = LFL.A00;
                C177967vV c177967vV = c44738JrL.A05;
                C44297Jho c44297Jho = c44738JrL.A04;
                String str2 = null;
                if (draft.A05) {
                    bitmap = c44738JrL.A00;
                    if (bitmap == null) {
                        bitmap = BitmapFactory.decodeResource(c44297Jho.A00.getResources(), R.drawable.filled_grid_album_icon);
                        if (bitmap != null) {
                            c44738JrL.A00 = bitmap;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else {
                    bitmap = null;
                }
                if (draft.A06 && (i = draft.A00) > 0) {
                    str2 = AbstractC189358aC.A01(i);
                }
                lfl.A00(bitmap, constraintLayout, c9bb, c206279Bk, galleryItem, c44297Jho, c177967vV, str2, z2, z3);
                C48279LYc c48279LYc = new C48279LYc(c206279Bk, c44738JrL);
                c44738JrL.A02 = c48279LYc;
                c189038Yt.A02.ATO(new C217099j4(draft, c189038Yt, AbstractC25225BEi.A16(c48279LYc)));
                c44297Jho.A00.invalidate();
                constraintLayout.invalidate();
                if (z3 && !draft.A08) {
                    z = false;
                }
                constraintLayout.setEnabled(z);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48306LZf.class;
    }
}
