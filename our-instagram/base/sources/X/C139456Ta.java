package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6Ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139456Ta {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public final InterfaceC56392iX A04;
    public final Integer A05;

    public C139456Ta(InterfaceC56392iX interfaceC56392iX, Integer num) {
        this.A05 = num;
        this.A04 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Tb
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                TextView textView;
                C14360o3.A0B(view, 0);
                C139456Ta c139456Ta = C139456Ta.this;
                View requireViewById = view.requireViewById(R.id.popularity_proof_container);
                C14360o3.A0B(requireViewById, 0);
                c139456Ta.A00 = requireViewById;
                ImageView imageView = (ImageView) view.requireViewById(R.id.popularity_proof_icon);
                C14360o3.A0B(imageView, 0);
                c139456Ta.A01 = imageView;
                TextView textView2 = (TextView) view.requireViewById(R.id.popularity_proof_text);
                C14360o3.A0B(textView2, 0);
                c139456Ta.A03 = textView2;
                if (c139456Ta.A05 == C05F.A0C) {
                    textView = (TextView) view.requireViewById(R.id.popularity_proof_bullet);
                } else {
                    textView = null;
                }
                c139456Ta.A02 = textView;
                if (textView != null) {
                    textView.setText(" • ");
                }
            }
        });
    }
}
