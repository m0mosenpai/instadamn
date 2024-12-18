package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class WKX implements NoCopySpan, TextWatcher {
    public String A00;
    public final int A01 = 0;
    public final Object A02;

    public WKX(W9B w9b) {
        this.A02 = w9b;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.A01 == 0) {
            ((C50802McJ) this.A02).A01.put(this.A00, editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            this.A00 = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            String str = this.A00;
            if (charSequence.toString().replaceAll("\\D", "").length() > 9 && str != null) {
                W9B.A00((W9B) this.A02, str);
                return;
            }
            String charSequence2 = charSequence.toString();
            Locale A02 = C1Q2.A02();
            W9B w9b = (W9B) this.A02;
            String CDp = w9b.A0L.CDp();
            CDp.getClass();
            Currency currency = Currency.getInstance(CDp);
            String replaceAll = charSequence2.replaceAll("\\D", "");
            if (!replaceAll.equals("")) {
                replaceAll = AbstractC69979Vyw.A01(Double.valueOf(Double.parseDouble(replaceAll)), currency, A02);
            }
            W9B.A00(w9b, replaceAll);
            boolean equals = replaceAll.equals("");
            EditText editText = w9b.A03;
            editText.getClass();
            int i4 = 17;
            if (equals) {
                i4 = 8388611;
            }
            editText.setGravity(i4);
            W9B.A01(w9b);
        }
    }

    public WKX(C50802McJ c50802McJ, String str) {
        this.A02 = c50802McJ;
        this.A00 = str;
    }
}
