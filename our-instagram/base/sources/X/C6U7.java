package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6U7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U7 {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public IgImageView A05;
    public final InterfaceC56392iX A06;

    public C6U7(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A06 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6U8
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6U7 c6u7 = C6U7.this;
                View requireViewById = view.requireViewById(R.id.ctwa_story_messaging_card_container);
                C14360o3.A0B(requireViewById, 0);
                c6u7.A01 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.ctwa_story_messaging_card);
                C14360o3.A0B(requireViewById2, 0);
                c6u7.A00 = requireViewById2;
                View requireViewById3 = view.requireViewById(R.id.ctwa_story_messaging_card_dimmer_overlay);
                C14360o3.A0B(requireViewById3, 0);
                c6u7.A02 = requireViewById3;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.ctwa_story_messaging_card_image_background);
                C14360o3.A0B(igImageView, 0);
                c6u7.A05 = igImageView;
                TextView textView = (TextView) view.requireViewById(R.id.ctwa_story_messaging_card_info);
                C14360o3.A0B(textView, 0);
                c6u7.A04 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.ctwa_story_messaging_card_cta_text);
                C14360o3.A0B(textView2, 0);
                c6u7.A03 = textView2;
            }
        });
    }
}
