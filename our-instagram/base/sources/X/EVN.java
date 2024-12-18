package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EVN extends AbstractC60592pi {
    public TextView.OnEditorActionListener A00;
    public InterfaceC37221GaW A01;
    public ProgressButton A02;
    public Integer A03;
    public TextView A04;
    public AbstractC12990ll A05;
    public boolean A06;
    public boolean A07;
    public final TextWatcher A08;
    public final TextView.OnEditorActionListener A09;

    public final void A00() {
        this.A06 = false;
        A02();
        this.A01.ARU();
    }

    public final void A01() {
        this.A06 = true;
        A02();
        this.A01.APP();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A04 = null;
        this.A02 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.A01.CbE() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r2 = this;
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            boolean r0 = r2.A06
            r1.setShowProgressBar(r0)
            boolean r0 = r2.A06
            if (r0 != 0) goto L14
            X.GaW r0 = r2.A01
            boolean r0 = r0.CbE()
            r1 = 1
            if (r0 != 0) goto L15
        L14:
            r1 = 0
        L15:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A02
            r0.setEnabled(r1)
            X.GaW r0 = r2.A01
            r0.Dbn(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVN.A02():void");
    }

    public final void A03(boolean z) {
        String str;
        InterfaceC37221GaW interfaceC37221GaW = this.A01;
        interfaceC37221GaW.DVq();
        if (this.A07 && !(interfaceC37221GaW instanceof ELk)) {
            C35031Fc4 c35031Fc4 = C35031Fc4.A00;
            AbstractC12990ll abstractC12990ll = this.A05;
            EnumC31713DwI C0Q = interfaceC37221GaW.C0Q();
            if (C0Q != null) {
                str = C0Q.A01;
            } else {
                str = null;
            }
            EnumC33445EqI B75 = interfaceC37221GaW.B75();
            Integer num = this.A03;
            Boolean valueOf = Boolean.valueOf(z);
            C14360o3.A0B(abstractC12990ll, 0);
            c35031Fc4.A01(abstractC12990ll, B75, valueOf, null, num, str, null);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        ViewOnClickListenerC35686FpL.A00(this.A02, 3, this);
        TextView textView = this.A04;
        if (textView != null) {
            TextView.OnEditorActionListener onEditorActionListener = this.A00;
            if (onEditorActionListener == null) {
                onEditorActionListener = this.A09;
            }
            textView.setOnEditorActionListener(onEditorActionListener);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.removeTextChangedListener(this.A08);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.addTextChangedListener(this.A08);
        }
        A02();
    }

    public EVN(TextView textView, AbstractC12990ll abstractC12990ll, InterfaceC37221GaW interfaceC37221GaW, ProgressButton progressButton, int i) {
        this.A07 = true;
        this.A09 = new C35754Fqr(this, 19);
        this.A08 = new Em2(this, 16);
        this.A05 = abstractC12990ll;
        this.A01 = interfaceC37221GaW;
        this.A04 = textView;
        this.A02 = progressButton;
        progressButton.setText(i);
        this.A02.setEnabled(false);
        this.A01.Dbn(false);
    }

    public EVN(TextView textView, AbstractC12990ll abstractC12990ll, InterfaceC37221GaW interfaceC37221GaW, ProgressButton progressButton) {
        this(textView, abstractC12990ll, interfaceC37221GaW, progressButton, 2131968535);
    }
}
