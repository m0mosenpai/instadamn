package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.4yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110714yj {
    public C110464yI A00;

    public void A00(C3CL c3cl) {
    }

    public void A01(C110464yI c110464yI) {
        if (this instanceof C110704yi) {
            C110704yi c110704yi = (C110704yi) this;
            C110464yI c110464yI2 = ((AbstractC110714yj) c110704yi).A00;
            if (c110464yI2 != null) {
                c110464yI2.A05.removeUpdateListener(c110704yi.A00);
            }
            ((AbstractC110714yj) c110704yi).A00 = c110464yI;
            ((C110644yc) c110704yi.A03).A00(c110464yI.A00);
            C110464yI c110464yI3 = ((AbstractC110714yj) c110704yi).A00;
            if (c110464yI3 != null) {
                c110464yI3.A05.addUpdateListener(c110704yi.A00);
                return;
            }
            return;
        }
        C110734yl c110734yl = (C110734yl) this;
        c110734yl.A01.getLayoutParams().height = -2;
        IgImageView igImageView = c110734yl.A03;
        Context context = igImageView.getContext();
        C14360o3.A07(context);
        int[] iArr = new int[5];
        C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
        igImageView.setImageDrawable(C3LQ.A04(context, iArr, R.drawable.instagram_star_pano_filled_12));
        IgImageView igImageView2 = c110734yl.A04;
        igImageView2.setImageDrawable(AbstractC13620mo.A00(igImageView2.getContext(), R.drawable.instagram_chevron_right_pano_outline_12));
    }

    public void A03(String str, View.OnClickListener onClickListener) {
        View view;
        int i;
        if (this instanceof C110704yi) {
            C110704yi c110704yi = (C110704yi) this;
            if (str != null && str.length() != 0 && onClickListener != null) {
                IgdsButton igdsButton = c110704yi.A04;
                igdsButton.setText(str);
                C0fQ.A00(onClickListener, igdsButton);
                igdsButton.setVisibility(0);
                return;
            }
            view = c110704yi.A04;
            i = 8;
        } else {
            C110734yl c110734yl = (C110734yl) this;
            C0fQ.A00(onClickListener, c110734yl.A00);
            view = c110734yl.A04;
            i = 4;
            if (onClickListener != null) {
                i = 0;
            }
        }
        view.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r6.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A04(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C110704yi
            if (r0 == 0) goto L2e
            r4 = r5
            X.4yi r4 = (X.C110704yi) r4
            com.instagram.common.ui.base.IgTextView r3 = r4.A02
            r3.setText(r6)
            r2 = 0
            if (r6 == 0) goto L16
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L18
        L16:
            r0 = 8
        L18:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            r1.setText(r7)
            if (r7 == 0) goto L28
            int r0 = r7.length()
            if (r0 != 0) goto L2a
        L28:
            r2 = 8
        L2a:
            r1.setVisibility(r2)
            return
        L2e:
            r0 = r5
            X.4yl r0 = (X.C110734yl) r0
            com.instagram.common.ui.base.IgTextView r0 = r0.A02
            r0.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC110714yj.A04(java.lang.String, java.lang.String):void");
    }

    public void A02(String str, View.OnClickListener onClickListener) {
    }
}
