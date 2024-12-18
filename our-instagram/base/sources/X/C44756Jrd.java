package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jrd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44756Jrd extends C3OO {
    public final Button A00;
    public final TextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44756Jrd(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC166987dD.A0e(view, R.id.gallery_section_title);
        this.A00 = (Button) view.findViewById(R.id.gallery_manage_button);
    }

    public final void A00(MX6 mx6, C43888Jav c43888Jav) {
        int i;
        int i2;
        String A0p;
        C14360o3.A0B(mx6, 0);
        TextView textView = this.A01;
        if (textView != null) {
            Context A0L = AbstractC166997dE.A0L(textView);
            int A0H = AbstractC166987dD.A0H(mx6.A01);
            if (A0H != 1) {
                if (A0H != 0) {
                    if (A0H == 2) {
                        A0p = mx6.A03;
                        textView.setText(A0p);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    i2 = 2131961169;
                }
            } else {
                i2 = 2131957011;
            }
            A0p = AbstractC166997dE.A0p(A0L, i2);
            textView.setText(A0p);
        }
        Number number = (Number) mx6.A02;
        if (number != C05F.A00) {
            Button button = this.A00;
            if (button != null) {
                button.setVisibility(0);
                Context A05 = AbstractC31172DnG.A05(this);
                int A03 = AbstractC43592JPx.A03(number, 0);
                if (A03 != 1) {
                    if (A03 != 2) {
                        if (A03 != 3) {
                            if (A03 == 0) {
                                i = 0;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            i = 2131973182;
                        }
                    } else {
                        i = 2131973172;
                    }
                } else {
                    i = 2131961584;
                }
                AbstractC31177DnL.A0r(A05, button, Integer.valueOf(mx6.A00), i);
                ViewOnClickListenerC48066LPr.A00(button, 22, number, c43888Jav);
                return;
            }
            return;
        }
        AbstractC167007dF.A0x(this.A00);
    }
}
