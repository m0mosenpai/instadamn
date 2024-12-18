package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6Tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139626Tr {
    public final ViewGroup A00;
    public final IgFrameLayout A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final MediaFrameLayout A0A;

    public C139626Tr(ViewGroup viewGroup, IgFrameLayout igFrameLayout, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2, MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(mediaFrameLayout, 2);
        C14360o3.A0B(igFrameLayout, 5);
        this.A00 = viewGroup;
        this.A0A = mediaFrameLayout;
        this.A06 = interfaceC56392iX;
        this.A04 = interfaceC56392iX2;
        this.A01 = igFrameLayout;
        this.A03 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.caption_text_view_stub), false, false);
        this.A02 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.auto_translated_label_view_stub), false, false);
        this.A05 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.headline_text_view_stub), false, false);
        this.A07 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.product_sticker_view_stub), false, false);
        this.A08 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.smart_caption_text_view_stub), false, false);
        this.A09 = AbstractC56372iV.A01(igFrameLayout.requireViewById(R.id.systematic_caption_text_view_stub), false, false);
    }
}
