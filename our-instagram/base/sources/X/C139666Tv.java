package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139666Tv {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public IgImageView A08;
    public final InterfaceC56392iX A09;

    public C139666Tv(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A09 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6Tw
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139666Tv c139666Tv = C139666Tv.this;
                View requireViewById = view.requireViewById(R.id.lead_gen_card_container);
                C14360o3.A0B(requireViewById, 0);
                c139666Tv.A01 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.lead_gen_card);
                C14360o3.A0B(requireViewById2, 0);
                c139666Tv.A00 = requireViewById2;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.lead_gen_card_image_background);
                C14360o3.A0B(igImageView, 0);
                c139666Tv.A08 = igImageView;
                View requireViewById3 = view.requireViewById(R.id.lead_gen_card_dimmer_overlay);
                C14360o3.A0B(requireViewById3, 0);
                c139666Tv.A02 = requireViewById3;
                TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle);
                C14360o3.A0B(textView, 0);
                c139666Tv.A07 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle_enlarged);
                C14360o3.A0B(textView2, 0);
                c139666Tv.A06 = textView2;
                TextView textView3 = (TextView) view.requireViewById(R.id.lead_gen_card_info);
                C14360o3.A0B(textView3, 0);
                c139666Tv.A05 = textView3;
                View requireViewById4 = view.requireViewById(R.id.lead_gen_card_divider);
                C14360o3.A0B(requireViewById4, 0);
                c139666Tv.A03 = requireViewById4;
                TextView textView4 = (TextView) view.requireViewById(R.id.lead_gen_card_cta_text);
                C14360o3.A0B(textView4, 0);
                c139666Tv.A04 = textView4;
            }
        });
    }

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("cardView");
        throw C00O.createAndThrow();
    }
}
