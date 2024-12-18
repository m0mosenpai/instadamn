package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.save.model.SavedCollection;
import java.text.NumberFormat;

/* renamed from: X.Fl3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35468Fl3 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35468Fl3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewGroup viewGroup;
        View findViewById;
        CharSequence A0B;
        ViewGroup viewGroup2;
        View findViewById2;
        switch (this.A00) {
            case 2:
                C33151Eju c33151Eju = (C33151Eju) this.A02;
                AbstractC31171DnF.A1S(c33151Eju, AbstractC167007dF.A0g((EditText) this.A01), c33151Eju.A0A, C33151Eju.A0C, 0);
                C33151Eju.A05(c33151Eju);
                return;
            case 3:
                if (editable != null && (A0B = AbstractC001900j.A0B(editable)) != null && A0B.length() != 0) {
                    ((View) this.A02).setVisibility(0);
                    C35041FcE c35041FcE = (C35041FcE) this.A01;
                    if (c35041FcE == null || (viewGroup2 = c35041FcE.A00) == null) {
                        return;
                    }
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup2.getChildAt(i);
                        if (childAt != null && (findViewById2 = childAt.findViewById(R.id.instant_reply_text_view)) != null) {
                            findViewById2.setEnabled(false);
                            childAt.setClickable(false);
                        }
                    }
                    return;
                }
                ((View) this.A02).setVisibility(4);
                C35041FcE c35041FcE2 = (C35041FcE) this.A01;
                if (c35041FcE2 == null || (viewGroup = c35041FcE2.A00) == null) {
                    return;
                }
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup.getChildAt(i2);
                    if (childAt2 != null && (findViewById = childAt2.findViewById(R.id.instant_reply_text_view)) != null) {
                        findViewById.setEnabled(true);
                        childAt2.setClickable(true);
                    }
                }
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                C33150Ejt c33150Ejt = (C33150Ejt) this.A02;
                c33150Ejt.A03 = AbstractC25228BEl.A1A(AbstractC167007dF.A0g((EditText) this.A01));
                C33150Ejt.A04(c33150Ejt);
                return;
            case 7:
                C14360o3.A0B(editable, 0);
                C56352iT.A0t.A03(AbstractC31172DnG.A0C(this.A02)).A0T();
                ((View) this.A01).setEnabled(AbstractC167007dF.A1O(AbstractC001900j.A0B(editable).length()));
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        EMX emx;
        FGJ fgj;
        boolean z;
        EM6 em6;
        SavedCollection savedCollection;
        switch (this.A00) {
            case 0:
                BusinessInfoSectionView businessInfoSectionView = (BusinessInfoSectionView) this.A02;
                TextView textView = businessInfoSectionView.A03;
                if (textView == null) {
                    str = "emailInlineErrorMessage";
                } else {
                    textView.setVisibility(8);
                    TextView textView2 = businessInfoSectionView.A02;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        InterfaceC37296Gbx interfaceC37296Gbx = (InterfaceC37296Gbx) this.A01;
                        EditText editText = businessInfoSectionView.A00;
                        if (editText == null) {
                            str = "emailEditView";
                        } else {
                            interfaceC37296Gbx.DDF(editText.hasFocus());
                            return;
                        }
                    }
                    str = "bottomInlineErrorMessage";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                BusinessInfoSectionView businessInfoSectionView2 = (BusinessInfoSectionView) this.A02;
                TextView textView3 = businessInfoSectionView2.A04;
                if (textView3 == null) {
                    str = "phoneInlineErrorMessage";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                textView3.setVisibility(8);
                TextView textView4 = businessInfoSectionView2.A02;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                    ((InterfaceC37296Gbx) this.A01).DYK();
                    return;
                }
                str = "bottomInlineErrorMessage";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
            case 3:
            case 6:
            case 7:
            default:
                return;
            case 4:
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
                String replaceAll = charSequence.toString().replaceAll("\\D", "");
                if (replaceAll.isEmpty() || currencyInstance.getCurrency() == null) {
                    return;
                }
                double parseDouble = Double.parseDouble(replaceAll) / Math.pow(10.0d, currencyInstance.getCurrency().getDefaultFractionDigits());
                IgFormField igFormField = (IgFormField) this.A02;
                AbstractC31173DnH.A1D(this, igFormField);
                if (parseDouble > 0.0d) {
                    igFormField.setText(currencyInstance.format(parseDouble));
                    emx = (EMX) this.A01;
                    fgj = emx.A01;
                    if (fgj != null) {
                        z = true;
                        FNU fnu = fgj.A00;
                        C189478aR c189478aR = fnu.A04;
                        C189458aP c189458aP = fnu.A05;
                        c189458aP.A0A = z;
                        c189478aR.A0K(c189458aP.A00(), true);
                    }
                    emx.A03 = Double.toString(parseDouble);
                    igFormField.A0H(this);
                    return;
                }
                igFormField.setText("");
                emx = (EMX) this.A01;
                fgj = emx.A01;
                if (fgj != null) {
                    z = false;
                    FNU fnu2 = fgj.A00;
                    C189478aR c189478aR2 = fnu2.A04;
                    C189458aP c189458aP2 = fnu2.A05;
                    c189458aP2.A0A = z;
                    c189478aR2.A0K(c189458aP2.A00(), true);
                }
                emx.A03 = Double.toString(parseDouble);
                igFormField.A0H(this);
                return;
            case 5:
                View view = (View) this.A01;
                boolean z2 = true;
                if (!((C38909HBg) this.A02).A02 || charSequence == null || AbstractC001900j.A0T(charSequence)) {
                    z2 = false;
                }
                view.setEnabled(z2);
                return;
            case 8:
                ((FQF) this.A01).A00((InterfaceC37221GaW) this.A02, C05F.A00);
                return;
            case 9:
                TextView textView5 = (TextView) this.A02;
                if (textView5 == null || (savedCollection = (em6 = (EM6) this.A01).A0C) == null || savedCollection.A08 == null) {
                    return;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    AbstractC31177DnL.A10(textView5, em6, em6.A0C.A08.getUsername(), 2131971133);
                    AbstractC167007dF.A0x(em6.A02);
                    return;
                }
                textView5.setText(charSequence);
                View view2 = em6.A02;
                if (view2 == null) {
                    return;
                }
                view2.setVisibility(0);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
