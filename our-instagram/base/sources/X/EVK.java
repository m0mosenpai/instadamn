package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* loaded from: classes6.dex */
public final class EVK extends AbstractC60592pi {
    public EnumC33445EqI A00;
    public Integer A01;
    public Integer A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final AbstractC12990ll A06;
    public final EKF A07;
    public final C34617FNa A08;
    public final C34692FQd A09;
    public final FQU A0A;
    public final FQU A0B;

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0283, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        if (r3 == null) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.Integer r27) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVK.A01(java.lang.Integer):void");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        ViewOnClickListenerC31724DwT.A00(this.A03, 42, this);
        ViewOnClickListenerC31724DwT.A00(this.A04, 43, this);
        Integer num = this.A02;
        C34617FNa c34617FNa = this.A08;
        ImageView imageView = c34617FNa.A05;
        AutoCompleteTextView autoCompleteTextView = c34617FNa.A04;
        int i = 8;
        if (autoCompleteTextView.getText().length() > 0) {
            i = 0;
        }
        imageView.setVisibility(i);
        ViewOnClickListenerC31724DwT.A00(imageView, 38, c34617FNa);
        autoCompleteTextView.addTextChangedListener(c34617FNa.A03);
        C34692FQd c34692FQd = this.A09;
        FQV fqv = c34692FQd.A00;
        fqv.getClass();
        fqv.A01();
        ImageView imageView2 = c34692FQd.A06;
        AutoCompleteTextView autoCompleteTextView2 = c34692FQd.A05;
        int i2 = 0;
        if (AbstractC13880nE.A10(autoCompleteTextView2)) {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        ViewOnClickListenerC31724DwT.A00(imageView2, 40, c34692FQd);
        ViewOnClickListenerC31724DwT.A00(c34692FQd.A07, 41, c34692FQd);
        autoCompleteTextView2.addTextChangedListener(c34692FQd.A04);
        A01(num);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A09.A00 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C34692FQd c34692FQd = this.A09;
        EHO eho = c34692FQd.A01;
        if (eho != null) {
            eho.A07();
        }
        AbstractC13880nE.A0O(c34692FQd.A05);
        C34617FNa c34617FNa = this.A08;
        AutoCompleteTextView autoCompleteTextView = c34617FNa.A04;
        autoCompleteTextView.removeTextChangedListener(c34617FNa.A03);
        AbstractC13880nE.A0O(autoCompleteTextView);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        AutoCompleteTextView autoCompleteTextView;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                autoCompleteTextView = this.A08.A04;
            } else {
                return;
            }
        } else {
            autoCompleteTextView = this.A09.A05;
        }
        AbstractC35259Fgt.A06(autoCompleteTextView);
    }

    public EVK(View view, View view2, ViewGroup viewGroup, AbstractC12990ll abstractC12990ll, EKF ekf, FQU fqu, FQU fqu2, C34617FNa c34617FNa, C34692FQd c34692FQd, Integer num, Integer num2) {
        this.A05 = viewGroup;
        this.A03 = view;
        this.A04 = view2;
        this.A01 = num;
        this.A07 = ekf;
        this.A08 = c34617FNa;
        this.A09 = c34692FQd;
        this.A06 = abstractC12990ll;
        this.A0A = fqu;
        this.A0B = fqu2;
        this.A02 = num2;
    }

    public final void A00(AbstractC12990ll abstractC12990ll, Integer num, Integer num2) {
        EnumC33445EqI enumC33445EqI;
        C18920wW A02;
        double A01;
        double A00;
        String str;
        if (num2.intValue() != 0) {
            enumC33445EqI = EnumC33445EqI.A03;
            this.A00 = enumC33445EqI;
            A02 = AbstractC12220kQ.A02(abstractC12990ll);
            A00 = AbstractC31171DnF.A00();
            A01 = AbstractC31171DnF.A01();
            str = "switch_to_email";
        } else {
            enumC33445EqI = EnumC33445EqI.A06;
            this.A00 = enumC33445EqI;
            A02 = AbstractC12220kQ.A02(abstractC12990ll);
            A01 = AbstractC31171DnF.A01();
            A00 = AbstractC31171DnF.A00();
            str = "switch_to_phone";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, str);
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31172DnG.A1O(A0f);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, this.A07.C0Q().A01, A00);
        AbstractC31171DnF.A19(A0f, enumC33445EqI.A00);
        AbstractC35274Fh9.A07(A0f, A01);
        A0f.Cht();
        this.A01 = num2;
        A01(num);
    }
}
