package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HLs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39164HLs extends AbstractC110714yj {
    public final ValueAnimator.AnimatorUpdateListener A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final InterfaceC110654yd A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    @Override // X.AbstractC110714yj
    public final void A02(String str, View.OnClickListener onClickListener) {
        if (str != null && str.length() != 0 && onClickListener != null) {
            IgdsButton igdsButton = this.A05;
            igdsButton.setText(str);
            C0fQ.A00(onClickListener, igdsButton);
            igdsButton.setVisibility(0);
            return;
        }
        this.A05.setVisibility(8);
    }

    @Override // X.AbstractC110714yj
    public final void A03(String str, View.OnClickListener onClickListener) {
        if (str != null && str.length() != 0 && onClickListener != null) {
            IgdsButton igdsButton = this.A06;
            igdsButton.setText(str);
            C0fQ.A00(onClickListener, igdsButton);
            igdsButton.setVisibility(0);
            return;
        }
        this.A06.setVisibility(8);
    }

    @Override // X.AbstractC110714yj
    public final void A00(C3CL c3cl) {
        View view = this.A01;
        Context context = view.getContext();
        C1XV c1xv = c3cl.A00;
        Resources resources = context.getResources();
        int i = R.dimen.action_button_settings_height;
        if (c1xv != null) {
            i = R.dimen.abc_select_dialog_padding_start_material;
        }
        float dimension = resources.getDimension(i);
        ViewGroup.MarginLayoutParams A0H = AbstractC31177DnL.A0H(view);
        A0H.bottomMargin = (int) dimension;
        view.setLayoutParams(A0H);
    }

    @Override // X.AbstractC110714yj
    public final void A01(C110464yI c110464yI) {
        C110464yI c110464yI2 = super.A00;
        if (c110464yI2 != null) {
            c110464yI2.A05.removeUpdateListener(this.A00);
        }
        super.A00 = c110464yI;
        ((C110644yc) this.A04).A00(c110464yI.A00);
        C110464yI c110464yI3 = super.A00;
        if (c110464yI3 != null) {
            c110464yI3.A05.addUpdateListener(this.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r5.length() == 0) goto L6;
     */
    @Override // X.AbstractC110714yj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.instagram.common.ui.base.IgTextView r3 = r4.A03
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto Lf
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L11
        Lf:
            r0 = 8
        L11:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A02
            r1.setText(r6)
            if (r6 == 0) goto L21
            int r0 = r6.length()
            if (r0 != 0) goto L23
        L21:
            r2 = 8
        L23:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39164HLs.A04(java.lang.String, java.lang.String):void");
    }

    public C39164HLs(View view, IgTextView igTextView, IgTextView igTextView2, InterfaceC110654yd interfaceC110654yd, IgdsButton igdsButton, IgdsButton igdsButton2) {
        AbstractC167027dH.A13(interfaceC110654yd, igTextView, igTextView2);
        AbstractC167017dG.A1T(igdsButton, igdsButton2);
        this.A04 = interfaceC110654yd;
        this.A03 = igTextView;
        this.A02 = igTextView2;
        this.A01 = view;
        this.A05 = igdsButton;
        this.A06 = igdsButton2;
        this.A00 = new C41785If1(this, 0);
    }
}
