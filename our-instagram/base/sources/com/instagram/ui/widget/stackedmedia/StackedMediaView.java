package com.instagram.ui.widget.stackedmedia;

import X.AbstractC25228BEl;
import X.AbstractC81033jX;
import X.C14360o3;
import X.InterfaceC11380iw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class StackedMediaView extends FrameLayout {
    public IgImageView A00;
    public IgImageView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00();
    }

    private final void A00() {
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.stacked_media, (ViewGroup) this, true);
        this.A01 = (IgImageView) inflate.findViewById(R.id.media_front);
        this.A00 = (IgImageView) inflate.findViewById(R.id.media_back);
    }

    public final void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw) {
        if (!AbstractC81033jX.A03(imageUrl)) {
            IgImageView igImageView = this.A01;
            C14360o3.A0A(igImageView);
            C14360o3.A0A(imageUrl);
            C14360o3.A0A(interfaceC11380iw);
            igImageView.setUrl(imageUrl, interfaceC11380iw);
        } else {
            IgImageView igImageView2 = this.A01;
            C14360o3.A0A(igImageView2);
            igImageView2.A09();
        }
        boolean A03 = AbstractC81033jX.A03(imageUrl2);
        IgImageView igImageView3 = this.A00;
        if (!A03) {
            C14360o3.A0A(igImageView3);
            C14360o3.A0A(imageUrl2);
            C14360o3.A0A(interfaceC11380iw);
            igImageView3.setUrl(imageUrl2, interfaceC11380iw);
            return;
        }
        C14360o3.A0A(igImageView3);
        igImageView3.A09();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedMediaView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00();
    }
}
