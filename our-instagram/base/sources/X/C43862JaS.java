package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JaS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43862JaS extends AbstractC66422zJ {
    public final C206279Bk A00;
    public final UserSession A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16620sF A05;

    public C43862JaS(C206279Bk c206279Bk, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(c206279Bk, 2);
        this.A01 = userSession;
        this.A00 = c206279Bk;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A05 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ3;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.gallery_remote_media, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC166997dE.A0S(inflate, R.id.gallery_picker_grid_item_container);
        C177967vV A00 = C206019Ah.A00(AbstractC37302Gc3.A0K(constraintLayout, R.id.gallery_picker_grid_item_background));
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44749JrW(inflate, constraintLayout, (ShimmerFrameLayout) AbstractC166997dE.A0S(inflate, R.id.gallery_remote_media_shimmer), new C44297Jho((GalleryPickerMediaOverlayView) AbstractC166987dD.A0c(constraintLayout, R.id.gallery_picker_item_overlay)), A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EnumC44309Ji0 enumC44309Ji0;
        int i;
        C48307LZg c48307LZg = (C48307LZg) interfaceC66482zP;
        C44749JrW c44749JrW = (C44749JrW) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c48307LZg, c44749JrW);
        C47534Kz1 c47534Kz1 = new C47534Kz1(this, c48307LZg);
        C206279Bk c206279Bk = this.A00;
        UserSession userSession = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        C30192DRx c30192DRx = new C30192DRx(this, 16);
        int A07 = AbstractC25230BEn.A07(2, c206279Bk, userSession);
        View view = c44749JrW.A04;
        GalleryItem galleryItem = c48307LZg.A01;
        C44297Jho c44297Jho = c44749JrW.A07;
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = c44297Jho.A00;
        if (WGT.A07(userSession, LIK.A00(galleryItem))) {
            enumC44309Ji0 = EnumC44309Ji0.A03;
        } else {
            enumC44309Ji0 = EnumC44309Ji0.A02;
        }
        int ordinal = enumC44309Ji0.ordinal();
        int i2 = R.drawable.instagram_app_icloud_pano_outline_24;
        if (ordinal != 0) {
            i2 = R.drawable.instagram_app_icloud_warning_pano_outline_24;
        }
        Integer valueOf = Integer.valueOf(i2);
        String str = null;
        if (valueOf == null) {
            galleryPickerMediaOverlayView.A01 = null;
        } else {
            Drawable drawable = galleryPickerMediaOverlayView.getContext().getDrawable(valueOf.intValue());
            JQ0.A0w(drawable, galleryPickerMediaOverlayView);
            galleryPickerMediaOverlayView.A01 = drawable;
        }
        C0fQ.A00(new LPM(2, c44749JrW, c47534Kz1, view, c48307LZg), view);
        view.setOnLongClickListener(new LQH(0, view, c44749JrW, c47534Kz1));
        C9BB c9bb = c48307LZg.A00;
        boolean z = c48307LZg.A02.A06;
        c44749JrW.A00 = new C43888Jav(c30192DRx, A1a ? 1 : 0);
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            RemoteMedia remoteMedia2 = c44749JrW.A02;
            String str2 = null;
            if (remoteMedia2 != null) {
                str = remoteMedia2.A06;
            }
            String str3 = remoteMedia.A06;
            boolean z2 = !C14360o3.A0K(str, str3);
            c44749JrW.A02 = remoteMedia;
            LFL lfl = LFL.A00;
            ConstraintLayout constraintLayout = c44749JrW.A05;
            C177967vV c177967vV = c44749JrW.A08;
            if (remoteMedia.A09 && (i = remoteMedia.A01) > 0) {
                str2 = AbstractC189358aC.A01(i);
            }
            if (lfl.A00(null, constraintLayout, c9bb, c206279Bk, galleryItem, c44297Jho, c177967vV, str2, z2, z)) {
                c44749JrW.A03 = A1a;
                c44749JrW.A06.A06(A1a);
                C1NJ c1nj = c44749JrW.A01;
                if (c1nj == null) {
                    c1nj = new C23597Acr(A07, c206279Bk, c44749JrW);
                }
                c44749JrW.A01 = c1nj;
                C1OG A0J = C25821No.A00().A0J(remoteMedia.A03, null);
                A0J.A0I = false;
                A0J.A0L = A1a;
                A0J.A08 = str3;
                A0J.A02(c1nj);
                A0J.A01();
            }
            galleryPickerMediaOverlayView.invalidate();
            constraintLayout.invalidate();
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(str3);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48307LZg.class;
    }
}
