package X;

import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class FQF {
    public TextWatcher A00;
    public EditText A01;
    public C07270a1 A02;
    public Integer A03;
    public boolean A04 = false;

    public final void A00(InterfaceC37221GaW interfaceC37221GaW, Integer num) {
        String str;
        String str2;
        String str3;
        EditText editText = this.A01;
        if (editText != null && this.A04) {
            C18920wW A02 = AbstractC12220kQ.A02(this.A02);
            double A01 = AbstractC31171DnF.A01();
            String str4 = "";
            if (interfaceC37221GaW.B75() == null) {
                str = "";
            } else {
                str = interfaceC37221GaW.B75().A00;
            }
            String A0s = AbstractC31174DnI.A0s();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "reg_field_interacted");
            AbstractC31176DnK.A1K(A0f, A01);
            AbstractC31177DnL.A1B(A0f, A01, AbstractC31171DnF.A00());
            switch (this.A03.intValue()) {
                case 0:
                    str2 = "PHONE_FIELD";
                    break;
                case 1:
                    str2 = "EMAIL_FIELD";
                    break;
                case 2:
                    str2 = "FULLNAME_FIELD";
                    break;
                case 3:
                    str2 = "PASSWORD_FIELD";
                    break;
                default:
                    str2 = "USERNAME_FIELD";
                    break;
            }
            Locale locale = Locale.US;
            A0f.AAP("field_name", str2.toLowerCase(locale));
            if (num.intValue() != 0) {
                str3 = "TAPPED";
            } else {
                str3 = "STARTED_TYPING";
            }
            A0f.AAP(MSV.A00(53), str3.toLowerCase(locale));
            AbstractC31172DnG.A1O(A0f);
            AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
            EnumC31713DwI C0Q = interfaceC37221GaW.C0Q();
            C0Q.getClass();
            AbstractC31178DnM.A19(A0f, C0Q.A01);
            AbstractC31171DnF.A19(A0f, str);
            if (A0s != null) {
                str4 = A0s;
            }
            A0f.AAP("guid", str4);
            A0f.Cht();
            this.A04 = false;
            editText.post(new GM6(this));
        }
    }

    public FQF(EditText editText, C07270a1 c07270a1, InterfaceC37221GaW interfaceC37221GaW, Integer num) {
        this.A02 = c07270a1;
        this.A03 = num;
        this.A01 = editText;
        C35468Fl3 c35468Fl3 = new C35468Fl3(8, interfaceC37221GaW, this);
        this.A00 = c35468Fl3;
        editText.addTextChangedListener(c35468Fl3);
        this.A01.setOnTouchListener(new ViewOnTouchListenerC70251WNw(10, this, interfaceC37221GaW));
    }
}
