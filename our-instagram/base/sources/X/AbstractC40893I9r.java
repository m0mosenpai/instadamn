package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import java.text.DateFormat;
import java.text.DateFormatSymbols;

/* renamed from: X.I9r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40893I9r {
    public static final void A00(Context context, Resources resources, View view, View view2, IgTextView igTextView, IgTextView igTextView2, C38677GzI c38677GzI) {
        long j;
        String A0F;
        C14360o3.A0B(c38677GzI, 0);
        AbstractC167017dG.A1T(igTextView, igTextView2);
        C5QE c5qe = c38677GzI.A02;
        if (c5qe != null) {
            igTextView.setText(c5qe.A01(resources));
        }
        Integer num = c38677GzI.A04;
        if (num != null) {
            igTextView.setHighlightColor(num.intValue());
        }
        if (c38677GzI.A06) {
            AbstractC25227BEk.A11(igTextView);
        }
        boolean z = c38677GzI.A07;
        int i = R.dimen.accent_edge_thickness;
        if (z) {
            i = R.dimen.afi_margin_top;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        AbstractC13880nE.A0Z(igTextView2, dimensionPixelSize);
        boolean z2 = false;
        C85963sQ.A09(igTextView, 0, dimensionPixelSize, context.getColor(AbstractC53242c7.A05(context)), z);
        InterfaceC43391JFg interfaceC43391JFg = c38677GzI.A03;
        if (interfaceC43391JFg instanceof J0B) {
            igTextView2.setVisibility(8);
        } else {
            boolean z3 = interfaceC43391JFg instanceof H85;
            if (z3) {
                if (((H85) interfaceC43391JFg).A00 == 1) {
                    A0F = C23831Eq.A09(resources, r1.A01);
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            }
            if (z3) {
                H85 h85 = (H85) interfaceC43391JFg;
                if (h85.A00 == 0) {
                    A0F = DateFormat.getTimeInstance(3).format(Long.valueOf(h85.A01 * 1000));
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            }
            if (interfaceC43391JFg instanceof H86) {
                H86 h86 = (H86) interfaceC43391JFg;
                if (h86.A02) {
                    j = h86.A01;
                    A0F = AbstractC50558MTp.A03(context, j);
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                } else {
                    A0F = DateFormatSymbols.getInstance().getShortWeekdays()[h86.A00];
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            } else {
                if (z3) {
                    H85 h852 = (H85) interfaceC43391JFg;
                    int i2 = h852.A00;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            A0F = C23831Eq.A0F("MMMM d", h852.A01, AbstractC31177DnL.A06());
                            igTextView2.setText(A0F);
                            igTextView2.setVisibility(0);
                        }
                    } else {
                        j = h852.A01;
                        A0F = AbstractC50558MTp.A03(context, j);
                        igTextView2.setText(A0F);
                        igTextView2.setVisibility(0);
                    }
                }
                throw B4Z.A00();
            }
        }
        if (!c38677GzI.A05) {
            View.OnClickListener onClickListener = c38677GzI.A00;
            C0fQ.A00(onClickListener, view);
            view.setClickable(AbstractC167007dF.A1W(onClickListener));
            View.OnClickListener onClickListener2 = c38677GzI.A01;
            C0fQ.A00(onClickListener2, view2);
            if (onClickListener2 != null) {
                z2 = true;
            }
            view2.setClickable(z2);
        }
    }
}
