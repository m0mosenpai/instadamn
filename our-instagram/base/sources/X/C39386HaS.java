package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;

/* renamed from: X.HaS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39386HaS extends AbstractC50789Mc6 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ProductTagView";
    public PointF A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TightTextView A04;
    public C38321qM A05;
    public ImageInfo A06;
    public ImageInfo A07;
    public boolean A08;
    public String A09;
    public final C120435cm A0A;
    public final UserSession A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final C25671My A0E;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "product_tag_view";
    }

    public FrameLayout.LayoutParams getThumbnailParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        Context context = getContext();
        ((ViewGroup.LayoutParams) layoutParams).height = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        ((ViewGroup.LayoutParams) layoutParams).width = AbstractC166997dE.A04(context, R.dimen.abc_dropdownitem_icon_width);
        return layoutParams;
    }

    public C39386HaS(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, ImageInfo imageInfo, ImageInfo imageInfo2, Boolean bool, Boolean bool2, boolean z) {
        super(context);
        int i;
        OXO oxo;
        String str;
        this.A0E = AbstractC25651Mw.A00(userSession);
        this.A0B = userSession;
        this.A05 = c38321qM;
        this.A08 = z;
        this.A00 = pointF;
        this.A0A = new C120435cm(userSession);
        this.A0C = bool;
        this.A0D = bool2;
        this.A06 = imageInfo;
        this.A07 = imageInfo2;
        Context context2 = getContext();
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A01 = frameLayout;
        UserSession userSession2 = this.A0B;
        AbstractC41736Ie8.A00(frameLayout, userSession2, this.A05, Boolean.valueOf(this.A08));
        ImageInfo imageInfo3 = this.A06;
        if (imageInfo3 != null) {
            int A0A = AbstractC167017dG.A0A(context2);
            this.A01.setPadding(A0A, A0A, A0A, A0A);
        }
        this.A04 = new TightTextView(context2);
        if (imageInfo3 != null) {
            i = AbstractC167017dG.A09(context2) + AbstractC167017dG.A05(context2);
        } else {
            i = 0;
        }
        AbstractC41736Ie8.A03(this.A04, this.A01.getPaddingLeft() + (i / 2), this.A0C.booleanValue());
        ImageView imageView = new ImageView(context2);
        this.A03 = imageView;
        AbstractC41736Ie8.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A02 = imageView2;
        AbstractC41736Ie8.A01(imageView2, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        this.A01.addView(this.A04, layoutParams);
        if (imageInfo3 != null) {
            RoundedCornerImageView A00 = A00(imageInfo3);
            ImageInfo imageInfo4 = this.A07;
            if (imageInfo4 != null) {
                RoundedCornerImageView A002 = A00(imageInfo4);
                A002.setStrokeColor(AbstractC167007dF.A09(context2, R.attr.igds_color_photo_border));
                A00.setId(1001);
                A002.setId(1002);
                C56302iJ stackedThumbnailParams = getStackedThumbnailParams();
                C56302iJ stackedThumbnailParams2 = getStackedThumbnailParams();
                ConstraintLayout constraintLayout = new ConstraintLayout(context2);
                constraintLayout.setId(1000);
                int A09 = AbstractC167017dG.A09(context2);
                constraintLayout.setLayoutParams(new C56302iJ(A09, A09));
                constraintLayout.addView(A002, stackedThumbnailParams2);
                constraintLayout.addView(A00, stackedThumbnailParams);
                this.A01.addView(constraintLayout);
                C110964z8 c110964z8 = new C110964z8();
                int A04 = AbstractC167017dG.A04(context2);
                c110964z8.A0I(constraintLayout);
                c110964z8.A0D(A002.getId(), 1, constraintLayout.getId(), 1);
                c110964z8.A0D(A002.getId(), 3, constraintLayout.getId(), 3);
                c110964z8.A0E(A00.getId(), 1, constraintLayout.getId(), 1, A04);
                c110964z8.A0E(A00.getId(), 3, constraintLayout.getId(), 3, A04);
                c110964z8.A0G(constraintLayout);
            } else {
                this.A01.addView(A00, getThumbnailParams());
            }
        }
        this.A0A.A00(context2);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        addView(this.A01, layoutParams2);
        if (this.A0D.booleanValue()) {
            PointF pointF2 = new PointF(0.0f, 1.0f);
            int A0A2 = AbstractC167017dG.A0A(context2);
            oxo = new OXO(pointF2, this.A01, this.A03, this.A02, this.A04, userSession2, this.A05, this, A0A2, A0A2, false);
        } else {
            addView(this.A03, layoutParams2);
            addView(this.A02, layoutParams2);
            ViewGroup viewGroup = this.A01;
            TightTextView tightTextView = this.A04;
            oxo = new OXO(this.A00, viewGroup, this.A03, this.A02, tightTextView, userSession2, this.A05, this, 0, 0, false);
        }
        super.A02 = oxo;
        if (C18U.A06(C06090Tz.A05, userSession2, 36314850430815088L)) {
            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) getTag();
            EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0Q;
            if (tag != null) {
                str = tag.getId();
            } else {
                str = null;
            }
            C71313Hs.A00(userSession2).A08(this, new C71353Hw(null, enumC71343Hv, null, str));
        }
    }

    @Override // X.AbstractC50789Mc6
    public CharSequence getText() {
        return this.A04.getText();
    }

    @Override // X.AbstractC50789Mc6
    public C57482kN getTextLayoutParams() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TightTextView tightTextView = this.A04;
        return AbstractC37303Gc4.A0C(alignment, tightTextView.getPaint(), tightTextView, tightTextView.getMaxWidth());
    }

    @Override // X.AbstractC50789Mc6
    public int getTextLineHeight() {
        return this.A04.getLineHeight();
    }

    private RoundedCornerImageView A00(ImageInfo imageInfo) {
        Context context = getContext();
        RoundedCornerImageView roundedCornerImageView = new RoundedCornerImageView(context);
        roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedCornerImageView.setStrokeEnabled(true);
        roundedCornerImageView.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top));
        roundedCornerImageView.setRadius(AbstractC167017dG.A04(context));
        roundedCornerImageView.setStrokeColor(context.getColor(R.color.bright_foreground_disabled_material_dark));
        ExtendedImageUrl A03 = AbstractC40161tk.A03(imageInfo, C05F.A0C);
        if (A03 != null) {
            roundedCornerImageView.setUrl(A03, this);
            roundedCornerImageView.setVisibility(0);
        }
        return roundedCornerImageView;
    }

    public C56302iJ getStackedThumbnailParams() {
        int dimensionPixelSize = AbstractC25228BEl.A0M(this).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        return new C56302iJ(dimensionPixelSize, dimensionPixelSize);
    }

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        return ((com.instagram.tagging.model.Tag) AbstractC31172DnG.A0x(this)).getId();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        String str2;
        int A05 = C0f9.A05(1407789811);
        if (motionEvent.getAction() == 1) {
            ProductTag productTag = (ProductTag) AbstractC31172DnG.A0x(this);
            C38321qM media = getMedia();
            media.getClass();
            if (this.A07 != null) {
                C25671My c25671My = this.A0E;
                int i = super.A00;
                Product A00 = AbstractC38048Gob.A00(productTag);
                String str3 = this.A09;
                C75113Zb c75113Zb = super.A01;
                if (c75113Zb != null) {
                    str2 = c75113Zb.A1V;
                } else {
                    str2 = null;
                }
                c25671My.E4s(new C72303Md(media, A00, true, str3, str2, i));
            } else {
                C75113Zb c75113Zb2 = super.A01;
                if (c75113Zb2 != null) {
                    c75113Zb2.A07(super.A00, -1).A04 = true;
                }
                ILZ ilz = new ILZ(EnumC71343Hv.A0Q);
                ilz.A02 = productTag.getId();
                C71313Hs.A00(this.A0B).A09(this, ilz.A00(), new String[0], 1);
                C25671My c25671My2 = this.A0E;
                int i2 = super.A00;
                Product A002 = AbstractC38048Gob.A00(productTag);
                String str4 = this.A09;
                C75113Zb c75113Zb3 = super.A01;
                if (c75113Zb3 != null) {
                    str = c75113Zb3.A1V;
                } else {
                    str = null;
                }
                c25671My2.E4s(new C72303Md(media, A002, false, str4, str, i2));
            }
            UserSession userSession = this.A0B;
            if (IBO.A00.A02(userSession, media)) {
                C3MG.A00();
                C3MF.A00(getContext(), userSession, media.A1g(userSession), new JGP() { // from class: X.Ix3
                    @Override // X.JGP
                    public final void Dwz() {
                    }
                }, "tags");
            } else {
                C3MF.A05.put(media.A1g(userSession).A2u(), null);
            }
        }
        C0f9.A0C(-279989494, A05);
        return true;
    }

    public void setPriorModule(String str) {
        this.A09 = str;
    }
}
