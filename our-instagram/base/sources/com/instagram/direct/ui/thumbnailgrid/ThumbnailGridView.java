package com.instagram.direct.ui.thumbnailgrid;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C3P9;
import X.EZQ;
import X.InterfaceC11380iw;
import X.JQ0;
import X.MNT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ThumbnailGridView extends LinearLayout {
    public MNT A00;
    public boolean A01;
    public final IgImageView[] A02;
    public final LinearLayout A03;
    public final LinearLayout A04;

    public final void setHorizontalGridDivider(Drawable drawable) {
        setShowDividers(2);
        setDividerDrawable(drawable);
    }

    public final void setThumbnailPreviews(List list, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            this.A04.setVisibility(0);
            LinearLayout linearLayout = this.A03;
            if (size <= 3) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
            }
            IgImageView[] igImageViewArr = this.A02;
            int length = igImageViewArr.length;
            for (IgImageView igImageView : igImageViewArr) {
                igImageView.setVisibility(4);
            }
            int min = Math.min(list.size(), length);
            for (int i = 0; i < min; i++) {
                ImageUrl imageUrl = (ImageUrl) list.get(i);
                if (imageUrl != null) {
                    igImageViewArr[i].setUrl(imageUrl, interfaceC11380iw);
                    igImageViewArr[i].setVisibility(0);
                }
            }
            return;
        }
        this.A04.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public final void setListener(MNT mnt) {
        this.A00 = mnt;
        if (mnt != null && !this.A01) {
            for (IgImageView igImageView : this.A02) {
                C3P9 A0s = AbstractC166987dD.A0s(igImageView);
                A0s.A04 = new EZQ(this, 4);
                A0s.A00();
            }
            this.A01 = true;
        }
    }

    public final void setThumbnailHeight(int i) {
        AbstractC13880nE.A0W(this.A04, i);
        AbstractC13880nE.A0W(this.A03, i);
    }

    public final void setVerticalGridDivider(Drawable drawable) {
        LinearLayout linearLayout = this.A04;
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(drawable);
        LinearLayout linearLayout2 = this.A03;
        linearLayout2.setShowDividers(2);
        linearLayout2.setDividerDrawable(drawable);
    }

    public /* synthetic */ ThumbnailGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.direct_thumbnail_grid, (ViewGroup) this, true);
        LinearLayout A0B = AbstractC31172DnG.A0B(this, R.id.top_image_row);
        this.A04 = A0B;
        LinearLayout A0B2 = AbstractC31172DnG.A0B(this, R.id.bottom_image_row);
        this.A03 = A0B2;
        this.A02 = new IgImageView[]{AbstractC31172DnG.A0a(A0B, R.id.image1), AbstractC31172DnG.A0a(A0B, R.id.image2), AbstractC31172DnG.A0a(A0B, R.id.image3), AbstractC31172DnG.A0a(A0B2, R.id.image4), AbstractC31172DnG.A0a(A0B2, R.id.image5), AbstractC31172DnG.A0a(A0B2, R.id.image6)};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setThumbnailPreviews(java.util.List r8, X.AnonymousClass791 r9, X.AnonymousClass791 r10, X.InterfaceC11380iw r11) {
        /*
            r7 = this;
            r6 = 3
            X.C14360o3.A0B(r11, r6)
            r2 = 8
            if (r8 == 0) goto L68
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L68
            int r1 = r8.size()
            r5 = 0
            android.widget.LinearLayout r0 = r7.A04
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r7.A03
            if (r1 > r6) goto L2e
            r0.setVisibility(r2)
        L1f:
            com.instagram.common.ui.widget.imageview.IgImageView[] r4 = r7.A02
            int r3 = r4.length
            r2 = 0
        L23:
            if (r2 >= r3) goto L32
            r1 = r4[r2]
            r0 = 4
            r1.setVisibility(r0)
            int r2 = r2 + 1
            goto L23
        L2e:
            r0.setVisibility(r5)
            goto L1f
        L32:
            int r0 = r8.size()
            int r3 = java.lang.Math.min(r0, r3)
            if (r3 > r6) goto L5f
            r0 = r4[r5]
            r0.A0I = r9
            if (r3 != r6) goto L47
            r0 = 2
        L43:
            r0 = r4[r0]
            r0.A0I = r10
        L47:
            r2 = 0
        L48:
            if (r2 >= r3) goto L72
            java.lang.Object r1 = r8.get(r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r1 == 0) goto L5c
            r0 = r4[r2]
            r0.setUrl(r1, r11)
            r0 = r4[r2]
            r0.setVisibility(r5)
        L5c:
            int r2 = r2 + 1
            goto L48
        L5f:
            r0 = r4[r6]
            r0.A0I = r9
            r0 = 6
            if (r3 != r0) goto L47
            r0 = 5
            goto L43
        L68:
            android.widget.LinearLayout r0 = r7.A04
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r7.A03
            r0.setVisibility(r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView.setThumbnailPreviews(java.util.List, X.791, X.791, X.0iw):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailGridView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
