package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.instagram.actionbar.ActionButton;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Fl7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35471Fl7 implements TextWatcher {
    public boolean A00;
    public final EditText A01;
    public final C32271EJg A02;

    public C35471Fl7(EditText editText, C32271EJg c32271EJg) {
        C14360o3.A0B(editText, 1);
        this.A01 = editText;
        this.A02 = c32271EJg;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        int i;
        ActionButton actionButton;
        C14360o3.A0B(editable, 0);
        if (!this.A00) {
            String A00 = new C11L("\\D+").A00(editable.toString(), "");
            int length = A00.length();
            boolean z = true;
            this.A00 = true;
            if (length == 0) {
                editText = this.A01;
                editText.setText("");
            } else if (length > 6) {
                editText = this.A01;
                editText.setText(editText.getText().subSequence(0, 14));
                editText.setSelection(14);
            } else {
                StringBuilder sb = new StringBuilder(14);
                int i2 = 6 - length;
                for (int i3 = 0; i3 < i2; i3++) {
                    A00 = AnonymousClass001.A0C(A00, '#');
                }
                int length2 = A00.length();
                int i4 = 0;
                for (int i5 = 0; i5 < length2; i5++) {
                    if (Character.isDigit(A00.charAt(i5))) {
                        i4 += 2;
                    }
                    sb.append(A00.charAt(i5));
                    sb.append(" ");
                    if (i5 == 2) {
                        if (Character.isDigit(A00.charAt(i5))) {
                            i4 += 2;
                        }
                        sb.append("   ");
                    }
                }
                String A19 = AbstractC166987dD.A19(sb);
                int length3 = A19.length() - 1;
                int i6 = 0;
                boolean z2 = false;
                while (i6 <= length3) {
                    int i7 = length3;
                    if (!z2) {
                        i7 = i6;
                    }
                    boolean A192 = AbstractC167027dH.A19(A19, i7);
                    if (!z2) {
                        if (!A192) {
                            z2 = true;
                        } else {
                            i6++;
                        }
                    } else if (!A192) {
                        break;
                    } else {
                        length3--;
                    }
                }
                SpannableString spannableString = new SpannableString(AbstractC31177DnL.A0g(A19, length3, i6));
                editText = this.A01;
                spannableString.setSpan(new ForegroundColorSpan(editText.getCurrentHintTextColor()), i4, spannableString.length(), 33);
                editText.setText(spannableString);
                if (length <= 3) {
                    i = Math.max((length * 2) - 1, 0);
                } else {
                    i = (length + 1) * 2;
                }
                editText.setSelection(i);
            }
            this.A00 = false;
            C32271EJg c32271EJg = this.A02;
            if (new C11L("\\D+").A00(AbstractC167007dF.A0g(editText), "").length() != 6) {
                z = false;
            }
            if (c32271EJg.mView != null && (actionButton = c32271EJg.A05) != null) {
                actionButton.setEnabled(z);
                ProgressButton progressButton = c32271EJg.A0F;
                if (progressButton != null) {
                    progressButton.setEnabled(z);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
