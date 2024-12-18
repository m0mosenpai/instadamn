package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139586Tn {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public final InterfaceC56392iX A03;
    public final Integer A04;

    public C139586Tn(InterfaceC56392iX interfaceC56392iX, Integer num) {
        this.A04 = num;
        this.A03 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6To
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139586Tn c139586Tn = C139586Tn.this;
                View requireViewById = view.requireViewById(R.id.social_context_container);
                requireViewById.setTag(c139586Tn);
                c139586Tn.A00 = requireViewById;
                ImageView imageView = (ImageView) view.requireViewById(R.id.social_context_facepile);
                C14360o3.A0B(imageView, 0);
                c139586Tn.A01 = imageView;
                TextView textView = (TextView) view.requireViewById(R.id.social_context_text);
                C14360o3.A0B(textView, 0);
                c139586Tn.A02 = textView;
            }
        });
    }
}
