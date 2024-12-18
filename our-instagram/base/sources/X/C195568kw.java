package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195568kw extends AbstractC66412zI {
    public final C9BW A00;
    public final C193528hX A01;
    public final C8SF A02;
    public final UserSession A03;
    public final C195578kx A04;
    public final InterfaceC195388ke A05;
    public final InterfaceC16820sZ A06;

    public C195568kw(C9BW c9bw, C193528hX c193528hX, C8SF c8sf, UserSession userSession, InterfaceC195388ke interfaceC195388ke, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C195578kx c195578kx;
        C14360o3.A0B(c9bw, 2);
        this.A03 = userSession;
        this.A00 = c9bw;
        this.A05 = interfaceC195388ke;
        this.A02 = c8sf;
        this.A06 = interfaceC16820sZ;
        this.A01 = c193528hX;
        if (str != null) {
            c195578kx = new C195578kx(str);
        } else {
            c195578kx = null;
        }
        this.A04 = c195578kx;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int dimensionPixelSize;
        int i;
        int i2;
        int color;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        UserSession userSession = this.A03;
        C9BW c9bw = this.A00;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c9bw, 3);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        String A04 = AbstractC188868Yc.A04((Integer) ((C206279Bk) c9bw.A01).A05);
        c110964z8.A0F(R.id.background_color, A04);
        c110964z8.A0F(R.id.gallery_grid_item_thumbnail, A04);
        c110964z8.A0F(R.id.gallery_grid_item_selection_overlay, A04);
        c110964z8.A0G(constraintLayout);
        C206259Bi c206259Bi = (C206259Bi) c9bw.A00;
        C14360o3.A0B(constraintLayout, 0);
        C14360o3.A0B(c206259Bi, 2);
        Context context = constraintLayout.getContext();
        C14360o3.A07(context);
        Number number = (Number) c206259Bi.A03;
        Resources resources = context.getResources();
        C177907vP c177907vP = new C177907vP(context);
        int intValue = number.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                i = R.dimen.account_discovery_bottom_gap;
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            } else {
                throw new RuntimeException();
            }
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
            i = R.dimen.action_bar_item_spacing_right;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        c177907vP.A02 = dimensionPixelSize;
        c177907vP.A01 = dimensionPixelSize2;
        c177907vP.invalidateSelf();
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(c177907vP);
        C14360o3.A07(requireViewById);
        Resources resources2 = imageView.getContext().getResources();
        if (intValue != 1) {
            int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.abc_star_medium);
            AbstractC13880nE.A0g(imageView, dimensionPixelSize3);
            AbstractC13880nE.A0W(imageView, dimensionPixelSize3);
            i2 = R.dimen.abc_button_inset_vertical_material;
        } else {
            int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            AbstractC13880nE.A0g(imageView, dimensionPixelSize4);
            AbstractC13880nE.A0W(imageView, dimensionPixelSize4);
            i2 = R.dimen.abc_edit_text_inset_bottom_material;
        }
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(i2);
        imageView.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
        View requireViewById2 = constraintLayout.requireViewById(R.id.gallery_grid_item_label);
        C14360o3.A07(requireViewById2);
        IgTextView igTextView = (IgTextView) requireViewById2;
        int intValue2 = ((Number) c206259Bi.A02).intValue();
        if (intValue2 != 0) {
            if (intValue2 == 1) {
                Context context2 = igTextView.getContext();
                C14360o3.A07(context2);
                igTextView.setTextSize(AbstractC13880nE.A02(context2, igTextView.getResources().getDimension(R.dimen.button_text_size)));
                igTextView.setTypeface(null, 0);
                color = -1;
            } else {
                throw new RuntimeException();
            }
        } else {
            Context context3 = igTextView.getContext();
            C14360o3.A07(context3);
            igTextView.setTextSize(AbstractC13880nE.A02(context3, igTextView.getResources().getDimension(R.dimen.abc_text_size_menu_header_material)));
            igTextView.setTypeface(null, 1);
            color = context3.getColor(AbstractC53242c7.A0H(context3, R.attr.igds_color_secondary_text_on_media));
        }
        igTextView.setTextColor(color);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_calendar_header_stub), false, false);
        A01.EZv(C177927vR.A00);
        View requireViewById3 = constraintLayout.requireViewById(R.id.gallery_grid_item_selection_overlay);
        C14360o3.A07(requireViewById3);
        View requireViewById4 = constraintLayout.requireViewById(R.id.gallery_grid_item_bottom_container);
        C14360o3.A07(requireViewById4);
        final C177937vS c177937vS = new C177937vS(requireViewById3, requireViewById4, imageView, igTextView, AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_favorite_view_stub), false, false), AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_ml_data_stub), false, false), A01, AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_motion_photo_view_stub), false, false), AbstractC56372iV.A01(constraintLayout.requireViewById(R.id.gallery_grid_item_glasses_capture_view_stub), false, false), c177907vP);
        c177937vS.A09.EZv(new InterfaceC69513Al() { // from class: X.7vU
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                C14360o3.A0B(view, 0);
                C177937vS c177937vS2 = C177937vS.this;
                c177937vS2.A01 = (TextView) view.requireViewById(R.id.month_text);
                c177937vS2.A00 = (TextView) view.requireViewById(R.id.day_text);
            }
        });
        Number number2 = (Number) c206259Bi.A01;
        if (number2 != null && number2.intValue() == 24) {
            ((ImageView) c177937vS.A08.getView()).setImageResource(R.drawable.instagram_boomerang_pano_outline_24);
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View requireViewById5 = constraintLayout.requireViewById(R.id.gallery_grid_item_thumbnail);
        C14360o3.A07(requireViewById5);
        return new C177977vW(constraintLayout, c177937vS, new C177967vV(null, (IgImageView) requireViewById5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02be, code lost:
    
        if (r1.equals(true) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0238, code lost:
    
        if (r12.A00 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0230, code lost:
    
        if (r0 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x029a, code lost:
    
        if (r1 == null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fe  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r44, X.C3OO r45) {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195568kw.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C195598kz.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C177977vW c177977vW = (C177977vW) c3oo;
        if (c177977vW != null) {
            UserSession userSession = this.A03;
            C206279Bk c206279Bk = (C206279Bk) this.A00.A01;
            C193528hX c193528hX = this.A01;
            InterfaceC177947vT interfaceC177947vT = c177977vW.A02;
            C14360o3.A0C(interfaceC177947vT, "null cannot be cast to non-null type com.instagram.creation.capture.adapter.model.GalleryGridThumbnailOverlayViewHolder.GalleryGridMediaOverlayViewHolder");
            C177937vS c177937vS = (C177937vS) interfaceC177947vT;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(c206279Bk, 1);
            C14360o3.A0B(c177937vS, 4);
            C208429Kb.A01(c206279Bk, c193528hX, c177977vW);
            ConstraintLayout constraintLayout = c177977vW.A01;
            C57112jm A00 = AbstractC58982mw.A00(constraintLayout);
            if (A00 != null) {
                A00.A04(constraintLayout);
            }
            c177937vS.A0B.setVisibility(8);
        }
    }
}
