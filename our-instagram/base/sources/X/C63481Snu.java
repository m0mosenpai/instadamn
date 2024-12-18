package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.Snu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63481Snu implements TextWatcher {
    public C63396SjQ A00;
    public boolean A01;
    public boolean A02 = false;

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        if (this.A01) {
            if (editable.length() == 0) {
                z = false;
            }
            this.A01 = z;
        } else if (!this.A02) {
            int selectionEnd = Selection.getSelectionEnd(editable) - 1;
            C63396SjQ c63396SjQ = this.A00;
            c63396SjQ.A0B();
            int length = editable.length();
            String str = null;
            char c = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        boolean z3 = false;
                        if (z2) {
                            z3 = true;
                        }
                        str = C63396SjQ.A04(c63396SjQ, c, z3);
                        c63396SjQ.A04 = str;
                        z2 = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z2 = true;
                }
            }
            if (c != 0) {
                boolean z4 = false;
                if (z2) {
                    z4 = true;
                }
                str = C63396SjQ.A04(c63396SjQ, c, z4);
                c63396SjQ.A04 = str;
            }
            if (str != null) {
                if (!c63396SjQ.A0C) {
                    i = c63396SjQ.A00;
                } else {
                    int i3 = 0;
                    i = 0;
                    while (i3 < c63396SjQ.A01 && i < c63396SjQ.A04.length()) {
                        if (c63396SjQ.A07.charAt(i3) == c63396SjQ.A04.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A02 = true;
                editable.replace(0, editable.length(), str, 0, str.length());
                if (str.equals(editable.toString())) {
                    Selection.setSelection(editable, i);
                }
                this.A02 = false;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A01 && i2 > 0) {
            for (int i4 = i; i4 < i + i2; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.A01 = true;
                    this.A00.A0B();
                    return;
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A01 && i3 > 0) {
            for (int i4 = i; i4 < i + i3; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.A01 = true;
                    this.A00.A0B();
                    return;
                }
            }
        }
    }

    public C63481Snu(Context context, String str) {
        if (str != null) {
            this.A00 = new C63396SjQ(PhoneNumberUtil.A01(context), str);
            return;
        }
        throw AbstractC58318PtA.A0Y();
    }
}
