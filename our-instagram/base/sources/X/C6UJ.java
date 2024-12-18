package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6UJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UJ {
    public TextView A00;
    public RoundedCornerFrameLayout A01;
    public final InterfaceC56392iX A02;

    public final void A00(Context context, CharSequence charSequence, float f) {
        String str;
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(charSequence);
            Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0X);
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setTypeface(A02);
                if (f < 1.0f) {
                    RoundedCornerFrameLayout roundedCornerFrameLayout = this.A01;
                    if (roundedCornerFrameLayout != null) {
                        roundedCornerFrameLayout.setScaleX(f);
                        RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.A01;
                        if (roundedCornerFrameLayout2 != null) {
                            roundedCornerFrameLayout2.setScaleY(f);
                            return;
                        }
                    }
                    str = "chipView";
                } else {
                    return;
                }
            } else {
                str = "chipTextView";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public C6UJ(InterfaceC56392iX interfaceC56392iX) {
        this.A02 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6UK
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6UJ c6uj = C6UJ.this;
                TextView textView = (TextView) view.requireViewById(R.id.reel_chip_metadata_label_text);
                C14360o3.A0B(textView, 0);
                c6uj.A00 = textView;
                RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.reel_metadata_chip_view);
                C14360o3.A0B(roundedCornerFrameLayout, 0);
                c6uj.A01 = roundedCornerFrameLayout;
            }
        });
    }
}
