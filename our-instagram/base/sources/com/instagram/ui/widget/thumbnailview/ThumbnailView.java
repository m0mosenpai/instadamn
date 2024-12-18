package com.instagram.ui.widget.thumbnailview;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC46674Kkr;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AnonymousClass001;
import X.C0w9;
import X.C38321qM;
import X.C57012jc;
import X.C70833Whq;
import X.InterfaceC11380iw;
import X.VEK;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class ThumbnailView extends FrameLayout {
    public View A00;
    public C57012jc A01;
    public RoundedCornerMediaFrameLayout A02;
    public List A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C57012jc A08;
    public C57012jc A09;
    public C57012jc A0A;
    public VEK A0B;

    private void setGridOnInflateListener(C57012jc c57012jc) {
        c57012jc.A02 = new C70833Whq(this, 3);
    }

    private void A00() {
        int i;
        if (this.A03 != null) {
            int i2 = this.A05;
            VEK vek = this.A0B;
            if (vek == VEK.A04) {
                i = (i2 * 2) + this.A04;
            } else if (vek == VEK.A05) {
                i = i2;
                i2 = (i2 * 2) + this.A04;
            } else {
                i = i2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setLayoutParams(layoutParams);
            }
        }
    }

    private void A01() {
        this.A01.A02();
        List<IgImageView> list = this.A03;
        if (list != null) {
            for (IgImageView igImageView : list) {
                igImageView.setImageDrawable(null);
                igImageView.A0E = null;
                igImageView.A0D = null;
            }
        }
        A04(this);
        getGridHolder().A03(0);
    }

    public static void A04(ThumbnailView thumbnailView) {
        thumbnailView.A08.A02();
        thumbnailView.A09.A02();
        thumbnailView.A0A.A02();
        thumbnailView.A01.A02();
        View view = thumbnailView.A00;
        if (view != null) {
            thumbnailView.A02.removeView(view);
            thumbnailView.A00 = null;
        }
    }

    private C57012jc getGridHolder() {
        int ordinal = this.A0B.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return this.A08;
            }
            return this.A09;
        }
        return this.A0A;
    }

    public void setupGrid(ViewGroup viewGroup) {
        this.A03 = new ArrayList();
        for (int i : this.A0B.A01) {
            RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) viewGroup.requireViewById(i);
            roundedCornerImageView.setStrokeColor(this.A06);
            roundedCornerImageView.setStrokeWidth(this.A07);
            this.A03.add(roundedCornerImageView);
        }
        A00();
    }

    public void setGridLayout(VEK vek) {
        boolean A1a = AbstractC25229BEm.A1a(vek, this.A0B);
        this.A0B = vek;
        if (A1a) {
            setupGrid((ViewGroup) getGridHolder().A01());
        }
    }

    public ThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = VEK.A03;
        A02(attributeSet);
    }

    private void A02(AttributeSet attributeSet) {
        VEK vek;
        Context context = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context).inflate(R.layout.thumbnail_view_layout, this).requireViewById(R.id.container);
        this.A02 = roundedCornerMediaFrameLayout;
        this.A01 = AbstractC31177DnL.A0V(roundedCornerMediaFrameLayout, R.id.single_thumbnail_stub);
        C57012jc A0V = AbstractC31177DnL.A0V(this.A02, R.id.two_by_two_thumbnail_stub);
        this.A08 = A0V;
        setGridOnInflateListener(A0V);
        C57012jc A0V2 = AbstractC31177DnL.A0V(this.A02, R.id.two_rows_one_column_thumbnail_stub);
        this.A0A = A0V2;
        setGridOnInflateListener(A0V2);
        C57012jc A0V3 = AbstractC31177DnL.A0V(this.A02, R.id.two_columns_one_row_thumbnail_stub);
        this.A09 = A0V3;
        setGridOnInflateListener(A0V3);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2I);
            if (obtainStyledAttributes.hasValue(2)) {
                int i = obtainStyledAttributes.getInt(2, 0);
                VEK[] values = VEK.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        vek = values[i2];
                        if (vek.A00 == i) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        C0w9.A03("ThumbnailView_GridLayout", AnonymousClass001.A0O("Unexpected grid layout index: ", i));
                        vek = VEK.A03;
                        break;
                    }
                }
                this.A0B = vek;
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A02.setRadius(obtainStyledAttributes.getDimensionPixelOffset(0, AbstractC167017dG.A06(context)));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, AbstractC166997dE.A04(context, R.dimen.account_recs_header_image_margin));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A06 = obtainStyledAttributes.getColor(3, AbstractC53242c7.A0F(context, R.attr.strokeColor));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void setImageForMedia(ImageUrl imageUrl, IgImageView igImageView, InterfaceC11380iw interfaceC11380iw) {
        AbstractC31173DnH.A11(igImageView.getContext(), igImageView, R.color.fds_transparent);
        igImageView.setUrl(imageUrl, interfaceC11380iw);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int A00 = AbstractC46674Kkr.A00(i, i2);
        this.A05 = (View.MeasureSpec.getSize(A00) - this.A04) / 2;
        A00();
        super.onMeasure(A00, A00);
    }

    public void setCustomView(View view) {
        A04(this);
        this.A02.addView(view);
        this.A00 = view;
    }

    public void setGridImages(List list, InterfaceC11380iw interfaceC11380iw) {
        A01();
        this.A03.getClass();
        int min = Math.min(list.size(), this.A03.size());
        for (int i = 0; i < min; i++) {
            IgImageView igImageView = (IgImageView) this.A03.get(i);
            igImageView.setUrl((ImageUrl) list.get(i), interfaceC11380iw);
            AbstractC31173DnH.A11(igImageView.getContext(), igImageView, R.color.thumbnail_tint);
        }
    }

    public void setGridImagesFromMedia(Context context, InterfaceC11380iw interfaceC11380iw, List list) {
        A01();
        this.A03.getClass();
        int min = Math.min(list.size(), this.A03.size());
        for (int i = 0; i < min; i++) {
            ExtendedImageUrl A1q = ((C38321qM) list.get(i)).A1q(context);
            A1q.getClass();
            setImageForMedia(A1q, (IgImageView) this.A03.get(i), interfaceC11380iw);
        }
    }

    public void setSingleImageFromMedia(C38321qM c38321qM, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        A04(this);
        this.A01.A03(0);
        IgImageView igImageView = (IgImageView) this.A01.A01();
        if (c38321qM != null) {
            setImageForMedia(imageUrl, igImageView, interfaceC11380iw);
        } else {
            igImageView.setUrl(imageUrl, interfaceC11380iw);
        }
    }

    public void setSingleImageFromUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        A04(this);
        this.A01.A03(0);
        ((IgImageView) this.A01.A01()).setUrl(imageUrl, interfaceC11380iw);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = VEK.A03;
        A02(attributeSet);
    }

    public ThumbnailView(Context context) {
        super(context);
        this.A0B = VEK.A03;
        A02(null);
    }
}
